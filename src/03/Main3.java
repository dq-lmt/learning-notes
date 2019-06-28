/*
 * 运算符就是连词。主要有以下几种。
 * 算术运算符：四则运算符（+、-、*、/）和取余（%）、自增（++）、自减（--）。
 * 取余：返回除数除被除数的余数。如果被除数较小，则返回被除数。
 * 自增可以放在变量的前面，也可以在后面，是把这个变量重新赋值为原来的值+1，如果“++”在前，那么返回增加前的值，反之则返回增加后的。
 * 自减同理。
 * 关系运算符：用于运算两个值之间的关系，满足则返回true，否则返回false。
 * ==是等于。
 * !=是不等于。
 * >=是大于等于。
 * <=是小于等于。
 * >是大于。
 * >是小于。
 * 位运算符下节课再讲。
 * */
public class Main3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++b);
        System.out.println(b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
    }
}
