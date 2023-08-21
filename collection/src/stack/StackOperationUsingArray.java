package stack;

public class StackOperationUsingArray {
	int top;
	int size;
	int[] st;
	StackOperationUsingArray()
	{
		top=-1;
		size=10;
		st =new int[size];
		
	}
	public boolean isEmpty()
	{
		return top== -1;
	}
	public boolean  isFull()
	{
		return top==size-1;
	}
	public int push(int elements)
	{
		if(isFull())
		{
			System.out.println("stack is full");
		}
		return st[++top]=elements;
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
		}
		return st[top--];
	}
	public int peek()
	{
		return st[top];
	}
	public void display()
	{
		for(int i:st)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		StackOperationUsingArray s=new StackOperationUsingArray();
		 s.push(10);
		 s.push(30);
		  s.display();
	     
	}

}
