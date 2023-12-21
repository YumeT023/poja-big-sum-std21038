package com.bigsum.poja.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.bigsum.poja.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
