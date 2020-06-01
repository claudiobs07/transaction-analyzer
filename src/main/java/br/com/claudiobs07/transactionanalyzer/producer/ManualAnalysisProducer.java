package br.com.claudiobs07.transactionanalyzer.producer;

import br.com.claudiobs07.transactionanalyzer.model.TransactionAnalyzed;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ManualAnalysisProducer {

    public void send(TransactionAnalyzed transactionAnalyzed) {
        //TODO send to queue
    }

}
