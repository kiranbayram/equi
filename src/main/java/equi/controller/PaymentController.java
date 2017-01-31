package equi.controller;

import java.util.concurrent.atomic.AtomicLong;

import equi.domain.Payment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/payment")
    public Payment payment(@RequestParam(value="id", defaultValue="0") String id) {
        return new Payment(Long.parseLong(id), 35.74, "This is payment description!");
    }
}