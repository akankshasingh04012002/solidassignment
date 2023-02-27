interface Area
{
    abstract int calculateArea();
}
class Rectangle implements Area
{
  private int m_width;
  public int m_height;
  
  //default constructor;
   public Rectangle() {
    
  }
 public Rectangle(int width, int height) 
  {
    m_width = width;
    m_height = height;
  }
 
  public void setWidth(int width)
  {
    m_width = width;
  }
 
  public void setHeight(int height) 
  {
    m_height = height;
  }
 
  public int getWidth() 
  {
    return m_width;
  }
 
  public int getHeight() 
  {
    return m_height;
  }
 
  public int calculateArea() 
  {
    return m_width * m_height;
  }
 
}
//square class extends rectangle that implements area
class Square extends Rectangle implements  Area 
{
  public Square(int sideLength) 
  {
   m_height=sideLength;
  }
   public int getHeight()
   {
       return m_height;
   }
   public int calculateArea()
   {
       return m_height * m_height;
   }
  
}

public class Main
{
    public static void main(String args[])
    {
        Rectangle obj1= new Rectangle(7,8);
        Square obj2=new Square(7);
        System.out.println(obj1.calculateArea());
        System.out.print(obj2.calculateArea());
    }
}
