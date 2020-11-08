package com.finzly.csvtodb.controller;

import java.io.InputStreamReader;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.finzly.csvtodb.entity.Rate;
import com.finzly.csvtodb.repository.CsvRepository;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

@Controller
public class CsvController {

	@Autowired
	CsvRepository csvRepo;

	TimeZone timeZone = TimeZone.getTimeZone("US/Eastern");
	String dateFormat = "dd-MMM-yyyy ";
	String timeFormat = "hh:mm:ss";

	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String index() {
		return "index";
	}

	@PostMapping(path = "/post")
	public String post(@RequestParam("file") MultipartFile file) {

		// read line by line
		String[] record = null;

		try {
			Reader read = new InputStreamReader(file.getInputStream());
			CSVReader reader = new CSVReaderBuilder(read).withSkipLines(1).build();
			while ((record = reader.readNext()) != null) {

				Rate rate = new Rate();
				rate.setDate(getDate(record[0]));
				rate.setCurrencyName(record[1]);
				rate.setCurrencyCode(record[2]);
				rate.setTerms(record[3]);
				rate.setInternalSpotRate(Double.parseDouble(record[4]));
				rate.setBuyRate(Double.parseDouble(record[5]));
				rate.setSellRate(Double.parseDouble(record[6]));
				rate.setBossRate(Double.parseDouble(record[7]));
				rate.setCutoffTime(getTime(record[8]));

				csvRepo.save(rate);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}

		return "success";
	}

	private Date getDate(String csvDate) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		Date date = dateFormat.parse(csvDate);
		return date;
	}

	private Date getTime(String csvTime) throws ParseException {
		SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
		Date date = timeFormat.parse(csvTime);
		return date;
	}
}
