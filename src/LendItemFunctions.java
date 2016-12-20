
public class LendItemFunctions {
	/**
	 * 
	 * @param it
	 * @param format
	 * @return
	 * 
	 */
	
	public static String lendItemString(LendItem it, int format)
	{
		switch (format)
		{
		case 1:
			return String.format("%-15.15s %-10.10s %s %s %-10.10s", it.description,it.lender, dateString(it.lendDate), dateString(it.returnDate), it.owner);
		case 2:
			return String.format("%-15.15s %-10.10s", it.description, it.lender);
		default:
			return String.format("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"", it.description,it.lender, dateString(it.lendDate), dateString(it.returnDate), it.owner);
		}
	}
	
	
	private static String dateString(Date d)
	{
		return String.format("%04d.%02d.%02d", d.year, d.month, d.day);
	}

	public static int compare(LendItem it1, LendItem it2, int method)
	{
		switch (method) {
			case 1:
				return compareByLendDate(it1, it2);
			case 2:
				return compareByReturnDate(it1, it2);
			case 3:
				return compareByLender(it1, it2);
			case 4:
				return compareByOwner(it1, it2);
			default:
				return compareByDescription(it1, it2);
		}
	}

	public static int compareByLendDate(LendItem it1, LendItem it2)
	{
		//null comparison
		if (it1 == null && it2 == null)
			return 0;
		else if (it1 == null)
			return -1;
		else if (it2 == null)
			return 1;
		//end null comparison
		
		return compare(it1.lendDate, it2.lendDate);
	 }
	
	 public static int compareByReturnDate(LendItem it1, LendItem it2)
	 {
		//null comparison
		if (it1 == null && it2 == null)
			return 0;
		else if (it1 == null)
			return -1;
		else if (it2 == null)
			return 1;
		//end null comparison
		
		return compare(it1.returnDate, it2.returnDate);
		 
	 }
	 
	 public static int compareByDescription(LendItem it1, LendItem it2)
	 {
		//null comparison
		if (it1 == null && it2 == null)
			return 0;
		else if (it1 == null)
			return -1;
		else if (it2 == null)
			return 1;
		//end null comparison
		
		int tmp=it1.lender.compareTo(it2.lender);
		if (tmp>0) return 1;
		else if (tmp<0) return -1;
		return 0;
	 }
	 
	 public static int compare(Date d1, Date d2)
	 {
		//null comparison
			if (d1 == null && d2 == null)
				return 0;
			else if (d1 == null)
				return -1;
			else if (d2 == null)
				return 1;
			//end null comparison
		 int tmp1 = d1.day + d1.month * 100 + d1.year * 10000;
		 int tmp2 = d2.day + d2.month * 100 + d2.year * 10000;
		 if (tmp1 < tmp2)
			 return -1;
		 else if (tmp1 > tmp2)
			 return 1;
		 else
			 return 0;
	 }
	 
	 public static int compareByLender(LendItem it1, LendItem it2)
	 {
		 return 0;
	 }
	 
	 public static int compareByOwner(LendItem it1, LendItem it2)
	 {
		 return 0;
	 }
	 
	 public static boolean equals(LendItem it1, LendItem it2)
	 {
		 return true;
	 }
	 
	 public static boolean equals(Date d1, Date d2)
	 {
		 return true;
	 }
	 
	 public static LendItem scanLendItem()
	 {
		 return null;
	 }
	 
	 public static Date scanDate()
	 {
		 return null;
	 }
}
