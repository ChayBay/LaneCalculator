import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		System.out.println("Would you like to Create Champion or LaneCalculator?");
		Scanner LvC = new Scanner(System.in);
		switch(LvC.nextLine().equals("champion") ? 1:0){
		case 1:
			addChampion champadd = new addChampion();
			break;
		case 0:
			LaneCalculator lanecalc = new LaneCalculator();
		}
		
	}
}






/* Show list loop
int curs = 0;
while(champadd.Champs[curs]!=null) {
	System.out.printf("%d | ChampName: %s\n", curs,champadd.Champs[curs].name);
	curs++;
}
*/