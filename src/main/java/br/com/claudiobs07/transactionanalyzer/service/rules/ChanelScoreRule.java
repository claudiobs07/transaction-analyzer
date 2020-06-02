package br.com.claudiobs07.transactionanalyzer.service.rules;

import br.com.claudiobs07.transactionanalyzer.model.TransactionScore;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ChanelScoreRule implements ScoreRule {

    @Override
    public void apply(TransactionScore transactionScore) {
        //TODO add score rules
    }
}
