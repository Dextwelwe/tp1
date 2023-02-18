package persistance;
import modele.Document;
import modele.Loan;

import java.util.List;

public interface DaoLibrary {

    void saveLoan(Loan loan);
    Loan getLoanById(int id);
    void delete();
    void update();
    List<Document> getAllDocuments();
    List<Loan> getAllLoans();

}
