/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backendmadrid.nutricion.modelo;

/**
 *
 * @author USUARIO
 */
public class Ingrediente {
    
    private int id;
    private String descripcion;
    private double agua;
    private int energia;
    private double proteinas;
    private double grasas;
    private double carbohidratos;
    private double fibra;
    private double azucar;
    private int calcio;
    private double hierro;
    private double magnesio;
    private int fosforo;
    private int potasio;
    private int sodio;
    private double vitamina_c;
    private double vitamina_b12;
    private int vitamina_a;
    private double vitamina_e;
    private double vitamina_d;
    private double grasas_saturadas;
    private double grasas_mono;
    private double grasas_poli;
    private int colesterol;

    public Ingrediente() {
    }

    public Ingrediente(int id, String descripcion, double agua, int energia, double proteinas, double grasas, double carbohidratos, double fibra, double azucar, int calcio, double hierro, double magnesio, int fosforo, int potasio, int sodio, double vitamina_c, double vitamina_b12, int vitamina_a, double vitamina_e, double vitamina_d, double grasas_saturadas, double grasas_mono, double grasas_poli, int colesterol) {
        this.id = id;
        this.descripcion = descripcion;
        this.agua = agua;
        this.energia = energia;
        this.proteinas = proteinas;
        this.grasas = grasas;
        this.carbohidratos = carbohidratos;
        this.fibra = fibra;
        this.azucar = azucar;
        this.calcio = calcio;
        this.hierro = hierro;
        this.magnesio = magnesio;
        this.fosforo = fosforo;
        this.potasio = potasio;
        this.sodio = sodio;
        this.vitamina_c = vitamina_c;
        this.vitamina_b12 = vitamina_b12;
        this.vitamina_a = vitamina_a;
        this.vitamina_e = vitamina_e;
        this.vitamina_d = vitamina_d;
        this.grasas_saturadas = grasas_saturadas;
        this.grasas_mono = grasas_mono;
        this.grasas_poli = grasas_poli;
        this.colesterol = colesterol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getAgua() {
        return agua;
    }

    public void setAgua(double agua) {
        this.agua = agua;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getGrasas() {
        return grasas;
    }

    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }

    public double getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(double carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public double getFibra() {
        return fibra;
    }

    public void setFibra(double fibra) {
        this.fibra = fibra;
    }

    public double getAzucar() {
        return azucar;
    }

    public void setAzucar(double azucar) {
        this.azucar = azucar;
    }

    public int getCalcio() {
        return calcio;
    }

    public void setCalcio(int calcio) {
        this.calcio = calcio;
    }

    public double getHierro() {
        return hierro;
    }

    public void setHierro(double hierro) {
        this.hierro = hierro;
    }

    public double getMagnesio() {
        return magnesio;
    }

    public void setMagnesio(double magnesio) {
        this.magnesio = magnesio;
    }

    public int getFosforo() {
        return fosforo;
    }

    public void setFosforo(int fosforo) {
        this.fosforo = fosforo;
    }

    public int getPotasio() {
        return potasio;
    }

    public void setPotasio(int potasio) {
        this.potasio = potasio;
    }

    public int getSodio() {
        return sodio;
    }

    public void setSodio(int sodio) {
        this.sodio = sodio;
    }

    public double getVitamina_c() {
        return vitamina_c;
    }

    public void setVitamina_c(double vitamina_c) {
        this.vitamina_c = vitamina_c;
    }

    public double getVitamina_b12() {
        return vitamina_b12;
    }

    public void setVitamina_b12(double vitamina_b12) {
        this.vitamina_b12 = vitamina_b12;
    }

    public int getVitamina_a() {
        return vitamina_a;
    }

    public void setVitamina_a(int vitamina_a) {
        this.vitamina_a = vitamina_a;
    }

    public double getVitamina_e() {
        return vitamina_e;
    }

    public void setVitamina_e(double vitamina_e) {
        this.vitamina_e = vitamina_e;
    }

    public double getVitamina_d() {
        return vitamina_d;
    }

    public void setVitamina_d(double vitamina_d) {
        this.vitamina_d = vitamina_d;
    }

    public double getGrasas_saturadas() {
        return grasas_saturadas;
    }

    public void setGrasas_saturadas(double grasas_saturadas) {
        this.grasas_saturadas = grasas_saturadas;
    }

    public double getGrasas_mono() {
        return grasas_mono;
    }

    public void setGrasas_mono(double grasas_mono) {
        this.grasas_mono = grasas_mono;
    }

    public double getGrasas_poli() {
        return grasas_poli;
    }

    public void setGrasas_poli(double grasas_poli) {
        this.grasas_poli = grasas_poli;
    }

    public int getColesterol() {
        return colesterol;
    }

    public void setColesterol(int colesterol) {
        this.colesterol = colesterol;
    }
  
}
