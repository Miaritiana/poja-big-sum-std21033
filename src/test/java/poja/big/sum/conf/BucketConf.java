package poja.big.sum.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import poja.big.sum.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
