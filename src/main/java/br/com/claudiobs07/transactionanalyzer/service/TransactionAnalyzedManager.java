package br.com.claudiobs07.transactionanalyzer.service;

import br.com.claudiobs07.transactionanalyzer.model.TransactionAnalyzed;
import br.com.claudiobs07.transactionanalyzer.model.TransactionStatus;
import br.com.claudiobs07.transactionanalyzer.producer.ManualAnalysisProducer;
import br.com.claudiobs07.transactionanalyzer.repository.TransactionAnalyzedRepository;

public class TransactionAnalyzedManager {

    private final ManualAnalysisProducer manualAnalysisProducer;

    private final TransactionAnalyzedRepository transactionAnalyzedRepository;

    public TransactionAnalyzedManager(ManualAnalysisProducer manualAnalysisProducer, TransactionAnalyzedRepository transactionAnalyzedRepository) {
        this.manualAnalysisProducer = manualAnalysisProducer;
        this.transactionAnalyzedRepository = transactionAnalyzedRepository;
    }

    public void manage(TransactionAnalyzed analyzed) {
        TransactionAnalyzed analyzedSaved = transactionAnalyzedRepository.save(analyzed);
        if (analyzedSaved.getStatus() == TransactionStatus.MANUAL) {
            manualAnalysisProducer.send(analyzedSaved);
        }
    }

}
