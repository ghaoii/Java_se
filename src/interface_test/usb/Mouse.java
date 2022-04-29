package interface_test.usb;

public class Mouse implements USB {
    @Override
    public void plugIn(){
        System.out.println("安装鼠标驱动中...");
    }
    @Override
    public void work(){
        System.out.println("鼠标驱动安装完成，现在可正常使用!");
    }
}
