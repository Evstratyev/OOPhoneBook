import java.util.Scanner;

/**
 * Created by Евген on 03.09.2017.
 */
public class Book {
    public static void main(String[] args) {

        ContactList newContactList = new ContactList();

        while (true) {

            System.out.println("Menu: " + "\n 1 - Add contact" + "\n 2 - Show all" + "\n 3 - delete contact" + "\n 4 - Exit");

            System.out.print("Choise option: ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();


            if (option == 1) {
                System.out.print("Enter name: ");
                Contacts newContact = new Contacts();
                newContact.setName(sc.next());
                System.out.print("Enter phone: ");
                newContact.setPhone(sc.next());
                System.out.print("Enter e-mail: ");
                newContact.setEmail(sc.next());

                newContactList.add(newContact);

            }
            else if (option == 2) {
                for (int i = 0; i < newContactList.size(); i++) {
                    System.out.println(newContactList.get(i).toString());
                    System.out.println("Contact List size: " +newContactList.size());
                }
            }

            else if (option == 3) {
                System.out.print("Delete contact number: ");
                int removeTemp = sc.nextInt();
                newContactList.remove(removeTemp);
            } else break;
        }
    }
}

//            } else if (option == 2) {
//                for (int i = 0; i < phoneBook.length; i++) {
//                    if (phoneBook[i] != null) {
//                        System.out.println(phoneBook[i].toString());
//                    }
//                }
//
//
//            } else if (option == 3) {
//                System.out.print("Enter contact to delete: ");
//                String contactDelete = sc.next();
//                for (int i = 0; i < phoneBook.length; i++) {
//                    if (phoneBook[i].getName().equals(contactDelete)) {
//                        phoneBook[i] = null;
//                        break;
//                    }
//                }
//            } else break;
//        }
//    }
//}

