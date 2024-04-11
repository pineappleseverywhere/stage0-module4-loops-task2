package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int temp = 0;
        if (multiplyByAndToInclusive > 0) {
            while (temp <= multiplyByAndToInclusive) {
                System.out.println(temp * multiplyByAndToInclusive);
                temp++;
            }
        } else if (multiplyByAndToInclusive < 0 ) {
            temp = 0;
            while (temp >= multiplyByAndToInclusive) {
                System.out.println(temp * multiplyByAndToInclusive* (-1));
                temp--;
            }
        }

    }
}
