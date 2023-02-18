package modele;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Loan{

    private int id;
    private LibraryCustomer customer;
    private Document document;
    private LocalDate borrowDate;
    private LocalDate dueDate;

}
