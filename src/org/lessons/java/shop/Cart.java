package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
    // metodo per verificare che la stringa inserita contenga solo cifre numeriche
    private static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci il numero di prodotti che vuoi mettere nel carrello: ");
        int productNumber = Integer.parseInt(scan.nextLine());

        Product[] cart = new Product[productNumber];

        for (int i = 0; i < cart.length; i++) {
            int choice;
            do {
                System.out.println("Quale tipo di prodotto vuoi aggiungere?");
                System.out.println("1-Smartphone 2-Televisione 3-Cuffie");
                choice = Integer.parseInt(scan.nextLine());
            } while (choice < 1 || choice > 3);

            System.out.print("Inserisci codice prodotto: ");
            int numberCode = Integer.parseInt(scan.nextLine());

            System.out.print("Nome: ");
            String name = scan.nextLine();

            System.out.print("Descrizione: ");
            String description = scan.nextLine();

            System.out.print("Prezzo: ");
            String priceString = scan.nextLine();
            BigDecimal priceInput = new BigDecimal(priceString);

            System.out.print("IVA: ");
            String vatString = scan.nextLine();
            BigDecimal vatInput = new BigDecimal(vatString);

            switch (choice) {
                case 1:
                    System.out.println("Inserisci le informazioni dello smartphone");
                    String imei;
                    boolean isValidImei = false;
                    do {
                        System.out.print("Codice IMEI (15 cifre): ");
                        imei = scan.nextLine();
                        // Verifico che l'IMEI abbia esattamente 15 cifre numeriche
                        if (imei.length() != 15 || !isNumeric(imei)) {
                            System.out.println("IMEI non valido. Assicurati di inserire esattamente 15 cifre numeriche.");
                        } else isValidImei = true;
                    } while (!isValidImei);

                    System.out.print("Quantità di memoria: ");
                    int amountMemory = Integer.parseInt(scan.nextLine());

                    cart[i] = new Smartphone(numberCode, name, description, vatInput, priceInput, imei, amountMemory);
                    break;
                case 2:
                    System.out.println("Inserisci le informazioni della TV");
                    System.out.print("Dimensioni Tv (in pollici): ");
                    int sizes = Integer.parseInt(scan.nextLine());

                    System.out.print("È una smart TV? (s/n): ");
                    boolean isSmart = scan.nextLine().equalsIgnoreCase("s");

                    cart[i] = new Television(numberCode, name, description, vatInput, priceInput, sizes, isSmart);
                    break;
                case 3:
                    System.out.println("Inserisci le informazioni delle cuffie");
                    System.out.print("Colore cuffie: ");
                    String color = scan.nextLine();

                    System.out.print("È Wireless? (true/false): ");
                    boolean isWireless = scan.nextLine().equalsIgnoreCase("s");

                    cart[i] = new Headphone(numberCode, name, description, vatInput, priceInput, color, isWireless);
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
        scan.close();
    }
}
