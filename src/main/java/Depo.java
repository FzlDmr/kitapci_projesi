import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Depo {
    static String secim;
    static Scanner scan = new Scanner(System.in);

    static String book;
    static String writer;
    static String price;
    static int kitapNo = 1005;

    static int index;

    static List<String> bookList = new ArrayList<>();
    static List<String> writerList = new ArrayList<>();
    static List<String> priceList = new ArrayList<>();
    static List<Integer> numberList = new ArrayList<>();


    static {

        bookList.add("SEFILLER");
        bookList.add("SUC VE CEZA");
        bookList.add("KURK MANTOLU MADONNA");
        bookList.add("1984");
        bookList.add("SERENAD");

        writerList.add("VICTOR HUGO");
        writerList.add("DOSTOYEVSKI");
        writerList.add("SABAHATTIN ALI");
        writerList.add("GEORGE ORWELL");
        writerList.add("ZULFU LIVANELI");

        priceList.add("100");
        priceList.add("120");
        priceList.add("50");
        priceList.add("90");
        priceList.add("110");

        numberList.add(1000);
        numberList.add(1001);
        numberList.add(1002);
        numberList.add(1003);
        numberList.add(1004);
    }


    static List<Integer> kitapNoList = new ArrayList<>();

    static List<List> kitapBilgisiList = new ArrayList<>();

    static String YESIL = "\u001B[32m";


}


