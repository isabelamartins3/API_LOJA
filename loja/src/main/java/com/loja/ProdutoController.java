package com.loja;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{produtoId}")
    public Produto buscarProdutoPeloIdNaLoja(@PathVariable int produtoId) {
        Produto produtoProcurado = this.tabelaProdutos.
                buscarProdutoPeloId(produtoId);
        return produtoProcurado;
    }

    @PostMapping
    public Produto cadastrarNovoProdutoNaLoja(
            @RequestBody Produto dadosNovoProduto) {
        return this.tabelaProdutos.cadastrarNovoProduto(dadosNovoProduto);
    }
        @PutMapping("/{produtoId}")
    public void atualizarProduto (@PathVariable int produtoId, @RequestBody Produto dadosAtualizarProduto) {
        this.tabelaProdutos.atualizarProduto(produtoId, dadosAtualizarProduto);
        }
}
