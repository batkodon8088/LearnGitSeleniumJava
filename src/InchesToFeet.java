public class InchesToFeet {
    public static void main(String[] args) {
        System.out.println(getFeetFromInches(72933364));
    }

    public static int getFeetFromInches(int inches) {
        int feet = inches / 12;
        return feet;
    }
}
