package CoreDataTypes;

public class TestOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Take 2 number as input and perform all arithmetic /logical opereation on 
				//a=20 b=30
				//operation i+=,i-=,i*=,i/=
				//a+b a-b a*b a/b a%b
				//a>b,a,b,a==b,a>=b,a<=b
		//001
		int i=10;
		int j=30;
		System.out.println("Print1:" +i);
	    //int z=i+j;
	    //System.out.println("Print sum:" +z);
	    i=i+10;
	    System.out.println("Prin2:" +i);
	    i+=10;
	    System.out.println("Print3:" +i);
	    j-=20;
	    System.out.println("Print4:" +j);
	    i*=2;
	    System.out.println("Print5:" +i);
	    j/=2;
	    System.out.println("Print6:" +j);
	    //002
	    int a=10,b=20;
	    String s="selenium",d="testing";
	    System.out.println("Test all operators");
	    System.out.println(a+b);
	    System.out.println(s+d);
	    System.out.println(a-b);
	    System.out.println(a*b);
	    System.out.println(a/b);
	    System.out.println(a%b);
	    System.out.println(100%1000);
	    System.out.println(500%100);
	    
	    
	    
	}

}
