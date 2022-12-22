package com.sangjun.order.domain.service.dto.message;

import com.sangjun.common.domain.valueobject.OrderApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class RestaurantApprovalResponse {
    private String id;
    private String sagaId;
    private String orderId;
    private String restaurantId;
    private OrderApprovalStatus orderApprovalStatus;
    private List<String> failureMessages;
}
