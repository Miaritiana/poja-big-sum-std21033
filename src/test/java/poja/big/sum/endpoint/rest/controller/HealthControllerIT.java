package poja.big.sum.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static poja.big.sum.endpoint.rest.controller.health.PingController.OK;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import poja.big.sum.PojaGenerated;
import poja.big.sum.conf.FacadeIT;
import poja.big.sum.endpoint.rest.controller.health.HealthDbController;
import poja.big.sum.endpoint.rest.controller.health.PingController;

@PojaGenerated
class HealthControllerIT extends FacadeIT {

  @Autowired PingController pingController;
  @Autowired HealthDbController healthDbController;

  @Test
  void ping() {
    assertEquals("pong", pingController.ping());
  }

  @Test
  void can_read_from_dummy_table() {
    var responseEntity = healthDbController.dummyTable_should_not_be_empty();
    assertEquals(OK, responseEntity);
  }
}
