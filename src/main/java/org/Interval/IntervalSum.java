package org.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntervalSum {
    public static int sumIntervals(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        List<Interval> mergedIntervals = new ArrayList<>();
        mergedIntervals.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            Interval currentInterval = intervals[i];
            Interval previousInterval = mergedIntervals.get(mergedIntervals.size() - 1);

            
            if (currentInterval.start <= previousInterval.end) {
                previousInterval.end = Math.max(previousInterval.end, currentInterval.end);
            } else {
                mergedIntervals.add(currentInterval);
            }
        }

        int sum = 0;
        for (Interval interval : mergedIntervals) {
            sum += interval.end - interval.start;
        }

        return sum;
    }

    public static void main(String[] args) {
        Interval[] intervals = {
                new Interval(1, 4),
                new Interval(7, 10),
                new Interval(3, 5)
        };

        int result = sumIntervals(intervals);
        System.out.println("Sum of non-overlapping intervals: " + result);
    }
}
