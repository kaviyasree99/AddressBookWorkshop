
import java.util.ArrayList;

public class AddressBook {

    ArrayList<Contacts> contactlist = new ArrayList<Contacts>();

    /*
    display welcome message
     */
    public void message(){
        System.out.println("Welcome to Address book");
    }

    /*
    add the contact
    */
    public boolean addNewContact(Contacts contact) {
        contactlist.add(contact);
        return true;
    }

    /*
     return Arraylist of contacts
     */
    public ArrayList<Contacts> getContactlist(){
        return contactlist;
    }

}