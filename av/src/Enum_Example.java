package ab;


public class Enum_Example {
	enum Level{
		High, Low , Medium;
	}
	public static void main(String[]args) {
Level lev = Level.Medium;
System.out.println(lev);
switch(lev) {
case Low:
  System.out.println("Low level");
  break;
case Medium:
   System.out.println("Medium level");
  break;
case High:
  System.out.println("High level");
  break;
}
	}
}
