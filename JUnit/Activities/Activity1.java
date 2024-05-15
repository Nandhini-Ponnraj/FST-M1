import org.junit.Assert;
//import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {
    public  static ArrayList<String> list;

    @BeforeEach
    public  void setUp(){
list=new ArrayList<String>();
list.add("alpha");
list.add("beta");
    }

    @Test
    public void insertTest(){
        assertEquals(2,list.size(),"Mismatch value");
        list.add("gamma");
        assertEquals(3,list.size(),"Mismatch value");
        assertEquals("alpha",list.get(0),"false");
        assertEquals("beta",list.get(1),"false");
        assertEquals("gamma",list.get(2),"false");
    }

    @Test
    public void replaceTest(){
        assertEquals(2,list.size(),"Mismatch value");
        list.add("hexa");
        assertEquals(3,list.size(),"Mismatch value");

        list.set(1,"octa");

        assertEquals(3,list.size(),"Mismatch value");
        assertEquals("alpha",list.get(0),"false");
        assertEquals("octa",list.get(1),"false");
        assertEquals("hexa",list.get(2),"false");
    }
}
