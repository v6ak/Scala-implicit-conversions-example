Demonstrates implicit conversions in Scala.

* times-repl.scala - This file can be simply used in Scala console or as a "Scala script".
* com/v6ak/conversions/rubyLike/IntConversions.scala - This file contains reusable conversions that "adds" method `times` to all Ints.
* com/v6ak/examples/Times.scala - This file is an application that demonstrates usage of reusable `times`.

You can simply compile all the files:
 fsc $(find com -name '*.scala')
Then, you can simply run them:
 scala com.v6ak.examples.Times
You can also clean all the compiled class files:
 rm $(find -name '*.class')
