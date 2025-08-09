import java.util.Scanner;
import java.io.*;

public class Task_4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String filename="output.txt";
		int choice;

		while(true)
		{
			System.out.println("\n--- File Menu ---");
			System.out.println("1. Write Notes");
			System.out.println("2. Read Notes (FileReader)");
			System.out.println("3. Read Notes (BufferedReader)");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");
			choice = scan.nextInt();
			scan.nextLine();

			switch(choice)
			{
				case 1:
				{
					System.out.println("Enter your notes(type end to finish)");
					try(FileWriter fw = new FileWriter(filename))
					{
						while(true)
						{
							String line = scan.nextLine();
							if(line.equalsIgnoreCase("end")) break;
							fw.write(line+"\n");
						}
						System.out.println("Notes saved..!");
					} 
	
					catch (IOException e) 
					{
						e.printStackTrace();
					}
					break;
				}
				
	
				case 2:
				{
					System.out.println("\n--- Reading using FileReader ---");
					try(FileReader fr=new FileReader(filename))
					{
						int ch;
						while((ch=fr.read())!=-1)
						{
							System.out.print((char)ch);
						}
	
					}
					catch(IOException e)
					{
						System.out.println(" File not found or error reading.");
					}
					break;
				}
	
				case 3:
				{
					System.out.println("\n--- Reading using BufferedReader ---");
					
					try(BufferedReader br=new BufferedReader(new FileReader(filename)))
					{
						String line;
	
						while((line = br.readLine())!=null)
						{
							System.out.println(line);
						}
	
					} 
					catch (IOException e) 
					{
						 System.out.println(" File not found or error reading.");
					}
					break;
				}
				case 4:
                    System.out.println(" \nExiting...");
                    System.exit(4);
                    break;

                default:
                    System.out.println(" \nInvalid choice, try again.");
			}
		}
	}

}
