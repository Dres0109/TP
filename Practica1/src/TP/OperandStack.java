package main;

public class OperandStack {
	
	private int[] stack;
	private static int stackPos;
	
	
	public OperandStack()
	{
		int[] stack = new int[10];	
		stackPos = 0;
	}
	
	public String toString(int value)
	{		
		return Integer.toString(value);
	}
	
	public void Push(int n)
	{
		stack[stackPos] = n;
		stackPos++;
	}
	
	public void Load(int pos, Memory memory)
	{
		int value;
		
		value = memory.readMem(pos);
		Push(value);	
	}
	
	public void removeTop()
	{
		for (int i = 0; i < stack.length-1; i++) 
		{
			stack[i] = stack[i+1];
		}
	}
	
	public void Store(int pos, Memory memory)
	{
		memory.writeMem(pos, stack[0]);
		removeTop();
	}
	
	public void Add()
	{
		stack[1] = stack[1] + stack[0];
		removeTop();
	}
	
	public void Sub()
	{
		stack[1] = stack[1] - stack[0];
		removeTop();
	}
	
	public void Mul()
	{
		stack[1] = stack[1] * stack[0];
		removeTop();
	}
	
	public void Div()
	{
		stack[1] = stack[1] / stack[0];
		removeTop();
	}
	
	public void Out()
	{
		System.out.println(toString(stack[0]));
		
	}
	
	public void Halt(){}

}
