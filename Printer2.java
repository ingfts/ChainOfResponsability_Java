public class Printer2 implements PrintingHandler{

    private PrintingHandler nextHandler;

    @Override

    public void nextPrinter(PrintingHandler next){
        this.nextHandler = next;
    }

    @Override

    public void handleRequest(String printerRequest){
        if ("epson".equalsIgnoreCase(printerRequest)){
            System.out.println("\nEpson printer is ready to print");
       }else if (nextHandler != null){
            this.nextHandler.handleRequest(printerRequest);
        }else{
            System.out.println("\nNo printer available or specified printer not found");
        }

    }
}
