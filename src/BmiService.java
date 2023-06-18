public class BmiService {
    public int calculate(int weightKg) {
        double heightMcube = 1.87;
        int result = weightKg / (int) Math.ceil (heightMcube);
        return result;
    }
}
