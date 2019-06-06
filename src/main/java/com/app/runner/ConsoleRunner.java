package com.app.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleRunner implements ApplicationRunner{
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// ---Option args---
		//1.read all keys
		Set<String> optionKeys = args.getOptionNames();
		System.out.println(optionKeys);
		
		//2.one key related values
		List<String> optionValues = args.getOptionValues("profile");
		System.out.println(optionValues);
		
		//3.check for key exist
		boolean containsOption = args.containsOption("nature");
		boolean containsOption2 = args.containsOption("db");
		System.out.println(containsOption);
		System.out.println(containsOption2);
		
		//---Non Option Args---
		List<String> nonOptionArgs = args.getNonOptionArgs();
		System.out.println(nonOptionArgs);
		
		//---all args---
		String[] sourceArgs = args.getSourceArgs();
		System.out.println(sourceArgs);
		System.out.println(Arrays.asList(sourceArgs));
		System.out.println("ok git");
	}
}
