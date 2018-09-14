import org.junit.Test;

import static org.junit.Assert.*;

public class ReadFileTest {
    ReadFile ob=new ReadFile();
    @Test
    public void checkFileData(){

        //assertEquals("19\nHELLO EVERYONE!!!!",ob.readFile("Sample.txt"));
        assertEquals("0\nnull",ob.readFile("Unknown.txt"));
    }



}