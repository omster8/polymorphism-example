public class Reptile extends Animal
{
  private String scaleColor;
  
  public Reptile (String name, String species, String scaleColor)
  {
    super (name, species);
    this.scaleColor = scaleColor;
  }
  
  public String getBloodType ()
  {
    return "Cold blooded";
  }
  
  public String getScaleColor ()
  {
    return scaleColor;
  }
}