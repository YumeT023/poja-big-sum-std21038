package com.bigsum.poja.conf;

import com.bigsum.poja.PojaGenerated;
import org.springframework.test.context.DynamicPropertyRegistry;

@PojaGenerated
public class SqliteConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("driverClassName", () -> "org.sqlite.JDBC");
    registry.add(
        "spring.jpa.database-platform", () -> "com.bigsum.poja.repository.conf.SqliteDialect");
    registry.add("spring.datasource.url", () -> "jdbc:sqlite:/tmp/sqlite-data:db?cache=shared");
    registry.add("spring.datasource.username", () -> "sa");
    registry.add("spring.datasource.password", () -> "sa");
  }
}
