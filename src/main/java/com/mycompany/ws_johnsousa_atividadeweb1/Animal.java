/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ws_johnsousa_atividadeweb1;

/**
 *
 * @author johnb
 */
public class Animal {
    private String nome;
    private String especie;
    private String raca;
    private String genero;
    private String dataNascimento;

     public Animal() {}

    public Animal(String nome, String especie, String raca, String genero, String dataNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", raca='" + raca + '\'' +
                ", genero='" + genero + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                '}';
    }
}
