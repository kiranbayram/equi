package equi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Payment {

    @Id
    @GeneratedValue
    private final long id;
    private final double amount;
    private String description;
    private final Payer payer;

    public Payment(long id, double amount, Payer payer, String description) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.payer = payer;
    }

    public long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) { this.description = description; }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Payment)) {
            return false;
        }
        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

