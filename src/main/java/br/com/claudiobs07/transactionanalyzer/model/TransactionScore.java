package br.com.claudiobs07.transactionanalyzer.model;

public class TransactionScore {

    public TransactionScore(Transaction transaction) {
        this.transaction = transaction;
        this.score = 0;
    }

    private Transaction transaction;

    private int score;

    public Transaction getTransaction() {
        return transaction;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int score) {
        this.score += score;
    }

}
