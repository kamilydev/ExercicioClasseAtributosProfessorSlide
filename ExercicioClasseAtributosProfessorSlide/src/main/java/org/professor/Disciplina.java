package org.professor;
import java.util.Scanner;
import java.util.ArrayList;

public class Disciplina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o número de professores que o usuário deseja criar
        System.out.print("Quantos professores você deseja criar? ");
        int numeroDeProfessores = scanner.nextInt();
        scanner.nextLine(); // Consome a nova linha deixada pelo nextInt

        // Cria uma lista para armazenar os objetos professor
        ArrayList<Professor> listaDeProfessores = new ArrayList<>();

        // Coleta os dados de cada professor e cria os objetos
        for (int i = 0; i < numeroDeProfessores; i++) {
            System.out.println("Dados do professor " + (i + 1) + ":");

            // Solicita o nome do professor
            System.out.print("Digite o nome do professor: ");
            String name = scanner.nextLine();

            // Solicita a disciplina do professor
            System.out.print("Digite a disciplina do professor: ");
            String place = scanner.nextLine();


            // Cria um objeto da classe Professor e disciplina e adiciona à lista
            Professor professor = criarProfessor(name, place);
            listaDeProfessores.add(professor);
        }

        // Exibe as informações de todos os professores criados
        System.out.println("\nInformações das pessoas criadas:");
        for (Professor professor : listaDeProfessores) {
            professor.exibirInformacoes();
        }

        // Fecha o scanner
        scanner.close();
    }

    // Método que cria um objeto da classe Professor
    public static Professor criarProfessor(String name, String place) {
        return new Professor(name, place);
    }
}