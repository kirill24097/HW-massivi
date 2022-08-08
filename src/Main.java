public class Main {
    public static void main(String[] args){
        int[] arr = generateRandomArray();

///1
        int sum = 0;
        for (int daySuumma : arr) {
            sum = sum + daySuumma;
        }
        System.out.println("Сумма трат за месяц составила   " + sum + "   рублей");
        ///2

        int minSuma = arr[0];
        int maksSuma = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minSuma > arr[i]) {
                minSuma = arr[i];
            } else if (maksSuma < arr[i]) {
                maksSuma = arr[i];
            }

        }

        System.out.println("Минимальная сумма трат за день составила  " + minSuma + "  рублей.  " +
                "Максимальная сумма трат за день составила  " + maksSuma + "  рублей");

        ///3
        double srednyaSummaZaVtsyats = (double) sum / arr.length;
        {
            System.out.println("Средняя сумма трат за месяц составила  " + srednyaSummaZaVtsyats + "  рублей");
        }
        ///4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }




}