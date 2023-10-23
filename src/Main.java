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
        int[] weights = new int[12];
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
        System.out.print(x[2] + ", ");
        System.out.print(x[1] + ", ");
        System.out.println(x[0]);
        System.out.print(y[2] + ", ");
        System.out.print(y[1] + ", ");
        System.out.println(y[0]);
        System.out.print(weights[2] + ", ");
        System.out.print(weights[1] + ", ");
        System.out.println(weights[0]);

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