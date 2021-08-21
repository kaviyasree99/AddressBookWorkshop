
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AddressBookTest {
    AddressBook addressBook;

    @Test
    public void whenGivenAddressbook_whenAdded_shouldReturnContactList() {
        addressBook = new AddressBook();
        Contacts contact = new Contacts("Kaviya", "Sree", "Chennai", "Tamilnadu", 560009
                , 966334555, "kaviyasreer@gmail.com");
        addressBook.addNewContact(contact);

        ArrayList<Contacts> contactList = addressBook.getContactlist();
        Assertions.assertEquals(1, contactList.size());
    }
}
