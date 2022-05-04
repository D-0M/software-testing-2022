import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatIntrerestTest {
    CalculatIntrerest m;
    @Before
    public void setup() throws Exception{
        m= new CalculatIntrerest();
        System.out.print("successful test\n");
    }
    //Equivalence Partitions
    @Test(expected = IllegalArgumentException.class)
    public void EquivalencePartitions(){
        double result =m.AccountIntreset(-20);
        assertEquals(00,result,0.00000);
    }
    @Test
    public void EquivalencePartitions2(){
        double result =m.AccountIntreset(50);
        assertEquals(1.5,result,0.00000);
    }
    @Test
    public void EquivalencePartitions3(){
        double result =m.AccountIntreset(300);
        assertEquals(15 ,result,0.00000);
    }
    @Test
    public void EquivalencePartitions4(){
        double result =m.AccountIntreset(1200);
        assertEquals(84,result,00000000000001);
    }
    // boundary Value Analysis
    @Test(expected = IllegalArgumentException.class)
    public void boundaryValueAnalysis(){
        double result =m.AccountIntreset(-0.01);
        assertEquals(00,result,0.000000);
    }
    @Test
    public void boundaryValueAnalysis2(){
        double result =m.AccountIntreset(0.00);
        assertEquals(0,result,0.000000);
    }
    @Test
    public void boundaryValueAnalysis3(){
        double result =m.AccountIntreset(100.00);
        assertEquals(3,result,0.000000);
    }
    @Test
    public void boundaryValueAnalysis4(){
        double result =m.AccountIntreset(100.01);
        assertEquals(5.0005,result,0.000500000000001);
    }
    @Test
    public void boundaryValueAnalysis5(){
        double result =m.AccountIntreset(999.99);
        assertEquals(49.9995,result,0.999500000000005);
    }
    @Test
    public void boundaryValueAnalysis6(){
        double result =m.AccountIntreset(1000.00);
        assertEquals(70,result,0.000000);
    }
}