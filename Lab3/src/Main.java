import java.util.List;

public class Main {

    public static void printList(List<Good> List) {
        List.forEach((Good x) -> {
            System.out.println(x.toString());
        });
    }
    
    
    public static void main(String[] args) {

        ChemicalSupplyStore vopak = new ChemicalSupplyStore();

        vopak.addGood(new AirFresheners("Air Fresh Matic", "Fu", 4.2, 5, "Red"));
        vopak.addGood(new AirFresheners("Fresh Matic", "fe", 7.2, 5, "Red"));
        vopak.addGood(new AirFresheners("Matic", "mm", 4.7, 6, "Red"));
        vopak.addGood(new Cleaners("Kitchen", "bb", 4.9, 4, "Red"));
        vopak.addGood(new Cleaners("Floow", "au", 7.2, 15, "Red"));
        vopak.addGood(new Cleaners("Tables", "fu", 4.12, 25, "Red"));
        vopak.addGood(new Cleaners("Windows", "atu", 4.32, 65, "Red"));
        vopak.addGood(new Liquids("Kuhovarka", "gghu", 14.2, 75, "Red"));
        vopak.addGood(new Liquids("Aramazam", "ga", 42.2, 5, "Red"));
        vopak.addGood(new Liquids("Airwic", "Fhet", 43.2, 75, "Red"));
        vopak.addGood(new InsectRepellents("Anticomar", "ab", 40.2, 95, "Red"));
        vopak.addGood(new InsectRepellents("Antizombe", "vsd", 41.2, 15, "Red"));
        vopak.addGood(new InsectRepellents("Airinsect", "advb", 44.2, 65, "Red"));
        vopak.addGood(new Powders("Laundry", "Fg", 46.2, 65, "Red"));
        vopak.addGood(new Powders("Calgon", "Fgn", 49.2, 55, "Red"));
        vopak.addGood(new ScouringPads("Nice", "Fgng", 47.2, 75, "Red"));
        vopak.addGood(new ScouringPads("Bestic", "dxv", 44.2, 15, "Red"));

        System.out.println("\nAvailable Good \n");
        printList(vopak.getGoodsList());
        
        System.out.println("\nSearched Good: ");
        List<Good> result = vopak.findByGroup(GoodType.LIQUIDS, GoodColour.NONE);
        printList(result);

        System.out.println("\nSorted list:\n");
        vopak.sortByPrice(result);
        printList(result); 
            }    
}
