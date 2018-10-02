package unit9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class AdapterRandomDouble extends RandomDouble implements Readable {
	private int count;

	public AdapterRandomDouble(int count) {
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0) {
			return -1;
		}

		String result = Double.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(new AdapterRandomDouble(7));
		while (s.hasNextDouble()) {
			System.out.println(s.nextDouble() + " ");
		}
	}
}


/*
public class RandomDouble {
	private static Random rand = new Random(47);

	public double next() {
		return rand.nextDouble();
	}

	public static void main(String[] args) {
		RandomDouble rd = new RandomDouble();
		for (int i = 0; i < 7; i++) {
			System.out.println(rd.next() + " ");
		}
	}
}
 */