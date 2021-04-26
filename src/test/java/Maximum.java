import com.bridgelabz.FindMax;
import com.bridgelabz.MaximumT;
import org.junit.jupiter.api.Test;

public class Maximum {
    /**
     * test 1 should return maximum integer
     */
    @Test
    void givenIntegershouldGivesMaximumVallue() {
        FindMax.printInteger(4,3,7);
    }

    @Test
    void givenDoubleValueShouldReturnMaximum() {
        FindMax.printFloat(1.2,1.6,1.9);
    }

    @Test
    void givenStringItGivesMaximumValue() {
        FindMax.printString("apple","peatch","banana");
    }

    /**
     * with the help of genric printing
     */

    @Test
    void withTheHelpOfGenricCalculateMaxInThrreInSame() {
       FindMax.printInteger(4,8,11);
       FindMax.printFloat(1.2,8.4,25.2);
       FindMax.printGenric("apple","peach","banana");
    }

    @Test
    void genricClassUsedToFindOutMax() {
        MaximumT maximumT = new MaximumT(15,20,45);
        maximumT.Maximum();
        MaximumT.valueMax("apple","peach","banana");

    }
}
