class Abilities{
	
	public int BurstCalc(String input){

	switch (input.toLowerCase()) {
	case "hook":
		return 25;
	case "root":
		return 15;
	case "knockup":
		return 25;
	case "stun":
		return 20;
	case "charm":
		return 20;
	case "fear":
		return 20;
	case "taunt":
		return 20;
	case"pacify":
		return 10;
	case"supression":
		return 20;
	case"close damage":
		return 10;
		}
		return 0;
	}
	public int PokeCalc(String input) {
		switch (input.toLowerCase()) {
	case"slow":
		return 10;
	case"silence":
		return 10;
	case"blind":
		return 10;
	case"shield":
		return 20;
	case"long damage":
		return 10;
		}
		return 0;
	}
	public int SustainCalc(String input) {
		switch (input.toLowerCase()) {
	case"heal":
		return 20;
	case"attackspeed":
		return 10;
	case"speed":
		return 10;
	case"dash":
		return 10;
	case"blink":
		return 10;
	case"invis":
		return 10;
		}
		return 0;
	}
}