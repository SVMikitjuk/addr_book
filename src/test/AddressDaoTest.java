import com.mik.model.Address;
import com.mik.service.AddressService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mikitjuk on 05.10.15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*: spring-servlet.xml")
//@ContextConfiguration(locations={"classpath:test-context.xml"})
@Transactional
@TransactionConfiguration(defaultRollback=true)
public class AddressDaoTest {

    @Autowired
    private AddressService addressService;

    @Test
    public void testFindById()
    {
        Address address = addressService.read(1);
        Assert.assertEquals(Integer.getInteger("1"), address.getId());
    }

//    @Test
//    public void testFindByEmail()
//    {
//        Member member = memberDao.findByEmail("john.smith@mailinator.com");
//
//        Assert.assertEquals("John Smith", member.getName());
//        Assert.assertEquals("john.smith@mailinator.com", member.getEmail());
//        Assert.assertEquals("2125551212", member.getPhoneNumber());
//        return;
//    }
//
//    @Test
//    public void testRegister()
//    {
//        Member member = new Member();
//        member.setEmail("jane.doe@mailinator.com");
//        member.setName("Jane Doe");
//        member.setPhoneNumber("2125552121");
//
//        memberDao.register(member);
//        Long id = member.getId();
//        Assert.assertNotNull(id);
//
//        Assert.assertEquals(2, memberDao.findAllOrderedByName().size());
//        Member newMember = memberDao.findById(id);
//
//        Assert.assertEquals("Jane Doe", newMember.getName());
//        Assert.assertEquals("jane.doe@mailinator.com", newMember.getEmail());
//        Assert.assertEquals("2125552121", newMember.getPhoneNumber());
//        return;
//    }
//
//    @Test
//    public void testFindAllOrderedByName()
//    {
//        Member member = new Member();
//        member.setEmail("jane.doe@mailinator.com");
//        member.setName("Jane Doe");
//        member.setPhoneNumber("2125552121");
//        memberDao.register(member);
//
//        List<Member> members = memberDao.findAllOrderedByName();
//        Assert.assertEquals(2, members.size());
//        Member newMember = members.get(0);
//
//        Assert.assertEquals("Jane Doe", newMember.getName());
//        Assert.assertEquals("jane.doe@mailinator.com", newMember.getEmail());
//        Assert.assertEquals("2125552121", newMember.getPhoneNumber());
//        return;
//    }
}
