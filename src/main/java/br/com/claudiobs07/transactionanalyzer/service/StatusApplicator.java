package br.com.claudiobs07.transactionanalyzer.service;

import br.com.claudiobs07.transactionanalyzer.model.TransactionScore;
import br.com.claudiobs07.transactionanalyzer.model.TransactionStatus;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StatusApplicator {

    public TransactionStatus apply(TransactionScore transactionScore) {
        return TransactionStatus.MANUAL;
    }

}
