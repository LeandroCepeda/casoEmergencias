package com.sample.model;

import java.time.LocalDate;

public class Despacho {
    private int id;
    private Recepcion recepcion;
    private int nfichadespacho;
    private int ndespacho;
    private LocalDate fecha;
    private Movil movil;
    private Base base;
    private String hllamado;
    private String hdespacho;
    private String horadisp;
    private String hllegadadom;
    private String hsalidadom;
    private String hsalidab;
    private String hsalidahosp;
    private String hllegadabase;
    private String hllegadahosp;
    private Desenlace desenlace;
    private Institucion institucionderiva;
    private LocalDate fecha_reg;
    private String hora_reg;
}