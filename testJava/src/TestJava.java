import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import testCompare.testCompareBase;


public class TestJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testCompareBase [] testC = {new testCompareBase("1t",1,3,3),new testCompareBase("2t",1,3,2),new testCompareBase("3t",2,2,3),new testCompareBase("4t",4,2,4),new testCompareBase("5t",3,1,1)};
		
		System.out.println(Arrays.toString(testC));
		
		Arrays.sort(testC);
		
		System.out.println(Arrays.toString(testC));
		System.out.println("test java!");
	}

}
