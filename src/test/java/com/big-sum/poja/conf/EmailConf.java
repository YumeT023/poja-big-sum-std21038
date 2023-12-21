package com.big-sum.poja.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import com.big-sum.poja.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
