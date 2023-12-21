package poja.big.sum.endpoint.rest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@CrossOrigin
public class BigSumController {
    @GetMapping("/big-sum")
    public BigInteger getBigSum(@RequestParam BigInteger a, @RequestParam BigInteger b) {
        BigInteger sum = a.add(b);
        return sum;
    }
}
