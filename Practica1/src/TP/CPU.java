package main;

public class CPU {
	
	private boolean terminated;
	
	public CPU()
	{
		Memory mem = new Memory();
		OperandStack stack = new OperandStack();
		terminated = false;
	}
	
	public boolean execute(ByteCode instr)
	{
		if(instr.toString() == "PUSH")
		{
			
		}
		return terminated;
		
	}
	
		

}
