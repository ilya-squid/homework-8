public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задание 1");
        int[] array1 = new int[3];

        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        double[] array2 = {1.57, 7.654, 9.986};

        array2[0] = 1.57;
        array2[1] = 7.654;
        array2[2] = 9.986;

        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);

        boolean[] array3 = new boolean[3];
        array3[0] = true;
        array3[1] = false;
        array3[2] = true;

        // task 2
        System.out.println("Задание 2");

        for (int i = 0; i < array1.length; i++) {
            if (i != array1.length - 1) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.print(array1[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            if (i != array2.length - 1) {
                System.out.print(array2[i] + ", ");
            } else {
                System.out.print(array2[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < array3.length; i++) {
            if (i != array3.length - 1) {
                System.out.print(array3[i] + ", ");
            } else {
                System.out.print(array3[i]);
            }
        }
        System.out.println();
        // task 3
        System.out.println("Задание 3");

        for (int i = array1.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array1[i] + ", ");
            } else {
                System.out.print(array1[i]);
            }
        }
        System.out.println();

        for (int i = array2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array2[i] + ", ");
            } else {
                System.out.print(array2[i]);
            }
        }
        System.out.println();

        for (int i = array3.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(array3[i] + ", ");
            } else {
                System.out.print(array3[i]);
            }
        }
        System.out.println();

        // task 4
        System.out.println("Задание 4");

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] = array1[i] + 1;
            }
            System.out.print(array1[i] + " ");
        }
    }
}