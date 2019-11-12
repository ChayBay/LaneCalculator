import java.util.Scanner;

class main{
	public static void main(String args[]) {
		System.out.println("Create Champion or LaneCalculator?");
		Scanner LvC = new Scanner(System.in);
		switch(LvC.nextLine().equals("Champion") ? 1 : 0){
		
		case 1:
			addChampion champadd = new addChampion();
			break;
		case 0:
			LaneCalculator lanecalc = new LaneCalculator();
		}
		
		
	}
}


				