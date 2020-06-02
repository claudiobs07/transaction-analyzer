package br.com.claudiobs07.transactionanalyzer.service.rules;

import br.com.claudiobs07.transactionanalyzer.model.TransactionScore;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TypeScoreRule implements ScoreRule {

    @Override
    public void apply(TransactionScore transactionScore) {
        //apply score rule
    }
}
