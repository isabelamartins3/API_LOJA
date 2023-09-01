package com.loja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/loja/produtos")
public class ProdutoController {
    private TabelaProdutos tabelaProdutos;

    public ProdutoController() {
        this.tabelaProdutos = new TabelaProdutos();
    }
    @GetMapping
    public List<Produto> buscarTodosOsProdutosDaLoja() {
        return this.tabelaProdutos.buscarTodosOsProdutos();
    }

    @GetMapping ("/{produtoId}")
    public Produto buscarProdutoPeloIdNaLoja (@PathVariable int produtoId ) {
        Produto produtoProcurado = this.tabelaProdutos.
                buscarProdutoPeloId(produtoId);
        return produtoProcurado;
    }

}
