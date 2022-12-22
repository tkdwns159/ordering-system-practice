package com.sangjun.order.domain.event;

import com.sangjun.common.domain.event.DomainEvent;
import com.sangjun.order.domain.entity.Order;
import lombok.Getter;

import java.time.ZonedDateTime;

public class OrderCreateEvent extends OrderEvent {
    public OrderCreateEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
