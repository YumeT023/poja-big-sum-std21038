package com.big-sum.poja.endpoint.rest.controller.health;

import com.big-sum.poja.PojaGenerated;
import com.big-sum.poja.repository.DummyRepository;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.big-sum.poja.endpoint.rest.controller.health.PingController.KO;
import static com.big-sum.poja.endpoint.rest.controller.health.PingController.OK;

@PojaGenerated
@RestController
@AllArgsConstructor
public class HealthDbController {

  DummyRepository dummyRepository;

  @GetMapping("/health/db")
  public ResponseEntity<String> dummyTable_should_not_be_empty() {
    return dummyRepository.findAll().isEmpty() ? KO : OK;
  }
}
