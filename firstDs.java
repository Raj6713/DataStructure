//This program will create a file which will show the working of the stack
import falcon.List;
import falcon.EmptyListException;
import java.io.IOException;
public class firstDs 
{
	public static void main(String[] args) throws IOException
	{
	List list=new List();
	list.insertAtFront(-1);
	list.print();
	list.insertAtBack(10);
	list.print();
    }
}