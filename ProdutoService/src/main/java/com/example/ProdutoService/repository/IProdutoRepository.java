package com.example.ProdutoService.repository;

import com.example.ProdutoService.domain.Produto;
import com.example.ProdutoService.domain.Produto.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IProdutoRepository extends MongoRepository<Produto, String> {
    Optional<Produto> findByCodigo(String codigo);

    Page<Produto> findAllByStatus(Pageable pageable, Status status);
}
