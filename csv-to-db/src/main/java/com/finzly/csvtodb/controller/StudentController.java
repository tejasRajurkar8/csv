//package com.finzly.csvtodb.controller;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Iterator;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.finzly.csvtodb.entity.Rate;
//import com.finzly.csvtodb.entity.Student;
//import com.finzly.csvtodb.repository.StudentRepository;
//import com.opencsv.bean.CsvToBean;
//import com.opencsv.bean.CsvToBeanBuilder;
//
//@Controller
//public class StudentController {
//
//	@Autowired
//	StudentRepository studRepo;
//	
////	@GetMapping(path = "/test")
////	public String getData() {
////		
////		try {
////			//CSVReader reader = new CSVReader(new FileReader("C:/Users/tejas/Downloads/RATES_MARGINED_20190505_164050.csv"));
////			Reader reader = Files.newBufferedReader(Paths.get("C:/Users/tejas/Downloads/students.csv"));
////			 CsvToBean<Student> csvToBean = new CsvToBeanBuilder<Student>(reader)
////	                    .withType(Student.class)
////	                    .withIgnoreLeadingWhiteSpace(true)
////	                    .build();
////
////	            Iterator<Student> csvUserIterator = csvToBean.iterator();
////	            
////	            while (csvUserIterator.hasNext()) {
////	            	Student student = csvUserIterator.next();
////	            	System.out.println(student.toString());
////	            	Student newStudent = studRepo.save(student);
////	            	System.out.println(newStudent.toString());
////	            }
////		return "Working";
////		}catch(Exception e) {
////			 e.printStackTrace(); 
////			 return "exception";
////		}
////		}
////		
//		
//	
//	@RequestMapping(method = RequestMethod.GET, value = "/test")
//    public String test() {
//        return "index";
//    }
//	
//	@PostMapping(path = "/post123")
//	public String getCsv(@RequestParam("file") MultipartFile file) {
//		
//		try {
//			//CSVReader reader = new CSVReader(new FileReader("C:/Users/tejas/Downloads/RATES_MARGINED_20190505_164050.csv"));
//			Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()));
//			 CsvToBean<Student> csvToBean = new CsvToBeanBuilder<Student>(reader)
//	                    .withType(Student.class)
//	                    .withIgnoreLeadingWhiteSpace(true)
//	                    .build();
//
//	            Iterator<Student> csvUserIterator = csvToBean.iterator();
//	            
//	            while (csvUserIterator.hasNext()) {
//	            	Student student = csvUserIterator.next();
//	            	System.out.println(student.toString());
//	            	Student newStudent = studRepo.save(student);
//	            	System.out.println(newStudent.toString());
//	            }
//		return "success";
//		}catch(Exception e) {
//			 e.printStackTrace(); 
//			 return "error";
//		}
//		
//		
//	}
//	
//	
//}
