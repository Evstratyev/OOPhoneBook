/**
 * Created by Евген on 16.10.2017.
 */
public class ContactList {

   private Contact[] contacts;

    public void add (Contact contact){

        if (contacts == null){
        contacts = new Contact[1];
        contacts[0] = contact;
        } else {
            Contact[] temp = contacts;
            contacts = new Contact[contacts.length + 1];
            for (int i = 0; i < contacts.length-1; i++){
                contacts[i] = temp[i];
            }
            contacts[contacts.length-1] = contact;
        }
    }

    public void remove (int removeContactIndex){

        Contact[] temp = contacts;
        contacts = new Contact[contacts.length-1];
        for (int i = 0; i < removeContactIndex-1; i++){
            contacts[i] = temp[i];
            }
        for (int j = removeContactIndex-1; j < contacts.length; j++){
            contacts[j] = temp[j+1];
        }
    }

    public int size (){
        return contacts.length;
    }

    public Contact get (int index) {
        return contacts[index];
    }
}

