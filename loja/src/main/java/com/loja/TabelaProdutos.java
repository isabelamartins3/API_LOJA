package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    public TabelaProdutos() {
        Produto caneta = new Produto(1,"Caneta BIC","Caneta BIC na cor azul", 1.99);
        Produto borracha = new Produto(2,"Borracha branca","Borracha branca comum", 3.99);
        Produto lapis = new Produto(3,"Lápis Faber Castel","Lapis Faber Castel comum",2.99);
        Produto apontador = new Produto(4,"Apontador","Apontador comum com reservatorio",7.99);
        Produto caderno = new Produto(5,"Caderno espiral","Caderno espiral de 96 folhas",15.99);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);

    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    public List<Produto> buscarTodosOsProdutos() {
        return this.getProdutos();
    }

    public Produto buscarProdutoPeloId(int produtoId) {
        Produto produtoProcurado = null;
        for (Produto p: this.produtos) {
            if (p.getId() == produtoId) {
                produtoProcurado = p;
                break;
            }
        }
        return produtoProcurado;
    }


    public Produto cadastrarNovoProduto(Produto novoProduto) {
        // 5 - 1 = 4
        int ultimoIndex = this.produtos.size() -1;
        // Produto caderno = new Produto (5, "Caderno", "Caderno"
        Produto ultimoProduto = this.produtos.get(ultimoIndex);
        // 5 + 1 = 6
        int proximoId = ultimoProduto.getId() + 1;

            novoProduto.setId(proximoId);
            this.produtos.add(novoProduto);
            return novoProduto;

    }

}
