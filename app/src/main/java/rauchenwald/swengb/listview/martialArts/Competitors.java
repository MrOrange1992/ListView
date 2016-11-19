package rauchenwald.swengb.listview.martialArts;

import java.io.Serializable;
import java.util.Random;

import rauchenwald.swengb.listview.martialArts.forms.*;

/**
 * Created by Felix on 19/11/2016.
 */

public class Competitors implements Serializable
{
    // ATTRIBUTES
    // -----------------------------------------------------------------------------------------------------------------
    protected String name;
    protected int size;
    protected int weight;
    protected int healthPoints;
    protected MartialArt martialArt;
    // -----------------------------------------------------------------------------------------------------------------



    // CONSTRUCTOR
    // -----------------------------------------------------------------------------------------------------------------
    public Competitors(String name, int size, int weight, int healthPoints, MartialArt martialArt)
    {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.healthPoints = healthPoints;
        this.martialArt = martialArt;
    }
    // -----------------------------------------------------------------------------------------------------------------



    // GETTER SETTER
    // -----------------------------------------------------------------------------------------------------------------
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }

    public int getWeight() { return weight; }
    public void setWeight(int weight) { this.weight = weight; }

    public int getHealthPoints() { return healthPoints; }
    public void setHealthPoints(int healthPoints) { this.healthPoints = healthPoints; }

    public MartialArt getMartialArt() { return martialArt; }
    public void setMartialArt(MartialArt martialArt) { this.martialArt = martialArt; }
    // -----------------------------------------------------------------------------------------------------------------



    // OVERRIDES
    // -----------------------------------------------------------------------------------------------------------------
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Competitors that = (Competitors) o;

        if (size != that.size) return false;
        if (weight != that.weight) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }
    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + size;
        result = 31 * result + weight;
        return result;
    }
    // -----------------------------------------------------------------------------------------------------------------



    // METHODS
    // -----------------------------------------------------------------------------------------------------------------
    public String performHandTechnique()
    {
        Random rand = new Random();
        int maxNumber = this.getMartialArt().getHandTechniques().size() - 1;
        return this.name + " is using " +
                this.getMartialArt().getHandTechniques().toArray()[rand.nextInt(maxNumber)].toString();
    }

    public String performFootTechnique()
    {
        Random rand = new Random();
        int maxNumber = this.getMartialArt().getFootTechniques().size() - 1;
        return this.name + " is using " +
                this.getMartialArt().getFootTechniques().toArray()[rand.nextInt(maxNumber)].toString();
    }

    public String performTakeDown()
    {
        Random rand = new Random();
        int maxNumber = this.getMartialArt().getTakedowns().size() - 1;
        return this.name + " is using " +
                this.getMartialArt().getTakedowns().toArray()[rand.nextInt(maxNumber)].toString();
    }

    public void performTurn()
    {
        Random rand = new Random();

        int randomNumber = rand.nextInt(3);

        if (randomNumber == 1)
            System.out.println(this.performHandTechnique());
        else if (randomNumber == 2)
            System.out.println(this.performFootTechnique());
        else
            System.out.println(this.performTakeDown());
    }
    // -----------------------------------------------------------------------------------------------------------------
}
