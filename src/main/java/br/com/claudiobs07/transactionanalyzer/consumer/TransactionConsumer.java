package br.com.claudiobs07.transactionanalyzer.consumer;

import br.com.claudiobs07.transactionanalyzer.model.TransactionDTO;
import br.com.claudiobs07.transactionanalyzer.service.AnalyzerService;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class TransactionConsumer {

    private static final Logger LOG = Logger.getLogger(TransactionConsumer.class);

    @Inject
    AnalyzerService analyzerService;

    @Incoming("transaction")
    public void consume(TransactionDTO transactionDTO) {
        LOG.infov("Process transaction: {}", transactionDTO);
        analyzerService.analyse(transactionDTO);
    }

}
