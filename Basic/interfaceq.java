import java.util.ArrayList;
import java.util.Iterator;
class interfaceq {

public static void main(String[ ] args) {
ArrayList<Integer> list = new ArrayList<Integer>();
for (int i = 0; i < 6; i++) {
	list.add(i);
}
int x = 0;
Iterator<Integer> it = list.iterator();
while (it.hasNext()) {
	x+= it.next();	
}
System.out.println(x);
}
}