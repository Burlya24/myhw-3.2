public class BmiService {

    public int calculate(double heightInMeters, int weightInKg) {
        double bmi = weightInKg / (heightInMeters * heightInMeters);
        return (int) bmi;
    }
}
