package skeleton;

public class ShoppingCart {

    private String status = "";

    public void checkout(int items) {
        new Thread(){
            @Override
            public void run() {
                try {
                    status = "PROCESSING";
                    Thread.sleep(10000);
                    status = "READY";
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    public String getStatus() {
        return status;
    }
}
