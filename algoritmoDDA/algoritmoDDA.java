import java.util.Scanner;

public class algoritmoDDA {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // declaração de variaveis //
        double x1, x2, y1, y2;

        // definição dos pontos x1, y1 e x2, y2/ /
        System.out.format("Digite o valor do ponto x1: ");
        x1 = input.nextDouble();
        System.out.format("Digite o valor do ponto y1: ");
        y1 = input.nextDouble();
        System.out.format("Digite o valor do ponto x2: ");
        x2 = input.nextDouble();
        System.out.format("Digite o valor do ponto y2: ");
        y2 = input.nextDouble();

        // chamada do procedimento DDA //
        DDA(x1, y1, x2, y2);

    }

    // procedimento DDA //
    public static void DDA(double x1, double y1, double x2, double y2) {

        // declaração de variaveis //
        double length;
        double x, y, xInc, yInc;

        // length = [x2 - x1] (variação de x) para length < 0 //
        length = Math.abs(x2 - x1);

        // length = [y2 - y1] (variação de y) para length > 0 //
        if (Math.abs(y2 - y1) > length) {
            length = Math.abs(y2 - y1);
        }

        // valor da incrementação de x //
        xInc = (x2 - x1) / length;

        // valor da incrementação de y //
        yInc = (y2 - y1) / length;

        // imprime o valor de m //
        if (xInc > 0 && xInc < 1) {
            System.out.format("Valor de m = (%.2f) %n", xInc);
        } else {
            System.out.format("Valor de m = (%.2f) %n", yInc);
        }

        // x e y recebem os pontos iniciais //
        x = x1;
        y = y1;

        // incrementação ocorre enquanto x1 <= x2 //
        while (x <= x2) {
            System.out.format("x = (%.2f) | y = (%.2f) %n", x, y);
            x = x + xInc;
            y = y + yInc;
        }

    }

}