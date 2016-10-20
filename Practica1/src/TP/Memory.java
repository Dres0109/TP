package main;

public class Memory {
	
	public static final int MIN_MEMORY = 100;
	private Integer[] memory;
	
	public Memory()
	{
		Integer[] memory = new Integer[MIN_MEMORY];
	}
	
	public String toString(int pos)
	{	
		return Integer.toString(memory[pos]);
	}
	
	public boolean writeMem(int pos, int value)
	{
		boolean written = false;
		
		if(pos > memory.length)
		{
			Integer[] aux = new Integer[pos*2];
			for(int i = 0; i < memory.length; i++)
			{
				memory[i] = aux[i];
			}
			Integer[] memory = new Integer[pos*2];
			
			for (int i = 0; i < aux.length; i++) 
			{
				aux[i] = memory[i];
			}
			
		}
		
		if(pos >= 0)
		{
			memory[pos] = value;
			showState(pos);
			written = true;
		}
		
		return written;
		
	}

	
	
	public int readMem(int pos){
		
		if(memory[pos] == null) memory[pos] = 0;
		showState(pos);
		
		return memory[pos];
	}
	
	public void showState(int pos)
	{
		
		if(memory[pos] != null)
		{ 
			System.out.println("Memory: [" + pos + "]  : " + toString(pos));
		}
		else
		{
			System.out.println("Memory: <vacia>");
		}
	}
}










