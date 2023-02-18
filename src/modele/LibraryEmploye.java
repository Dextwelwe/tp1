package modele;

import lombok.Data;

@Data
public class LibraryEmploye extends User{

    public LibraryEmploye(int id, String firstName, String lastName, String address) {
        super(id, firstName, lastName, address);
    }
}
