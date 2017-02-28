package problemDomain;

import java.util.List;

import computer.Memory;

public class Computer
{
	
	List<Memory> memoryList;


	public Computer(int MemSize)
	{
		// initialize the list of Memory elements with the address
		// of i and everything set to 0 for the start.
		for (int i = 0; i < MemSize; i++)
		{
			memoryList.add(new Memory(i, 0, 0, 0, 0, 0));
		}
	}
}
