package rauchenwald.swengb.listview.martialArts.forms;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by Felix on 19/11/2016.
 */

public abstract class MartialArt implements Serializable
{
    // ATTRIBUTES
    // -----------------------------------------------------------------------------------------------------------------
    protected String name;
    protected String origin;
    protected Set<String> handTechniques;
    protected Set<String> footTechniques;
    protected Set<String> takedowns;
    // -----------------------------------------------------------------------------------------------------------------



    // CONSTRUCTOR
    // -----------------------------------------------------------------------------------------------------------------
    public MartialArt(String name, String origin, Set<String> handTechniques, Set<String> footTechniques, Set<String> takedowns)
    {
        this.name = name;
        this.origin = origin;
        this.handTechniques = handTechniques;
        this.footTechniques = footTechniques;
        this.takedowns = takedowns;
    }
    // -----------------------------------------------------------------------------------------------------------------



    // GETTER SETTER METHODS
    // -----------------------------------------------------------------------------------------------------------------
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }

    public Set<String> getHandTechniques() { return handTechniques; }
    public void setHandTechniques(Set<String> handTechniques) { this.handTechniques = handTechniques; }

    public Set<String> getFootTechniques() { return footTechniques; }
    public void setFootTechniques(Set<String> footTechniques) { this.footTechniques = footTechniques; }

    public Set<String> getTakedowns() { return takedowns; }
    public void setTakedowns(Set<String> takedowns) { this.takedowns = takedowns; }
    // -----------------------------------------------------------------------------------------------------------------



    // OVERRIDES
    // -----------------------------------------------------------------------------------------------------------------


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MartialArt)) return false;

        MartialArt that = (MartialArt) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return origin != null ? origin.equals(that.origin) : that.origin == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (origin != null ? origin.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() { return "Martial Art" + "\nName: " + this.name + "\nOrigin: " + this.origin + "\n"; }
    // -----------------------------------------------------------------------------------------------------------------



    // METHODS
    // -----------------------------------------------------------------------------------------------------------------
    public void printHandTechniques()
    {
        System.out.println("Hand Techniques:");
        for (String ht : this.handTechniques) { System.out.println("    " + ht); }
        System.out.println("\n");
    }

    public void printFootTechniques()
    {
        System.out.println("Foot Techniques:");
        for (String ft : this.footTechniques) { System.out.println("    " + ft); }
        System.out.println("\n");
    }

    public void printTakedowns()
    {
        System.out.println("Takedowns:");
        for (String td : this.takedowns) { System.out.println("    " + td); }
        System.out.println("\n");
    }
    // -----------------------------------------------------------------------------------------------------------------
}
