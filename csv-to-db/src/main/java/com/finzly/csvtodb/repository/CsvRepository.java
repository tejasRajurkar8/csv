package com.finzly.csvtodb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finzly.csvtodb.entity.Rate;

public interface CsvRepository extends JpaRepository<Rate, Integer> {

}
