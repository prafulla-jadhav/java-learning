public class Test1 {
  public static void main(String[] args) {
    // Angle lookup
    System.out.println(Direction.NORTH.getAngle());
    // Reverse lookup by angle
    System.out.println(Direction.get(90));
  }
}