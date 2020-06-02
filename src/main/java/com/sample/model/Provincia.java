package com.sample.model;

public class Provincia {

    private int id;

    private String descripcion;

    private Pais pais;

    public Provincia(int id, String descripcion, Pais pais) {
        this.id = id;
        this.descripcion = descripcion;
        this.pais = pais;
    }

}