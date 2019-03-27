package com.dmall.order.domain;

public class OrderCalculator {
  private OrderCalculatorRepository orderCalculatorRepository;

  public OrderCalculator(OrderCalculatorRepository orderCalculatorRepository) {

    this.orderCalculatorRepository = orderCalculatorRepository;
  }

  public int calculate(Order order) {

    int data = orderCalculatorRepository.queryCalculatorData();

    return data * 8848;
  }
}
