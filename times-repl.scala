/*

This is version for Scala console ("REPL")
1. Install Scala if needed.
2. Type "scala" in console and press Enter.
3. Copy&paste the code

You can also run it as "Scala script":
1. Install Scala if needed.
2. type scala times-repl.scala in console and pres Enter.

*/

// Let's define the conversion!
implicit def toTimes(n: Int) = new {  
    def times(f: =>Unit){
        var i = 0    // we can do it in imperative way
        while(i<n){
            f
            i += 1
        }
    }
}

// I can use the method on any Int.
5 times {
    println("hello")
}
