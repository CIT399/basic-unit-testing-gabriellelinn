import org.junit.Test;
import static org.junit.Assert.*;
public class testing {
    private String testCase1 = "5701239999";
    private String testCase2 = "(610)9901234";
    private String testCase3 = "570589-16983";


    @Test
    public void happyPath() {
        assertTrue("Good!",Telephone.format(testCase1) == "(570)123-9999");
    }
    @Test
    public void noDash(){
        assertFalse(Telephone.format(testCase2) == "(610)990-1234");
    }
    @Test
    public void noparen(){
        assertFalse(Telephone.format(testCase3)== "570589-16983");
    }
}