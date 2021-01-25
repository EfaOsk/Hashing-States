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
		if(o == null || !(o instanceof Position)) { return false; }
		Position other = (Position) o;
		return (other.x == x)&&(other.y == y);
	}

}
