import java.awt.*;
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhập kích thước của mảng 1: ");
        int size1 = scanner.nextInt();

        System.out.print(" Nhập kích thước của mảng 2:");
        int size2 = scanner.nextInt();

        int[] array1 = new int[size1];
        int[] array2 = new int[size2];

        System.out.println("Nhập giá trị cho mảng 1: ");
        for (int i = 0; i < size1; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ":");
            array1[i] = scanner.nextInt();
        }

        System.out.println("Nhập giá trị cho mảng 2: ");
        for (int i = 0; i < size2; i++) {
            System.out.println("Phần tử thứ " + (i + 1) + ":");
            array2[i] = scanner.nextInt();
        }

        int size3 = size1 + size2;
        int[] array3 = new int[size3];
        int index = 0;


        for (int i = 0; i < size1; i++) {
            array3[index++] = array1[i];
        }

        for (int i = 0; i < size2; i++) {
            array3[index++] = array2[i];
        }

        System.out.println("Mảng mới sau khi gộp hai mảng đã cho : ");
        for (int i : array3) {
            System.out.print(i + " ");
        }
    }
}
