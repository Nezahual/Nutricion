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
    private double vitaminaC;
    private double vitaminaB12;
    private int vitaminaA;
    private double vitaminaE;
    private double vitaminaD;
    private double grasasSaturadas;
    private double grasasMono;
    private double grasasPoli;
    private int colesterol;

    public Ingrediente() {
    }
    
    public Ingrediente(Ingrediente ingredienteAux) {
        this.id = ingredienteAux.getId();
        this.descripcion = ingredienteAux.getDescripcion();
        this.agua = ingredienteAux.getAgua();
        this.energia = ingredienteAux.getEnergia();
        this.proteinas = ingredienteAux.getProteinas();
        this.grasas = ingredienteAux.getGrasas();
        this.carbohidratos = ingredienteAux.getCarbohidratos();
        this.fibra = ingredienteAux.getFibra();
        this.azucar = ingredienteAux.getAzucar();
        this.calcio = ingredienteAux.getCalcio();
        this.hierro = ingredienteAux.getHierro();
        this.magnesio = ingredienteAux.getMagnesio();
        this.fosforo = ingredienteAux.getFosforo();
        this.potasio = ingredienteAux.getPotasio();
        this.sodio = ingredienteAux.getSodio();
        this.vitaminaC = ingredienteAux.getVitaminaC();
        this.vitaminaB12 = ingredienteAux.getVitaminaB12();
        this.vitaminaA = ingredienteAux.getVitaminaA();
        this.vitaminaE = ingredienteAux.getVitaminaD();
        this.vitaminaD = ingredienteAux.getVitaminaD();
        this.grasasSaturadas = ingredienteAux.getGrasasSaturadas();
        this.grasasMono = ingredienteAux.getGrasasMono();
        this.grasasPoli = ingredienteAux.getGrasasPoli();
        this.colesterol = ingredienteAux.getColesterol();
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
        this.vitaminaC = vitamina_c;
        this.vitaminaB12 = vitamina_b12;
        this.vitaminaA = vitamina_a;
        this.vitaminaE = vitamina_e;
        this.vitaminaD = vitamina_d;
        this.grasasSaturadas = grasas_saturadas;
        this.grasasMono = grasas_mono;
        this.grasasPoli = grasas_poli;
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

    public double getVitaminaC() {
        return vitaminaC;
    }

    public void setVitaminaC(double vitaminaC) {
        this.vitaminaC = vitaminaC;
    }

    public double getVitaminaB12() {
        return vitaminaB12;
    }

    public void setVitaminaB12(double vitaminaB12) {
        this.vitaminaB12 = vitaminaB12;
    }

    public int getVitaminaA() {
        return vitaminaA;
    }

    public void setVitaminaA(int vitaminaA) {
        this.vitaminaA = vitaminaA;
    }

    public double getVitaminaE() {
        return vitaminaE;
    }

    public void setVitaminaE(double vitaminaE) {
        this.vitaminaE = vitaminaE;
    }

    public double getVitaminaD() {
        return vitaminaD;
    }

    public void setVitaminaD(double vitaminaD) {
        this.vitaminaD = vitaminaD;
    }

    public double getGrasasSaturadas() {
        return grasasSaturadas;
    }

    public void setGrasasSaturadas(double grasasSaturadas) {
        this.grasasSaturadas = grasasSaturadas;
    }

    public double getGrasasMono() {
        return grasasMono;
    }

    public void setGrasasMono(double grasasMono) {
        this.grasasMono = grasasMono;
    }

    public double getGrasasPoli() {
        return grasasPoli;
    }

    public void setGrasasPoli(double grasasPoli) {
        this.grasasPoli = grasasPoli;
    }

    public int getColesterol() {
        return colesterol;
    }

    public void setColesterol(int colesterol) {
        this.colesterol = colesterol;
    }
  
}
