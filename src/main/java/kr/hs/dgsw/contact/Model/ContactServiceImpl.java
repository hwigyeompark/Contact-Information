package kr.hs.dgsw.contact.Model;

import kr.hs.dgsw.contact.Controller.ResponseFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    ContactMapper mapper;

    private ResponseFormat response(int num_affected, CMD cmd) {
        ResponseFormat r = new ResponseFormat();
        if(num_affected == 0) r.fail(cmd.code(), CMD.description(cmd));
        return r;
    }

    private ResponseFormat response(ContactDomain contact) {
        ResponseFormat r = new ResponseFormat(contact);
        if(contact == null) r.fail(CMD.VIEW.code(), CMD.description(CMD.VIEW));
        return r;
    }

    private ResponseFormat response(List<ContactDomain> contacts) {
        ResponseFormat r = new ResponseFormat(contacts);
        if(contacts == null) r.fail(CMD.LIST.code(), CMD.description(CMD.LIST));
        return r;
    }

    @Override
    public ResponseFormat list() {
        return this.response(mapper.list());
    }

    @Override
    public ResponseFormat view(int idx) {
        return this.response(mapper.view(idx));
    }

    @Override
    public ResponseFormat insert(ContactDomain contact) {
        return this.response(mapper.insert(contact), CMD.INSERT);
    }

    @Override
    public ResponseFormat update(ContactDomain contact) {
        return this.response(mapper.update(contact), CMD.UPDATE);
    }

    @Override
    public ResponseFormat delete(int idx) {
        return this.response(mapper.delete(idx), CMD.DELETE);
    }
}
