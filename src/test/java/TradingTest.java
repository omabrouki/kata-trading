import java.util.Arrays;
import java.util.List;

public class TradingTest {

    private static class Trader {

        private String name;

        private String city;

        public Trader(String n, String c) {
            this.name = n;
            this.city = c;
        }

        public String getName() {
            return this.name;
        }

        public String getCity() {
            return this.city;
        }

        public void setCity(String newCity) {
            this.city = newCity;
        }

        public String toString() {
            return "Trader:" + this.name + " in " + this.city;
        }

    }

    private static class Transaction {

        private Trader trader;
        private int year;
        private int value;

        public Transaction(Trader trader, int year, int value) {

            this.trader = trader;
            this.year = year;
            this.value = value;
        }

        public Trader getTrader() {
            return this.trader;
        }

        public int getYear() {
            return this.year;
        }

        public int getValue() {
            return this.value;
        }

        public String toString() {

            return "{" + this.trader + ", " +
                    "year: " + this.year + ", " +
                    "value:" + this.value + "}";
        }

    }

    public List<Transaction> given_transactions() {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        Trader john = new Trader("John", "Hong-Kong");

        return Arrays.asList(

                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950),
                new Transaction(john, 2010, 100)
        );

    }

    // Etant donné le modèle ci-dessus et la liste de transactions fournie

    // 1 : Coder une méthode qui retourne toutes les transactions de 2011

    // -> la liste doit être triée par valeur croissante

    // -> refactorer pour prendre l'année en paramètre

    // 2 : Coder une méthode qui retourne les villes (sans doublon) où travaillent les traders

    // 3 : Coder une méthode qui retourne les noms de tous les tradeurs de Cambridge

    // -> la liste doit être triée par ordre alphabétique ascendant

    // -> refactorer pour prendre la ville en paramètre

    // 4 : Coder une méthode qui retourne dans une chaine les noms de tous les tradeurs triée par ordre alphabétique ascendant

    // 5 : Coder une méthode qui retourne vrai si un Trader se trouve à Milan

    // -> refactorer pour prendre la ville en paramètre

    // 7 : Coder une méthode qui retourne la plus grande valeur de toutes les transactions

}
