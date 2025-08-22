// Last updated: 8/22/2025, 4:45:23 PM
class MinStack {
    private Stack<Integer> mainSt, minSt;

    public MinStack() {
        mainSt = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int val) {
        mainSt.push(val);
        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }
    }

    public void pop() {
        if (mainSt.isEmpty()) return;
        if (mainSt.peek().equals(minSt.peek())) {
            minSt.pop();
        }
        mainSt.pop();
    }

    public int top() {
        if (mainSt.isEmpty()) return -1;
        return mainSt.peek();
    }

    public int getMin() {
        if (minSt.isEmpty()) return -1;
        return minSt.peek();
    }
}