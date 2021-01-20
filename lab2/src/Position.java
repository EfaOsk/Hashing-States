public class Position {
	
	public int x;
	public int y;
	
	public Position(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	public int hashCode() {
		return 0;
	}
	public boolean equals(Object o) {
		return false;
	}

}
