class MinStack {
    private Stack<int[]> stack;

    public MinStack() {
        stack = new Stack<>();    
    }
    
    public void push(int val) {
        if(stack.empty()){
            stack.push(new int[] {val, val});
        }
        else if(stack.peek()[1] < val){
            stack.push(new int[] {val, stack.peek()[1]});
        }
        else{
            stack.push(new int[] {val, val});
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}
