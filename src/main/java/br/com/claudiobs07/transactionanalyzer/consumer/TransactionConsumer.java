package br.com.claudiobs07.transactionanalyzer.consumer;

import br.com.claudiobs07.transactionanalyzer.model.Transaction;
import br.com.claudiobs07.transactionanalyzer.service.TransactionService;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class TransactionConsumer {

    private static final Logger LOG = Logger.getLogger(TransactionConsumer.class);

    @Inject
    TransactionService transactionService;

    public void process(Transaction transaction) {
        LOG.infov("Process transaction: {}", transaction);
        transactionService.process(transaction);
    }

}
