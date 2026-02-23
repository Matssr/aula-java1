package com.sgp.modelo;

public class irma{
     

     private String nome; //atributo privado tipo string
     private String idade; //atributo privado tipo int

    //construtor
    public irma(String nome, String idade){
        this.nome = nome;
        this.idade = idade;
    }

    //construtor padrao
    public irma(){
        this.nome = "Ana Beatriz";
        this.idade = "10";
    }

    //saudação padrao 
    public void saudacao(){
        System.out.println("Ola, "+ nome + "!" + "Voce tem" + idade + "anos");
    }

    //metodos gatters para controle de acesso dos trib priv

    public String getnome(){
        return nome;
        
    } 

}