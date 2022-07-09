package functional

import java.math.BigInteger

/*
Problem
You have a recursive process and want to minimize the memory required to execute it.

Solution
Express your algorithm by using tail recursion and add the tailrec keyword to your function
 */
/*
Normal java open jdk 8 stack frame is 1 MB
recursive calls can make the stack frame full very fast and cause SOF exception.
tailrec - does not create new stack frame it uses the same one to optimize the stack frame.
 */
/*
the requirements for a function to be eligible for the tailrec modifier are as follows:

    The function must call itself as the last operation it performs.

    You cannot use tailrec inside try/catch/finally blocks.

    Tail recursion is supported only on the JVM backend.
 */
@JvmOverloads// Annotation allows invoking the function from Java with only one argument
tailrec fun recursiveFactorialTailRec(
    number: Long,
    acc: BigInteger = BigInteger.ONE
): BigInteger =
    when (number) {
        0L -> BigInteger.ONE
        1L -> acc
        else -> recursiveFactorialTailRec(number - 1, acc * BigInteger.valueOf(number))
    }
