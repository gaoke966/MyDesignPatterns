package proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 类CglibInterceptor的实现描述：cglib动态代理类
 *
 * @author gaoke 2017/8/15 10:35
 */
public class CglibInterceptor<T> implements MethodInterceptor {

    private T target;
    public CglibInterceptor(T target){
        this.target = target;
    }

    public T getProxyTarget(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return (T) enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB proxy.invoke:"+method.getName());
        return methodProxy.invokeSuper(o,objects);
    }
}
