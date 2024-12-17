package srp;

class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double calculateTax() {
        return amount * 0.1;
    }

    public double getAmount() {
        return amount;
    }
}