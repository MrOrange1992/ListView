package rauchenwald.swengb.listview.martialArts.forms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Felix on 19/11/2016.
 */

public class BJJ extends MartialArt
{
    // ATTRIBUTES
    // -----------------------------------------------------------------------------------------------------------------
    Set<String> groundPositions = new HashSet<>(Arrays.asList("Top Mount", "Guard", "Side Mount"));
    // -----------------------------------------------------------------------------------------------------------------



    // CONSTRUCTOR
    // -----------------------------------------------------------------------------------------------------------------
    public BJJ(String origin, String name, Set<String> handTechniques, Set<String> footTechniques, Set<String> takedowns)
    { super(origin, name, handTechniques, footTechniques, takedowns); }
    // -----------------------------------------------------------------------------------------------------------------



    // METHODS
    // -----------------------------------------------------------------------------------------------------------------
    public void printGroundPositions()
    {
        System.out.println("Ground Positions:");
        for (String gp : this.groundPositions) { System.out.println("    " + gp); }
        System.out.println("\n");
    }
    // -----------------------------------------------------------------------------------------------------------------
}
