package lab06;

public class MergeSort<E extends Comparable<E>> {

    /** The constant in the formula t = c * O() */
    private double c;

    /** The order O() of the implementation.
        If your implementation is in O(n^2), use Math.pow().
	    @param n index
	    @return the function of n inside the O()
	 */
    public double O(int n) {
        // EXERCISE
    	double t= Math.log10(n)/Math.log10(2);
        return (n*t);
    }

    /** Calculates the constant c using a given input array of type E.
        Units of time should be converted to microseconds
    */
    public void fit(E[] array) {
    	long start = System.nanoTime();
    	//System.out.println(array.length);
    	//System.out.println(start);
    	sort(array);
    	
    	//for(int i=0;i<array.length;i++) {
    	//	System.out.println(array[i]);	
    	//}
    	
    	long end = System.nanoTime(); 
    	//System.out.println(end);
    	//convert to microseconds divide by 1000
    	double timeElapsed = ((end-start));
    	double timeM = timeElapsed/1000;
    	 c= timeM/(array.length * array.length);
    	 System.out.println(c);
    	 System.out.printf("time in microsecond %.3f %n",c);
    }

    /** Predicts the running time of a merge sort for some index n
        @param n
        @return the estimated amount of time in unit microseconds
    */
    public double predict(int n) {
        // EXERCISE
    	double time= c* O(n);
    	
    	//System.out.printf("time in microsecond %.3f %n",time);
        return time;
        
    }

    /** Performs a merge sort using a given input array
        @param array the (unsorted) array
        @return the sorted array
    */
    public E[] sort(E[] array) {
        if (array.length <= 1)
            return array;
        E[] sorted = array.clone();
        E[] array2 = sorted.clone();
        sort(sorted, array2, 0, array.length - 1);
        return sorted;
    }

    private void sort(E[] array1, E[] array2, int first, int last) {
        if (first >= last)
            return;

        int middle = (first + last) / 2;
        sort(array1, array2, first, middle);
        sort(array1, array2, middle+1, last);

        int i = first;
        int a = first;
        int b = middle+1;
        while (a <= middle && b <= last) {
            // EXERCISE
        	if (array1[a] ==array1[b] || array1[a].compareTo(array1[b])<0) {
        		array2[i]=array1[a] ;
        		i++;
        		a++;
        	}
        	if(array1[a].compareTo(array1[b])>0) {
        		array2[i]= array1[b];
        		i++;
        		b++;
        	}

            // Copy the smaller of array[a] or array[b] to array2[i]
            // (in the case of a tie, copy array[a])
            // and increment i and a or b (the one you copied).
           

        }

        // EXERCISE
        // Copy the rest of a or b, whichever is not at the end.
        while(a<=middle) {
        	array2[i]=array1[a];
        	//i++;
        	a++;
        }
        while (b<=last) {
        	array2[i] = array1[b];
        	i++;
        	b++;
        }


        System.arraycopy(array2, first, array1, first, last - first + 1);
        
    }

}
