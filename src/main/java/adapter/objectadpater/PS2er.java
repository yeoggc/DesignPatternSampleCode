package adapter.objectadpater;

/**
 * 鼠标 PS2的实现类
 */
public class PS2er implements PS2 {
    @Override
    public void insert() {
        System.out.println("插入PS2(圆形)接口的设备");
    }
}
