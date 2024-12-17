package srp;

class InvoicePrinter {
    Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void print(Invoice invoice) {
        double tax = invoice.calculateTax();
        System.out.println("Printing Invoice...");
        System.out.println("Amount: " + invoice.getAmount());
        System.out.println("Tax: " + tax);
    }

    public static void main(String[] args){
        Invoice factura = new Invoice(200);

        InvoicePrinter impersorFactura = new InvoicePrinter(factura);
        impersorFactura.print(factura)
    }
}