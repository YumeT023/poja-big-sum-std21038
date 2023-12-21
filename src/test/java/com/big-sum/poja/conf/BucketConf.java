package com.big-sum.poja.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.big-sum.poja.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
