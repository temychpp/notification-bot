package com.iyuriy.notification.common.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Setter
@Getter
@ToString
public final class ScheduleEventDto {
    private Instant timeToTrigger;
    private String notificationText;
    private String originalRq;
}