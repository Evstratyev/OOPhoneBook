import java.util.Scanner;

/**
 * Created by Евген on 03.09.2017.
 */
public class Book {
    public static void main(String[] args) {

        String[] arrname = new String[100];

        int buf = 0;
        while (true) {

            System.out.println("Menu: " + "\n 1 - Add contact" + "\n 2 - Show all" + "\n 3 - Exit");

            System.out.print("Choise option: ");
            Scanner sc = new Scanner(System.in);
            int choise = sc.nextInt();


            if (choise == 1) {
                System.out.println("Enter name: ");
                String name = sc.next();

//                for (int i = 0; i < arrname.length; i++) {
//                    if (arrname[i] == null) {
//                        arrname[i] = name;
//                        break;
//                    }
//                }

                int i;
                i = buf;            //счетчик кол-ва записанных имен в массиве
                arrname[i] = name;
                buf++;


            } else if (choise == 2) {
                for (int i = 0; i < arrname.length; i++) {
                    if (arrname[i] != null) {
                        System.out.println(arrname[i]);
                    }
                }
                break;

            } else if (choise == 3) {
                break;
            }
        }
    }
}
