public class customStack {

    protected int[] data;
    private static final int default_size = 10;
    
    int ptr =-1;
    
    public customStack(){
        this(default_size);
    }
    public customStack(int size)
    {
        this.data = new int[size];
    }
    public boolean push(int item)
    {
        if(isFull())
        {
            System.out.println("Stack is full!");
            return false;
        }
        ptr++;
        data[ptr]= item;
        return true;
    }
    private boolean isFull()
    {
        return ptr == data.length - 1; //ptr is at last index

    }

    private boolean isEmpty() {
        return ptr == - 1; //ptr is at first index
    }

    public int pop() throws Exception{
        if(isEmpty())
        {
            throw new Exception("Cannot pop from an empty stack!!");
        }
        return data[ptr--];
    }

    public int peek()throws Exception{
        if(isEmpty())
        {
            throw new Exception("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }




    
}
