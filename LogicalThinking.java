package bools;
/*
 * 
 * author@RollingRoyce
 *
 */

public class LogicalThinking {
	public static void main(String args[]){		
		//we think, so speaking is irrelevant. disagreement causes conversations-
		//-agreement can silence the world. 
		
		//question to the both people-
		/*
		 * what two numbers equal 2?**/
		int person_IL = 2+1; //Illogical
		int person_L = 1+1;  //Logical
		
		//asking if person_L shares the same answer as person_IL.
		if (person_L == person_IL){
			System.out.println("no problems here");		
		}
		 //if the IF( statement) returns false, print this.
		else{
			System.out.println("give up");		          	
		}
		 //if person_IL does not agree with person_L same result...
		if(person_IL != person_L){
			System.out.println(" still give up");		 
		}
		///rare do we find no problems in the things we inquire
		//about with others...
		else{
			System.out.println("no problems here");	        						         
		}
		//if i decide to lie to myself, and stop the arguing. (to be dishonest with my hardwired belief.)
		for(person_IL = person_IL; person_IL == 3; person_L++ ){     
			System.out.println("congrats you lost your integerty,"
					+ " by agreeing with somthing you dont agree with. ");
		}
	}
}
