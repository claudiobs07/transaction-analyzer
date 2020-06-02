package br.com.claudiobs07.transactionanalyzer.service;

import br.com.claudiobs07.transactionanalyzer.model.Transaction;
import br.com.claudiobs07.transactionanalyzer.model.TransactionScore;
import br.com.claudiobs07.transactionanalyzer.service.rules.ChanelScoreRule;
import br.com.claudiobs07.transactionanalyzer.service.rules.ScoreRule;
import br.com.claudiobs07.transactionanalyzer.service.rules.TypeScoreRule;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ScoreApplicator {

    private final List<ScoreRule> scoreRules;

    public ScoreApplicator(ChanelScoreRule chanelScoreRule, TypeScoreRule typeScoreRule) {
        this.scoreRules = List.of(chanelScoreRule, typeScoreRule);
    }

    public TransactionScore apply(Transaction transaction) {
        TransactionScore transactionScore = new TransactionScore(transaction);
        scoreRules.forEach(rule -> rule.apply(transactionScore));
        return transactionScore;
    }

}
