public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = (float) 65.5;
        float height = (float) 1.73;
        float bmi = service.calculate(weight, height);
        System.out.println(bmi);
    }
}