import java.util.zip.ZipFile;

public class Main {
    public static void main(String[] args) {
        exercise1_2_3();
        exercise4();
    }
    public static void exercise1_2_3 () {
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        boolean[] arr3 = {true, false};

        System.out.println(arr1[0] + ", " + arr1[1] + ", " + arr1[2]);
        System.out.println(arr2[0] + ", " + arr2[1] + ", " + arr2[2]);
        System.out.println(arr3[0] + ", " + arr3[1]);

        System.out.println(arr1[2] + ", " + arr1[1] + ", " + arr1[0]);
        System.out.println(arr2[2] + ", " + arr2[1] + ", " + arr2[0]);
        System.out.println(arr3[1] + ", " + arr3[0]);
    }

    public static void exercise4 () {
        int[] arr4 = {1, 2, 3};

        for (int i = 0; i < arr4.length; i++) {
            if(i % 2 != 0) {
                System.out.println(arr4[i]);
            } else {
                System.out.println(arr4[i]+1);
            }
        }

    }
}