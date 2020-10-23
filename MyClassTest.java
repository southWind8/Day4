package Day04;

/**
 * @ClassName MyClassTest
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/23
 **/

public class MyClassTest {
    public static void main(String[] args) {
        //首先创建对象
        MyClass obj =new MyClass();
        //然后才能使用没有static关键字内容
        obj.method();
        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称来调用
        //正确，但是不推荐，这种写法在编译之后也会被javac翻译成"类名称，静态方法名"
        obj.methodStatic();
        MyClass.methodStatic();
        myMethod();
        MyClassTest.myMethod();
    }

    private static void myMethod() {
        System.out.println("这是我的方法");


    }


}
