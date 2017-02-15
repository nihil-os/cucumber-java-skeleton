package skeleton;

public class ShoppingCart {

    private String status = "";

    public void checkout(int items) {
        try {
            status = "PROCESSING";
            Thread.sleep(1000);
            status = "READY";
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getStatus() {
        return status;
    }
}
