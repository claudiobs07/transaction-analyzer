package br.com.claudiobs07.transactionanalyzer.service;

import br.com.claudiobs07.transactionanalyzer.model.Transaction;
import br.com.claudiobs07.transactionanalyzer.model.TransactionAnalyzed;
import br.com.claudiobs07.transactionanalyzer.model.TransactionAnalisysScore;
import br.com.claudiobs07.transactionanalyzer.model.TransactionScoreStatus;
import br.com.claudiobs07.transactionanalyzer.service.rules.AnalisysRule;

import java.util.List;

public class AnalysisService {

    private final List<AnalisysRule> analisysRules;

    public AnalysisService(List<AnalisysRule> analisysRules) {
        this.analisysRules = analisysRules;
    }

    public TransactionAnalyzed analyze(Transaction transaction) {
        TransactionAnalisysScore transactionAnalisysScore = new TransactionAnalisysScore(transaction);
        analisysRules.forEach(rule -> rule.apply(transactionAnalisysScore));
        return new TransactionAnalyzed(transactionAnalisysScore, TransactionScoreStatus.MANUAL);
    }
}
