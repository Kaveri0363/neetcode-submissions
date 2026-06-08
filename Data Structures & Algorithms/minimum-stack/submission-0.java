class MinStack {
    Stack<Integer> stack;
    Stack<Integer> stack2;
    public MinStack() {
        stack=new Stack<>();
        stack2=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(stack2.isEmpty())
        stack2.push(val);
        else{
            stack2.push(Math.min(val,stack2.peek()));
        }
        
    }
    
    public void pop() {
        stack.pop();
        stack2.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stack2.peek();
    }
}
