package Learning;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleApp {


    static private void sortArray(int[] mass) {

        int in, out;

        for (out=1; out < mass.length; out++){
            int temp = mass[out];
            in = out;
            while (in>0 && mass[in-1] >= temp){
                mass[in] = mass[in-1];
                --in;
            }
            mass[in] = temp;
        }

        System.out.println(Arrays.toString(mass));
    }

    static void findElement(int[] mass, int num){

        for (int element : mass) {
            element++;
            if (element == num)
                System.out.println("Position of element in arrray is " + element );
        }
        System.out.println("Element was not found");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mass;
        int numElems = 0;
        int menuChice;


            System.out.println("For manipulation with array type capacity of array");
            numElems = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Now array have size of " + numElems + " elements");
                 mass =new int[numElems];

            System.out.println("Enter the value for each of the elements of array");
                for (int i = 0; i < numElems; i++)
                mass[i] = scanner.nextInt();
                System.out.println();

        while (true) {
            System.out.println();
            System.out.println("Enter 1 to sort array");
            System.out.println("Enter 2 to find some element in array");
            System.out.println("Enter 3 to quit from menu");
            menuChice = scanner.nextInt();
            System.out.println();


            switch (menuChice) {
                case 1:
                    sortArray(mass);
                    break;
                case 2:
                    System.out.println("Enter the number to find it in array");
                    int findNamber = scanner.nextInt();
                    System.out.println();
                    findElement(mass, findNamber);
                    break;
                case 3:
                    break;
            }
        }
    }
}
