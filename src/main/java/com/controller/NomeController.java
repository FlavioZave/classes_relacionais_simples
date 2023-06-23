package com.controller;

import com.dal.NomeDao;
import com.model.Nome;

public abstract class NomeController {
    public static void salvar(Nome nome) {
        try {
            NomeDao.salvar(nome);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
