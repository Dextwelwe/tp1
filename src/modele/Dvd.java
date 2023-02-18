package modele;

import lombok.Data;

@Data
public class Dvd extends Document {

    private String director;
    private String mainActor;

    public Dvd(int id, String title, int year, String director, String mainActor) {
        super(id, title, year);
        this.director = director;
        this.mainActor = mainActor;
    }
}
