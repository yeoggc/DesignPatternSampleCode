package adapter.objectadpater;

/**
 * 适配器模式
 */
public class Client {

    public static void main(String[] args) {
        USB usb = new USBAdapter(new PS2er());
        usb.insert();
    }

}
