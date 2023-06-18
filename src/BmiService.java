public class BmiService {
    public int calculate(int weightKg, double heightMcube) {
        int result = weightKg / (int) Math.ceil (heightMcube);
        return result;
    }
}
