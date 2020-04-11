package CoreDataTypes;

public class TestPrePostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Print Pre and Post increment
	//Pre:++a Post a++
		int a=20;
		System.out.println(a);
		//System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		int i=12,j=15;
		i=i++; //1st print then increment
		System.out.println(i);
		i=++j;
		System.out.println(i);
		i=j++;
		System.out.println(j);
		int x=0,y=5;
		x=--y; //1st increment and then print
		System.out.println(x);
		System.out.println(y);
		y=x--;
		System.out.println(y);
		System.out.println(x);
		//002
		int r=15;
		r=r++ + r + r-- - r-- + r++;
		//15  + 16 +16   -15   + 14
		System.out.println("print 002: "+r);
		
		
	}

}
