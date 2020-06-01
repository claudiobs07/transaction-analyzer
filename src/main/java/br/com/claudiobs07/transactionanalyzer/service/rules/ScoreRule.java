package br.com.claudiobs07.transactionanalyzer.service.rules;

import br.com.claudiobs07.transactionanalyzer.model.TransactionScore;

public interface ScoreRule {

    void apply(TransactionScore transactionScore);

}
