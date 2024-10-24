import java.util.Random;

public class Main {
	public void carasDado(int caras) {
	Random random = new Random();
	int result = random.nextInt(caras) +1;
		System.out.println("El dado tiene " + caras +  "caras. ");
		}

	public static void main (String[] args) {
		Main main = new Main();
		main.carasDado(6);
		}
	}
