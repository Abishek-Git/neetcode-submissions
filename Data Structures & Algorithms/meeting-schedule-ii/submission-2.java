/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        intervals.sort((a, b) -> a.start - b.start);
        PriorityQueue<Interval> que = new PriorityQueue<>((a,b)-> a.end - b.end);

        for (int i = 0; i < intervals.size(); i++) {
            Interval meet = intervals.get(i);
            if (!que.isEmpty() && que.peek().end <= meet.start) {
               que.poll();
            }
            que.offer(meet);

            
        }

        return que.size();
    }
}
