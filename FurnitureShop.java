package com.company;

public class FurnitureShop {
    Chear chear1 = new Chear();

    Table table1 = new Table();
    Cupboarde cupboarde1 = new Cupboarde();

    Furniture[] Furnitures = { chear1, table1, cupboarde1};
    public FurnitureShop(){
        chear1.setPrice(50);
        table1.setPrice(75);
        cupboarde1.setPrice(128);
        chear1.setName("Baginskiy");
        table1.setName("Фурфоровый");
        cupboarde1.setName("Белый Клён");



    }
    public void listFurniture(){
        for (Furniture furniture : Furnitures) {
            String Name = furniture.getName();
            System.out.println(Name);

        }
    }

}
