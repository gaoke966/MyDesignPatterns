/*
 * Copyright 2017 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
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
