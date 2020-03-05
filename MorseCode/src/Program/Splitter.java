package Program;

public class Splitter {
	public int splitString(String toSplit) {
		String[] str = toSplit.split(" ");
		return str.length;
	}
}
