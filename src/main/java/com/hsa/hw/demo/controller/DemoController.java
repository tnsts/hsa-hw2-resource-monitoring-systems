package com.hsa.hw.demo.controller;

import com.hsa.hw.demo.entity.ElasticRecord;
import com.hsa.hw.demo.entity.MongoRecord;
import com.hsa.hw.demo.repo.ElasticRecordRepository;
import com.hsa.hw.demo.repo.MongoRecordRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {

    private final MongoRecordRepository mongoDBRepository;
    private final ElasticRecordRepository elasticsearchRepository;

    public DemoController(MongoRecordRepository mongoDBRepository, ElasticRecordRepository elasticsearchRepository) {
        this.mongoDBRepository = mongoDBRepository;
        this.elasticsearchRepository = elasticsearchRepository;
    }

    @GetMapping("/mongo")
    public List<MongoRecord> getAllFromMongoDB() {
        return mongoDBRepository.findAll();
    }

    @GetMapping("/elasticsearch")
    public Iterable<ElasticRecord> getAllFromElasticsearch() {
        return elasticsearchRepository.findAll();
    }
}
