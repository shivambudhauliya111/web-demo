// Last updated: 8/22/2025, 4:44:50 PM
class StockSpanner {
  public int next(int price) {
    int span = 1;
    while (!stack.isEmpty() && stack.peek().getKey() <= price)
      span += stack.pop().getValue();
    stack.push(new Pair<>(price, span));
    return span;
  }
  private Stack<Pair<Integer, Integer>> stack = new Stack<>();
}