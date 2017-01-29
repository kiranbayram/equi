package equi.domain;

import java.util.Objects;

public class Payment {

    private final long id;
    private final double amount;
    private final String description;

    public Payment(long id, double amount, String description) {
        this.id = id;
        this.amount = amount;
        this.description = description;
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

