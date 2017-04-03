package equi.service;

import equi.domain.Payment;

import java.util.Collection;

public interface PaymentService {

    Collection<Payment> findAll();

    Payment findOne(Long id);

    Payment create(Payment greeting);

    Payment update(Payment greeting);

    void delete(Long id);

}
