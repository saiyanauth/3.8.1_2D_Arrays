/*
 * Activity 3.8.1
 */
public class TileTester
{
  private static String[] tileValues =
  { "lion", "lion",
    "penguin", "penguin",
    "dolphin", "dolphin",
    "fox", "fox",
    "monkey", "monkey",
    "turtle", "turtle" }; 

  public static void main(String[] args)
  {
    // Create a 3x4 gameboard (3 rows, 4 columns)
    Tile[][] gameboard = new Tile[3][4];

    // Initialize the gameboard with Tile objects
    int index = 0;
    for (int row = 0; row < 3; row++) {
      for (int col = 0; col < 4; col++) {
        gameboard[row][col] = new Tile(tileValues[index]);
        index++;
      }
    }

    // Display the gameboard rows
    System.out.println(java.util.Arrays.toString(gameboard[0]));
    System.out.println(java.util.Arrays.toString(gameboard[1]));
    System.out.println(java.util.Arrays.toString(gameboard[2]));
  }
}
