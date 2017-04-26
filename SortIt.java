public static boolean asc(int[] array) {
		boolean asc = true;
		int max = 0;
		int count = 1;
		boolean last = array[0] > array[1];
		boolean desc = true;
		for(int i = 1; i<array.length-1; i++){
			desc = array[i] > array[i+1];
			System.out.println(array[i] + " to " + array[i+1] +" is " + (desc?"desc":"asc"));
			//if not equal
			if(desc ^ last) {
				if(max < count) {
					max = count;
					asc = !last;
				}
				System.out.println(count+" continuous of " + (last?"desc":"asc"));
				count = 1;
				last = desc;
			} else {
				count ++;
			}
		}
		if(max < count) {
			max = count;
			asc = !last;
		}
		System.out.println(count+" continuous of " + (last?"desc":"asc"));
		System.out.println("[Summary] max up to " + max + " of " + (asc?"asc":"desc"));
		return asc;
	}
