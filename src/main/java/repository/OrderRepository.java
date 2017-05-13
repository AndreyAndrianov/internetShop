package repository;

import model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Andrey on 13.05.2017.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
