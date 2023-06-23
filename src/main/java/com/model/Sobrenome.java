package com.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Sobrenome implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String sobrenome;

    /* A Table Sobrenome fica salva com nome_id = null */

    @ManyToOne(cascade = CascadeType.ALL)
    private Nome nome;

    public Sobrenome(Nome nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Sobrenome(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Nome getNome() {
        return nome;
    }

    public void setNome(Nome nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Sobrenome [id=" + id + ", sobrenome=" + sobrenome + "]";
    }
}
