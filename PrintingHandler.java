public interface PrintingHandler {
    public void nextPrinter(PrintingHandler next);
    public void handleRequest(String printerRequest);
}
