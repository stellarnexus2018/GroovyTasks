//def addTwo = {it + 2}

//println addTwo(3)
//println addTwo(0)

//groovy.lang.Closure cl1 = {println it}
//cl1("Это проверочный текст!")

class PrintValue {

    def printClosure = {
        println myValue
    }

}

class PrintHandler {

    def myValue = "I'm Defined Here"

}

def pcl = new PrintValue().printClosure
pcl.delegate = new PrintHandler()
pcl()
