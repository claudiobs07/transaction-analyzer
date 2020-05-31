package br.com.claudiobs07.transactionanalyzer.repository;

import br.com.claudiobs07.transactionanalyzer.model.TransactionAnalyzed;
import org.springframework.data.repository.CrudRepository;

public interface TransactionAnalyzedRepository extends CrudRepository<TransactionAnalyzed, Long>  {
}
