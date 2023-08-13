
import org.Interval.Interval;
import org.Interval.IntervalSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class IntervalSumTest {

    @Test
    public void testWithHardValues() {
        Interval[] intervals = {
                new Interval(1, 4),
                new Interval(7, 10),
                new Interval(3, 5)
        };

        int result = IntervalSum.sumIntervals(intervals);
        assertEquals(7, result,"Failed");
    }
    @Test
    public void TestWithSimpleValue(){
        Interval[] firstTest = {
                new Interval(1,5)
        };
        int result = IntervalSum.sumIntervals(firstTest);
        assertEquals(4,result,"Failed");

    }
}
