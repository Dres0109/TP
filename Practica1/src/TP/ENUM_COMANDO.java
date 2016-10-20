package main;

public enum ENUM_COMANDO 
{
	HELP, 
	QUIT, 
	NEWINST, 
	RUN, 
	RESET, 
	REPLACE;
	
	public int posicion(int pos){
		
		for (int i = 0; i < ENUM_COMANDO.values().length; i++) 
		{
			
		}
		return pos;
		
	}
}


/*HELP: Shows information about the available commands.
1
2 Assignment 1: Virtual Machine
QUIT: Closes the application.
NEWINST BC: Checks if the instruction BC is a valid bytecode instruction and, if
so, adds it to the current program.
RUN: Executes the current program.
RESET: Deletes the current program.
REPLACE N: Replaces the bytecode instruction number N of the program. After the
user enters this command, he/she is asked to provide the replacement instruction.
*/