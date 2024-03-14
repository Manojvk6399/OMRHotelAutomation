package org.com.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;


public class NetworkNT {
	@Test
	public void valitationShema() throws IOException{
		ObjectMapper mapper = new ObjectMapper();
		JsonSchemaFactory factory = JsonSchemaFactory.getInstance(VersionFlag.V4);
		File inputFile =new File("src/test/resources/input.json"); 
		InputStream schema = new FileInputStream("src/test/resources/Schema.json");
		
		JsonNode readTree = mapper.readTree(inputFile);
		JsonSchema jsonSchema = factory.getSchema(schema);
		
		Set<ValidationMessage> sets = jsonSchema.validate(readTree);
		
		if (sets.isEmpty()) {
			System.out.println("No validate Massage");
		}
		else {
			for (ValidationMessage set : sets) {
				System.out.println(set);
			}
			
		}
	}

}
