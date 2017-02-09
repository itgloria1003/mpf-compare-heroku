package com.github.britter.springbootherokudemo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RecordRepository extends CrudRepository<Record, Long> {

    List<Record> findByData(String data);
}
