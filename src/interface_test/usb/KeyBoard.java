package interface_test.usb;

public class KeyBoard implements USB {
    @Override
    public void plugIn(){
        System.out.println("键盘驱动安装中...");
    }
    @Override
    public void work(){
        System.out.println("键盘驱动安装完成，现在可正常使用!");
    }
}
