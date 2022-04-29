package interface_test.b;

import interface_test.a.Base;

public class SubType extends Base {
    public void fun(){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
//        Base base = new Base();
//        System.out.println(base.name);//error
//        base.show();//error
//        Type type = new Type();
//        System.out.println(type.name);//error
    }

    public static void main(String[] args) {
        new SubType().fun();
    }
}
class Type extends Base {

}
