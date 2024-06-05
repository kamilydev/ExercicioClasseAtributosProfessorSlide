package org.professor;

public class Professor extends Laboratorio{
    public String name;

    public Professor(String name, String place) {
        this.name = name;
        this.place = place;
    }

    // Métodos getters e setters
    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setIdade(String place) {
        this.place = place;
    }

    // Método para exibir informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + name);
        System.out.println("Local: " + place);
    }
}
