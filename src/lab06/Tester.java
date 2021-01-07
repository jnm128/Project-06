package lab06;

public class Tester {
	public static void main(String[] args) {
		
		
		SortedString string1 = new SortedString("wap");
		SortedString string2 = new SortedString("below");
		SortedString string3 = new SortedString("joanna");
		SortedString string4 = new SortedString("oajnna");
		SortedString string5 = new SortedString("minott");
		//comparing constructor
		System.out.println(string1.toString());
		
		//testing compareto method
		
		System.out.println(string1.compareTo(string2));
		
		//testing areAnagrams method
		System.out.println(AnagramUtil.areAnagrams(string3, string4));
		System.out.println(AnagramUtil.areAnagrams(string3, string5));
		System.out.println("\n");
		System.out.println("TESTING INSERTION SORT");
		InsertionSort<Integer> tester = new  InsertionSort<Integer>();
		Integer [] test = new Integer[] {2};
		Integer [] Stest= tester.sort(test);
		for (int i=0; i<test.length;i++) {
			System.out.println(Stest[i]);	
			}
		
		Integer [] test2 = new Integer[] {4,3};
		Integer[] stest2 = tester.sort(test2);
		for (int i=0; i<test2.length;i++) {
		System.out.println(stest2[i]);
		
		}
		
		Integer [] test3 = new Integer[] {1,2,3,4,5};
		Integer[] Stest3 = tester.sort(test3);
		for (int i=0;i<test3.length;i++) {
		System.out.println(Stest3[i]);
		}

		Integer [] test4 = new Integer[] {2,4,3,6,5};
		Integer [] Stest4 = tester.sort(test4); 
		for (int i=0; i<test4.length;i++) {
		System.out.println("\n" + Stest4[i]);
		}
		
		
		System.out.println("\n");
		System.out.println("TESTING INSERTION SORT (WORDS)");
		InsertionSort<SortedString> testerr = new  InsertionSort<SortedString>();
		String[] myArray = new String[] {"joy","ski","fed","cat"};
		
		System.out.println("UNSORTED");
		for (int i =0; i< myArray.length;i++) {
			System.out.println(myArray[i]);	
		}
		SortedString[] Array1 = SortedString.toSortedString(myArray);
		SortedString[] sArray= testerr.sort(Array1);
		System.out.println("\n");
		System.out.println("SORTED");
		for (int i =0; i< Array1.length;i++) {
			System.out.println(sArray[i]);	
			}
		
		System.out.println("\n");
		System.out.println("TESTING  INSERTION SORT FIT");
		InsertionSort<Integer> fTester = new  InsertionSort<Integer>();
		Integer[] f_Array = new Integer[] {1,3,4,5,2,6,7,8,9,10};
		Integer[] fArray= fTester.sort(f_Array);
		fTester.fit( fArray);
		
		System.out.println("\n");
		System.out.println("TESTING INSERTION SORT PREDICT");
		//InsertionSort<Integer> pTester = new  InsertionSort<Integer>();
		Integer[] pArray = new Integer[100000];
		System.out.println(fTester.predict(pArray.length));
		
		System.out.println("\n");
		System.out.println("TESTING LARGEST ANAGRAM");
		
		//AnagramUtil test5 = new AnagramUtil();
		//String[] s3 = AnagramUtil.getLargestAnagramGroup("sample_word_list.txt");
		//System.out.println(s3.toString());
		
		System.out.println("\n");
		System.out.println("TESTING MERGSORT");
		
		MergeSort<Integer> mTester = new  MergeSort<Integer>();
		Integer[] mArray= new Integer[] {12,1,10,50,5,15,45};
		Integer[] mergeArray = mTester.sort(mArray);

		for (int i =0; i< mArray.length;i++) {
			System.out.println(mergeArray[i]);	
			}

		System.out.println("\n");
		System.out.println("TESTING MERGESORT FIT");
	     mTester.fit( mergeArray);
		System.out.println("\n");
		System.out.println("TESTING PREDICT");
		Integer[] bArray = new Integer[100000];
		System.out.println(mTester.predict(bArray.length));
	
		

		
		
		
		
		
		
		
		
		
		
		

	
		
		
	}
	
	}



