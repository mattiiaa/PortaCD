public class CD {
    private String titolo;
    private String autore;
    private int brani;
    private int durata;

    // Master
    public CD(String titolo, String autore, int brani, int durata) {
        this.titolo = titolo;
        this.autore = autore;
        this.brani = brani;
        this.durata = durata;
    }

    // Get titolo
    public String getTitolo(){
        return titolo;
    }

    // Set titolo
    public void setTitolo(String titolo) {
        this.titolo=titolo;
    }

    // Get autore
    public String getAutore(){
        return autore;
    }

    // Set autore
    public void setAutore(String autore) {
        this.autore=autore;
    }

    // Get brani
    public int getBrani(){
        return brani;
    }

    // Set brani
    public void setBrani(int brani) {
        this.brani=brani;
    }

    // Get durata
    public int getDurata(){
        return durata;
    }

    // Set durata
    public void setDurata(int durata) {
        this.durata=durata;
    }

    // toString
    public String toString() {
        return this.titolo + " ha come autore " + this.autore + ", contiene " + this.brani + " brani e dura " + this.durata + " minuti.";
    }

    // Metodo per comparare la durata di 2 CD
    public int compareDurata(CD cd) {
        int risultato;
        if (cd.getDurata() == durata) {
            risultato = 0;
        } else if (durata > cd.getDurata()) {
            risultato = 1;
        } else {
            risultato = -1;
        }
        return risultato;
    }

}
