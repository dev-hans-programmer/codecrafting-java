package interfaces;

public class Test {
    public static void main(String[] args) {
        var tax2023 = new TaxCalculator2023(100_000);
        new TaxReport(tax2023).show();
    }
}
