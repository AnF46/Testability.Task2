public class BmiService {
    public int calculate(int weightKg, double height) {
        double heightMCube = Math.pow(height,2);
        int result = (int) (weightKg / (double) heightMCube);
        return result;
    }
}