package modele;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String address;

    public User() {
    }
}
