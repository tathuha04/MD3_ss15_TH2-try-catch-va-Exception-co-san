import java.util.Random;
import java.util.Scanner;

public class Main {
    public Integer[] createRandom(){
        Random random = new Random();
        Integer[] array = new Integer[100];
        System.out.println("danh sách các phần tử của mảng : ");
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
            System.out.println(array[i] + " ");
        }
        return array;
    }
    public static void main(String[] args) {
       Main arrayExample = new Main();
       Integer[] array = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số " + x + " là " + array[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }

    }
}