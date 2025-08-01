package com.cibertec.bancocibertec.persistence.repositories;

import com.cibertec.bancocibertec.persistence.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> { ;
}
