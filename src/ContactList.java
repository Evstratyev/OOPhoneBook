/**
 * Created by Евген on 16.10.2017.
 */
public class ContactList {

   private Contacts[] contacts;

    public void add (Contacts contact){

        if (contacts == null){
        contacts = new Contacts[1];
        contacts[0] = contact;
        } else {
            Contacts[] temp = contacts;
            contacts = new Contacts[contacts.length + 1];
            for (int i = 0; i < contacts.length-1; i++){
                contacts[i] = temp[i];
            }
            contacts[contacts.length-1] = contact;
        }
    }

    public void remove (int removeContactIndex){

        Contacts[] temp = contacts;
        contacts = new Contacts[contacts.length-1];
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

    public Contacts get (int index) {
        return contacts[index];
    }
}

