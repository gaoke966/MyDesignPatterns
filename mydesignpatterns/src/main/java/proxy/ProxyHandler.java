/*
 * Copyright 2017 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 类ProxyHandler的实现描述：代理类
 *
 * @author gaoke 2017/8/14 16:19
 */
public class ProxyHandler implements InvocationHandler{
    TargetInterface target;
    public ProxyHandler(TargetInterface target) {
        this.target = target;
    }
    public TargetInterface getProxyTarget(){
        return (TargetInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
        /**target.getClass()返回的是具体对象的Class(非接口)
         * TargetInterface.class返回的是接口的Class
         *target.getClass().getInterfaces()不能替换为TargetInterface.class,
         */
        //return (TargetInterface) Proxy.newProxyInstance(TargetInterface.class.getClassLoader(),TargetInterface.class.getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy.invoke:"+method.getName());
        return method.invoke(target,args);
    }
}
