package com.javarush.task.task20.task2023;

/* 
Делаем правильный вывод
C class, method2
A class, method2
A class, method1
B class, method1
Метод method1 должен быть объявлен с модификатором доступа private в классе A.
3. Метод method1 в классе B должен содержать вызов super.method2().
4. Метод method2 в классе С должен содержать вызов super.method1().
5. Метод method2 в классе A должен содержать вызов method1().
*/
public class Solution {
    public static void main(String[] s) {
        A a = new C();
        a.method2();

    }

    public static class A {
        private void method1() {
            System.out.println("A class, method1");
        }

        public void method2() {
            System.out.println("A class, method2");
            this.method1();
        }
    }

    public static class B extends A {
        public void method1() {
            super.method2();
            System.out.println("B class, method1");
        }

        public void method2() {
            System.out.println("B class, method2");
        }
    }

    public static class C extends B {
        public void method1() {
            System.out.println("C class, method1");
        }

        public void method2() {
            System.out.println("C class, method2");
            //super.method1();
        }
    }
}
