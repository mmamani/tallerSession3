package customReport;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GenerateReport {

    public static void main (String[]args){

        String path="C:\\Users\\NERV\\Documents\\proyectos\\tallerSesion2\\build\\reports\\cucumber\\";
        File reportOutPutDirectory= new File(path+"target");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(path+"report.json");

        Configuration configuration = new Configuration(reportOutPutDirectory,"Appium & Cucumber");

        configuration.setBuildNumber("Build 00.1");
        configuration.addClassifications("SO","Android");
        configuration.addClassifications("Platform","9.0");
        configuration.addClassifications("Branch","master");
        configuration.addClassifications("Commit","12312432543asdsad");
        configuration.addClassifications("Report","Local");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles,configuration);
        Reportable reportable= reportBuilder.generateReports();

    }

}
