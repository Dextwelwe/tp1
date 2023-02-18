package modele;

import lombok.Data;

@Data
public class Cd extends Document{

    private String genre;
    private int length;

    public Cd(int id, String title, int year, String genre, int length) {
        super(id, title, year);
        this.genre = genre;
        this.length = length;
    }
}
