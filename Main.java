package kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<Product>();
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.printdisplay();

        String input = sc.nextLine();

        if (input.equals("Burgers")){
            menu.bugersMenu();
        } else if (input.equals("Forzen Custard")){
            menu.custardMenu();
        } else if (input.equals("Drinks")){
            menu.drinksMenu();
        } else if (input.equals("Beer")){
            menu.beerMenu();
        }

        boolean order = true;

        String choice = sc.nextLine();
        if (choice.equals("ShackBurger")){
            menu.print(menu.ShackBurger);
        } else if (choice.equals("SmokeShack")) {
            menu.print(menu.SmokeShack);
        } else if (choice.equals("Shroom Burger")) {
            menu.print(menu.ShroomBurger);
        } else if (choice.equals("Hamburger")) {
            menu.print(menu.Hamburger);
        } else if (choice.equals("Shakes")) {
            menu.print(menu.Shakes);
        } else if (choice.equals("Shake of the Week")) {
            menu.print(menu.ShakeOfTheWeek);
        } else if (choice.equals("Red Bean Shake")) {
            menu.print(menu.RedBeanShake);
        } else if (choice.equals("Floats")) {
            menu.print(menu.Floats);
        } else if (choice.equals("Shack-made Lemonade")) {
            menu.print(menu.ShackMadeLemonade);
        } else if (choice.equals("Fresh Brewed Iced Tea")) {
            menu.print(menu.FreshBrewedIcedTea);
        } else if (choice.equals("Fifty/Fifty")) {
            menu.print(menu.FiftyFifty);
        } else if (choice.equals("Fountain Soda")) {
            menu.print(menu.FountainSoda);
        } else if (choice.equals("ShackMeister Ale")) {
            menu.print(menu.ShackMeisterAle);
        } else if (choice.equals("Magpie Brewing Co.")) {
            menu.print(menu.MagpieBrewingCo);
        }
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인            2. 취소");

        String yesOrno = sc.nextLine();
        if (yesOrno.equals("확인")){
            Product selectedProduct = menu.getProductByName(choice);
            cart.add(selectedProduct);
            System.out.println();
            System.out.println(selectedProduct.name + " 가 장바구니에 추가되었습니다.");
            menu.printfirst();
        } else if (yesOrno.equals("취소")) {
            menu.printfirst();
        }

    }

}
