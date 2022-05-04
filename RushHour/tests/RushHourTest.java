import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RushHourTest {
    RushHour h;
    @Before
    public void setup() throws Exception{
        h= new RushHour();
        System.out.print("Success!");
    }
    @Test(expected = IllegalArgumentException.class)
    public void EquivalenceandBoundrytest1(){
        String result =h.TrainTicketFare((float ) -5);
        assertEquals("Full",result);
    }
    @Test
    public void EquivalenceandBoundrytest2(){
        String result =h.TrainTicketFare((float ) 4.50);
        assertEquals("Full",result);
    }
    @Test
    public void EquivalenceandBoundrytest3(){
        String result =h.TrainTicketFare((float ) 9.49);
        assertEquals("Full",result);
    }
    @Test
    public void EquivalenceandBoundrytest4(){
        String result =h.TrainTicketFare((float ) 9.50);
        assertEquals("Full",result);
    }
    @Test
    public void EquivalenceandBoundrytest5(){
        String result =h.TrainTicketFare((float ) 15);
        assertEquals("Saver",result);
    }
    @Test
    public void EquivalenceandBoundrytest6(){
        String result =h.TrainTicketFare((float ) 16.00);
        assertEquals("Saver",result);
    }
    @Test
    public void EquivalenceandBoundrytest7(){
        String result =h.TrainTicketFare((float ) 16.1);
        assertEquals("Full",result);
    }
    @Test
    public void EquivalenceandBoundrytest8(){
        String result =h.TrainTicketFare((float ) 18.00);
        assertEquals("Full",result);
    }
    @Test
    public void EquivalenceandBoundrytest9(){
        String result =h.TrainTicketFare((float ) 19.50);
        assertEquals("Full",result);
    }
    @Test
    public void EquivalenceandBoundrytest10(){
        String result =h.TrainTicketFare((float ) 19.51);
        assertEquals("Saver",result);
    }
    @Test
    public void EquivalenceandBoundrytest11(){
        String result =h.TrainTicketFare((float ) 23);
        assertEquals("Saver",result);
    }
}