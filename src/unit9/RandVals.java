package unit9;

import java.util.Random;

public interface RandVals {
	Random RAND = new Random();
	int RANDOM_INT = RAND.nextInt(10);
	long RAND_LONG = RAND.nextLong() * 10;
	float RAND_FLOAT = RAND.nextFloat() * 10;
	double RAND_DOUBLE = RAND.nextDouble() * 10;
}
