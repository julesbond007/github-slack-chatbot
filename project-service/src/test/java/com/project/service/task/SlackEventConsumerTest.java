package com.project.service.task;

import static org.testng.Assert.assertNotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.project.service.BaseSpringTest;

public class SlackEventConsumerTest extends BaseSpringTest {
    @Autowired
    private SlackEventConsumer consumer;

    @Test
    public void testNotNull() {
        assertNotNull(consumer);
    }
}