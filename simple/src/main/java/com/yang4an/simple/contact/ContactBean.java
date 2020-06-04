package com.yang4an.simple.contact;

/**
 * author: create by yangfan on 2020/5/14 1:55 PM
 * email: yang4an@gmail.com
 * description:
 * version:
 */
public class ContactBean {
    public String name;
    public String phone;
    public String note;

    @Override
    public String toString() {
        return "联系人--->{" +
                "姓名='" + name + '\'' +
                ", 手机='" + phone + '\'' +
                ", note='" + note + '\'' +
                '}' + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
