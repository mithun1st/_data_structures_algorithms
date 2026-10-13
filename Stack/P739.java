package Stack;

class Sta {
    private final int[] stack;

    Sta(int len) {
        stack = new int[len];
    }

    private int position = 0;

    void push(int value) {
        stack[position] = value;
        position++;
    }

    int pop() {
        position--;
        final int tem = stack[position];
        stack[position] = 0;
        return tem;
    }

    int top() {
        return stack[position - 1];
    }

    boolean isEmpty() {
        return position == 0;
    }
}

public class P739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        final Sta stackI = new Sta(temperatures.length);

        final int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            final int element = temperatures[i];

            if (stackI.isEmpty()) {
                stackI.push(i);
                continue;
            }

            while (!stackI.isEmpty() && temperatures[stackI.top()] < element) {
                final int index = stackI.pop();
                result[index] = i - index;
            }
            stackI.push(i);
        }
        return result;
    }

    public static void main(String[] args) {

        dailyTemperatures(new int[] { 73, 74, 75, 71, 69, 72, 76, 73 });
        // dailyTemperatures(new int[] { 73, 74, 75 });
        /*
         * 
         * Input: temperatures = [73,74,75,71,69,72,76,73]
         * Output: [1,1,4,2,1,1,0,0]
         * Example 2:
         * 
         * Input: temperatures = [30,40,50,60]
         * Output: [1,1,1,0]
         * Example 3:
         * 
         * Input: temperatures = [30,60,90]
         * Output: [1,1,0]
         */
    }
}
