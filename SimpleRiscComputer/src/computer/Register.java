package computer;

public class Register {
	private String name;
	private int address;
	private String hex;
	private String bin;
	private int[] value;

	public Register() {
		this.name = "unknown Register";
		this.value = new int[32];
		this.address = 0;
		this.hex = Integer.toHexString(this.address);
		this.bin = Integer.toBinaryString(this.address);
	}

	public Register(int Address, String name) {
		this();
		this.name = name;
		this.address = Address;
		this.hex = Integer.toHexString(Address);
		this.bin = Integer.toBinaryString(Address);
	}
	
	public void setValue(int decimal) {
		int index = 0;
		int zeros = 0;
		if (decimal < 32)
		{
			zeros = 32 - decimal;
		}

		for (index = 0; index < zeros; index++)
		{
			this.value[index] = 0;
		}

		while (decimal > 0){
			this.value[index++] = decimal % 2;
			decimal /= 2;
		}
		
	}
	
	public int[] getValue() {
		return this.value;
	}

	public int getAddress() {
		return this.address;
	}

	public String getBin() {
		return this.bin;
	}

	public String getHex() {
		return this.hex;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		String str = "";

		str += this.name + "   " + this.address + "   "
				+ this.hex + "   " + this.bin + "\n";

		return str;
	}
}
