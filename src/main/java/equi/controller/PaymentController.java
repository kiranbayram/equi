package equi.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import equi.domain.Payer;
import equi.domain.Payment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/payment")
    public Payment payment(@RequestParam(value="id", defaultValue="0") String id) {
        return new Payment(Long.parseLong(id), 35.74, Payer.ALEX,"This is payment description!");
    }

    @RequestMapping("/payments")
    public Collection<Payment> payments() {
        Payment payment1 = new Payment(1, 35.74, Payer.BAYRAM, "This is payment description!");
        Payment payment2 = new Payment(2, 135.74, Payer.ALEX, "This is payment description too!");
        ArrayList<Payment> paymentList = new ArrayList<Payment>();

        paymentList.add(payment1);
        paymentList.add(payment2);

        return paymentList;
    }
}