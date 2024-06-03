package atividaderestaurante;

import java.util.Scanner;

public class AtividadeRestaurante {

    public static void main(String[] args) {

        double a, c = 0;
        int b;
        Scanner ler = new Scanner(System.in);
        System.out.print("digite o valor da sua refeição: ");
        a = ler.nextDouble();

        do {

            System.out.print("insira a nota de 0 a 10 para avaliar o atendimento: ");
            b = ler.nextInt();

            if ((b >= 0) && (b <= 3)) {
                System.out.println("nosso atendimento foi ruim. caso queria dar uma gorjeta de 3%"
                        + " do total gasto nos ajudaria a melhorar");
                c = a * 3 / 100;
                break;
            } else if ((b >= 4) && (b <= 6)) {

                System.out.println("nosso atendimento foi regular. caso queria dar uma gorjeta de 3%"
                        + " do total gasto nos ajudaria a melhorar");
                c = a * 4 / 100;
                break;
            } else if ((b >= 7) && (b <= 8)) {

                System.out.println("nosso atendimento foi bom. caso queria dar uma gorjeta de 6%"
                        + " do total gasto nos ajudaria a melhorar");

                c = a * 6 / 100;
                break;
            } else if ((b >= 9) && (b <= 10)) {

                System.out.println("nosso atendimento foi ótimo. caso queria dar uma gorjeta de 12%"
                        + " do total gasto nos ajudaria a melhorar");
                c = a * 12 / 100;
                break;
            }

        } while ((b <= 0) || (b >= 10));

        System.out.println("valor da refeição: " + a);
        System.out.println("valor da gorjeta: " + c);
        System.out.println("valor total(gorjeta + refeição): " + (c + a));

    }
}
