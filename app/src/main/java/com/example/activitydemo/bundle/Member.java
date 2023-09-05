package com.example.activitydemo.bundle;

import java.io.Serializable;
import java.util.List;

public class Member implements Serializable {

    List<User> mList;

    public Member() {

    }

    public Member(List<User> mList) {
        this.mList = mList;
    }

    public List<User> getList() {
        return mList;
    }
}
