import java.util.*;

public class leetcodesol {

    public boolean ques219(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) == false) {
                map.put(nums[i], i);
            } else {
                if (Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }

    public int[] ques1480(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        output[0] = nums[0];
        /*
         * [1,2,3,4,5]
         * [1,1+2,1+2+3,1+2+3+4,1+2+3+4+5]
         */
        for (int i = 1; i < n; i++) {
            output[i] = nums[i] + output[i - 1];
        }

        return output;
    }

    public int slidingWindow(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int sum = 0;

        while (end - start + 1 < k) {
            end++;
            for (int i = 0; i < nums.length; i++) {
                sum = sum + nums[end];
            }
        }
        return sum;
    }

    public void que76(String s, String t) {
        String[] sarr = new String[] { s };
        String[] tarr = new String[] { t };
        int count = 0;
        int final_length = Integer.MAX_VALUE;
        int length = 0;
        // int[] ans = new int[sarr.length];
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0, a = 0; i < sarr.length; i++) {
            for (int j = 0; j < tarr.length; j++) {
                if (sarr[i] == tarr[j] && i - a < sarr.length) {
                    count++;
                    if (count == tarr.length - 1) {
                        for (int l = a; l <= i; l++) {
                            // String b = Integer.toString(l);
                            // sarr[l] = ans[b];
                        }
                        // length = sarr.length;
                        final_length = Math.min(final_length, length);
                        a = i + 1;
                        // i++;
                    }
                    i++;
                } else if (i == sarr.length) {
                    System.out.println(final_length);
                } else {
                    i++;
                }
            }
        }
    }

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, i);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)) == false) {
                return i;
            }
        }
        return -1;
    }

    public int climbStairs(int n) {
        if (n <= 3)
            return n;
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        while (n >= 4) {
            if (map.containsKey(n)) {
                return map.get(n);
            }
            // else{
            result += climbStairs(n - 1);
            map.put(n, result);
            // }
        }
        return result;
    }

    public int minCostClimbingStairs(int[] cost) {
        if (cost.length == 1) {
            return cost[0];
        }
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        if (cost.length == 3) {
            if (cost[0] + cost[2] >= cost[1]) {
                return cost[1];
            } else {
                return cost[0] + cost[2];
            }
        }
        int result = 0;
        for (int i = 4; i < cost.length; i++) {
            result += Math.min(cost[i - 1], cost[i - 2]);
        }
        return result;
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nger = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        nger[n - 1] = n;

        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                nger[i] = st.peek();
            } else {
                nger[i] = n;
            }
            st.push(i);
        }

        int[] ngel = new int[n];
        st.push(0);
        ngel[0] = -1;

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                ngel[i] = st.peek();
            } else {
                ngel[i] = n;
            }
            st.push(i);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            int width = nger[i] - ngel[i] - 1;
            int area = width * heights[i];

            if (area > max) {
                max = area;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        leetcodesol que = new leetcodesol();
        // int[] nums = { 1, 2, 3, 1 };
        // int k = 3;
        // que.ques219(nums,k);
        // que.ques1480(nums);
        // que.slidingWindow(nums, 2);
        // String s = "aaaaba";
        // String t = "ABC";

        // que.que76(s, t);

        // que.firstUniqChar(s);

        // que.climbStairs(10);
        int[] arr = {2,1,2};
        // que.minCostClimbingStairs(arr);
        System.out.println(que.largestRectangleArea(arr));

    }
}
