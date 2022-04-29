package interface_test.usb;

public class Computer {

    //fun方法就模拟电脑的USB的插口
    public void fun(USB usb){
        usb.plugIn();
        usb.work();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        Mouse mouse = new Mouse();
        //插入鼠标
        computer.fun(mouse);
        KeyBoard keyBoard = new KeyBoard();
        //插入键盘
        computer.fun(keyBoard);
        //新增一个相机子类
        Camera camera = new Camera();
        computer.fun(camera);
    }
}
