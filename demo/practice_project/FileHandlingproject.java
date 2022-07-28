package simplelearnp1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileHandlingproject {
	public static void main(String[] args) {
	
		Scanner strInput = new Scanner(System.in);
		 String choice,cont = "YES"; 
		 
		 while( cont.equalsIgnoreCase("YES") ) { 
		 System.out.println("\t\t Student Information System\n\n");
		 
		 System.out.println("1 Add student new Record : ");
		 System.out.println("2 View All student Record :");
		 System.out.println("3 Delete student Record :");
		 System.out.println("4 Search particular Record :");
		 System.out.println("5 Update particular Record :"); 
		 
		 System.out.print("\n");
		 System.out.println("CHOOSE FROM ABOVE OPTIONS: ");
		 choice = strInput.nextLine();
		 
		 if( choice.equals("1") ) {
		 try {
		AddRecord();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		 } else if( choice.equals("2") ) {
		 try {
		ViewAllRecord();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		 } else if( choice.equals("3") ) {
		 try {
		DeleteRecordByID();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		 } else if( choice.equals("4")) {
		 try {
		SearchRecordbyID();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		 } else if( choice.equals("5") ) {
		 try {
		updateRecordbyID();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		 }
		 
		 System.out.println("DO YOU WANT TO CONTINUE :YES/NO");
		 cont = strInput.nextLine();
		 
		 }
		}
		 public static void AddRecord() throws IOException {
		 
		 BufferedWriter bufferwriter = new BufferedWriter( new 
		FileWriter("records.txt",true) );
		Scanner strInput = new Scanner(System.in);
		 
		 String ID, name, age, address;
		 
		 System.out.print("Enter the student ID: ");
		 ID = strInput.nextLine();
		 System.out.print("Enter the student Name: ");
		 name = strInput.nextLine();
		 System.out.print("Enter the student Age: ");
		 age = strInput.nextLine();
		 System.out.print("Enter the student Address: ");
		 address = strInput.nextLine(); 
		 
		 bufferwriter.write(ID +","+ name+ ","+ age+ ","+ address);
		
		 bufferwriter.newLine();
		 bufferwriter.close();
		 
		 }
		 
		 
		 
		public static void ViewAllRecord() throws IOException {
		 BufferedReader br = new BufferedReader( new FileReader("records.txt") );
		 
		 String record;
		 
		 System.out.println(" ");
		 
		 System.out.println("| ID Name Age Address |");
		 
		 System.out.println("  ");
		 
		 while( ( record = br.readLine() ) != null ) {
		 
		 StringTokenizer st = new StringTokenizer(record,",");
		 
		 System.out.println("| "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" |");
		 }
		 
		 System.out.println("| |");
		 
		 System.out.println(" ");
		 br.close(); 
		 
		 }
		public static void DeleteRecordByID() throws IOException {
		Scanner strInput = new Scanner(System.in);
		 String ID, record;
		 
		 
		 File tempDB = new File("records_temp.txt");
		 File db = new File("records.txt");
		 
		 
		 BufferedReader br = new BufferedReader( new FileReader( db ) );
		 BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
		 
		 
		 System.out.println("\t\t Delete Employee Record\n");
		 
		 System.out.println("Enter your Employee ID: ");
		 ID = strInput.nextLine(); 
		 while( ( record = br.readLine() ) != null ) {
		 
		 if( record.contains(ID) ) 
		 continue;
		 
		 bw.write(record);
		
		 bw.newLine();
		 }
		 
		 br.close();
		 bw.close();
		 
		 db.delete();
		 
		 tempDB.renameTo(db);
		 }
		public static void SearchRecordbyID() throws IOException {
		 String ID,record;
		 @SuppressWarnings("resource")
		Scanner strInput = new Scanner(System.in);
		 
		 BufferedReader br = new BufferedReader( new FileReader("records.txt") );
		 
		 System.out.println("\t\t Search Employee Record\n");
		 
		 
		 System.out.println("Enter the Employee ID: ");
		 ID = strInput.nextLine();
		 
		 System.out.println("  ");
		 System.out.println("| ID Name Age Address |");
		 System.out.println("  ");
		 
		 while( ( record = br.readLine() ) != null ) {
		 
		 StringTokenizer st = new StringTokenizer(record,",");
		 if( record.contains(ID) ) {
		 System.out.println("| "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" |");
		 }
		 
		 }
		 
		 System.out.println("| |");
		 System.out.println("  ");
		 
		 br.close();
		 }
		public static void updateRecordbyID() throws IOException {
		 String newName, newAge, newAddr, record, ID,record2;
		 
		 File db = new File("records.txt");
		 File tempDB = new File("records_temp.txt");
		 
		 BufferedReader br = new BufferedReader( new FileReader(db) );
		 BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );
		 
		 @SuppressWarnings("resource")
		Scanner strInput = new Scanner(System.in);
		 
		 System.out.println("\tUpdate student Record\n"); 
		/**/
		System.out.println("Enter the ID: ");
		 ID = strInput.nextLine(); 
		 System.out.println(" ");
		 System.out.println("| ID Name  Age Address |");
		 System.out.println(" .................");
		 
		 while( ( record = br.readLine() ) != null ) {
		 
		 StringTokenizer st = new StringTokenizer(record,",");
		 if( record.contains(ID) ) {
		 System.out.println("| "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" |");
		 }
		 
		 } 
		 System.out.println("| |");
		 System.out.println(" ");
		 
		 br.close();
		/**/ 
		 System.out.println("Enter the new Name: ");
		 newName = strInput.nextLine(); 
		 System.out.println("Enter the new Age: ");
		 newAge = strInput.nextLine(); 
		 System.out.println("Enter the new Address: ");
		 newAddr = strInput.nextLine(); 
		 
		 BufferedReader br2 = new BufferedReader( new FileReader(db) );
		 
		 while( (record2 = br2.readLine() ) != null ) { 
		 if(record2.contains(ID)) {
		 bw.write(ID+ ","+newName+ ","+ newAge+ ","+ newAddr);
		 } else {
		 
		 bw.write(record2);
		 } 
		
		 bw.newLine();
		 }
		 
		 bw.close();
		 br2.close(); 
		 db.delete(); 
		 boolean success = tempDB.renameTo(db); 
		 System.out.println(success); 
		 
		 }
		 
		

}
