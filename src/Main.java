public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        int weightInKg = 98;
        int bmi = 0; // должно получиться 28
        bmi = service.calculate(heightInMeters, weightInKg);
        System.out.println(bmi);
    }
}
