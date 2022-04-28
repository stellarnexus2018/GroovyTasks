def cond1 = true
int cond2 = 1
//def unknownName

if (cond1) {
    println('Condition 1 satisfied')
    if (cond2) {
        println('Condition 2 satisfied')
} else {
        println('Condition 2 failed')
    }
} else {
    println('Condition 1 failed')
}

(cond2) ? println('Да') : println('Нет')

//String newName = unknownName?:"new name"
