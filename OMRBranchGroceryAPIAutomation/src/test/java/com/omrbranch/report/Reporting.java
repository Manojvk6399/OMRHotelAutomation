package com.omrbranch.report;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.omrbranch.base.BaseClassAPI;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClassAPI{
	public static void generateJvmReport(String jsonfile ) throws FileNotFoundException, IOException {
		//1.Mention the path of jvm report where to store?
		File file = new File(getProjectPath()+getPropertyFileValue("jvmPath"));
		
		
		//2.create the object for configuration class
		Configuration config = new Configuration(file,"OMRBranch Auromation");
		
		//3.Add the browser ,os,version
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Browser", "114.0");
		config.addClassifications("Os", "Win11");
		config.addClassifications("Sprint", "35");
		
		//4.Create the object for reportBuilder class and pass the Json file
		List<String> jsonFiles =new ArrayList<String>();
		jsonFiles.add(jsonfile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles, config);
		
		//5.Build the jvm report
		
		builder.generateReports();
	
	}

}
