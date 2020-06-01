package br.com.claudiobs07.transactionanalyzer.model;

public class TransactionAnalyzed {

    public TransactionAnalyzed(Long transactionId, Integer score, TransactionStatus status) {
        this.transactionId = transactionId;
        this.score = score;
        this.status = status;
    }

    private Long id;

    private Long transactionId;

    private Integer score;

    private TransactionStatus status;

    public TransactionAnalyzed(TransactionScore transactionScore, TransactionStatus status) {
        this.transactionId = transactionScore.getTransaction().getId();
        this.score = transactionScore.getScore();
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public Integer getScore() {
        return score;
    }

    public TransactionStatus getStatus() {
        return status;
    }
}
