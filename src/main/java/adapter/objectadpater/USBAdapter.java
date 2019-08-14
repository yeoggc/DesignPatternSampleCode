package adapter.objectadpater;

public class USBAdapter implements USB {

    private PS2 ps2;

    public USBAdapter(PS2 ps2) {
        this.ps2 = ps2;
    }


    @Override
    public void insert() {
        System.out.println("适配PS2 接口");
        ps2.insert();
    }
}
