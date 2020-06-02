package br.com.claudiobs07.transactionanalyzer.model;

import javax.persistence.*;

@Entity
public class TransactionAnalyzed {

    public TransactionAnalyzed() {}

    public TransactionAnalyzed(Transaction transaction, Integer score, TransactionStatus status) {
        this.transaction = transaction;
        this.score = score;
        this.status = status;
    }

    @Id
    @GeneratedValue
    private Long id;

    @JoinColumn(name = "transactionId")
    private Transaction transaction;

    private Integer score;

    private TransactionStatus status;

    public TransactionAnalyzed(TransactionScore transactionScore, TransactionStatus status) {
        this.transaction = transactionScore.getTransaction();
        this.score = transactionScore.getScore();
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public Integer getScore() {
        return score;
    }

    public TransactionStatus getStatus() {
        return status;
    }
}
