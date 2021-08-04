package json;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.google.gson.*;
import json.ProjectData;

public class JsonParserApplication {
	
//	public S {
//		
//	}

	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		// TODO Auto-generated method stub
		
		Gson gson = new Gson();
		ProjectData projectData = gson.fromJson(new FileReader("C:\\Users\\dongjun\\Desktop\\8869_result_05049e90fa.json"), ProjectData.class);
		System.out.println(projectData.projectID);
		System.out.println(projectData.result.get(0).name_DOW5PK.sourceValue);		
		System.out.println(projectData.result.get(0).name_DOW5PK.data.get(0).objectID);		
		System.out.println(projectData.result.get(0).name_DOW5PK.data.get(0).value.annotation);		
		System.out.println(projectData.result.get(0).name_DOW5PK.data.get(0).value.coords.tl.x+" "+projectData.result.get(0).name_DOW5PK.data.get(0).value.coords.tl.y);		
		System.out.println(projectData.result.get(0).name_DOW5PK.data.get(0).value.coords.tr.x+" "+projectData.result.get(0).name_DOW5PK.data.get(0).value.coords.tr.y);		
		System.out.println(projectData.result.get(0).name_DOW5PK.data.get(0).value.coords.br.x+" "+projectData.result.get(0).name_DOW5PK.data.get(0).value.coords.br.y);		
		System.out.println(projectData.result.get(0).name_DOW5PK.data.get(0).value.coords.bl.x+" "+projectData.result.get(0).name_DOW5PK.data.get(0).value.coords.bl.y);
		System.out.println(projectData.result.get(0).name_DOW5PK.data.get(0).value.object.left);
		System.out.println(projectData.result.get(0).name_DOW5PK.data.get(0).value.object.top);
		System.out.println(projectData.result.get(0).name_DOW5PK.data.get(0).value.object.width);
		System.out.println(projectData.result.get(0).name_DOW5PK.data.get(0).value.object.height);
		System.out.println(projectData.result.get(0).name_DOW5PK.data.get(0).value.extra.value);
		System.out.println(projectData.result.get(0).name_DOW5PK.data.get(0).value.extra.label);
			
	}
}
