package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] tls = new String[3];
		tls[0] = "zero";
		tls[1] = "one";
		tls[2] = "two";
		assertEquals(_00_LinearSearch.linearSearch(tls,"zero"),0);
		assertEquals(_00_LinearSearch.linearSearch(tls,"two"),2);
		assertEquals(_00_LinearSearch.linearSearch(tls,"three"),-1);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] tbs = new int[5];
		tbs[0] = 0;
		tbs[1] = 1;
		tbs[2] = 2;
		tbs[3] = 3;
		tbs[4] = 4;
		assertEquals(_01_BinarySearch.binarySearch(tbs,0,tbs.length-1,2),2);
		assertEquals(_01_BinarySearch.binarySearch(tbs,0,tbs.length-1,4),4);
		assertEquals(_01_BinarySearch.binarySearch(tbs,0,tbs.length-1,5),-1);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] tis = new int[5];
		tis[0] = 0;
		tis[1] = 1;
		tis[2] = 2;
		tis[3] = 3;
		tis[4] = 4;
		assertEquals(_02_InterpolationSearch.interpolationSearch(tis,2),2);
		assertEquals(_02_InterpolationSearch.interpolationSearch(tis,4),4);
		assertEquals(_02_InterpolationSearch.interpolationSearch(tis,5),-1);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] tes = new int[5];
		tes[0] = 0;
		tes[1] = 1;
		tes[2] = 2;
		tes[3] = 3;
		tes[4] = 4;
		assertEquals(_03_ExponentialSearch.exponentialSearch(tes,2),2);
		assertEquals(_03_ExponentialSearch.exponentialSearch(tes,4),4);
		assertEquals(_03_ExponentialSearch.exponentialSearch(tes,5),-1);
	}
}
