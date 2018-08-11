package com.singtel.util;

import java.util.Locale;
import java.util.ResourceBundle;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Utility {

	public static ResourceBundle labels = null;
	
	@EventListener(ContextRefreshedEvent.class)
    public void contextRefreshedEvent() {
		labels = ResourceBundle.getBundle("labels");
    }
	
	//To test locally
	public static String getLabel(String property){
		if(labels == null){
			labels = ResourceBundle.getBundle("labels");
		}
		
		return labels.getString(property);
	}
	
	public static void setLang(String lang, String country) {
		
		Locale.setDefault(new Locale(lang, country));
		labels = ResourceBundle.getBundle("labels");
	}
	
	
}
