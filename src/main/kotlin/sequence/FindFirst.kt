package sequence

fun findFirstWithoutSequence(): Int {
    return (100 until 200).map { it * 2 }
        .first { it % 3 == 0 }
}

fun findFirstWithSequence(): Int {
    return (100 until 200).asSequence()
        .map { it * 2 }
        .first { it % 3 == 0 }
}