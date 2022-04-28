def checkInput(def input) {
    switch (input) {
        case [3, 4, 5, 10] : println('Array Matched'); break
        case 10..15 : println('Range Matched'); break
        case ~/\d+/ : println('Pattern Matched'); break
        case Integer : println('Integer Matched'); break
        case String : println('String Matched'); break
        default : println('Nothing Matched'); break
    }
}

/* groovylint-disable-next-line CompileStatic */
//checkInput(3) // will print Array Matched
//checkInput(1) // will print Integer Matched
//checkInput(10) // will print Range Matched
checkInput(100) // will print Range Matched
//checkInput('abcd abcd') // will print String Matched
//checkInput('abcd') // will print Pattern Matched
