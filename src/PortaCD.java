public class PortaCD {
    private CD dischi[];
    private int max_num_cd;

    
    public PortaCD(int n) {
        max_num_cd = n;
        dischi = new CD[n];
    }

    public int setCD(CD cd, int posizione) {
        if (posizione < 0 || posizione >= max_num_cd) {
            return -1;
        } else if (dischi[posizione] != null) {
            return -2;
        } else {
            dischi[posizione]=cd;
            return posizione;
        }
    }

    public CD getCD(int posizione) {
        if (posizione < 0 || posizione >= max_num_cd) {
            return null;
        } else {
            return dischi[posizione];
        }
    }

    public int killCD(int posizione) {
        int risultato = -1;
        if (posizione < 0 || posizione >= max_num_cd) {
            return -1;
        } else if (dischi[posizione] == null) {
            return -2;
        } else {
            dischi[posizione] = null;
            risultato=posizione;
        }
        return risultato;
    }

    public int getNumMaxDischi(){
        return max_num_cd;
    }

    public int getN() {
        int numCD = 0;
        for (int i = 0; i < max_num_cd; i++) {
            if (dischi[i] != null) {
                numCD += 1;
            }
        }
        return numCD;
    }

    public int cercaCDPerTitolo (String titolo){
        int posCD = -1;
        int i = 0;
        while (i < dischi.length && posCD == -1) {
            if (dischi[i] != null && dischi[i].getTitolo().equals(titolo)) {
                posCD = i;
            }
            i++;
        }
        return posCD;
    }
    
    /*public int confrontaCollezione(PortaCD p) {
        int risultato = 0;
        for (int i = 0; i < dischi.length; i++) {
            if (dischi[i] != null && dischi[i].equals(p.dischi[i])) {
                risultato++;
            }
        }
        return risultato;
    }*/

    public int confrontaCollezione(PortaCD p) {
        int pos = 0;
        int x = 0;
        boolean trovato = true;
        int numCD = 0;
        while (trovato == true && pos <= max_num_cd) {
            int i = 0;
            while (trovato == true && pos <= max_num_cd) {
                if (dischi[x] != null && dischi[x].equals(dischi[i])) {
                    trovato = false;
                    numCD++;
                }
            }
        }
        return numCD;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < max_num_cd; i++) {
            if (dischi[i]!=null) {
                s+="Il portaCD in posto: " + i + " ha come titolo " + dischi[i].getTitolo() + "\n";
            } else {
                s+="Il portaCD in posto: " + i + " ha come titolo " + null + "\n";
            }
        }
        return s;
    }

}
