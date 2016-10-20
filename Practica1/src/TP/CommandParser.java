package main;

public class CommandParser {
	
	public static Command parse(String line){
		
		int i = 0;
		boolean encontrado = false;
		
		while(!encontrado && (i < ENUM_COMANDO.values().length)){
			if(line == ENUM_COMANDO.values(i))
			
			i++;
		}
		
	}

}

/*private ENUM_COMANDO command;
private ByteCode instruction;
private int replace;*/