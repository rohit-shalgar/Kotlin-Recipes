package oop

/*
        Problem
You need to indicate that a value is a compile-time rather than a runtime constant.
 */
class Task(val taskName: String, _priority: Int = DEFAULT_PRIORITY) {
// absence of val on priority alog with _ indicates that this is used to set a property
    // and not a constructor parameter.
    companion object {
        // const is a modifier
        // val is kt keyword hence they both go together - equivalent to final in Java.
        const val MIN_PRIORITY = 1
        const val MAX_PRIORITY = 5
        const val DEFAULT_PRIORITY = 3
    }

    var priority = validPriority(_priority)
        set(priority) {
            field = validPriority(priority)

            //field here is known as backing field and is used to override the default value.
        }

    private fun validPriority(priority: Int) =
        priority.coerceIn(MIN_PRIORITY, MAX_PRIORITY)

}