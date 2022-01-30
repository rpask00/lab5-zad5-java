public class Main {

    public  static void main(String[] args){
        var powiesc = new Powiesc();
        Ksiazka ksiazka;

        ksiazka = (Ksiazka)powiesc;

        powiesc.czytajPowiesc();

        ksiazka.content = "Ksiazka content";

        ksiazka.czytaj();
    }
}


