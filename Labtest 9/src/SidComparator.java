import java.util.Comparator;

public class SidComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getSid()>o2.getSid())
			return 1;
		else if(o1.getSid()<o2.getSid())
			 return -1;
		else
		return 0;
	}

}
