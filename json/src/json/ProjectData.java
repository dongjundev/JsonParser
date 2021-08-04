package json;

import java.util.List;

public class ProjectData {
	String projectID;
	List<ResultList> result;
	
	public class ResultList {
		String dataID;
		Name_DOW5PK name_DOW5PK;
	}
	
	public class Name_DOW5PK {
		String sourceValue;
		List<DataList> data;
	}
	
	public class DataList{
		String objectID;
		Value value;
	}
	
	public class Value {
		String annotation;
		Coords coords;
		Object object;
		Extra extra;
	}
	
	public class Coords {
		Tl tl;
		Tr tr;
		Br br;
		Bl bl;
	}
	
	public class Tl {
		String x;
		String y;
	}
	
	public class Tr {
		String x;
		String y;
	}

	public class Br {
		String x;
		String y;
	}
	
	public class Bl {
		String x;
		String y;
	}
	
	public class Object {
		String left;
		String top;
		String width;
		String height;
	}
	
	public class Extra {
		String value;
		String label;
	}
}
