package br.com.claudiobs07.transactionanalyzer.model;

import java.time.LocalDateTime;

public class Transaction {

    public Transaction(Long id, String sourceAccountId, String destinationAccountId, Double amount, TransactionType type, Channel channel, LocalDateTime createdAt) {
        this.id = id;
        this.sourceAccountId = sourceAccountId;
        this.destinationAccountId = destinationAccountId;
        this.amount = amount;
        this.type = type;
        this.channel = channel;
        this.createdAt = createdAt;
    }

    public Transaction(String sourceAccountId, String destinationAccountId, Double amount, TransactionType type, Channel channel, LocalDateTime createdAt) {
        this(null, sourceAccountId, destinationAccountId, amount, type, channel, createdAt);
    }

    private Long id;

    private String sourceAccountId;

    private String destinationAccountId;

    private Double amount;

    private TransactionType type;

    private Channel channel;

    private LocalDateTime createdAt;


    public Long getId() {
        return id;
    }

    public String getSourceAccountId() {
        return sourceAccountId;
    }

    public String getDestinationAccountId() {
        return destinationAccountId;
    }

    public Double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    public Channel getChannel() {
        return channel;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", sourceAccountId='" + sourceAccountId + '\'' +
                ", destinationAccountId='" + destinationAccountId + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                ", channel=" + channel +
                ", createdAt=" + createdAt +
                '}';
    }
}
