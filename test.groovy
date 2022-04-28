class Person {
    String name
    @Override
    public String toString() {
        return "Person [name=" + name +"]";
    }
}



def methodMissing(String name, args) {
    if (name.startsWith("plus") ) {
        // write your own implementation
        return "plus method intercepted"
    }
    else {
        println "Method name does not start with plus"
        throw new MissingMethodException(name, this.class, args)
    }
}

def addition(a, b) { return a + b}

p1 = new Person()
p2 = new Person()
println addition(p1, p2)



//println addition (1, 2) // Output: 3
//println addition ([1,2], [4, 5]) // Output: [1, 2, 4, 5]
//println addition('Hi ', 3) // Output: Hi 3