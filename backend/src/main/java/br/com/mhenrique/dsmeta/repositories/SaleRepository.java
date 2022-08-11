package br.com.mhenrique.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mhenrique.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
