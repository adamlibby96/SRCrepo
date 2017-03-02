package computer;

public class Memory
{
	private int address;
	private int decimal;
	private String binary;
	private String hex;
	private int DecWord;
	private int HexWord;

	public Memory()
	{
		this.address = 0;
		this.decimal = 0;
		this.binary = Integer.toBinaryString(this.decimal);
		this.hex = Integer.toHexString(this.decimal);
		this.DecWord = 0;
		this.HexWord = Integer.decode("#00000000");
	}

	public Memory(int addr, int dec)
	{
		this.address = addr;
		this.decimal = dec;
		this.binary = Integer.toBinaryString(dec);
		this.hex = Integer.toHexString(dec);
		this.DecWord = 0;
		this.HexWord = 0;
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
	
	public String getBinary()
	{
		return binary;
	}
	
	public void setBinary(String binary)
	{
		this.binary = binary;
	}
	
	public String getHex()
	{
		return hex;
	}
	
	public void setHex(String hex)
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
