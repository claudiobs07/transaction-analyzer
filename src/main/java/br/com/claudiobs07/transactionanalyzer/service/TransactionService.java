package br.com.claudiobs07.transactionanalyzer.service;

import br.com.claudiobs07.transactionanalyzer.model.*;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TransactionService {

    private final ScoreApplicator scoreApplicator;

    private final StatusApplicator statusApplicator;

    public TransactionService(ScoreApplicator scoreApplicator, StatusApplicator statusApplicator) {
        this.scoreApplicator = scoreApplicator;
        this.statusApplicator = statusApplicator;
    }

    public void process(TransactionDTO transactionDTO) {
        Transaction transaction = transactionDTO.toTransaction();
        transaction.persist();
        TransactionScore score = scoreApplicator.apply(transaction);
        TransactionStatus status = statusApplicator.apply(score);
        TransactionAnalyzed transactionAnalyzed = new TransactionAnalyzed(transaction, status);
        transactionAnalyzed.persist();
    }

}
