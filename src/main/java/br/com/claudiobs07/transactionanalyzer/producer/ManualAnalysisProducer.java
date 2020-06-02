package br.com.claudiobs07.transactionanalyzer.producer;

import br.com.claudiobs07.transactionanalyzer.model.TransactionAnalyzed;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ManualAnalysisProducer {

    private static final Logger LOG = Logger.getLogger(ManualAnalysisProducer.class);

    public void send(TransactionAnalyzed transactionAnalyzed) {
        LOG.infov("sending to manual queue, transaction", transactionAnalyzed.getTransaction());
        //TODO send to queue
    }

}
