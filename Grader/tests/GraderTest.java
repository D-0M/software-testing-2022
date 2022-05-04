import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class GraderTest {
    Grader n =new Grader();

    @Test
    public void Grade() {
        char result = n.determineLetterGrade(100);
        assertEquals('A', result);
    }

    @Test
    public void Grade2() {
        char result = n.determineLetterGrade(99);
        assertEquals('A', result);
    }

    @Test
    public void Grade3() {
        char result = n.determineLetterGrade(90);
        assertEquals('A', result);
    }

    @Test
    public void Grade4() {
        char result = n.determineLetterGrade(89);
        assertEquals('B', result);
    }

    @Test
    public void Grade5() {
        char result = n.determineLetterGrade(84);
        assertEquals('B', result);
    }

    @Test
    public void Grade6() {
        char result = n.determineLetterGrade(80);
        assertEquals('B', result);
    }

    @Test
    public void Grade7() {
        char result = n.determineLetterGrade(70);
        assertEquals('C', result);
    }

    @Test
    public void Grade8() {
        char result = n.determineLetterGrade(72);
        assertEquals('C', result);
    }

    @Test
    public void Grade9() {
        char result = n.determineLetterGrade(79);
        assertEquals('C', result);
    }
    @Test
    public void Grade10() {
        char result = n.determineLetterGrade(60);
        assertEquals('D', result);
    }

    @Test
    public void Grade11() {
        char result = n.determineLetterGrade(68);
        assertEquals('D', result);
    }

    @Test
    public void Grade12() {
        char result = n.determineLetterGrade(69);
        assertEquals('D', result);
    }

    @Test
    public void Grade13() {
        char result = n.determineLetterGrade(0);
        assertEquals('F', result);
    }

    @Test
    public void Grade14() {
        char result = n.determineLetterGrade(59);
        assertEquals('F', result);
    }

    @Test
    public void Grade15() {
        char result = n.determineLetterGrade(30);
        assertEquals('F', result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void GradeNegative() {
        char result= n.determineLetterGrade(-1);
        assertEquals("Number grade cannot be negative: ", result);
    }
}

