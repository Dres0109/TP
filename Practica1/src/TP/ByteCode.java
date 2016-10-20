package main;

public class ByteCode {
	
	private ENUM_BYTECODE name;
	private int param;
	
	public ByteCode(ENUM_BYTECODE name)
	{
		name = this.name;		
	}
	
	public ByteCode(ENUM_BYTECODE name, int param)
	{
		name = this.name;	
		param = this.param;
	}
	
	public String toString()
	{
		return Enum.valueOf(name.getClass(), name);
		
	}
	
	public ENUM_BYTECODE getCode()
	{
		
		
	}


}
