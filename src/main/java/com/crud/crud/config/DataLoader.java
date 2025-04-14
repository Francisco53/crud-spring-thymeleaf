package com.crud.crud.config;



import com.crud.crud.model.Produto;
import com.crud.crud.repository.ProdutoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner carregarDados(ProdutoRepository produtoRepository) {
        return args -> {
            if (produtoRepository.count() == 0) { // Evita duplicação
                produtoRepository.saveAll(List.of(
                        new Produto("Notebook Dell", new BigDecimal("3500.00")),
                        new Produto("Smartphone Samsung", new BigDecimal("2200.00")),
                        new Produto("Mouse Gamer", new BigDecimal("150.00")),
                        new Produto("Teclado Mecânico", new BigDecimal("300.00"))
                ));
                System.out.println("Produtos inseridos no banco!");
            }
        };
    }
}

