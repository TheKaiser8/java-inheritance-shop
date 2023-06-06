package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il numero di prodotti che vuoi mettere nel carrello: ");
        int productNumber = Integer.parseInt(scan.nextLine());

        Product[] cart = new Product[productNumber];

        for (int i = 0; i < cart.length; i++) {
            System.out.println("Quale tipo di prodotto vuoi aggiungere?");
            System.out.print("1 - Smartphone, 2 - Televisione, 3 - Cuffie: ");
            int choice = Integer.parseInt(scan.nextLine());

            System.out.print("Inserisci codice prodotto: ");
            int numberCode = scan.nextInt();

            System.out.print("Nome: ");
            String name = scan.nextLine();

            System.out.print("Descrizione: ");
            String description = scan.nextLine();

            System.out.print("Prezzo: ");
            BigDecimal price = scan.nextBigDecimal();

            System.out.print("IVA: ");
            BigDecimal vat = scan.nextBigDecimal();

            switch (choice) {
                case 1:
                    System.out.println("Inserisci le informazioni dello smartphone");
                    System.out.print("Codice IMEI: ");
                    int imei = Integer.parseInt(scan.nextLine());

                    System.out.print("Quantità di memoria: ");
                    int amountMemory = Integer.parseInt(scan.nextLine());

                    cart[i] = new Smartphone(numberCode, name, description, vat, price, imei, amountMemory);
                    break;
                case 2:
                    System.out.println("Inserisci le informazioni della TV");
                    System.out.print("Dimensioni Tv: ");
                    BigDecimal sizes = scan.nextBigDecimal();
                    scan.nextLine();

                    System.out.print("È una smart TV? (true/false): ");
                    boolean isSmart = scan.nextBoolean();
                    scan.nextLine();

                    cart[i] = new Television(numberCode, name, description, vat, price, sizes, isSmart);
                    break;
                case 3:
                    System.out.println("Inserisci le informazioni delle cuffie");
                    System.out.print("Colore cuffie: ");
                    String color = scan.nextLine();

                    System.out.print("È Wireless? (true/false): ");
                    boolean isWireless = scan.nextBoolean();
                    scan.nextLine();

                    cart[i] = new Headphone(numberCode, name, description, vat, price, color, isWireless);
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
        scan.close();
    }
}
