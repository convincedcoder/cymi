package com.mistermicheels.cymi.component.event;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

interface EventResponseRepository extends JpaRepository<EventResponse, EventResponseId> {

    List<EventResponse> findByEventResponseIdUserIdAndEventResponseIdEventIdIn(Long userId,
            List<Long> eventIds);

    List<EventResponse> findByEventResponseIdEventId(Long eventId);

}
