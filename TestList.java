// Gary Parker
// Test for Linked-List

public class TestList {
    public static void main(String[] args){
	List a = new List();
	List b = new List();
	List c = new List();
	Movie xNode = new Movie("Jane", 19200102, 88, 99, true);
	Movie yNode = new Movie("Joe", 20200102, 54, 70, true);
	Movie zNode = new Movie("Jack", 22222222, 100, 60, true);
	Movie kNode = new Movie("Jill", 93456785, 2000, 100, true);
	Movie aNode = new Movie("Abe", 12345678, 1, 69, true);
	Movie bNode = new Movie("Beth", 93456798, 2, 70, true);
	Movie cNode = new Movie("Chuck", 22342238, 3, 88, true);
	Movie dNode = new Movie("Dot", 93456858, 4, 99, true);
	a.insert(xNode);
	a.insert(yNode);
	a.insert(zNode);
	a.insert(kNode);
	a.printList();
	Movie mNode = new Movie("Mike", 72345237, 7, 66, true);
	Movie nNode = new Movie("Nick", 73456857, 8, 78, true);
	b.insert(mNode);
	b.insert(nNode);
	System.out.println("searchReturn");
	System.out.println(a.searchReturn(88).getTitle());
	System.out.println(a.searchReturn(54).getTitle());
	System.out.println(b.searchReturn(7).getTitle());
	System.out.println(b.searchReturn(8).getTitle());
	System.out.println("length");
	System.out.println(a.length());
	System.out.println("list a");
	a.printList();
	System.out.println("list b");
	b.printList();
	System.out.println("list a");
	a.printList();
	System.out.println("searchReturn 7890");
	System.out.println(a.searchReturn(7890));
	System.out.println("searchRemove7890");
	a.searchRemove(7890);
	System.out.println("searchReturn 7890");
	System.out.println(a.searchReturn(7890));
	a.printList();
	System.out.println("searchRemove6789");
	a.searchRemove(6789);
	a.printList();
	System.out.println("searchRemove7856");
	a.searchRemove(7856);
	a.printList();
	System.out.println("insert6788");
	a.insert(aNode);
	a.printList();
	System.out.println("insert7898");
	a.insert(bNode);
	a.printList();
	System.out.println("insert2238");
	a.insert(cNode);
	a.printList();
	System.out.println("isEmptyList = " + a.isEmptyList());
	System.out.println("length a: " + a.length());
	
	System.out.println("insert z x y in c");
	c.insert(zNode);
	c.insert(xNode);
	c.insert(yNode);
	c.printList();
	System.out.println("searchRemove x y z in c");
	c.searchRemove(xNode.getIDKey());
	c.printList();
	c.searchRemove(yNode.getIDKey());
	c.printList();
	c.searchRemove(zNode.getIDKey());
	c.printList();
	System.out.println("isEmptyList = " + c.isEmptyList());
	System.out.println("length = " + c.length());
    }
}

