package computer;

public class Memory
{
	private int address;
	private int decimal;
	private int binary;
	private int hex;
	private int DecWord;
	private int HexWord;

	public Memory()
	{
		this.address = 0;
		this.decimal = 0;
		this.binary = Integer.parseInt("00000000", 2);
		this.hex = Integer.decode("#00");
		this.DecWord = 0;
		this.HexWord = Integer.decode("#00000000");
	}

	public Memory(int addr, int dec, int bin, int hex, int decWord, int Hexword)
	{
		this.address = addr;
		this.decimal = dec;
		this.binary = bin;
		this.hex = hex;
		this.DecWord = decWord;
		this.HexWord = Hexword;
	}

	public int getAddress()
	{
		return address;
	}
	
	public void setAddress(int address)
	{
		this.address = address;
	}
	
	public int getDecimal()
	{
		return decimal;
	}
	
	public void setDecimal(int decimal)
	{
		this.decimal = decimal;
	}
	
	public int getBinary()
	{
		return binary;
	}
	
	public void setBinary(int binary)
	{
		this.binary = binary;
	}
	
	public int getHex()
	{
		return hex;
	}
	
	public void setHex(int hex)
	{
		this.hex = hex;
	}
	
	public int getDecWord()
	{
		return DecWord;
	}
	
	public void setDecWord(int decWord)
	{
		DecWord = decWord;
	}
	
	public int getHexWord()
	{
		return HexWord;
	}
	
	public void setHexWord(int hexWord)
	{
		HexWord = hexWord;
	}
	

}
