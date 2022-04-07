package Person.java;

import java.util.Comparator;

public class SortByLuong implements Comparator<Worker>{
	@Override
	public int compare(Worker w1, Worker w2) {
		return (int) (w1.getLuong() - w2.getLuong());
	}
}
