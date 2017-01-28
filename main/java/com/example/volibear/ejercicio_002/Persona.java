package com.example.volibear.ejercicio_002;

/**
 * Created by volibear on 18/01/17.
 */

public class Persona {
    private String nombre;
    private double peso;
    private double estuatura;
    private char sexo;
    private byte ejercicio;
    private double imc;
    private String status;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public byte getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(byte ejercicio) {
        this.ejercicio = ejercicio;
    }

    public double getEstuatura() {
        return estuatura;
    }

    public void setEstuatura(double estuatura) {
        this.estuatura = estuatura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getImc() {
        return imc;
    }

    public void calcularImc() {
        imc = peso / (estuatura * estuatura);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", estuatura=" + estuatura +
                ", sexo=" + sexo +
                ", ejercicio=" + ejercicio +
                ", imc=" + imc +
                ", status='" + status + '\'' +
                '}';
    }
}
