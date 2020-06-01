package br.com.claudiobs07.transactionanalyzer.service;

import br.com.claudiobs07.transactionanalyzer.model.Transaction;
import br.com.claudiobs07.transactionanalyzer.model.TransactionAnalyzed;
import br.com.claudiobs07.transactionanalyzer.repository.TransactionRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TransactionService {

    private final TransactionAnalizer transactionAnalizer;

    private final TransactionRepository transactionRepository;

    private final TransactionAnalyzedManager transactionAnalyzedManager;

    public TransactionService(TransactionAnalizer transactionAnalizer, TransactionRepository transactionRepository, TransactionAnalyzedManager transactionAnalyzedManager) {
        this.transactionAnalizer = transactionAnalizer;
        this.transactionRepository = transactionRepository;
        this.transactionAnalyzedManager = transactionAnalyzedManager;
    }

    public void process(Transaction transaction) {
        Transaction transactionSaved = transactionRepository.save(transaction);
        TransactionAnalyzed analyzed = transactionAnalizer.analize(transactionSaved);
        transactionAnalyzedManager.manage(analyzed);

    }

}
