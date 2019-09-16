package input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        inputs variavel = new inputs();

        System.out.println(variavel.lerInt());
        System.out.println(variavel.showInt("mensagem por parametro retorna inteiro"));

        System.out.println(variavel.lerChar());
        System.out.println(variavel.showChar("mensagem por parametro retorna um char"));

        System.out.println(variavel.lerFloat());
        System.out.println(variavel.showFloat("mensagem por parametro retorna um float"));

        System.out.println(variavel.lerDouble());
        System.out.println(variavel.showDouble("mensagem por parametro retorna um double"));

        System.out.println(variavel.lerString());
        System.out.println(variavel.showString("mensagem por parametro retorna uma string"));

        System.out.println(variavel.lerEmail());

        System.out.println(variavel.lerTel());

        System.out.println(variavel.lerData());

        System.out.println(variavel.trocarData());

        System.out.println(variavel.validaNumero());

    }
}
