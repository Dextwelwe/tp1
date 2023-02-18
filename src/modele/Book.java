package modele;

import lombok.Data;

@Data
public class Book extends Document {

    private enum Type {
        Roman,
        Manuel,
        Etude,
        Magazine
    }
    private String author;
    private String editor;
    private int pages;
    private Type type;



    public Book(int id, String title, int year , String author, String editor , int pages, Type type) {
        super(id, title, year);
        this.author = author;
        this.editor = editor;
        this.pages = pages;
        this.type = type;
    }
}
