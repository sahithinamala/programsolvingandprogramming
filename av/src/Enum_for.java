package ab;

import ab.Enum_Example.Level;

public class Enum_for {
	enum Level{
		High, Low , Medium;
	}
	public static void main(String[]args) {
Level lev = Level.Medium;
System.out.println(lev);
for(Level leve:Level.values()) {
	System.out.println(leve);
}

	}


}
