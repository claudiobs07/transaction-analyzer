package br.com.claudiobs07.transactionanalyzer.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;

@Entity
public class TransactionAnalyzed extends PanacheEntity {

    public TransactionAnalyzed() {}

    public TransactionAnalyzed(Transaction transaction, TransactionStatus status) {
        this.transaction = transaction;
        this.status = status;
    }

    @OneToOne
    @JoinColumn(name="transaction_id")
    private Transaction transaction;

    @Enumerated(EnumType.STRING)
    private TransactionStatus status;

}
