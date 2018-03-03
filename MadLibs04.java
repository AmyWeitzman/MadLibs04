/**
 * @student.info
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, describe goals
 *<BR> Cite Sources:  People who helped, and/or websites used
 */

import java.util.Scanner; 
 
public class MadLibs04
{
	String place;
	String funnyWord01;
	String noun01;
	String noun02;
	String noun03;
	String name01;
	String body01;
	String body02;
	int number;
	String color;
	String adj01;
	String noun04;
	String adj02;
	String noun05;
	String adj03;
	String noun06;
	String fourLetter;
	String name02;
	String funnyWord02;
	
	public void getWords()
	{
		Scanner Input = new Scanner(System.in);
		
		System.out.print("Enter a place ---> ");
		place = Input.next();
		System.out.print("Enter a funny word ---> ");
		funnyWord01 = Input.next();
		System.out.print("Enter a noun(plural) ---> ");
		noun01 = Input.next();
		System.out.print("Enter a noun(plural) ---> ");
		noun02 = Input.next();
		System.out.print("Enter a noun(plural) ---> ");
		noun03 = Input.next();
		System.out.print("Enter a name ---> ");
		name01 = Input.next();
		System.out.print("Enter a body part(plural) ---> ");
		body01 = Input.next();
		System.out.print("Enter a body part(plural) ---> ");
		body02 = Input.next();
		System.out.print("Enter a number(integer) ---> ");
		number = Input.nextInt();
		System.out.print("Enter a color ---> ");
		color = Input.next();
		System.out.print("Enter an adjective ---> ");
		adj01 = Input.next();
		System.out.print("Enter a noun---> ");
		noun04 = Input.next();
		System.out.print("Enter an adjective ---> ");
		adj02 = Input.next();
		System.out.print("Enter a noun ---> ");
		noun05 = Input.next();
		System.out.print("Enter an adjective ---> ");
		adj03 = Input.next();
		System.out.print("Enter a noun ---> ");
		noun06 = Input.next();
		System.out.print("Enter a four-letter word ---> ");
		fourLetter = Input.next();
		System.out.print("Enter a name ---> ");
		name02 = Input.next();
		System.out.print("Enter a funny word ---> ");
		funnyWord02 = Input.next();
	}	
		
	public void printMadLib04()
	{
		System.out.println();
		System.out.println("BREAKING NEWS");
		System.out.println("Breaking News: a man was found dead last night in/at " 
		+ place + ". He was found by two travellers hiking in the " + funnyWord01
		 + " mountains. The authorities suspect murder! Upon examining the scene, " 
		 + "the crime investigators found " + noun01 + ", " + noun02 + ", and " 
		 + noun03 + ". The fingerprints recovered at the scene belong to " +
		name01 + ". The body was badly beaten and suffered severe bruising to the "
		+ body01 + " and " + body02 + ". The authorities do not have an ID for the victim yet, but they describe him as " 
		+ number + " feet tall, medium build, " + color + " eyes, and bearded. "
		+ "Among his possessions were a/n " + adj01 + " " + noun04 + ", a/n " + adj02 
		+ " " + noun05 + ", and a/n " + adj03 + " " + noun06 
		+ ". If you recognize this description, please call 1-800-123-" + fourLetter 
		+ ". We'll keep you updated. I'm " + name02 + " and this is " + funnyWord02 + " news.");
	}
}

/*
RUN OUTPUT:

*/