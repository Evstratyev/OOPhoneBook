import java.util.Scanner;

/**
 * Created by Евген on 03.09.2017.
 */
public class Book {
    public static void main(String[] args) {

        Contacts[] phoneBook = new Contacts[5];

        int arrnamecount = 0;
        while (true) {

            System.out.println("Menu: " + "\n 1 - Add contact" + "\n 2 - Show all" + "\n 3 - delete contact" + "\n 4 - Exit");

            System.out.print("Choise option: ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();


            if (option == 1) {
                System.out.print("Enter name: ");
                phoneBook[arrnamecount] = new Contacts();

                phoneBook[arrnamecount].setName(sc.next());

                System.out.print("Enter phone: ");
                phoneBook[arrnamecount].setPhone(sc.next());

                System.out.print("Enter e-mail: ");
                phoneBook[arrnamecount].setEmail(sc.next());

                arrnamecount++;

            } else if (option == 2) {
                for (int i = 0; i < phoneBook.length; i++) {
                    if (phoneBook[i] != null) {
                        System.out.println(phoneBook[i].toString());
                    }
                }


            } else if (option == 3) {
                System.out.print("Enter contact to delete: ");
                String contactDelete = sc.next();
                for (int i = 0; i < phoneBook.length; i++) {
                    if (phoneBook[i].getName().equals(contactDelete)) {
                        phoneBook[i] = null;
                        break;
                    }
                }
            } else break;
        }
    }
}

