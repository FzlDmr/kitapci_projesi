

import java.util.InputMismatchException;

public class Methods extends Depo {
   public static void kitapEkle() {

        System.out.println("Lutfen Eklemek Istediginiz Kitabi Giriniz");
        book=scan.next().toUpperCase();
        bookList.add(book);
        kitapBilgisiList.add(bookList);
        scan.nextLine(); // satır atlayarak
        System.out.println("Lutfen Eklemek Istediginiz Kitabin Yazarini Giriniz");
        writer=scan.nextLine().toUpperCase();
        writerList.add(writer);
        kitapBilgisiList.add(writerList);
        System.out.println("Lutfen Eklemek Istediginiz Kitabin Fiyatini Giriniz");
        price=scan.next();
        priceList.add(price);
        kitapBilgisiList.add(priceList);

        numberList.add(kitapNo);
        kitapBilgisiList.add(kitapNoList);
        kitapNo++;

        System.out.println("*******************************");

        System.out.println("1-Kitap Ekle\n" + "2-Kitap Listesi\n" +"3-Menu\n"+"4-Cikis");
        secim=scan.next();
        switch (secim){
            case "1":
                kitapEkle();
            case "2":
                butunKitaplariListele();
            case "3":
                menu();
            case "4":
                System.exit(0);
            default:
                System.out.println("Hatali Giris Yaptiniz");

        }

    }


    public static void menu() {
        System.out.println(YESIL+"********** HOSGELDINIZ ***********\nYapmak Istediginiz Islemi Seciniz:" +
                " \n**********************************");
        System.out.println("1-Kitap Ekle\n" +
                "2-Numara Ile Kitap Goruntule\n" +
                "3-Bilgi Ile Kitap Goruntule\n" +
                "4-Numara Ile Kitap Sil\n" +
                "5-Tum Kitaplari Listele\n" +
                "6-Cikis");

        secim=scan.next();

        switch (secim){
            case "1":
                kitapEkle();
            case "2":
                numaraIleKitapGoruntule();
            case "3":
                bilgiIleGoruntule();
            case "4":
                numaraIleKitapSil();
            case "5":
                butunKitaplariListele();
            case "6":
                System.exit(0);
            default:
                System.out.println("Hatali Giris Yaptiniz");
                menu();


        }
    }

    public static void bilgiIleGoruntule() {
        System.out.println("1-Numara ile Kitap Goruntule\n2-Kitap Adi Ile Goruntule\n3-Yazar Adi Ile Goruntule\n4-Kitabin Fiyati Ile Goruntule");
        secim=scan.next();
        switch (secim){
            case "1":
                numaraIleKitapGoruntule();
            case "2":
                kitapAdiIleGoruntule();
            case "3":
                yazarAdiIleGoruntule();
            case "4":
                fiyatIleGoruntule();
            default:
                System.out.println("Hatali Giris Yaptiniz");
                bilgiIleGoruntule();


        }
    }

