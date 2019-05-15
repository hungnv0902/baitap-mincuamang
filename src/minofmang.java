import java.util.Scanner;

public class minofmang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang :");
        int size = input.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i ++) {
            System.out.println("Nhap phan tu " + (i +1));
            array[i] = input.nextInt();
        }
        int min = array[0];
        for(int j = 1 ; j < size; j ++) {
            if (array[j] < min) {
                min = array[j];
            }
        }

        System.out.println("GT nho nhat la " + min);
    }
}
