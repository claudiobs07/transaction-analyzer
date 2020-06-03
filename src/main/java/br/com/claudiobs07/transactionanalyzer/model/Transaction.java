package br.com.claudiobs07.transactionanalyzer.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Transaction extends PanacheEntity {

    public Transaction() { }

    public Transaction(String sourceAccountId, String destinationAccountId, Double amount, TransactionType type, Channel channel, LocalDateTime createdAt) {
        this.sourceAccountId = sourceAccountId;
        this.destinationAccountId = destinationAccountId;
        this.amount = amount;
        this.type = type;
        this.channel = channel;
        this.createdAt = createdAt;
    }

    @Column(name="source_account_id")
    private String sourceAccountId;

    @Column(name="destination_account_id")
    private String destinationAccountId;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    @Enumerated(EnumType.STRING)
    private Channel channel;

    @Column(name="created_at")
    private LocalDateTime createdAt;

}
