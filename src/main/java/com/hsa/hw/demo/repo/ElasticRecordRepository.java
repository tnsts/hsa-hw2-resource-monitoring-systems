package com.hsa.hw.demo.repo;

import com.hsa.hw.demo.entity.ElasticRecord;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ElasticRecordRepository extends ElasticsearchRepository<ElasticRecord, String> {
}
