package JDKproxy;


/**
 * 类Tester的实现描述：测试类
 *
 * @author gaoke 2017/8/14 16:22
 */
public class Tester {
    public static void main(String[] args) {
        ProxyHandler proxyInstance = new ProxyHandler(new Target());
        TargetInterface targetInterface = proxyInstance.getProxyTarget();
        targetInterface.methodA();
        targetInterface.methodB();
        targetInterface.methodC("c");
        System.out.println(targetInterface.methodD("d"));

        TargetInterface target = new Target();
        Class c[] = target.getClass().getInterfaces();
//        Class c1[] = TargetInterface.class.getInterfaces();
        System.out.println(c[0]);
//        System.out.println(c1[0]);

    }
}
