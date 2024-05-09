public class App {
    public static void main(String[] args) throws Exception {

        // Creo nuovi cd da aggiungere alla classe PortaCD1
        CD cd1 = new CD("Eminem Show", "Eminem", 13, 150);
        CD cd2 = new CD("To Pimp A Butterfly", "Kendrick Lamar", 11, 120);
        CD cd3 = new CD("Graduation", "Kanye West", 12, 135);

        // Creo una classe PortaCD
        PortaCD portaCD1 = new PortaCD(5); 

        // Comparare durata dei vari CD
        // 1 se maggiore
        // -1 se minore
        // 0 se uguale
        System.out.println(cd1.compareDurata(cd2));
        System.out.println(cd2.compareDurata(cd3));
        System.out.println(cd1.compareDurata(cd3));

        // Controllo quanti CD ci sono nell'array
        System.out.println("Nell'array di portaCD1 ci sono: " + portaCD1.getN() + " CD.");

        // Inserisco il CD cd1 in posizione 2 dell'array 
        portaCD1.setCD(cd1,2);
        
        // Controllo quanti CD ci sono nell'array
        System.out.println("Nell'array di portaCD1 ci sono: " + portaCD1.getN() + " CD.");
        // Inserisco il CD cd2 in posizione 0 dell'array 
        portaCD1.setCD(cd2,0);
        // Controllo quanti CD ci sono nell'array
        System.out.println("Nell'array di portaCD1 ci sono: " + portaCD1.getN() + " CD.");

        // Restituisce l'oggetto CD in posizione 2 dell'array 
        System.out.println(portaCD1.getCD(2));
        
        // Elimino il CD presente in posizione 2 dell'array 
        portaCD1.killCD(2);

        System.out.println("Nell'array di portaCD1 ci sono: " + portaCD1.getN() + " CD.");
        // Inserisco il CD cd3 in posizione 4 dell'array 
        portaCD1.setCD(cd3,4);
        System.out.println("Nell'array di portaCD1 ci sono: " + portaCD1.getN() + " CD.");
        
        // Cerco se è presente il titolo di un CD nell'array
        System.out.println(portaCD1.cercaCDPerTitolo("To Pimp A Butterfly"));
        System.out.println(portaCD1.cercaCDPerTitolo("The College Dropout"));

        // Elenco titoli di tutti i CD contenuti nel portaCD1
        System.out.println(portaCD1);
        
        // Creo una nuova classe PortaCD
        PortaCD portaCD2 = new PortaCD(5);

        // Creo nuovi dischi da aggiungere alla classe PortaCD2
        CD cd4 = new CD("Get Rich Or Die Trying", "50 Cent", 9, 110);
        CD cd5 = new CD("Stankonia", "Outkast", 17, 175);

        // Inserisco i vari cd nell'array
        portaCD2.setCD(cd2,4);
        portaCD2.setCD(cd4,3);
        portaCD2.setCD(cd5,1);

        // Hanno in comune solo il cd2 in posizione 0
        System.out.println("Il portaCD1 e portaCD2 hanno in comune: " + portaCD1.confrontaCollezione(portaCD2) + " CD.");






    }

}
