import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;

public class MovieProject{
	
	public static void main(String[] args){
		CRecord customerHash = new CRecord();
		MovieByID MovieIDList = new MovieByID(); 
		MovieByDate MovieDateList = new MovieByDate();
		MovieHeap MovieHeapList = new MovieHeap();
		
		MovieDB(MovieHeapList, MovieDateList, MovieIDList);
		CRecordDB(customerHash, MovieIDList);
		
		Menu(customerHash, MovieHeapList, MovieDateList, MovieIDList);
		
	}
	
	private static void CRecordDB(CRecord customerHash, MovieByID MovieIDList){
		try{
			FileReader reader = new FileReader("CDatabase.txt");
			Scanner read = new Scanner(reader);
			Customer newCustomer;
			while (read.hasNextLine()){
				String c = read.nextLine();
				String[] cList = c.split(",");
				String name0 = cList[0];
				int ccn0 = Integer.parseInt(cList[1]);
				String email0 = cList[2];
				newCustomer = new Customer(name0, ccn0, email0);
				Queue temp = newCustomer.getWishList();
				for(int i = 0; i < cList.length-3; i++){
					int m = Integer.parseInt(cList[i+3]);
					Movie tempMovie = MovieIDList.searchByID(m);
					temp.enqueue(tempMovie);
				}
				customerHash.insert(newCustomer);
			}
			reader.close();
			read.close();
		}
		catch(IOException e){
			System.out.println("Input/output error " + e);
		}
		catch(NumberFormatException e){
			System.out.println("One of the inputs is not an integer " + e);
		}
	}
	
	private static void MovieDB(MovieHeap movie1, MovieByDate movie2, MovieByID movie3){
		try{
			FileReader reader = new FileReader("MDatabase.txt");
			Scanner read = new Scanner(reader);
			Movie newMovie;
			while (read.hasNextLine()){
				String m = read.nextLine();
				String[] mList = m.split(",");
				String title0 = mList[0];
				int date0 =  Integer.parseInt(mList[1]);
				int id0 =  Integer.parseInt(mList[2]);
				int rating0 =  Integer.parseInt(mList[3]);
				boolean ava0 = Boolean.parseBoolean(mList[4]);
				newMovie  = new Movie(title0, date0, id0, rating0, ava0);
				movie3.insertByID(newMovie);
				movie2.insertByDate(newMovie);
				movie1.insertMovieHeap(newMovie);
			}
			reader.close();
			read.close();
		}
		catch(IOException e) {
			System.out.println("Input/output error " + e);
		}
		catch(NumberFormatException e) {
			System.out.println("One of the inputs is not an integer " + e);
		}
	}
	
	private static void CMenu(CRecord customerHash, MovieHeap movie1, MovieByDate movie2, MovieByID movie3){
		boolean go = true;
		Scanner in = new Scanner(System.in);
		
		while(go){
			System.out.println();
			System.out.println("[1] Access Customer");
			System.out.println("[2] Delete customer");
			System.out.println("[3] Add customer");
			System.out.println("[4] Back to Main Menu");
			System.out.print("Enter number: ");
			int choice = in.nextInt();
			
			if(choice == 1){
				System.out.println("Input/output error");
				
			}else if(choice == 2){
				System.out.print("Customer ID: ");
				customerHash.remove(in.nextInt());
				
			}else if(choice == 3){
				customerHash.printRecord();
				System.out.print("Customer Information: ");
				String c = in.next();
				String[] cList = c.split(",");
				String name0 = cList[0];
				int ccn0 = Integer.parseInt(cList[1]);
				String email0 = cList[2];
				Customer newCustomer = new Customer(name0, ccn0, email0);
				customerHash.insert(newCustomer);
				customerHash.printRecord();
				
			}else if(choice == 4){
				go = false;
				
			}else{
				System.out.println("Invalid input. Please try again.");
				
			}
		}
		in.close();
	}
	
	private static void MMenu(CRecord customerHash, MovieHeap movie1, MovieByDate movie2, MovieByID movie3){
		boolean go = true;
		Scanner in = new Scanner(System.in);
		while(go){
			System.out.println();
			System.out.println("[1] Show all movies");
			System.out.println("[2] Access lowest rated movie available");
			System.out.println("[3] Delete movie from database");
			System.out.println("[4] Add movie");
			System.out.println("[5] Access movie");
			System.out.println("[6] Back to Main Menu");
			System.out.print("Enter number: ");
			int choice = in.nextInt();
			
			if(choice == 1){
				movie2.traverseByDate();
			}else if(choice == 2){
				System.out.println();
				System.out.println(movie1.findMin().getTitle());
				System.out.println("[1] Make unavailable? ");
				try{
					int temp = in.nextInt();
					if (temp== 1){
						movie1.deleteMin();
					}else{
						System.out.println("Wrong input");
					}
				}
				catch(Exception e){
					System.out.println("Wrong input");
					in.reset();
					in.next();
				}
			}else if(choice == 3){
				movie1.deleteMin();
				
			}else if(choice == 4){
				System.out.println("Movie information: ");
				String m = in.next();
				String[] mList = m.split(",");
				String title0 = mList[0];
				int date0 =  Integer.parseInt(mList[1]);
				int id0 =  Integer.parseInt(mList[2]);
				int rating0 =  Integer.parseInt(mList[3]);
				boolean ava0 = Boolean.parseBoolean(mList[4]);
				Movie newMovie  = new Movie(title0, date0, id0, rating0, ava0);
				movie3.insertByID(newMovie);
				movie2.insertByDate(newMovie);
				movie1.insertMovieHeap(newMovie);
				movie1.printMovieHeap();
				
			}else if(choice == 5){
				System.out.print("Movie ID: ");
				int id = in.nextInt();
				System.out.println(movie3.searchByID(id).getTitle());
				
			}else if(choice == 6){
				go = false;
				
			}else{
				System.out.println("Invalid input. Please try again.");
				
			}
		}
		in.close();
	}
	
	private static void Menu(CRecord customerHash, MovieHeap movie1, MovieByDate movie2, MovieByID movie3){
		boolean go = true;
		Scanner in = new Scanner(System.in);
		while(go){
			System.out.println();
			System.out.println("[1] Access Customer Record");
			System.out.println("[2] Access Movie Database");
			System.out.println("[3] Quit");
			System.out.print("Enter number: ");
			int choice = in.nextInt();
			if(choice == 1){
				CMenu(customerHash, movie1, movie2, movie3);
			}else if(choice == 2){
				MMenu(customerHash, movie1, movie2, movie3);
			}else if(choice == 3){
				go = false;
			}
		}
		in.close();
	}
}	




