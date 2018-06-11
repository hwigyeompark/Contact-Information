package kr.hs.dgsw.contact.Controller;

import kr.hs.dgsw.contact.Model.ContactDomain;
import kr.hs.dgsw.contact.Model.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

    @RestController
    @RequestMapping("/contact")
    public class ContactController{
        @Autowired
        ContactService service;

        @GetMapping
        public ResponseFormat list(){
            return this.service.list();
        }
        @GetMapping("/{idx}")
        public ResponseFormat view(@PathVariable int idx){
            return this.service.view(idx);
        }
        @PostMapping
        public ResponseFormat insert(@RequestBody ContactDomain contact){
            return this.service.insert(contact);
        }
        @PutMapping 
        public ResponseFormat update(@RequestBody ContactDomain contact){
            return this.service.update(contact);
        }
        @DeleteMapping("/{idx}")
        public ResponseFormat delete(@PathVariable int idx){
            return this.service.delete(idx);
        }
    }
