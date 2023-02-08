public class MathOperationsApp {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        int liczba = 5;

        System.out.println("Czy liczba " + liczba + " jest nieparzysta? " + mathOperations.isOdd(liczba));
        System.out.println("Czy liczba " + liczba + " jest parzysta? " + mathOperations.isEven(liczba));
        System.out.println("Liczba " + liczba + " do potegi drugiej: " + mathOperations.power(liczba));
        System.out.println("Pole kola o promieniu " + liczba + ": " + mathOperations.circleField(liczba));
    }
}
