package kr.hs.dgsw.contact.Model;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ContactMapper {
    List<ContactDomain> list();
    ContactDomain view(@Param("idx") int idx);
    int insert(ContactDomain contact);
    int update(ContactDomain contact);
    int delete(@Param("idx") int idx);
    int getLastID();
}
