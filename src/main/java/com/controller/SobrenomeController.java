package com.controller;

import com.dal.SobrenomeDao;
import com.model.Sobrenome;

public abstract class SobrenomeController {
    public static void salvar(Sobrenome sobrenome) {
        try {
            SobrenomeDao.salvar(sobrenome);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
