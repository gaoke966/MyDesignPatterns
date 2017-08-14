package proxy;


/**
 * 类Target的实现描述：目标类
 *
 * @author gaoke 2017/8/14 16:20
 */
public class Target implements TargetInterface{
    public void methodA() {
        System.out.println("Target.methodA");
    }

    public void methodB() {
        System.out.println("Target.methodB");
    }

    public void methodC(String s) {
        System.out.println("Target.methodC:"+s);
    }

    public String methodD(String s) {
        System.out.println("Target.methodD:"+s);
        return "result:"+s;
    }
}
