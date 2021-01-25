public class State {
	public Orientation orientation;
	public Position position;
	public boolean turned_on;

	public State(Position position, Orientation orientation, boolean turned_on) {
		this.position = position;
		this.orientation = orientation;
		this.turned_on = turned_on;
	}

	public String toString() {
		return "State{position: " + position + ", orientation: " + orientation + ", on:" + turned_on + "}";
	}
	@Override
	public int hashCode() {
		int x = position.hashCode(), y = orientation.hashCode();
		int c = ((x+y)*(x+y+1)/2+y);
		return (c+(turned_on ? 1231: 1237))*(c+(turned_on ? 83 : 89)+1)/2+(turned_on ? 83 : 97);
	}
	@Override
	public boolean equals(Object o) {
		if (o == this) { return true; }
		if(o == null || !(o instanceof State)) { return false; }
		State other = (State) o;
		return (other.position.equals(position))&& (other.orientation==orientation) && (other.turned_on == turned_on);
	}
}
