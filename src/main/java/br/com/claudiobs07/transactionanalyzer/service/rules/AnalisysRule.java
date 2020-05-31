package br.com.claudiobs07.transactionanalyzer.service.rules;

import br.com.claudiobs07.transactionanalyzer.model.TransactionAnalisysScore;

public interface AnalisysRule {

    void apply(TransactionAnalisysScore transactionAnalisysScore);

}
