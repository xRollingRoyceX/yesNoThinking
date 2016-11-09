package bools;
/*
 * 
 * author@RollingRoyce
 *
 */

public class LogicalThinking {
	public static void main(String args[]){		//we think, so speaking is irrelevant. disagreement causes conversations-
		//question to the both people		//-agreement will silence the world. 
		/*
		 * what two numbers equal 2?**/
		int person_IL = 2+1; //Illogical
		int person_L = 1+1;  //Logical
		
		if (person_L == person_IL){
			System.out.println("no problems here");		//asking if person_L shares the same answer as person_IL.
		}
		else{
			System.out.println("give up");		           //if the IF( statement) returns false, print this.
			
		}
		if(person_IL != person_L){
			System.out.println(" still give up");		  //if person_IL does not agree with person_L same result...
		}
		else{
			System.out.println("no problems here");	         //rare do we find no problems in the things we inquire
								         //about with others...
		}
		for(person_IL = person_IL; person_IL == 3; person_L++ ){     //if i decide to lie to myself, and stop the arguing. 
			System.out.println("congrats you lost your integerty,"
					+ " by agreeing with somthing you dont agree with. ");
		}
	}
}