    private static void butunKitaplariListele() {

        System.out.println("************************\nButun Kitaplarin Listesi\n************************");
        for (int j = 0; j < bookList.size(); j++) {
            System.out.println();
            System.out.println(  "Kitap Adi    : "   +  bookList.get(j) + "\n"+
                    "Kitap Yazari : " + writerList.get(j) + "\n"+
                    "Kitap Fiyati : " + priceList.get(j) + "\n" +
                    "Kitap No     : " + numberList.get(j)+ "\n");
        }

        menu();

    }
    static void numaraIleKitapGoruntule(){

        System.out.println("Numara Listesi : " + numberList);
        System.out.println("Goruntulemek Istediginiz Kitap Numarasini Giriniz");

        while (true) {
            try {
                kitapNo = scan.nextInt();
                break; // Break out of the loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Hatali Giris Yaptiniz. Kitap Numaralari Sadece Tamsayilardan Olusur...");
                scan.nextLine(); // Consume invalid input
            }
        }

        if(numberList.contains(kitapNo)) {
            System.out.println(kitapNo+" Nolu Kitabin Bilgileri: \n"+
                    "Kitap Adi    : "   +  bookList.get(numberList.indexOf(kitapNo)) + "\n"+
                    "Kitap Yazari : " + writerList.get(numberList.indexOf(kitapNo)) + "\n"+
                    "Kitap Fiyati : " + priceList.get(numberList.indexOf(kitapNo)) + "\n");

            System.out.println("1-Numara ile Kitap Goruntule\n" + "2-Bilgi Ile Kitap Goruntule\n" +"3-Menu\n"+"4-Cikis\n");
            secim=scan.next();
            switch (secim){
                case "1":
                    numaraIleKitapGoruntule();
                case "2":
                    bilgiIleGoruntule();
                case "3":
                    menu();
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Hatali Giris Yaptiniz");
                    numaraIleKitapGoruntule();

            }

        }else {
            System.out.println("Hatali Giris Yaptiniz");
            numaraIleKitapGoruntule();
        }


    }
    static void numaraIleKitapSil(){//Kitabi sildikten sonra id numarasi degisiyor
        System.out.println("Silmek Istediginiz Kitabin Numarasini Giriniz");
        System.out.println(numberList);

        while (true) {
            try {
                kitapNo = scan.nextInt();
                break; // Break out of the loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Hatali Giris Yaptiniz. Kitap Numaralari Sadece Tamsayilardan Olusur...");
                scan.nextLine(); // Consume invalid input
            }
        }

        index = numberList.indexOf(kitapNo);
        System.out.println("************************");
        if(numberList.contains(kitapNo)) {
            System.out.println(kitapNo+" Nolu Silinecek Kitabin Bilgileri: \n"+
                    "Kitap Adi    : "   +  bookList.remove(index) + "\n"+
                    "Kitap Yazari : " + writerList.remove(index) + "\n"+
                    "Kitap Fiyati : " + priceList.remove(index) + "\n");

            System.out.println("1-Numara Ile Kitap Sil\n" + "2-Kitap Listesi\n" +"3-Menu\n"+"4-Cikis");
            secim=scan.next();

            switch (secim){
                case "1":
                    numaraIleKitapSil();
                case "2":
                    butunKitaplariListele();
                case "3":
                    menu();
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Hatali Giris Yaptiniz");

            }

        }else {
            System.out.println("Hatali Giris Yaptiniz");
            numaraIleKitapSil();
        }


    }
    static void kitapAdiIleGoruntule(){

        System.out.println(bookList);
        System.out.println("Goruntulemek Istediginiz Kitabin Adini Giriniz");
        book=scan.nextLine().toUpperCase();
        System.out.println("**********************");
        if (bookList.contains(book)){
            System.out.println(book+" Isimli Kitabin Bilgileri\n"+
                    "Kitap No     : "   +  numberList.get(bookList.indexOf(book)) + "\n"+
                    "Kitap Yazari : " + writerList.get(bookList.indexOf(book)) + "\n"+
                    "Kitap Fiyati : " + priceList.get(bookList.indexOf(book)) + "\n");

            System.out.println("1-Kitap Adi ile Kitap Goruntule\n" + "2-Bilgi Ile Kitap Goruntule\n" +"3-Menu\n"+"4-Cikis\n");
            secim=scan.next();
            switch (secim){
                case "1":
                    kitapAdiIleGoruntule();
                case "2":
                    bilgiIleGoruntule();
                case "3":
                    menu();
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Hatali Giris Yaptiniz");
                    kitapAdiIleGoruntule();

            }

        }else {
            System.out.println("Hatali Giris Yaptiniz");
            kitapAdiIleGoruntule();
        }


    }

    public static void yazarAdiIleGoruntule(){
        System.out.println(writerList);
        System.out.println("Goruntulemek Istediginiz Kitabin Yazarini Giriniz");
        writer=scan.nextLine().toUpperCase();
        if (writerList.contains(writer)){
            System.out.println("Isimli "+writer+" in Kitab Bilgileri\n"+
                    "Kitap No     : "   +  numberList.get(writerList.indexOf(writer)) + "\n"+
                    "Kitap Yazari : " + writerList.get(writerList.indexOf(writer)) + "\n"+
                    "Kitap Fiyati : " + priceList.get(writerList.indexOf(writer)) + "\n");


            System.out.println("1-Yazar Adi ile Kitap Goruntule\n" + "2-Bilgi Ile Kitap Goruntule\n" +"3-Menu\n"+"4-Cikis\n");
            secim=scan.next();
            switch (secim){
                case "1":
                    yazarAdiIleGoruntule();
                case "2":
                    bilgiIleGoruntule();
                case "3":
                    menu();
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Hatali Giris Yaptiniz");
                    yazarAdiIleGoruntule();

            }


        }else {
            System.out.println("Hatali Giris Yaptiniz");
            yazarAdiIleGoruntule();
        }
    }
    public static void fiyatIleGoruntule(){

        System.out.println(priceList);
        System.out.println("Goruntulemek Istediginiz Kitabin Fiyatini Giriniz");
        price=scan.next();
        if (priceList.contains(price)){
            System.out.println(price+" TL Degerindeki Kitabin Bilgileri\n"+
                    "Kitap No     : "   +  numberList.get(priceList.indexOf(price)) + "\n"+
                    "Kitap Adi    : " + bookList.get(priceList.indexOf(price)) + "\n"+
                    "Kitap Yazari : " + writerList.get(priceList.indexOf(price)) + "\n");

            System.out.println("1-Kitap Fiyati ile Kitap Goruntule\n" + "2-Bilgi Ile Kitap Goruntule\n" +"3-Menu\n"+"4-Cikis\n");
            secim=scan.next();
            switch (secim){
                case "1":
                    fiyatIleGoruntule();
                case "2":
                    bilgiIleGoruntule();
                case "3":
                    menu();
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Hatali Giris Yaptiniz");
                    fiyatIleGoruntule();

            }

        }else {
            System.out.println("Hatali Giris Yaptiniz");
            fiyatIleGoruntule();
        }
    }

}

