
import java.util.Scanner;
public class HarryPotterHW1 {

	public static void main(String[] args) {
	//How many years elapsed between first and last movie of Harry Potter? 

		int Releaseyrs[]= {2001,2002,2004,2005,2007,2009,2010,2011};
		// int MovieNumber[]= {1,2,3,4,5,6,7,8};

System.out.println(" Elapsed years between first and last movie of Harry Potter? \n is  " + (Releaseyrs[7]-Releaseyrs[0]) +" years");
// Calculate using formula and print answer in years and months.
int totalmovies=8;
int moviereleaseyrs =(Releaseyrs[7]-Releaseyrs[0])/totalmovies;
//System.out.println(moviereleaseyrs);
int moviereleaseyrs1=(Releaseyrs[7]-Releaseyrs[0])%totalmovies;
//System.out.println(moviereleaseyrs1);

System.out.println("Approximate Year for a movie release is " +moviereleaseyrs +" year and " +moviereleaseyrs1 +" months");

//Get a number as input from user and print the name of the movie.
Scanner input=new Scanner(System.in);
System.out.println("3.Enter the movie number (From 1-8) and I will tell you the movie name ");
int movieno= input.nextInt();
switch(movieno)
{
case 1:
	System.out.println("Harry Potter and the Philosopher's Stone");
	break;
case 2:
	System.out.println("Harry Potter and the Chamber of Secrets\n");
	break;
case 3:
	System.out.println("Harry Potter and the Prisoner of Azkaban");
	break;
case 4:
	System.out.println("Harry Potter and the Goblet of Fire");
	break;
case 5:
	System.out.println("Harry Potter and the Order of the Phoenix");
	break;
case 6:
	System.out.println("Harry Potter and the Half-Blood Prince");
	break;
case 7:
	System.out.println("Harry Potter and the Deathly Hallows – Part 1");
	break;
case 8:
	System.out.println("Harry Potter and the Deathly Hallows – Part 2");
	break;
default:
	System.out.println("Sorry!! Movie number does not exists");
} // end of switch
//input.close();
System.out.println("4.Enter the Movie number ");
movieno=input.nextInt();
if (movieno==1)
{
	System.out.println("First movie");
}
else if(movieno==8) {
	System.out.println("Last movie");
}
else {
	System.out.println("Not First or Last movie");
}
//[AVERAGE] Keep getting input from user and print the name of the movie
//till the user enters an invalid input.
//Scanner input1=new Scanner(System.in);


String moviename[]= {"Harry Potter and the Philosopher's Stone","Harry Potter and the Chamber of Secrets","Harry Potter and the Prisoner of Azkaban","Harry Potter and the Goblet of Fire","Harry Potter and the Order of the Phoenix","Harry Potter and the Half-Blood Prince","Harry Potter and the Deathly Hallows – Part 1","Harry Potter and the Deathly Hallows – Part 2"};
for(movieno=1;movieno<=8;movieno++) {
	System.out.println("5.Enter the movie number");
	movieno= input.nextInt(); 
	//0
	if(movieno>=1 && movieno<=8 && !(movieno==0) )//1=1 
	{
		System.out.println("Input is " +movieno +" Movie Name is "  +moviename[movieno-1]);
	}
	else //0
	{
		System.out.println("Invalid Movie Number");
		break;
	}
}

//System.out.println(" 6. Store all the data into respective arrays");
//String moviename[]= {"Harry Potter and the Philosopher's Stone","Harry Potter and the Chamber of Secrets","Harry Potter and the Prisoner of Azkaban","Harry Potter and the Goblet of Fire","Harry Potter and the Order of the Phoenix","Harry Potter and the Half-Blood Prince","Harry Potter and the Deathly Hallows – Part 1","Harry Potter and the Deathly Hallows – Part 2"};
int movieno1[]= {1,2,3,4,5,6,7,8};
int releaseyr1[]= {2001,2002,2004,2005,2007,2009,2010,2011};

/*for(int i=0;i<moviename.length;i++)
{
	System.out.println(" The movie names are " +moviename[i]);
}*/

//Create a single for loop to print all the data in the format [Movie Number, Movie name, Year Of Release
System.out.println("7. Print All data in Table format");
System.out.format("%-10s%-50s%-15s\n", "Movie Number", "Movie name","Year Of Release");
for (int i = 0; i < moviename.length; i++) 
{
      System.out.format("%-15s%-50s%-15s\n",movieno1[i],moviename[i],releaseyr1[i]);
}
/*Keep getting input from user  for 5 times. Store all the inputs given by 
the user in an array. Loop through the array using For Each loop and print all the movie names 
entered by the user. */
System.out.println("8. Store 5 Userinputs and Print ");
int userinput[]=new int[5];// declare an array
//userinput=new int[5];
Scanner input1=new Scanner(System.in);  // Initiate Scanner and get user input
for(int i=0;i<5;i++) // Get user input for 5 times
{
System.out.println("Enter the movie number");
	userinput[i]=input1.nextInt(); // storing the userinput in the variable

}
for(int j:userinput) {  //Validating the user input
	
if (j>0 && j<7)
{
	System.out.println("Given User Input is " +j  +" and the Respective Movie name is \n" +moviename[j]);
}
else
{
	System.out.println("Not a valid input.Movie name does not exists");
	}
}
input1.close();
	}// end of main method
	

}//HarrypotterHW
