public class Podrecznik extends Ksiazka {
    String content = "podrecznik content...";

    public  void czytajPodrecznik(){
        System.out.println("Czytanie zawartosci podrecznika");
        super.czytaj();
    }

}
