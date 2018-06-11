package kr.hs.dgsw.contact.Model;

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
public class ContactDomain {
    private int idx;
    private String lname;
    private String fname;
    private String phone;
    private String email;
    private Date birth;
    private String memo;
    private Timestamp created;
    private Timestamp updated;
}
