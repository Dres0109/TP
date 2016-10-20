package main;

public enum ENUM_BYTECODE {
	PUSH("PUSH"),
	LOAD("LOAD"),
	STORE("STORE"),
	ADD("ADD"),
	SUB("SUB"),
	MUL("MUL"),
	DIV("DIV"),
	OUT("OUT"),
	HALT("HALT");
	
	private String code;

	ENUM_BYTECODE(String code)
	{
		this.code = code;
		
	}

}
