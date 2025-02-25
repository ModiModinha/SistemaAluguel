package SistemaAluguelVeiculos;

import java.util.Objects;
import java.util.Scanner;

public class SistemaVeiculos {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int menu = 0;

        System.out.println("Bem vindo(a) ao Sistema de Aluguel de Veiculos");
        System.out.println("1 - Fazer Login");
        System.out.println("2 - Fazer Cadastro");
        System.out.println("3 - Sair do sistema");
        menu = sc.nextInt();

        if (menu == 2){
            cadastro();
        }



    }
    public static void cadastro(){
        int menu = 0;
        String nome;
        int idade;
        String cpf;
        String telefone;
        String email;
        String senha = "";

        System.out.println("Tela de Cadastro");
        System.out.print("Nome: ");
        nome = sc.next();
        System.out.print("Idade: ");
        idade = sc.nextInt();
        System.out.print("CPF: ");
        cpf = sc.next();
        System.out.print("Telefone/Celular: ");
        telefone = sc.next();
        System.out.print("E-mail: ");
        email = sc.next();
        System.out.print("Senha: ");
        senha = sc.next();

        login(cpf,senha,email);

    }

    public static void login(String cpf,  String senha, String email){
        String Vusuario;
        String Vsenha;


        System.out.println("Tela de Login");
        System.out.print("Insira seu e-mail ou CPF: ");
        Vusuario = sc.next();
        System.out.print("Insira sua senha: ");
        Vsenha = sc.next();

        if (Objects.equals(Vusuario, cpf) || (Objects.equals(Vsenha, senha))){
            menu();
        }

    }

    public static void menu(){
        System.out.println("Ai que não sei oq que não sei que la");
    }

}
