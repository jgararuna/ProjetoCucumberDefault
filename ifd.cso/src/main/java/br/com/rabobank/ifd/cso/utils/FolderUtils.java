package br.com.rabobank.ifd.cso.utils;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.apache.poi.ss.formula.functions.T;

import com.aventstack.extentreports.ExtentReports;
import com.vimalselvam.cucumber.listener.ExtentProperties;

import br.com.rabobank.ifd.cso.runners.Runner;
import br.com.rabobank.ifd.cso.runners.RunnerSetup;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

public class FolderUtils {
	
	
	public static void createFolder() {
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy 'at' hh mm");
		String time = dateFormat.format(now);
		File dir = new File("C:\\Users\\joao.araruna\\Documents\\" + time);
		dir.mkdir();
		
	}
	
	public static String createAndGetFolder() {
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy 'at' hh mm");
		String time = dateFormat.format(now);
		File dir = new File("C:\\Users\\joao.araruna\\Documents\\" + time);
		dir.mkdir();
		System.out.println(time);
		return time;
		
	}
	
	public static void renameFolder() {
		
		String user = System.getProperty("user.dir");
//		Path path = Paths.get(user + "\\AdvantageShopping\\target\\cucumber-reports\\output-");
//		System.out.println(path.getFileName());
//		path.resolve(user + "/AdvantageShopping/target/cucumber-reports/output-123");
		//File reportFolder = new File("")
		
		
//        Path sourceFilePath = Paths.get(user + "/AdvantageShopping/target/cucumber-reports/output");
//        Path targetFilePath = Paths.get(user + "/AdvantageShopping/target/cucumber-reports/output123");
//
//        try {
//            Files.move(sourceFilePath, targetFilePath);
//        } catch (FileAlreadyExistsException ex) {
//            System.out.println("Target file already exists");
//        } catch (IOException ex) {
//            System.out.format("I/O error: %s%n", ex);
//        }
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm");
		String time = dateFormat.format(now);
		String path = user + "/target/cucumber-reports/report " + time;

		Path source = Paths.get(user + "/target/cucumber-reports/output");
		try {
			Files.move(source, source.resolveSibling(path),
			                StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void createReportFolder(String reportName) {
		
//		CucumberUtils cucumberUtils = new CucumberUtils();
//		String reportName = cucumberUtils.getTagsFromAnnotations(clazz.class);
			
		ExtentReports er = new ExtentReports();
		try {
			er.setGherkinDialect("pt");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm");
		String time = dateFormat.format(now);
		
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;	
		extentProperties.setReportPath("target/cucumber-reports/" + reportName + " " + time + "/report.html");
		
	}
	
	public void createReportFolder2(Class<?> clazz) {
		
		CucumberUtils cucumberUtils = new CucumberUtils();
		String reportName = cucumberUtils.getTagsFromAnnotations(clazz);
			
		ExtentReports er = new ExtentReports();
		try {
			er.setGherkinDialect("pt");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm");
		String time = dateFormat.format(now);
		
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;	
		extentProperties.setReportPath("target/cucumber-reports/" + reportName + " " + time + "/report.html");
		
	}
	
	public void createReportFolder3(Object clazz) {
		
		CucumberUtils cucumberUtils = new CucumberUtils();
		String reportName = cucumberUtils.getTagsFromAnnotations2(clazz);
			
		ExtentReports er = new ExtentReports();
		try {
			er.setGherkinDialect("pt");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm");
		String time = dateFormat.format(now);
		
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;	
		extentProperties.setReportPath("target/cucumber-reports/" + reportName + " " + time + "/report.html");
		
	}
	
	public void renameReportFolder(String reportName) {
	//public void renameReportFolder() {
		
		System.out.println("oiRporter");
		//CucumberUtils cucumberUtils = new CucumberUtils();
		FolderUtils folderUtils = new FolderUtils();
		String user = System.getProperty("user.dir");
		String mostRecentFolderPath = folderUtils.mostRecentFolder(user + "\\target\\cucumber-reports");
		
		Path source = Paths.get(mostRecentFolderPath);
		try {
//			Files.move(source, source.resolveSibling(mostRecentFolderPath.replace("output", reportName)),
//			                StandardCopyOption.REPLACE_EXISTING);
			Files.move(source, source.resolveSibling(mostRecentFolderPath.replace("output", reportName)));
			
//			mostRecentFolderPath = folderUtils.mostRecentFolder(user + "\\target\\cucumber-reports");
//			System.out.println(mostRecentFolderPath);
//			ExtentProperties extentProperties = ExtentProperties.INSTANCE;	
//			extentProperties.setReportPath(mostRecentFolderPath);
//			System.out.println(extentProperties.getReportPath());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm");
		String time = dateFormat.format(now);
		
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;	
		extentProperties.setReportPath("target/cucumber-reports/" + reportName + time + "/report.html");


	}
	
	public void renameReportFilePath(String reportPath) {
	//public void renameReportFolder() {
		
		  String user = System.getProperty("user.dir");	  
		  String mostRecentFolderPath = mostRecentFolder(user + "\\target\\cucumber-reports");
		
		  Path source = Paths.get("/home/mkyong/newfolder/test1.txt");
		  Path target = Paths.get("/home/mkyong/newfolder/test2.txt");

		  try{

		    Files.move(source, target);

		  } catch (IOException e) {
		    e.printStackTrace();
		  }

	}
	
	public String mostRecentFolder(String directoryFilePath) {
		
//	    File directory = new File(directoryFilePath);
//	    File[] files = directory.listFiles(File::isFile);
//	    long lastModifiedTime = Long.MIN_VALUE;
//	    File chosenFile = null;
//
//	    if (files != null)
//	    {
//	        for (File file : files)
//	        {
//	            if (file.lastModified() > lastModifiedTime)
//	            {
//	                chosenFile = file;
//	                lastModifiedTime = file.lastModified();
//	            }
//	        }
//	    }
//
//	    return chosenFile;
		Path parentFolder = Paths.get(directoryFilePath);
		 
		Optional<File> mostRecentFolder =
			    Arrays
			        .stream(parentFolder.toFile().listFiles())
			        .filter(f -> f.isDirectory())
			        .max(
			            (f1, f2) -> Long.compare(f1.lastModified(),
			                f2.lastModified()));

		Optional<File> mostRecentFileOrFolder =
		    Arrays
		        .stream(parentFolder.toFile().listFiles())
		        .max(
		            (f1, f2) -> Long.compare(f1.lastModified(),
		                f2.lastModified()));
		File mostRecent = null;
		if (mostRecentFolder.isPresent()) {
		    mostRecent = mostRecentFileOrFolder.get();
		    //System.out.println("most recent is " + mostRecent.getPath());
		} else {
		    System.out.println("folder is empty!");
		}	
		
		return mostRecent.getPath();
	}
	
//	public static void main(String[] args) {
//		
//		//createFolder();
//		//createAndGetFolder();
//		//renameFolder();
//		//mostRecentFolder("C:\\Users\\joao.araruna\\eclipse-workspace\\IFD-CSO\\ifd.cso\\target\\cucumber-reports");
//		//System.out.print(mostRecentFolder("C:\\Users\\joao.araruna\\eclipse-workspace\\IFD-CSO\\ifd.cso\\target\\cucumber-reports"));
//		//renameReportFolder();
//		//renameReportFolder(RunnerSetup runnerSetup)
//	}

//	public static void renameReportFolder(RunnerSetup runnerSetup) {
//		
//		System.out.println("oiRporter");
//		CucumberUtils cucumberUtils = new CucumberUtils();
//		FolderUtils folderUtils = new FolderUtils();
//		String user = System.getProperty("user.dir");
//		String mostRecentFolderPath = folderUtils.mostRecentFolder(user + "\\target\\cucumber-reports");
//		
//		Path source = Paths.get(mostRecentFolderPath);
//		try {
//			Files.move(source, source.resolveSibling(mostRecentFolderPath.replace("output", cucumberUtils.getTagsFromAnnotations(RunnerSetup.class))),
//			                StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// TODO Auto-generated method stub
//		
//	}
	  private static final Map PRIMITIVE_NAME_TYPE_MAP = new HashMap();
	  static {
		    PRIMITIVE_NAME_TYPE_MAP.put("boolean", Boolean.TYPE);
		    PRIMITIVE_NAME_TYPE_MAP.put("byte", Byte.TYPE);
		    PRIMITIVE_NAME_TYPE_MAP.put("char", Character.TYPE);
		    PRIMITIVE_NAME_TYPE_MAP.put("short", Short.TYPE);
		    PRIMITIVE_NAME_TYPE_MAP.put("int", Integer.TYPE);
		    PRIMITIVE_NAME_TYPE_MAP.put("long", Long.TYPE);
		    PRIMITIVE_NAME_TYPE_MAP.put("float", Float.TYPE);
		    PRIMITIVE_NAME_TYPE_MAP.put("double", Double.TYPE);
		  }
	
	 public final Class convertToJavaClass(String name, ClassLoader cl) throws ClassNotFoundException {
		    int arraySize = 0;
		    while (name.endsWith("[]")) {
		      name = name.substring(0, name.length() - 2);
		      arraySize++;
		    }

		    // Check for a primitive type
		    Class c = (Class) PRIMITIVE_NAME_TYPE_MAP.get(name);

		    if (c == null) {
		      // No primitive, try to load it from the given ClassLoader
		      try {
		        c = cl.loadClass(name);
		      } catch (ClassNotFoundException cnfe) {
		        throw new ClassNotFoundException("Parameter class not found: " + name);
		      }
		    }

		    // if we have an array get the array class
		    if (arraySize > 0) {
		      int[] dims = new int[arraySize];
		      for (int i = 0; i < arraySize; i++) {
		        dims[i] = 1;
		      }
		      c = Array.newInstance(c, dims).getClass();
		    }

		    return c;
		  }

}
