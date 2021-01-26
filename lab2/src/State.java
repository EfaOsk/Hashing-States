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
		// hash of orientation
		int o=  (int)(orientation.name().charAt(0) & 0xF);
		int p = position.hashCode();
		int c = ((p+o)*(p+o+1)/2+o);
		return (c+(turned_on ? 1231: 1237))*(c+(turned_on ? 1231: 1237)+1)/2+(turned_on ? 1231: 1237);
	}
	@Override
	public boolean equals(Object o) {
		if (o == this) { return true; }
		if(o == null || !(o instanceof State)) { return false; }
		State other = (State) o;
		return (other.position.equals(position))&& (other.orientation==orientation) && (other.turned_on == turned_on);
	}
}
