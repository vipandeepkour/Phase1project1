package company.lockers;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class LockedMe 
{
static final String projectpath="D:\\Simplilearn\\Phase1_Project1\\Company_Lockers\\All Files";
public static void main(String[] args)
{
Scanner obj =new Scanner(System.in);
int ch;
do
{
	MainMenu();	// calling the displayMenu method
	System.out.println("Enter your choice");
	ch=Integer.parseInt(obj.nextLine());
switch (ch)
{
	case 1:displayFiles();
		break ;
	case 2:createFiles();
		break ;
	case 3:deleteFiles();
		break; 
	case 4:searchFiles();
		break ;
	case 5: System.exit(0);
	    break;
	    default: System.out.println("Invalid Option");
	}
}
while(ch>0);
}
public static void MainMenu() //heading
{
	System.out.println("\tCompany Lockers welcomes you at LockedMe.com");
	System.out.println("\tDeveloped by : Vipandeep Kour");
	System.out.println("==============================================");
	System.out.println("Index");
	System.out.println("\t1.Display files");
	System.out.println("\t2.Add files to existing directory");
	System.out.println("\t3.Delete files");
	System.out.println("\t4.Search a files");
	System.out.println("\t5.Exit");
	System.out.println("==============================================");
}
public static void displayFiles()
{
File [] listOfFiles = new File(projectpath).listFiles();

if (listOfFiles.length==0)
System.out.println("No files exist");
else
{
for(var l:listOfFiles)
{
	System.out.println(l.getName());
		}
	}
}
public static void createFiles()
{
	Scanner obj= new Scanner(System.in);
	try
	{
		String fileName;
		int linesCount;
		
		System.out.println("Enter File name:");
		fileName =obj.nextLine();
		
		System.out.println("How many lines do you want to create?");
		linesCount=Integer.parseInt(obj.nextLine());
		
		FileWriter fw= new FileWriter(projectpath+"\\"+fileName);
		for (int i=1; i<= linesCount;i++)
		{
		System.out.println("Enter your content:");
		fw.write(obj.nextLine()+"\n");
		}
		System.out.println("File created sucessfully");
		fw.close();	
	}
	catch (Exception ex) 
	{
		System.out.println("Some Error occured");
	}
	}

public static void  deleteFiles()
{
	Scanner obj =new Scanner(System.in);
	try
	{
	String fileName;
	System.out.println("Enter file name to be deleted");
	fileName= obj.nextLine();
	File fl = new File (projectpath+"\\"+fileName);
	if(fl.exists())
	{
		fl.delete();
	System.out.println("File deleted sucessfully");
	}
	else
		System.out.println("no such file exists");
	
	}
	catch(Exception ex)
	{
		System.out.println("Some Error occured");
	}
}

public static void searchFiles()
{
	Scanner obj =new Scanner(System.in);
	try
	{
		String fileName;
		System.out.println("Enter file name to be searched");
		fileName= obj.nextLine();
		File fl = new File (projectpath+"\\"+fileName);
		if(fl.exists())
		{
		System.out.println("File found");
		}
		else
			System.out.println("File doesnot exit");	
	}
	catch(Exception Ex)
	{
		System.out.println("Some Error occured");
	}

}
}

