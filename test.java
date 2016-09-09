public class test {

	public boolean isStackSortablePermutation(myqueue input) {
		// ..... fill the stub function ......
            int size=input.getRear()+1;
        
            mystack s=new mystack();
            myqueue qop=new myqueue();

            int element;

                while(!input.isEmpty())
                { element=input.dequeue();

                    while(!s.isEmpty())
                    {
                        if(element>s.getElementAtTopOfStack())
                        {
                            int tmp;
                            tmp=s.pop();
                            qop.enqueue(tmp);

                        }
                        else
                            break;
                    }
                    s.push(element);
                }

                while(!s.isEmpty())
                {
                    element=s.pop();
                    qop.enqueue(element);

                }

        int arr[]=new int[size];
        int i=0;

            while(!qop.isEmpty())
            { arr[i]=qop.dequeue();
                i++;
            }

        for(int j=1;j<size;j++)
        {
            if(arr[j-1]>arr[j])
                return false;
        }
            return true;
    }

}
