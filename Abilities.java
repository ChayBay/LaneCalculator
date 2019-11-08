class Abilities{
	
	public int ScoreCalc(String input){
		
	
	switch (input.toLowerCase()) {
	case "hook":
		return 25;
	case "root":
		return 15;
	} 
	return 0;
}
	

//	
//	public static void Hardcc(){
//		int Hook = 25;
//		int Root = 15;
//		int Knockup = 25;
//		int Stun = 20;
//		int Charm = 20;
//		int Fear = 20;
//		int Taunt = 20;
//		int Pacify = 10;
//		int Supress = 25;
//	}
//
//	public static void Softcc(){
//		int Slow = 10;
//		int Silence = 5;
//		int Blind = 5;
//	}
//	
//	public static void Heal(){
//		int Heal = 0;
//	}
//	
//	public static void Shield(){
//		int Shield = 5;
//	}
//	
//	public static void Damage(){
//		int Damage = 10;
//		int AtkSpd = 10;
//		int Burst = 30;
//	}
//	
//	public static void Mobility(){
//		int Speed = 0;
//		int Dash = 0;
//		int Blink = 0;
//		int Invis = 0;
//	}
}