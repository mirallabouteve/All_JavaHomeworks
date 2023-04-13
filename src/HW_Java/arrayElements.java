package HW_Java;

public class arrayElements {
    public static void main(String[] args) {
        double[] array = {2.5, 3.0, 1.0, 4.0, 0.5};

        for (int i = 0; i < array.length; i++) {
            if (array[i] * 0.75 < 1.0) {
                array[i] *= 1.25;
            } else {
                array[i] *= 0.75;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
