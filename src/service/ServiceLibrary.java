package service;

import modele.Document;
import modele.Fine;
import modele.LibraryCustomer;
import modele.Loan;
import persistance.DaoLibrary;

import java.time.LocalDate;
import java.util.List;

public class ServiceLibrary {

    private DaoLibrary dao;

    public ServiceLibrary(DaoLibrary dao) {
        this.dao = dao;
    }

    public void createLoan(int id, LibraryCustomer customer, Document document, LocalDate borrowDate, LocalDate dueDate){
        dao.saveLoan(new Loan(id, customer, document, borrowDate, dueDate));
    }

    public Loan getLoanById(int id){
      return dao.getLoanById(id);
    }

    public List<Loan> getAllLoans(){
        return null;
    }

    public List<Loan> getAllLoansByMonth(String month){
        return null;
    }

    public List<Fine> getAllFines(){
    return null;
    }

    public List<Fine> getAllFinesByMonth(String month){
        return null;
    }

    public int getTotalNumberOfFines(){
        return -1;
    }

    public List<Document> getAllDocuments(){
        return null;
    }

    public List<Document> getDocumentsByAuthor(String author){
        return null;
    }

    public List<Document> getDocumentsByEditor(String editor){
        return null;
    }

    public List<Document> getDocumentsByYear(String year){
        return null;
    }

    public List<Document> getDocumentsByTitle(String title){
        return null;
    }






}
