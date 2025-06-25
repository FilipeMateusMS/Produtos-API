package com.curso.spring.produtosapi.model;

import jakarta.persistence.*;

@Entity
@Table( name = "produto" )
public class Produto {

    @Id
    @Column( name= "id" )
    private String id;
    private String nome;
    private String descricao;
    private Double preco;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", descricao='").append(descricao).append('\'');
        sb.append(", preco=").append(preco);
        sb.append('}');
        return sb.toString();
    }
}
