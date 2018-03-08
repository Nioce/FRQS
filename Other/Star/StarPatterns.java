/**
 * This program makes little pictures using stars. These methods
 * are so much fun to write.
 *
 * (Look in the StarInstructions.txt file to see what each method
 *  should draw.)
 *
 * @author  [  Andrew Wilomovsky        ] <-- you
 * @version [          ] <-- today
 */


class StarPatterns 
{
    public static void starGrid(int h, int w)
    {           
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {               
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starBox(int h, int w)
    {
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {   
                if (i==0 || i==h-1 || j==0 || j==w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }

    public static void starX(int h)
    {
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i==j || i+j==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starZ(int h)
    {
        int w = h;           
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {         
                if(i==0||i==h-1||i+j==h-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    
    public static void StarXBox(int h){
        int w = h;

        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {
                if (i==j || i+j==h-1 || i==0 || i==h-1 || j==0 || j==w-1) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
        
    }
    
    public static void twoStarBoxes(int h)
    {           
        int w = h;
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {        
                if ((j<w/2 && i<h/2)|| (j>=h/2 && i>=w/2)) System.out.print("*");
                else System.out.print(" ");
                System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
        public static void starTriangleUR(int h)
    {           
        int w = h;
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {        
                if(j>=i) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void starTriangle(int h)
    {           
        int w = h;
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {          
                if(i>=j) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "/" + j + " ");
            }
            System.out.println();
        }   
    }
    
    /**
    public static void starTriangleHollow(int h)
    {           
        int w = h;
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {          
                if(i>=j) System.out.print("*");
                else System.out.print(" ");
                //System.out.print(i + "/" + j + " ");
            }
            System.out.println();
        }   
    }
    */
    public static void sideWaysisoscelesStarTriangle(int h)
    {           
        int w = h;
        for (int i=0; i<h; i++)
        {
            for (int j=0; j<w; j++)
            {          
                if( (i+j>=h-1 && i<w/2) || (i>=w/2 && i<j)) System.out.print("*");
                //(i>=w/2 && i<j) 
                //(j>=w/2 && i<j)
                //(j>=w/2 && j<i) ||
                
                else System.out.print(" ");
                //System.out.print(i + "/" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void isoscelesStarTriangle(int h)
    {           
        int w = h;
        int bw = (h/2);
        for (int i=0; i<h; i++)
        {
            bw -= 1;
            for (int j=0; j<w; j++)
            {          
                if( i==j && j > bw|| i+j==bw ) System.out.print("*");
                //(i>=w/2 h&& i<j) 
                //(j>=w/2 && i<j)
                //(j>=w/2 && j<i) ||
                
                else System.out.print(" ");
                //System.out.print(i + "/" + j + " ");
            }
            System.out.println();
        }   
    }
    
    public static void main(String[] args) 
    {
        starGrid(5, 5);
        System.out.println();

        starBox(7, 9);
        System.out.println();
        
        starX(7);
        System.out.println();
        
        starZ(7);
        System.out.println();
        
        StarXBox(10);
        System.out.println();
        
        starTriangleUR(10);
        System.out.println();
        
        twoStarBoxes(10);
        System.out.println();
        
        starTriangle(10);
        System.out.println();
        
        //starTriangleHollow(10);
        //System.out.println();
        
        sideWaysisoscelesStarTriangle(10);
        System.out.println();
        
        isoscelesStarTriangle(9);
        System.out.println();
    }
     
}