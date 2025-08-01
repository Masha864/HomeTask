//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product [] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("Samsung R430 Super", "01.12.2024", "Samsung Corp.", "Korea", 1234, true);
        productsArray[2] = new Product("LG CX300", "15.07.2024", "LG Corp.", "Korea", 2345, false);
        productsArray[3] = new Product("Honor x8", "20.10.2024", "Huawei Corp.","China", 4567, true);
        productsArray[4] = new Product("Huawei G400", "25.05.2025", "Huawei Corp.", "China", 5678, false);

        System.out.println("Смартфон: " + productsArray[0]);
        System.out.println("Смартфон: " + productsArray[1]);
        System.out.println("Смартфон: " + productsArray[2]);
        System.out.println("Смартфон: " + productsArray[3]);
        System.out.println("Смартфон: " + productsArray[4]);










    }
}