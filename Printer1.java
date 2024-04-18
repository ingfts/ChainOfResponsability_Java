public class Printer1 implements PrintingHandler{

    private PrintingHandler nextHandler;

    @Override
    public void nextPrinter(PrintingHandler next){
        this.nextHandler = next;

    }

    @Override
    public void handleRequest(String printerRequest){
        if ("hp".equalsIgnoreCase(printerRequest)){
            System.out.println("\nHp printer is ready to print");
        }else if (nextHandler != null){
            this.nextHandler.handleRequest(printerRequest);
        } else{
            System.out.println("\nNo printer available or specified printer not found");
        }


    }
}
