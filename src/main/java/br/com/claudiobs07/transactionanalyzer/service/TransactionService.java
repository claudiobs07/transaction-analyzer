package br.com.claudiobs07.transactionanalyzer.service;

import br.com.claudiobs07.transactionanalyzer.model.Transaction;
import br.com.claudiobs07.transactionanalyzer.model.TransactionAnalyzed;
import br.com.claudiobs07.transactionanalyzer.model.TransactionScoreStatus;
import br.com.claudiobs07.transactionanalyzer.producer.ManualAnalysisProducer;
import br.com.claudiobs07.transactionanalyzer.repository.TransactionAnalyzedRepository;
import br.com.claudiobs07.transactionanalyzer.repository.TransactionRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TransactionService {

    private final AnalysisService analysisService;

    private final TransactionRepository transactionRepository;

    private final ManualAnalysisProducer manualAnalysisProducer;

    private final TransactionAnalyzedRepository transactionAnalyzedRepository;

    public TransactionService(AnalysisService analysisService, TransactionRepository transactionRepository,
                              ManualAnalysisProducer manualAnalysisProducer, TransactionAnalyzedRepository transactionAnalyzedRepository) {
        this.analysisService = analysisService;
        this.transactionRepository = transactionRepository;
        this.manualAnalysisProducer = manualAnalysisProducer;
        this.transactionAnalyzedRepository = transactionAnalyzedRepository;
    }

    public void process(Transaction transaction) {
        Transaction transactionPersisted = transactionRepository.save(transaction);
        TransactionAnalyzed analyzed = analysisService.analyze(transactionPersisted);
        TransactionAnalyzed analyzedPersisted = transactionAnalyzedRepository.save(analyzed);
        if (analyzedPersisted.getStatus() == TransactionScoreStatus.MANUAL) {
            manualAnalysisProducer.send(transactionPersisted);
        }
    }

}
