package com.hsa.hw.demo.repo;

import com.hsa.hw.demo.entity.MongoRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoRecordRepository extends MongoRepository<MongoRecord, String> {
}