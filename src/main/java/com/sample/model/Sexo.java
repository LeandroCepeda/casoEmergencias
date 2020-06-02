package com.sample.model;

public class Sexo {
    private int id;
    private String codigo;
    private String descripcion;

    public Sexo(int id, String codigo, String descripcion) {
        this.codigo = codigo;
        this.id = id;
        this.descripcion = descripcion;
    }
}