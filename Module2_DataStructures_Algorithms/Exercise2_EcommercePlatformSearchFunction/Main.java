package Module2_DataStructures_Algorithms.Exercise2_EcommercePlatformSearchFunction;

public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(103, "Tablet", "Electronics"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Speaker", "Electronics")
        };

        System.out.println("LINEAR SEARCH");

        Product result1 =
                SearchEngine.linearSearch(products, "Watch");

        if (result1 != null)
            result1.display();
        else
            System.out.println("Product Not Found");


        Product[] sortedProducts = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mobile", "Electronics"),
                new Product(105, "Speaker", "Electronics"),
                new Product(103, "Tablet", "Electronics"),
                new Product(104, "Watch", "Accessories")
        };

        System.out.println("\nBINARY SEARCH");

        Product result2 =
                SearchEngine.binarySearch(sortedProducts, "Tablet");

        if (result2 != null)
            result2.display();
        else
            System.out.println("Product Not Found");
    }
}