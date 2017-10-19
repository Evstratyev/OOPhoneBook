/**
 * Created by Евген on 16.10.2017.
 */
public class ContactList {

   private Contacts[] arrayContactList;

    public void add (Contacts contact){

        if (arrayContactList == null){
        arrayContactList = new Contacts[1];
        arrayContactList[0] = contact;
        } else {
            Contacts[] temp = arrayContactList;
            arrayContactList = new Contacts[arrayContactList.length + 1];
            for (int i = 0; i < arrayContactList.length-1; i++){
                arrayContactList[i] = temp[i];
                arrayContactList[arrayContactList.length-1] = contact;
            }
        }
    }

    public void remove (int removeContactIndex){

        Contacts[] temp = arrayContactList;
        arrayContactList = new Contacts[arrayContactList.length-1];
        for (int i = 0; i < removeContactIndex-1; i++){
            arrayContactList[i] = temp[i];
            }
        for (int j = removeContactIndex-1; j < arrayContactList.length; j++){
            arrayContactList[j] = temp[j+1];
        }
    }

    public int size (){
        int size = arrayContactList.length;
        return size;
    }

    public Contacts get (int index) {
        return arrayContactList[index];
    }
}

