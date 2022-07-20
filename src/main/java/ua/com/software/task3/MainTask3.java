package ua.com.software.task3;

import ua.com.software.task3.product.clothes.TShirt;
import ua.com.software.task3.product.electronics.Laptop;
import ua.com.software.task3.product.electronics.SmartPhone;
import ua.com.software.task3.product.sports.FitnessEquipment;

public class MainTask3 {
    public static void main(String[] args) {
        Laptop macBookAir = new Laptop();
        System.out.println("Laptop price initialize: " + macBookAir.getPrice() + "$");

        macBookAir.setPrice(700.00f);
        System.out.println("Laptop price user-definition: " + macBookAir.getPrice() + "$");

        macBookAir.setBatteryVolume(13000);
        macBookAir.setDisplayDiagonal(13);
        macBookAir.setBrand("Apple");
        macBookAir.setModel("mac Book 13'");
        macBookAir.show();
        System.out.println();

        TShirt starWars = new TShirt();
        System.out.println("T-Shirt price initialize: " + starWars.getPrice() + "$");
        System.out.println();

        SmartPhone samsungGalaxyNote20Ultra = SmartPhone.builder()
                .brand("Samsung")
                .model("Note 20 Ultra")
                .price(1100)
                .batteryVolume(10000)
                .displayDiagonal(6.3f)
                .operationSystem("Android v12")
                .processor("Exynos 990")
                .screenRefreshRate(120)
                .voltage(5)
                .powerSupply("AC/DC")
                .build();

        samsungGalaxyNote20Ultra.show();
        System.out.println();

        FitnessEquipment punchingBag = FitnessEquipment.builder()
                .brand("LonsDale")
                .grossWeight(190)
                .waterproof(false)
                .applicationMethod("Hand punch")
                .kindOfSport("Boxing")
                .price(600)
                .build();

        punchingBag.show();
    }
}
