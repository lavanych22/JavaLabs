import java.util.List;

public class Main {

    public static void printList(List<Goods> List) {
        List.forEach((Goods x) -> {
            System.out.println(x.toString());
        });
    }
    
    
    public static void main(String[] args) {

        ChemicalSupplyStore Vopak = new ChemicalSupplyStore();

        Vopak.addGoods(new AirFresheners("Air Fresh Matic", 4.2, 5, "Fu", 10.0));
        Vopak.addGoods(new AirFresheners("Persik", 3.2, 15, "Otpad", 11.0));
        Vopak.addGoods(new AirFresheners("Yabko", 4.0, 10, "Nyam-nyam", 12.0));
        Vopak.addGoods(new Cleaners("Kitchen", 5.2, 3));
        Vopak.addGoods(new Cleaners("Floor", 2.2, 7));
        Vopak.addGoods(new Cleaners("Bathroom", 7.2, 6));
        Vopak.addGoods(new Cleaners("Polirol'", 4.3, 9));
        Vopak.addGoods(new Liquids("Fairy", 13.3, 3, 5.0, "White", 10.0));
        Vopak.addGoods(new Liquids("Perwoll", 18.3, 7, 4.0, "Pink", 11.0));
        Vopak.addGoods(new Liquids("Persil", 10.3, 7, 7.0, "Black", 21.0));
        Vopak.addGoods(new InsectRepellents("Anti-comar", 4.0, 0, 8.3, 4.0));
        Vopak.addGoods(new InsectRepellents("Anti-bee", 11.0, 2, 3.3, 4.5));
        Vopak.addGoods(new InsectRepellents("Anti-fly", 10.0, 4, 3.7, 8.5));
        Vopak.addGoods(new Powders("Calgon", 5.6, 2, "Sodium triphosphate", 10.0, "Multi-coloured"));
        Vopak.addGoods(new Powders("Tide", 3.6, 4, "Polyphosphoric acid", 10.9, "White"));
        Vopak.addGoods(new ScouringPads("Kuhovarochka", 6.6, 3, 3.6, "Green"));
        Vopak.addGoods(new ScouringPads("Gospodarochka", 7.6, 4, 4.6, "Yellow"));

        System.out.println("\nAvailable goods \n");
        printList(Vopak.getGoodsList());
        
        System.out.println("\nSearched goods: ");
        List<Goods> result = Vopak.findByGroup(GoodsType.LIQUIDS, GoodsColour.NONE);
        printList(result);

        System.out.println("\nSorted list:\n");
        Vopak.sortByPrice(result);
        printList(result); 
    }    
}
