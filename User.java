public class User {
    public static void main(String[] args) {
        PrintingHandler page1 = new Printer1();
        PrintingHandler page2 = new Printer2();

        page1.nextPrinter(page2);

        page1.handleRequest("hp");
        page1.handleRequest("epson");
        page1.handleRequest("canon");




    }
}
