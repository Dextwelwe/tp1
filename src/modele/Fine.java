package modele;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Fine {

    private int id;
    private LibraryCustomer libraryCustomer;
    private final Double amount = 25.00;

}
