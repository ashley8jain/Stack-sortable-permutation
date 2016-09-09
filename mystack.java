public class mystack {
    private int top=-1;
    // implement the stack using an array
    
    int myarray[]=new int[100];
    // declare additional variables here
   
    public void push(int element) {
        // ..... fill the stub function ......
        if(top==99)
            throw new RuntimeException("Stack overflow");
        top++;
        myarray[top]=element;
        
    }
    
    
    public int pop(){
        // ..... fill the stub function ......
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        int tmp=myarray[top];
        top--;
        return tmp;
        
        
    }
    
    public boolean isEmpty() {
        // ..... fill the stub function ......
        return top==-1;
    }
    
    public int getElementAtTopOfStack() {
        // ..... fill the stub function ......
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        return myarray[top];
        
    }
}
