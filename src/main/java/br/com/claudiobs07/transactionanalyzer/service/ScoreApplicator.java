package br.com.claudiobs07.transactionanalyzer.service;

import br.com.claudiobs07.transactionanalyzer.model.Transaction;
import br.com.claudiobs07.transactionanalyzer.model.TransactionScore;
import br.com.claudiobs07.transactionanalyzer.service.rules.ScoreRule;

import java.util.List;

public class ScoreApplicator {

    private final List<ScoreRule> scoreRules;

    public ScoreApplicator(List<ScoreRule> scoreRules) {
        this.scoreRules = scoreRules;
    }

    public TransactionScore apply(Transaction transaction) {
        TransactionScore transactionScore = new TransactionScore(transaction);
        scoreRules.forEach(rule -> rule.apply(transactionScore));
        return transactionScore;
    }

}
