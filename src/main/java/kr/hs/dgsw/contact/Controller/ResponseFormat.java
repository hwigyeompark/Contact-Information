package kr.hs.dgsw.contact.Controller;

import kr.hs.dgsw.contact.Model.ContactDomain;

import java.util.List;

public class ResponseFormat {
    int code;
    String description;
    int last_idx;
    ContactDomain contact;
    List<ContactDomain> contacts;

    public void fail(int code, String description){
        this.code = code;
        this.description = description;
    }

    public ResponseFormat(){
        this.code = 0;
        this.description =  "success";
        this.last_idx = -1;
        this.contact = null;
        this.contacts = null;
    }

    public ResponseFormat(ContactDomain contact){
        this();
        this.contact = contact;
    }

    public ResponseFormat(List<ContactDomain> contacts){
        this();
        this.contacts = contacts;
    }
}
