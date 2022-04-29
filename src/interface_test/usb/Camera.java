package interface_test.usb;

public class Camera implements USB {
    @Override
    public void plugIn(){
        System.out.println("读取相机文件中...");
    }

    @Override
    public void work() {
        System.out.println("相机文件读取成功，已打开文件夹!");
    }

}
