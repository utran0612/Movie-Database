public class TestCRecord{
	public static void main(String[] args){
		CRecord a = new CRecord();
		Customer aNode = new Customer("Jane", 1, "jane@gmail.com");
		Customer bNode = new Customer("Joe", 2, "joe@gmail.com");
		Customer cNode = new Customer("Jack", 3, "jack@gmail.com");
		Customer dNode = new Customer("Jill", 4, "jill@gmail.com");
		Customer eNode = new Customer("Abe", 5, "abe@gmail.com");
		Customer fNode = new Customer("Beth", 6, "beth@gmial.com");
		Customer gNode = new Customer("Chuck", 7, "chcuk@gmailcom");
		Customer hNode = new Customer("Dot", 8, "dot @gmail.com");
		Customer iNode = new Customer("Mike", 9, "mike@gmail.com");
		Customer jNode = new Customer("Nick", 10, "nick@gmail.com");
		Customer kNode = new Customer("Otis", 101, "oits@gmailcom");
		Customer lNode = new Customer("James", 201, "james@gmail.com");
		Customer mNode = new Customer("Oscar", 301, "oscar@gmail.com");
		Customer nNode = new Customer("Oswald", 401, "oswald@gmail.com");
		System.out.println("isEmptyHash = " + a.isEmptyRecord());
		System.out.println();
		a.insert(aNode);
		a.insert(bNode);
		a.insert(cNode);
		System.out.println("Print Hash");
		a.printRecord();
		System.out.println();
		a.insert(kNode);
		a.insert(lNode);
		a.insert(mNode);
		a.insert(nNode);
		System.out.println("Print Hash");
		a.printRecord();
		System.out.println();
		System.out.println("Remove 21");
		System.out.println(a.remove(201).getEmail() + " has been removed");
		System.out.println();
		System.out.println("Remove 1");
		System.out.println(a.remove(1).getEmail() + " has been removed");
		System.out.println();
		System.out.println("Remove 41");
		System.out.println(a.remove(401).getName() + " has been removed");
		System.out.println();
		System.out.println("Remove 5");
		if(a.search(5) == null){
			System.out.println("5 does not exist");
		}else{
			System.out.println(a.remove(5).getName() + " has been removed");
		}
		System.out.println();
		System.out.println("Print Hash");
		a.printRecord();
		System.out.println();
		System.out.println("isEmptyHash = " + a.isEmptyRecord());
		System.out.println();
	}
}