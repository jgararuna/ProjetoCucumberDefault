package br.com.rabobank.ifd.cso.runners;


import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.map.StaticBucketMap;
import org.apache.xmlbeans.impl.common.ResolverUtil;
import org.bson.util.ClassMap;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aventstack.extentreports.ExtentReports;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import br.com.rabobank.ifd.cso.managers.FileReaderManager;
import br.com.rabobank.ifd.cso.steps.comuns.TelaLoginStep;
import br.com.rabobank.ifd.cso.utils.CucumberUtils;
import br.com.rabobank.ifd.cso.utils.FolderUtils;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import cucumber.api.CucumberOptions;
import cucumber.runtime.Reflections;

public class RunnerSetup {
	
//	Class<? extends RunnerSetup> derivedClass = this.getClass();
	//private static ArrayList<Class> instantiatedDerivedTypes;
	
	//public RunnerSetup(Class<?> clazz, final Object testInstance) {
	public RunnerSetup(Class<?> clazz) {

		FolderUtils folderUtils = new FolderUtils();
		folderUtils.createReportFolder2(clazz);
		
	}
	
//	@BeforeClass
//	public static void setUp() {	
//	}
	
//	@Before
//	public void report() {	
//	}
	
//	@AfterClass
//	public static void writeExtentReport() {
//	}

}
