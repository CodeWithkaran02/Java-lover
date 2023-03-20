/*
simple inheretance
*/
class basevar
{
	int baseVar;
	public void baseMethod()
	{
	System.out.println("This is a BaseMethod. ");
	System.out.println("This is a BaseMethod ."+baseVar);
	}
}
class DerivedVar extends basevar
{
	int derivedVar;
	public void derivedMethod ()
	{
		baseMethod();
		System.out.println("This is Drived class Method.");
		System.out.println("This is Drived :"+derivedVar);
		
	}
}
class InhertanceDemo
{
	public static void main(String args [])
	{
		DerivedVar d = new DerivedVar();
		d.derivedMethod();
	}
}