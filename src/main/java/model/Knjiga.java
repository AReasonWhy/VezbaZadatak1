package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by androiddevelopment on 16.1.17..
 */
@DatabaseTable
public class Knjiga {

    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = POLJE_NASLOV,canBeNull = false)
    private String naslov;
    @DatabaseField(columnName = POLJE_BROJ_STRANA,canBeNull = false)
    private String BrojStrana;
    @DatabaseField(columnName = POLJE_DATUM_IZDAVANJA,canBeNull = false)
    private java.util.Date datumIzdanja;

    private boolean pristuna;

    public static String POLJE_NASLOV="naslov";
    public static String POLJE_BROJ_STRANA="broj_strana";
    public static String POLJE_DATUM_IZDAVANJA="datum_izdavanja";

    public Knjiga{

    }

    public Knjiga(String naslov, String BrojStrana, java.util.Date datumIzdanja){
        this.naslov = naslov;
        this.BrojStrana = BrojStrana;
        this.datumIzdanja = datumIzdanja;
    }

    //getteri i setteri block

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getBrojStrana() {
        return BrojStrana;
    }

    public void setBrojStrana(String brojStrana) {
        BrojStrana = brojStrana;
    }

    public Date getDatumIzdanja() {
        return datumIzdanja;
    }

    public void setDatumIzdanja(Date datumIzdanja) {
        this.datumIzdanja = datumIzdanja;
    }

    //block end

    @Override
    public String toString() {
        return "Knjiga{" +
                "id=" + id +
                ", naslov='" + naslov + '\'' +
                ", broj strana='" + BrojStrana + '\'' +
                ", datum izdavanja='" + datumIzdanja + '\'' +
                '}';
    }
}
