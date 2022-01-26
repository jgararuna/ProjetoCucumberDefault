package br.com.rabobank.ifd.cso.utils;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

import br.com.rabobank.ifd.cso.runners.Runner;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.runtime.model.CucumberTagStatement;

public class CucumberUtils {
	
	public String getTagsFromAnnotations(Class<?> clazz) {
	    CucumberOptions co = clazz.getAnnotation(CucumberOptions.class);
	    String[] tags = co.tags();
	    System.out.println("aqui");
	    System.out.println(tags[0]);
	    return tags[0];
	}
	
	public String getTagsFromAnnotations2(Object clazz) {
	    //CucumberOptions co = clazz.getAnnotation(CucumberOptions.class);
	    CucumberOptions co = clazz.getClass().getAnnotation(CucumberOptions.class);
	    String[] tags = co.tags();
	    System.out.println("aqui");
	    System.out.println(tags[0]);
	    return tags[0];
	}
//	public static void main(String[] args) {
//		System.out.println(getTagsFromAnnotations(Runner.class));
//		//getTagsFromAnnotations(Runner.class);
//	}
}
