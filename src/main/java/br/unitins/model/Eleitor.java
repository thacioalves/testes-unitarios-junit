package br.unitins.model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Eleitor {
    private String nome;
    private String titulo;
    private LocalDateTime dataNascimento;

    public Eleitor(String nome, String titulo, LocalDateTime dataNascimento) {
        this.nome = nome;
        this.titulo = titulo;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateTime dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade(){
        return (int)ChronoUnit.YEARS.between(dataNascimento, LocalDateTime.now());
    }
    public boolean aprovadoVotar(){
        return getIdade() >= 16;
    }
}