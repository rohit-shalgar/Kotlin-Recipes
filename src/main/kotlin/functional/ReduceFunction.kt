package functional

/*
        reduce is same as fold except fold takes initial(identity) value
        reduce first value is always first element in the collection.
        if you call reduce on empty array, it results in exception in KT
        in Java reduce comes with 2flavors - 1 with initial value, 2 without initial value
        empty collection reduce results in optional of empty stream in Java.
 */
fun reduce(vararg number: Int): Int {
    return number.reduce { acc, num -> acc + num }
}