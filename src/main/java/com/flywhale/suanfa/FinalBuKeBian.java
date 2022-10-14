package com.flywhale.suanfa;

/**
 * 在 User.java 文件中，类 User 提供了私有属性名为 name 的字符串变量，里面包含对应的 setter 和 getter 方法。
 *
 * 要求：请在类 Solution 中创建一个User 类的 final 变量 user ，
 * 并调用构造函数，还需要你创建一个名为 getUser 的方法，传入字符串变量，
 * 在内部需要你对调用 User 类的 setName 方法对 user 的 name 属性进行赋值，
 * 最终返回 user 对象，以证明经过 final 修饰的变量，对象的指向不可变，但其内容可变。
 */
public class FinalBuKeBian {
    final User user = new User();

    public User getUser(String username){
        user.setName(username);
        return user;
    }

}
