package com.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting 
 {
	public static void generatingJVMreport(String jsonfile) throws FileNotFoundException, IOException {
		File file = new File("");
		Configuration configuration = new Configuration(file, "OMRBranchHotelAutomtion");
		configuration.addClassifications("Environment", "Win-11");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Author", "Greens");
		configuration.addClassifications("Environment", "Win-11");

		List<String> list = new ArrayList<String>();
		list.add(jsonfile);

		ReportBuilder builder = new ReportBuilder(list, configuration);
		builder.generateReports();

	}
}
