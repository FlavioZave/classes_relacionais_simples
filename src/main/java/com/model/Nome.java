package com.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Nome implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;

    @OneToMany(mappedBy = "nome")
    private List<Sobrenome> sobrenome = new ArrayList<Sobrenome>();

    public Nome(String nome) {
        this.nome = nome;
    }

    public Nome(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Sobrenome> getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(List<Sobrenome> sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Nome [id=" + id + ", nome=" + nome + "]";
    }
}
