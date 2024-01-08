package kiosk;

import java.util.ArrayList;

public class Menu {
    public String name;
    public String description;
    public Product ShackBurger;
    public Product SmokeShack;
    public Product ShroomBurger;
    public Product Hamburger;
    public Product Shakes;
    public Product ShakeOfTheWeek;
    public Product RedBeanShake;
    public Product Floats;
    public Product ShackMadeLemonade;
    public Product FreshBrewedIcedTea;
    public Product FiftyFifty;
    public Product FountainSoda;
    public Product ShackMeisterAle;
    public Product MagpieBrewingCo;
    ArrayList<Product> products = new ArrayList<Product>();
    public void printdisplay(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1. Burgers         | 앵거스 비프 통살을 다져만든 버거");
        System.out.println("2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림");
        System.out.println("3. Drinks          | 매장에서 직접 만드는 음료");
        System.out.println("4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주");
        System.out.println();
        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");
        System.out.println();
    }
    public void printfirst(){
        System.out.println("SHAKESHACK BURGER 에 오신걸 환영합니다.");
        System.out.println("아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.");
        System.out.println();
    }
    public void print(Product product){
        System.out.println(product.name + " | W " + product.price + " | " + product.description);
    }
    public void bugersMenu (){
        printfirst();
        ShackBurger = new Product("ShackBurger", "6.9", "토마토, 양상추, 쉑소스가 토핑된 치즈버거");
        SmokeShack = new Product("SmokeShack", "8.9", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거");
        ShroomBurger = new Product("Shroom Burger", "9.4", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거");
        Hamburger = new Product("Hamburger", "5.4", "비프패티를 기반으로 야채가 들어간 기본버거");
        System.out.println("[ Burgers MENU ]");
        print(ShackBurger);
        print(SmokeShack);
        print(ShroomBurger);
        print(Hamburger);
        System.out.println();
        products.add(ShackBurger);
        products.add(SmokeShack);
        products.add(ShroomBurger);
        products.add(Hamburger);
    }
    public void custardMenu (){
        printfirst();
        Shakes = new Product("Shakes", "5.9", "바닐라, 초콜렛, 솔티드 카라멜, 커피");
        ShakeOfTheWeek = new Product("Shake of the Week", "6.5", "특별한 커스터드 플레이버");
        RedBeanShake = new Product("Red Bean Shake", "6.5", "신선한 커스터드와 함께 우유와 레드빈이 블렌딩 된 시즈널 쉐이크");
        Floats = new Product("Floats", "5.9", "루트비어, 퍼플 카우, 크림시클");
        System.out.println("[ Forzen Custard MENU ]");
        print(Shakes);
        print(ShakeOfTheWeek);
        print(RedBeanShake);
        print(Floats);
        System.out.println();
        products.add(Shakes);
        products.add(ShakeOfTheWeek);
        products.add(RedBeanShake);
        products.add(Floats);
    }
    public void drinksMenu (){
        printfirst();
        ShackMadeLemonade = new Product("Shack-made Lemonade", "3.9", "매장에서 직접만드는 상큼한 레몬에이드");
        FreshBrewedIcedTea = new Product("Fresh Brewed Iced Tea", "3.4", "직접 유기농 홍차를 우려낸 아이스티");
        FiftyFifty = new Product("Fifty/Fifty", "3.5", "레몬에이드와 아이스티의 만남");
        FountainSoda = new Product("Fountain Soda", "2.7", "코카콜라, 코카콜라 제로, 스프라이트, 환타 오렌지, 환타 그레이프");
        System.out.println("[ Drinks MENU ]");
        print(ShackMadeLemonade);
        print(FreshBrewedIcedTea);
        print(FiftyFifty);
        print(FountainSoda);
        System.out.println();
        products.add(ShackMadeLemonade);
        products.add(FreshBrewedIcedTea);
        products.add(FiftyFifty);
        products.add(FountainSoda);
    }
    public void beerMenu (){
        printfirst();
         ShackMeisterAle = new Product("ShackMeister Ale", "9.8", "쉐이크쉑 버거를 위해 뉴욕 브루쿨린 브루어리에서 특별히 양조한 에일 맥주");
         MagpieBrewingCo = new Product("Magpie Brewing Co.", "6.8", " ");
        System.out.println("[ Beer MENU ]");
        print(ShackMeisterAle);
        print(MagpieBrewingCo);
        System.out.println();
        products.add(ShackMeisterAle);
        products.add(MagpieBrewingCo);
    }

    public Product getProductByName(String productName) {
        for (Product product : products) {
            if (product.name.equals(productName)) {
                return product;
            }
        }
        return null;
    }
}
