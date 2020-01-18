
 /**
 * This class defines a tests all basic terrains.
 *
 * @author Joey Sabarese
 * @version 5/9/19
 */

public class TerrainTester
{
  public static void main(String[] args)
  {
    Terrain land = new Terrain(150, 240);
    Forest forest = new Forest(400, 400, 180);
    Mountain mountain = new Mountain(600, 200, 12);
    WinterMountain wMountain = new WinterMountain(500, 500, 30, 15);
    River river = new River(200, 200, 6);
    JungleForest jForest = new JungleForest(500, 400, 300, 20);

    System.out.println(land.getTerrainSize());
    System.out.println();
    System.out.println("Forest " + forest.getTerrainSize() + forest.getTrees());
    System.out.println();
    System.out.println("Mountain " + mountain.getTerrainSize() + mountain.getMountains());
    System.out.println();
    System.out.println("Winter Mountain " + wMountain.getTerrainSize() + mountain.getMountains() + wMountain.getTemp());
    System.out.println();
    System.out.println("River " + river.getTerrainSize() + river.getFlow());
    System.out.println();
    System.out.println("Jungle Forest " + jForest.getTerrainSize() + jForest.getRain());

  }
}
