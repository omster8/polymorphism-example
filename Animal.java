public class Animal
{
  private String name;
  private String species;
  
  public Animal (String name, String species)
  {
    this.name = name;
    this.species = species;
  }
  
  public String getBloodType ()
  {
    return "Some blood type";
  }
  
  public String getName ()
  {
    return name;
  }
  
  public String getSpecies ()
  {
    return species;
  }
}