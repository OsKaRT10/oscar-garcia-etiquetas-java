import java.util.Random;

public class Main {

    public void carasDado(int caras) {
        Random random = new Random();
        int result = random.nextInt(caras) + 1;
        System.out.println("El dado tiene " + caras + " caras.");
    }

    public void lanzarVariosDados(int caras, int cantidad) {
        Random random = new Random();
        System.out.println("Lanzando " + cantidad + " dados de " + caras + " caras.");
        for (int i = 1; i <= cantidad; i++) {
            int result = random.nextInt(caras) + 1;
            System.out.println("Resultado del dado " + i);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        if (args.length == 1) {
            int caras = Integer.parseInt(args[0]);
            main.carasDado(caras);
        } else if (args.length == 2) {
            int caras = Integer.parseInt(args[0]);
            int cantidad = Integer.parseInt(args[1]);
            main.lanzarVariosDados(caras, cantidad);
        } else {
            System.out.println("Por favor, introduce 1 o 2 argumentos.");
        }
    }
}

