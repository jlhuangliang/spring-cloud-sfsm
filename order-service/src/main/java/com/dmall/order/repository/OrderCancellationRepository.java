package com.dmall.order.repository;


import com.dmall.order.domain.OrderCancellation;
import org.springframework.data.repository.CrudRepository;

public interface OrderCancellationRepository extends CrudRepository<OrderCancellation, Integer> {
  OrderCancellation findByOid(Integer oid);
}
