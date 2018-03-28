package com.nowcoder.model;

import org.springframework.stereotype.Component;

/**
 * Created by nowcoder on 2016/7/3.
 * 表示当前用户是谁
 */
@Component
public class HostHolder {
    //线程本地变量
    private static ThreadLocal<User> users = new ThreadLocal<User>();

    //提取当前用户
    public User getUser() {
        return users.get();
    }

    //保存当前用户
    public void setUser(User user) {
        users.set(user);
    }

    public void clear() {
        users.remove();;
    }
}
