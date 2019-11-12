import java.util.Scanner;

class champion{
	
	champion Poke [];
	champion Burst [];
	champion Sustain [];
	
	int score, sustain, poke, burst;
	String name;
}


class addChampion{
	public addChampion() {
		System.out.println("Champion Name?");
		Scanner scan = new Scanner(System.in);
		Abilities abilityscore = new Abilities();
			
		String input = "";
		boolean go = true;
			
		String Prompt[] = {"Passive?","Q?","W?","E?","R?"}; 
		while(go) {
			champion c = new champion();
			c.name = scan.nextLine();
			for(int i = 0;i<Prompt.length;i++) {
				System.out.println(Prompt[i]);
				input = scan.nextLine();
				
				c.burst += abilityscore.BurstCalc(input);
				c.poke += abilityscore.PokeCalc(input);
				c.sustain += abilityscore.SustainCalc(input);
				
			}
			System.out.println("BURST: "+String.valueOf(c.burst)+"  POKE: "+String.valueOf(c.poke)+"  SUSTAIN: "+String.valueOf(c.sustain));
			System.out.println("Champion Name?");
		}
	}
	
}