package br.com.claudiobs07.transactionanalyzer.model;

import java.time.LocalDateTime;

public class TransactionDTO {

    private Long id;

    private String sourceAccountId;

    private String destinationAccountId;

    private Double amount;

    private TransactionType type;

    private Channel channel;

    private LocalDateTime createdAt;

    public Transaction toTransaction() {
        return new Transaction(sourceAccountId, destinationAccountId, amount, type, channel, createdAt);
    }

}
