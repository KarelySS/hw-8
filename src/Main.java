import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int[] x = new int[3];
        x[0] = 1;
        x[1] = 2;
        x[2] = 3;
        double[] y = {1.57, 7.654, 9.986};
        int[] weights = new int[3];
        weights[0] = 99;
        weights[1] = 95;
        weights[2] = 93;
        //Задача 2
        System.out.println("Задача 2");
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        System.out.print(weights[0] + ", ");
        System.out.print(weights[1] + ", ");
        System.out.println(weights[2]);
        //Задача 3
        System.out.println("Задача 3");
        for (int i= x.length-1; i>=0; i-- ) {
            System.out.print(x[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i= y.length-1; i>=0; i-- ) {
            System.out.print(y[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
        for (int i= weights.length-1; i>=0; i-- ) {
            System.out.print(weights[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");
             //Задача 4
        System.out.println("Задача 4");
        int[] room = {1, 2, 3, 4, 5};
        for (int i = 0; i < room.length; i++) {
            if (room[i]%2!=0) {
                room [i]=room[i]+1;
            }
        }
        System.out.println(Arrays.toString(room));
    }

}