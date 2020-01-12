package id.ac.poliban.mi.clubligainggris;

public class Club {
    private String gambar;
    private String clubName;
    private String clubDesc;

    public Club(String gambar, String clubName, String clubDesc) {
        this.gambar = gambar;
        this.clubName = clubName;
        this.clubDesc = clubDesc;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubDesc() {
        return clubDesc;
    }

    public void setClubDesc(String clubDesc) {
        this.clubDesc = clubDesc;
    }

    @Override
    public String toString(){
        return String.format("%30s\n\n%s", getClubName(), getClubDesc());
    }
}
