import java.util.*;
public class TryList{
	List<String> myArray =new ArrayList<String>();
	List<String> myLinkList =new LinkedList<String>();
	int size=50000;
	void add(){
		String str="sandip";
		int i;
		
		long start=System.currentTimeMillis();
		for(i=0;i<size;i++){
			myArray.add(str);
		}
		long stop=System.currentTimeMillis();
		long time=(stop-start);
		System.out.println("the time require for adding in Array : "+time);
		start=System.currentTimeMillis();
		for(i=0;i<size;i++){
			myLinkList.add(str);
		}
		stop=System.currentTimeMillis();
		time=(stop-start);
		System.out.println("the time require for adding in LinkList : "+time);
	}
	void disp(){
		int i;
		long start=System.currentTimeMillis();
		System.out.println("\n\n");
		for(i=0;i<size;i++){
			myArray.get(i);
			//System.out.println();
		}
		System.out.println("\n\n");
		long stop=System.currentTimeMillis();
		long time=(stop-start);
		System.out.println("the time require for display in Array : "+time);
		start=System.currentTimeMillis();
		System.out.println("\n\n");
		for(i=0;i<size;i++){
			myLinkList.get(i);
			//System.out.println();
		}
		System.out.println("\n\n");
		stop=System.currentTimeMillis();
		time=(stop-start);
		System.out.println("the time require for display in LinkList : "+time);
	}
}