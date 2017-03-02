package computer;

public class OpCodes
{
	private String[] instruction;
	
	private class opDefin {
		private String name;
		private String bin;
		private int decID;
		
		public opDefin(String name, int dec) {
			this.name = name;
			this.decID = dec;
			this.bin = Integer.toBinaryString(dec);
		}
		
		public String getName() {
			return name;
		}
		
		public String getBin() {
			return bin;
		}
		
		public int getID() {
			return decID;
		}
		
		public void setName(String n){
			this.name = n;
		}
		
		public void setDecID(int dec) {
			this.decID = dec;
			this.bin = Integer.toBinaryString(dec);
		}
		
	}
	
	public OpCodes() {
		for (int i = 0; i< 32; i++){
			switch (i)
			{
			case 0:
				instruction[i] = "nop";
				break;
			case 1:
				instruction[i] = "ld";
				break;
			case 2:
				instruction[i] = "ldr";
				break;
			case 3:
				instruction[i] = "st";
				break;
			case 4:
				instruction[i] = "str";
				break;
			case 5:
				instruction[i] = "la";
				break;
			case 6:
				instruction[i] = "lar";
				break;
			case 7:
				instruction[i] = "br";
				break;
			case 8:
				instruction[i] = "brl";
				break;
			case 9:
				instruction[i] = null;
				break;
			case 10:
				instruction[i] = null;
				break;
			case 11:
				instruction[i] = null;
				break;
			case 12:
				instruction[i] = "add";
				break;
			case 13:
				instruction[i] = "addi";
				break;
			case 14:
				instruction[i] = "sub";
				break;
			case 15:
				instruction[i] = "neg";
				break;
			case 16:
				instruction[i] = "and";
				break;
			case 17:
				instruction[i] = "andi";
				break;
			case 18:
				instruction[i] = "or";
				break;
			case 19:
				instruction[i] = "ori";
				break;
			case 20:
				instruction[i] = "not";
				break;
			case 21:
				instruction[i] = null;
				break;
			case 22:
				instruction[i] = null;
				break;
			case 23:
				instruction[i] = null;
				break;
			case 24:
				instruction[i] = null;
				break;
			case 25:
				instruction[i] = null;
				break;
			case 26:
				instruction[i] = "shr";
				break;
			case 27:
				instruction[i] = "shra";
				break;
			case 28:
				instruction[i] = "shl";
				break;
			case 29:
				instruction[i] = "shc";
				break;
			case 30:
				instruction[i] = null;
				break;
			case 31:
				instruction[i] = "stop";
				break;
			default:
				instruction[i] = "UnknownCommand";
				break;
			}
		}
	}
	
}
