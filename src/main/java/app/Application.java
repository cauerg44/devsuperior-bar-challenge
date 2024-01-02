package app;

import entities.Bill;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Bill bill = new Bill();

        System.out.print("Sexo: ");
        bill.gender = sc.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        bill.beer = sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        bill.softDrink = sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        bill.barbecue = sc.nextInt();
        System.out.println();

        double consumo = bill.feeding();
        double cover = bill.cover();
        double ingresso = bill.ticket();
        double total = bill.total();

        System.out.println("RELATÓRIO: ");
        System.out.printf("Consumo = R$ %.2f%n", consumo);
        if (cover == 0) {
            System.out.println("Isento de Couvert");
        } else {
            System.out.printf("Couvert = R$ %.2f%n", cover);
        }
        System.out.printf("Ingresso = R$ %.2f%n", ingresso);
        System.out.println();

        System.out.printf("Valor a pagar = R$ %.2f",  total);
    }
}