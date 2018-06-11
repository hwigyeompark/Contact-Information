package kr.hs.dgsw.contact.Model;

import kr.hs.dgsw.contact.Controller.ResponseFormat;

public interface ContactService {
    ResponseFormat list();
    ResponseFormat view(int idx);
    ResponseFormat insert(ContactDomain contact);
    ResponseFormat update(ContactDomain contact);
    ResponseFormat delete(int idx);
}

enum CMD {
    INSERT, UPDATE, DELETE, LIST, VIEW;

    public int code() { return ordinal() + 101; }

    public static String description(CMD cmd) {
        StringBuffer str = new StringBuffer("Fail to ");
        switch(cmd) {
            case INSERT : str.append("INSERT"); break;
            case UPDATE : str.append("UPDATE"); break;
            case DELETE : str.append("DELETE"); break;
            case LIST : str.append("LIST"); break;
            case VIEW : str.append("VIEW"); break;
        }
        return str.toString();
    }
}