import org.junit.Test;
import static org.junit.Assert.*;
public class MemberTest {

    MemberVariable obj=new MemberVariable();
    @Test
    public void checkResults(){
        assertEquals("Members Name: xyz\nMembers Age: 21\nMembers Salry: 2500.00",obj.printValue("xyz",21,2500.00));

    }







}