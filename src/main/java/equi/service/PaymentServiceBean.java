package equi.service;

import equi.domain.Payment;
import equi.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PaymentServiceBean implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Collection<Payment> findAll() {

        Collection<Payment> payments = paymentRepository.findAll();

        return payments;
    }

    @Override
    public Payment findOne(Long id) {

        Payment payment = paymentRepository.findOne(id);

        return payment;
    }

    @Override
    public Payment create(Payment payment) {
        Payment savedPayment = paymentRepository.save(payment);

        return savedPayment;
    }

    @Override
    public Payment update(Payment payment) {

        // Ensure the entity object to be updated exists in the repository to
        // prevent the default behavior of save() which will persist a new
        // entity if the entity matching the id does not exist
        Payment paymentToUpdate = findOne(payment.getId());
        if (paymentToUpdate == null) {
            // Cannot update Payment that hasn't been persisted
            return null;
        }

        paymentToUpdate.setDescription(payment.getDescription());
        Payment updatedPayment = paymentRepository.save(paymentToUpdate);

        return updatedPayment;
    }

    @Override
    public void delete(Long id) {

        paymentRepository.delete(id);

    }
}
