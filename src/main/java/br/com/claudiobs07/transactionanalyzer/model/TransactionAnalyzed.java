package br.com.claudiobs07.transactionanalyzer.model;

public class TransactionAnalyzed {

    public TransactionAnalyzed(Long transactionId, Integer score, TransactionScoreStatus status) {
        this.transactionId = transactionId;
        this.score = score;
        this.status = status;
    }

    private Long id;

    private Long transactionId;

    private Integer score;

    private TransactionScoreStatus status;

    public TransactionAnalyzed(TransactionAnalisysScore transactionAnalisysScore, TransactionScoreStatus status) {
        this.transactionId = transactionAnalisysScore.getTransaction().getId();
        this.score = transactionAnalisysScore.getScore();
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

    public TransactionScoreStatus getStatus() {
        return status;
    }
}
