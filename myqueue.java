public class myqueue {

    // implement the stack using an array
		int myarray[]=new int[100];
	// declare additional variables here
        private int front=-1;
        private int rear=-1;


  public void enqueue(int element) {
		// ..... fill the stub function ......
    if((rear+1)%100==front)
        throw new RuntimeException("Queue is Full!!!!");
    if(isEmpty())
        {front++;
        rear++;
        myarray[rear]=element;
        }
    else
    {
        rear=(rear+1)%100;
    myarray[rear]=element;
    }
                                    }

   public int dequeue() {
		// ..... fill the stub function ......
        int tmp;
    if(isEmpty())
        throw new RuntimeException("Queue is Empty!!!!");
    if(front==rear)
        {   tmp=myarray[front];
            front=rear=-1;
            return tmp;
        }
    else
        {
            tmp=myarray[front];
            front=(front+1)%100;
            return tmp;
        }


                            }

   public boolean isEmpty() {
		// ..... fill the stub function ......
        return (front==-1&&rear==-1);
                            }
   public int getRear()
    {
        return rear;
    }
}
