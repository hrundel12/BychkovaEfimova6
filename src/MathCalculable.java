interface MathCalculable {
    double PI = 3.141592653589793;

    double power(double base, double exponent);
    double complexModulus(double real, double imaginary);
}

// Класс MathFunc, реализующий интерфейс MathCalculable
class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
}
