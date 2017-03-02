package computer;

import java.util.ArrayList;

public class Processor
{
	ArrayList<Register> registers;

	public Processor() {
		Register pc = new Register(100, "PC");
		Register ir = new Register(200, "IR");
		Register ma = new Register(300, "MA");
		Register md = new Register(400, "MD");
		Register ra = new Register(500, "RA");
		Register rc = new Register(600, "RC");
		
		registers = new ArrayList<Register>();
		
		for (int i = 0; i < 32; i++) {
			registers.add(new Register((1000 + i), ("r" + i)));
		}
		
	}
	
	
	
}
