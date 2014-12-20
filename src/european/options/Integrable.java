package european.options;


public interface Integrable {
    public double calculateIntegral(double x0, double xf);
    public double calculateError(double x0, double xf, int iterations);
    public int calculateIterations(double x0, double xf, double error);
}
