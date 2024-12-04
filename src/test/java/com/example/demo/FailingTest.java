package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FailingTest {

    @Test
    void failingTest() {
        assertThat("Test").isEqualTo("Blub");
    }
}
