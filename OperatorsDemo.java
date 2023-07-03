package eve;

public class OperatorsDemo {

	public static void main(String[] args) {
		int i=11;
		int j=2;
		
		System.out.println("Addition..:"+(i+j));
		System.out.println("Subtraction..:"+(i-j));
		System.out.println("Multiplication..:"+(i*j));
		System.out.println("Division ..*Quotient*..:"+(i/j));
		System.out.println("Division..*Reminder*..:"+(i%j));
		
		int x=10;
		//increment x by 1
		x=x+1;
		System.out.println(x);
		
		x=10;
		x=x-1;
		System.out.println(x);
		
		x=10;
		System.out.println(x++);//x++ is equivalent to x=x+1
		
		//x++ is post increment and ++x is pre increment
		//x++ - prints the x first and then increments
		
		System.out.println(x);
		
		x=10;
		System.out.println(++x);
		
		x=10;
		System.out.println(x--);//prints first and then decrements
		System.out.println(x);
		
		x=10;
		System.out.println(--x);//decrement first and then print
		
		//can i increment to more than 1
		x=10;
		x=x+5;
		System.out.println(x);
		
		//this also has short cut
		
		x=10;
		x+=5;//this is equivalent to x=x+5;
		System.out.println(x);
		
		x=10;
		x-=5;//this is equivalent to x=x-5;
		System.out.println(x);
		
		x=10;
		x*=5;//this is equivalent to x=x*5;
		System.out.println(x);
		
		x=10;
		x/=5;//this is equivalent to x=x/5;
		System.out.println(x);
		
		x=10;
		x%=5;//this is equivalent to x=x%5;
		System.out.println(x);
		
		//RELATIONAL OPERATORS - will always return true or false
		//== (COMPARISON)
		i=10;
		j=2;
		System.out.println(i==j);//will return false because i and j are not equal
		System.out.println(i!=j);//will return true because i and j are not equal
		System.out.println(i<j);//i is lesser than j if so then true
		System.out.println(i>j);//i is greater than j if so then true
		System.out.println(i<=j);//i is lesser than or equal to j then true
		System.out.println(i>=j);//i is greater than or equal to j then true
		
		//LOGICAL OPERATORS - &&(AND) AND ||(OR)
		
		System.out.println(i>j && i==100);//ampersand symbol
		//if both are true, then the return will be true
		
		System.out.println(i>j || i==100);//pipe symbol
		//even if one is true, then the return will true

	}

}
