import java.util.*;


public class Hash_Generator{

    public Hash_Generator(){

	hm = new HashMap<Integer,CreditCard>();
    }



    private HashMap<Integer,CreditCard> hm;
    
    public int getRandomNumber(CreditCard cc){
	System.out.println("something");
	Random rand = new Random();

	Integer value = new Integer(0);
	value = rand.nextInt(50)+1;
	System.out.println(value);
	hm.put(value,cc);

	return value;
	    
    }

    public boolean isEmpty() {
	return hm.isEmpty();
    }

}
