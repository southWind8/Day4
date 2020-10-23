package Day04;

/**
 * @ClassName SingleInstance
 * @Description TODO
 * @Author 86139
 * @Date 2020/10/23
 **/

public class SingleInstance {
    private static SingleInstance singleInstance;

    private SingleInstance(){}

    public static SingleInstance getInstance(){
        if(singleInstance==null){
            singleInstance=new SingleInstance();
        }
        return singleInstance;
    }

    public static void main(String[] args) {
        SingleInstance instance=SingleInstance.getInstance();
        SingleInstance instance2=SingleInstance.getInstance();
        System.out.println(instance==instance2);
    }
}
