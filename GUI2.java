import java.awt.*;
public class GUI2
{
       public static void main(String[] args) 
       {
           MarvellousFrame mobj = new MarvellousFrame("Marvellous PPA41");

       }
}
class MarvellousFrame  {

    public MarvellousFrame(String title)
     {   
        Frame fobj = new Frame(title);

        fobj.setSize(500,500);

        fobj.setVisible(true);
        
   
      }
}
