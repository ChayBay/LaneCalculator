import java.util.Scanner;

class LaneCalculator{
	public static void main(String args[]) {
		
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
				c.score += abilityscore.ScoreCalc(scan.nextLine());
			}
			
			
		}
	}
	
	public static void Sort(champion c) {
		
		if (c.score>=60) {
			//place c in Burst
		}else if(c.score<60 && c.score>=40) {
			//place c in Poke
		}else if(c.score<40) {
			//place c in Sustain
		}
		
	}
}