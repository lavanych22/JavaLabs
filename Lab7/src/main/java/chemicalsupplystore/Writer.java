package chemicalsupplystore;

import chemicalsupplystore.goods.Goods;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class Writer {
    public void writeToFile(final List<Goods> goodsList) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\JavaLabs\\Lab7/list.csv"))) {

            goodsList.forEach((Goods x) -> {
                writer.println(x.getHeaders());
                writer.println(x.toCVS());
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}