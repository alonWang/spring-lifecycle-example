package com.github.alonwang.springlifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 演示循环依赖
 *
 * @author alonwang
 * @date 2020/11/6 11:11 上午
 */
public class CycleReferenceDemo {
    @Component
    static class C {

    }

    @Component
    static class A {
        private B b;

        @Autowired
        public void setB(B b) {
            this.b = b;
        }
    }

    @Component
    static class B {
        private A a;

        @Autowired
        public void setA(A a) {
            this.a = a;
        }
    }

    //构造器注入方式的循环依赖
//    @Component
//    static class A {
//        private B b;
//
//        public A(B b){
//            this.b=b;
//        }
//    }
//
//    @Component
//    static class B {
//        private A a;
//
//        public B(A a){
//            this.a=a;
//        }
//    }
}
