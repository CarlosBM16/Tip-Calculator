package com.example.tiptime

import org.junit.Test
import java.text.NumberFormat
import kotlin.test.assertEquals

class TipCalculatorTests {
    @Test
    fun calculateTip_20PercentNoRoundup() {
        val amount = 10.00
        val tipPercent = 20.00

        var expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_20PercentRoundup() {
        val amount = 10.00
        val tipPercent = 20.00

        var expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, true)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateNegativeAmountNoRoundup() {
        val amount = -10.00
        val tipPercent = 20.00

        var expectedTip = NumberFormat.getCurrencyInstance().format(0)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateNegativeAmountRoundup() {
        val amount = -10.00
        val tipPercent = 20.00

        var expectedTip = NumberFormat.getCurrencyInstance().format(0)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, true)
        assertEquals(expectedTip, actualTip)
    }
}