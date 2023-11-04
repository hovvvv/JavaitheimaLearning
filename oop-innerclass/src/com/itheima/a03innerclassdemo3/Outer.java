package com.itheima.a03innerclassdemo3;

public class Outer {
    private int a = 10;

    class Inner {
        private int a = 20;

        public void show() {
            int a = 30;
            System.out.println(a);
            //(this.a)中的this为调用者this（002）
            System.out.println(this.a);
            //(Outer.this.a)中的this为调用者Outer中的this（001）
            System.out.println(Outer.this.a);
        }
    }
}
