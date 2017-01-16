package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by androiddevelopment on 16.1.17..
 */
@DatabaseTable
public class Oblast {

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = POLJE_NAZIV,canBeNull = false)
    private String naziv;
    @DatabaseField(columnName = POLJE_POCETNA_STRANA,canBeNull = false)
    private int pocetnaStrana;

    public static String POLJE_NAZIV="naziv";
    public static String POLJE_POCETNA_STRANA="pocetna_strana";

    public Oblast() {

    }

    public Oblast(String naziv, int pocetnaStrana){
        this.naziv = naziv;
        this.pocetnaStrana = pocetnaStrana;
    }

    //getset block
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getPocetnaStrana() {
        return pocetnaStrana;
    }

    public void setPocetnaStrana(int pocetnaStrana) {
        this.pocetnaStrana = pocetnaStrana;
    }
    //getset block end

    @Override
    public String toString() {
        return "Knjiga{" +
                "id=" + id +
                ", naziv='" + naziv + '\'' +
                ", pocetna strana='" + pocetnaStrana + '\'' +
                '}';
    }
}
