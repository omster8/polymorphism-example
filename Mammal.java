public class Mammal extends Animal
{
  private String furColor;
  
  public Mammal (String name, String species, String furColor)
  {
    super (name, species);
    this.furColor = furColor;
  }
  
  public String getBloodType ()
  {
    return "Warm blooded";
  }
  
  public String getFurColor ()
  {
    return furColor;
  }
}