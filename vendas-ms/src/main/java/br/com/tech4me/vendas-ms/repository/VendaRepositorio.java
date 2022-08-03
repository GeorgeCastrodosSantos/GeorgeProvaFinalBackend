package br.com.tech4me.vendasms.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.tech4me.vendasms.model.Venda;

@Repository
public interface VendaRepositorio extends MongoRepository<Venda, String> {

	List<Venda> findByVenda(String venda);
    
}
