package netlabJBus;
/**
 * Write a description of class JBus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class JBus {
    //Menyelesaikan CS Modul 2
    public static void main(String[] args) {
        // Test cases for the implemented methods
        System.out.println("Travel ID: " + getTravelId());
        System.out.println("Travel Name: " + getTravelName());
        System.out.println("Has Discount: " + isDiscount());

        System.out.println("Discount Percentage: " + getDiscountPercentage(1000, 900) + "%");
        System.out.println("Discount Percentage: " + getDiscountPercentage(1000, 0) + "%");
        System.out.println("Discount Percentage: " + getDiscountPercentage(0, 0) + "%");
        System.out.println("Discount Percentage: " + getDiscountPercentage(0, 1) + "%");

        System.out.println("Discounted Price: " + getDiscountedPrice(1000, 10.0f));
        System.out.println("Discounted Price: " + getDiscountedPrice(1000, 100.0f));
        System.out.println("Discounted Price: " + getDiscountedPrice(1000, 120.0f));
        System.out.println("Discounted Price: " + getDiscountedPrice(0, 0.0f));

        System.out.println("Original Price: " + getOriginalPrice(900, 10.0f));
        System.out.println("Original Price: " + getOriginalPrice(1000, 0.0f));
        System.out.println("Original Price: " + getOriginalPrice(0, 100.0f));
        System.out.println("Original Price: " + getOriginalPrice(0, 120.0f));

        System.out.println("Admin Fee: " + getAdminFee(1000) + " 50");
        System.out.println("Admin Fee: " + getAdminFee(500) + " 25");
        System.out.println("Admin Fee: " + getAdminFee(0) + " 0");

        System.out.println("Total Price: " + getTotalPrice(10000, 2) + " 21000");
        System.out.println("Total Price: " + getTotalPrice(5000, 1) + " 5250");
        System.out.println("Total Price: " + getTotalPrice(0, 2) + " 0");
    }
    
    public static int getTravelId() {
        return 0;
    }

    public static String getTravelName() {
        return "Travel";
    }

    public static boolean isDiscount() {
        return true;
    }

    public static float getDiscountPercentage(int beforeDiscount, int afterDiscount) {
        if (beforeDiscount > afterDiscount) {
            float discountPercentage = ((beforeDiscount - afterDiscount) / (float) beforeDiscount) * 100;
            return discountPercentage;
        } else {
            return 0.0f;
        }
    }

    public static int getDiscountedPrice(int price, float discountPercentage) {
        if (discountPercentage > 100.0f) {
            discountPercentage = 100.0f;
        }
        int discountedPrice = price - (int) (price * (discountPercentage / 100));
        return discountedPrice;
    }

    public static int getOriginalPrice(int discountedPrice, float discountPercentage) {
        if (discountPercentage >= 100.0f) {
            return 0;
        } else {
            int originalPrice = (int) (discountedPrice / (1 - (discountPercentage / 100)));
            return originalPrice;
        }
    }

    public static float getAdminFeePercentage() {
        return 0.05f;
    }

    public static int getAdminFee(int price) {
        float adminFeePercentage = getAdminFeePercentage();
        int adminFee = (int) (price * adminFeePercentage);
        return adminFee;
    }

    public static int getTotalPrice(int price, int numberOfSeat) {
        int adminFee = getAdminFee(price * numberOfSeat);
        int totalPrice = (price * numberOfSeat) + adminFee;
        return totalPrice;
    }
}
