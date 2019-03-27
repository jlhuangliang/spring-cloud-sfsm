package com.dmall.order.repository;

import com.dmall.order.domain.Payment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PaymentRepository extends CrudRepository<Payment, Integer> {

  Payment findByOid(Integer oid);

}
