import java.util.Scanner;

public class algoritmoPM {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // declaração de variaveis //
        int x1, x2, y1, y2;

        // definição dos pontos x1, y1 e x2, y2/ /
        System.out.format("Digite o valor do ponto x1: ");
        x1 = input.nextInt();
        System.out.format("Digite o valor do ponto y1: ");
        y1 = input.nextInt();
        System.out.format("Digite o valor do ponto x2: ");
        x2 = input.nextInt();
        System.out.format("Digite o valor do ponto y2: ");
        y2 = input.nextInt();

        // chamada do procedimento PM //
        PM(x1, y1, x2, y2);

    }

    public static void PM(int x1, int y1, int x2, int y2) {
        // declaração de variaveis //
        int dx, dy, p, p2, xy2, x, y, xf;

        // valores de dx e dy //
        dx = x2 - x1;
        dy = y2 - y1;

        // calculo do parametro de decisão //
        p = 2 * dy - dx;

        // variaveis auxiliares //
        p2 = 2 * dy;
        xy2 = 2 * (dy - dx);

        // verifica se valor x1 > x2 //
        if (x1 > x2) {
            // inversão de pontos//
            x = x2;
            y = y2;
            xf = x1;
        } else {
            x = x1;
            y = y1;
            xf = x2;
        }

        System.out.format("x = (%d) | y = (%d) %n", x, y);

        // enquanto o ponto x < xf //
        while (x < xf) {
            x = x + 1;

            // se p for negativo incrementa apenas x + 1 //
            // caso contrario, incrementa x + 1 e y + 1 //
            if (p < 0) {
                p = p + p2;
            } else {
                y = y + 1;
                p = p + xy2;
            }
            System.out.format("x = (%d) | y = (%d) %n", x, y);
        }

    }

}
