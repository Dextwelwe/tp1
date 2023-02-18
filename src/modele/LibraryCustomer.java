package modele;

import lombok.Data;

@Data
public class LibraryCustomer extends User{

    private Fine fine;

    public LibraryCustomer(int id, String firstName, String lastName, String address) {
        super(id, firstName, lastName, address);
    }

}
