public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 98;
        int bmIndex = service.calculate(weightKg);
        System.out.println("Ваш индекс массы тела составляет " + bmIndex);
    }
}