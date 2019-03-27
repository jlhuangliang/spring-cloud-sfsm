package com.dmall.order.domain;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class OrderCalculatorTest {

  private OrderCalculator orderCalculator;

  @Mock
  private OrderCalculatorRepository orderCalculatorRepository;

  @Before
  public void setUp() throws Exception {

    init();
  }

  private void init() {
    orderCalculator = new OrderCalculator(orderCalculatorRepository);
  }

  @Test
  public void should_return_8848_when_calculate_given_order() {
    //given
    //when
    final Order order = new Order();
    when(orderCalculatorRepository.queryCalculatorData()).thenReturn(1);
    int sum = orderCalculator.calculate(order);

    //then
    Assert.assertEquals("should be 8848", 8848, sum);

  }
}
