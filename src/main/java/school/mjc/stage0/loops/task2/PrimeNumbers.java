package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int currentNumber = 2;

        while (currentNumber <= printToInclusive) {
            boolean isPrime = true;
            int divisor = 2;

            while (divisor <= Math.sqrt(currentNumber)) {
                if (currentNumber % divisor == 0) {
                    isPrime = false;
                    break; // Exit the inner loop if a divisor is found
                }
                divisor++;
            }

            if (isPrime) {
                System.out.println(currentNumber);
            }

            currentNumber++;
        }
    }
}
