package br.com.claudiobs07.transactionanalyzer.service;

import br.com.claudiobs07.transactionanalyzer.model.Transaction;
import br.com.claudiobs07.transactionanalyzer.model.TransactionAnalyzed;
import br.com.claudiobs07.transactionanalyzer.model.TransactionScore;
import br.com.claudiobs07.transactionanalyzer.model.TransactionStatus;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TransactionAnalizer {

    private final ScoreApplicator scoreApplicator;

    private final StatusApplicator statusApplicator;

    public TransactionAnalizer(ScoreApplicator scoreApplicator, StatusApplicator statusApplicator) {
        this.scoreApplicator = scoreApplicator;
        this.statusApplicator = statusApplicator;
    }

    public TransactionAnalyzed analize(Transaction transaction) {
        TransactionScore score = scoreApplicator.apply(transaction);
        TransactionStatus status = statusApplicator.apply(score);
        return new TransactionAnalyzed(score, status);
    }

}
