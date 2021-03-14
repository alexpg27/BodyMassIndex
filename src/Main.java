public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 75;
        double heightInMeters = 1.75;
        double result = (int)service.calculate(weightInKg, heightInMeters);
        System.out.println("Ваш индекс массы тела: " + result);
    }
}
