# Kotlin Reduce Function Error

This repository demonstrates a common error encountered when using the `reduce` function in Kotlin. The `reduce` function requires an initial value, but if this value is omitted, the code will throw an exception. The solution demonstrates how to correctly use the `reduce` function by providing an initial value and handling the edge cases where the list is empty.

## Bug

The original code uses the `reduce` function to calculate the sum of a list of numbers without providing an initial value. This leads to the `UnsupportedOperationException` error when the list is empty. 

## Solution

The solution provides an initial value of 0 to the `reduce` function to avoid the `UnsupportedOperationException` error when the list is empty. This ensures the function handles cases where the list might be empty correctly.