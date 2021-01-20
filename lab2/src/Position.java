public class Position {
	
	public int x;
	public int y;
	
	public Position(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	@Override
	public int hashCode() {
		// Cantor pairing function
		return ((x+y)*(x+y+1)/2+y);
	}
	@Override
	public boolean equals(Object o) {
		Position other = (Position) o;
		return (other.x == this.x)&&(other.y == this.y);
	}

}
