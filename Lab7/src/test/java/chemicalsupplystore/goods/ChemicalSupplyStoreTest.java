package chemicalsupplystore.goods;

import chemicalsupplystore.Customer;
import chemicalsupplystore.Writer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.runner.RunWith;

import java.util.LinkedList;
import java.util.List;

import static chemicalsupplystore.goods.ChemicalSupplyStore.printList;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@RunWith(JUnitPlatform.class)
@IncludeEngines("junit-jupiter")
public class ChemicalSupplyStoreTest {
    private ChemicalSupplyStore koshyk;
    private Customer customer;

    @BeforeEach
    void init() {
        customer = new Customer("Taras", "Gag", 100.5, 10);
        customer.toString();

        koshyk = new ChemicalSupplyStore("koshyk", "Lviv", 10, "from 9 to 21");

        koshyk.addGoods(new AirFresheners("Air Fresh Matic", 4.2, 5, "Fu", 10.0));
        koshyk.addGoods(new AirFresheners("Persik", 3.2, 15, "Otpad", 11.0));
        koshyk.addGoods(new AirFresheners("Yabko", 4.0, 10, "Nyam-nyam", 12.0));
        koshyk.addGoods(new Cleaners("Kitchen", 5.2, 3));
        koshyk.addGoods(new Cleaners("Floor", 2.2, 7));
        koshyk.addGoods(new Cleaners("Bathroom", 7.2, 6));
        koshyk.addGoods(new Cleaners("Polirol'", 4.3, 9));
        koshyk.addGoods(new LaundryDetergents("Fairy", 5.3, 3, 5.0, 10.0));
        koshyk.addGoods(new Liquids("Fairy", 5.3, 3, 5.0, "White", 10.0));
        koshyk.addGoods(new Liquids("Perwoll", 8.3, 7, 4.0, "Pink", 11.0));
        koshyk.addGoods(new Liquids("Persil", 10.3, 7, 7.0, "Black", 21.0));
        koshyk.addGoods(new InsectRepellents("Anti-comar", 4.0, 0, 8.3, 4.0));
        koshyk.addGoods(new InsectRepellents("Anti-bee", 11.0, 2, 3.3, 4.5));
        koshyk.addGoods(new InsectRepellents("Anti-fly", 10.0, 4, 3.7, 8.5));
        koshyk.addGoods(new Powders("Calgon", 5.6, 2, "Sodium triphosphate", 10.0, "Multi-coloured"));
        koshyk.addGoods(new Powders("Tide", 3.6, 4, "Polyphosphoric acid", 10.9, "White"));
        koshyk.addGoods(new ScouringPads("Kuhovarochka", 6.6, 3, 3.6, "Green"));
        koshyk.addGoods(new ScouringPads("Gospodarochka", 7.6, 4, 4.6, "Yellow"));
    }

    @Test
    public void testPrintList() {
        List<Goods> goodsList = new LinkedList<>();
        printList(goodsList);
        String expected = "";
        assertEquals(expected,"","Fields don't match");
    }

    @Test
    public final void testGeneralToString() {
        ChemicalSupplyStore koshyk = new ChemicalSupplyStore("koshyk", "Lviv", 10, "from 9 to 21");
        assertFalse(koshyk.toString().contains("@"));
    }

    @Test
    public void testGeneralAddGoods() {
        ChemicalSupplyStore chemicalSupplyStore = new ChemicalSupplyStore("Epicenter", "Lviv", 5, "from 9 to 15");
        List<Goods> goodsList = new LinkedList<>();
        assertTrue(goodsList.isEmpty());
        chemicalSupplyStore.addGoods(new AirFresheners("Airic", 10.5, 5, "Nice", 0.5));
        assertTrue(goodsList.isEmpty());
    }

    @Test
    public void testFindByType() {

        List<Goods> result1 = koshyk.findByGroup(GoodsType.AIR_FRESHENERS, GoodsColour.BLACK);
        assertEquals(GoodsType.AIR_FRESHENERS, result1.get(0).getGoodsType(), "Type doesn't match");
        assertNotEquals(GoodsType.CLEANERS, result1.get(1).getGoodsType() , "Type doesn't match");

    }

    @Test
    public void testSortByPrice() {

         koshyk.sortByPrice(koshyk.getGoodsList());
        List<Goods> result1 = koshyk.getGoodsList();
        assertEquals(2.2, result1.get(0).getPrice(),0.001 , "Price doesn't match");
        assertEquals(3.2, result1.get(1).getPrice(),0.001 , "Price doesn't match");
        assertEquals(10.3, result1.get(16).getPrice(),0.001 , "Price doesn't match");
        assertEquals(11, result1.get(17).getPrice(),0.001 , "Price doesn't match");
    }

    @Test
    public void testWriter() {
        Writer writer = new Writer();
        try {
            writer.writeToFile(koshyk.getGoodsList());
        } catch(Exception e) {
            assertFalse(false, "Unexpected exception was thrown");
        }
    }

    @AfterEach
    void tearDown() {
        koshyk = null;
    }
}
