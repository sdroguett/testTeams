package com.example.testteams.model;



public class TeamDTO  {

    private String nombre;
    private String pais;
    private int puntuacion;

    public TeamDTO(String nombre, String pais, int puntuacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }



}
