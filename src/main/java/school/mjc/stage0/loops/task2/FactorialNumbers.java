package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int currentNumber = 1;
        System.out.println(1);
        while (currentNumber <= printToInclusive) {
            long factorial = 1;
            int multiplier = 1;

            while (multiplier <= currentNumber) {
                factorial *= multiplier;
                multiplier++;
            }

            System.out.println(factorial);
            currentNumber++;
        }
    }
}
