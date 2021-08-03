import java.io.File;
public  class List_of_Files
{
   public static void main(String[] args)  {
        File main_dir = new File("E:\\KMIT\\CourseEra");
        if(main_dir.exists() && main_dir.isDirectory())
        {
	File arr[] = main_dir.listFiles(); 
           	 System.out.println("Files from main directory : " + main_dir.getName());
            	RecursivePrint(arr, 1); 
        } 
   }
   static void RecursivePrint(File[] arr, int level) 
   {
        for (File f: arr) 
        {
            for (int i = 0; i < level; i++)
              System.out.print("\t");
             
            if(f.isFile()) 
                 System.out.println(f.getName());
              
            else if(f.isDirectory()) 
            { 
                System.out.println("[" + f.getName() + "]");
                RecursivePrint(f.listFiles(), level + 1); //recursion for sub-directories
            }
        }
   }
}
