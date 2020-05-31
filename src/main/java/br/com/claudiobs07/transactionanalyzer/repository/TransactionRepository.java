package br.com.claudiobs07.transactionanalyzer.repository;

import br.com.claudiobs07.transactionanalyzer.model.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}
