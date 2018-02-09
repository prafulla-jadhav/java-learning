import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
 
enum Direction {
  // Enum types
  EAST(0), WEST(180), NORTH(90), SOUTH(270);
  // Constructor
  private Direction(final int angle) {
    this.angle = angle;
  }
 
  // Internal state
  private int angle;
 
  public int getAngle() {
    return angle;
  }
 
  // Lookup table
  private static final Map lookup = new HashMap();
 
  // Populate the lookup table on loading time
  static {
    for (Direction s : EnumSet.allOf(Direction.class))
      lookup.put(s.getAngle(), s);
  }
 
  // This method can be used for reverse lookup purpose
  public static Direction get(int angle) {
    return (Direction) lookup.get(angle);
  }
}
 
