package com.codezync.jettipapp.Util

fun CalculateTotalTip(totalBill: Double, tipPercentange: Int): Double {
    return if (totalBill > 1 && totalBill.toString()
            .isNotEmpty()
    ) (totalBill * tipPercentange) / 100 else 0.0
}

fun calculateTotalPerPerson(totalBill: Double, splitBy: Int,tipPercentange: Int): Double {
   val bill = CalculateTotalTip(totalBill = totalBill,tipPercentange = tipPercentange) + totalBill
    return (bill/splitBy)
}