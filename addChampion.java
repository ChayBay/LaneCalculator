import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class addChampion{
	champion Champs [] = new champion[100];
	
	public addChampion() {
		System.out.println("Champion Name?");
		Scanner scan = new Scanner(System.in);
		Abilities abilityscore = new Abilities();
			
		String input = "";
		boolean go = true;
			
		String Prompt[] = {"Passive?","Q?","W?","E?","R?"}; 
		while(go) {
			String inp = scan.nextLine();
			if(inp.equals("Stop")) {
				go = false;
				break;
			}
			champion c = new champion();
			c.name=inp;
			
			for(int i = 0;i<Prompt.length;i++) {
				System.out.println(Prompt[i]);
				input = scan.nextLine();
				
				c.burst += abilityscore.BurstCalc(input);
				c.poke += abilityscore.PokeCalc(input);
				c.sustain += abilityscore.SustainCalc(input);
				
			}
			Insert(c,Champs);
			System.out.println("BURST: "+String.valueOf(c.burst)+"  POKE: "+String.valueOf(c.poke)+"  SUSTAIN: "+String.valueOf(c.sustain));
			System.out.println("Champion Name?");
		}
		onStop();
	}
public void Insert(champion c, champion[] arr) {
	
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i] == null) {
				arr[i] = c;
				break;
			}
		}
	}

public void onStop() {
	try{
    	File file =new File("champs.txt");

    	FileWriter fw = new FileWriter(file,true);
    	BufferedWriter bw = new BufferedWriter(fw);
    	champion c;
    	int curs = 0;
    	while(Champs[curs]!=null) {
    		c=Champs[curs];
    		String output = String.format("%s %d %d %d\n", c.name,c.burst,c.poke,c.sustain);
        	bw.write(output);
        	curs++;
    	}
    	
    	bw.close();

	System.out.println("Data successfully appended at the end of file");

      }catch(FileNotFoundException e){
         System.out.println("cant find champs. :(");
       } catch (IOException e) {
		e.printStackTrace();
	}
}


}