package com.v6ak.examples

object Times extends Application{ // should be "object Times extends App" in Scala 2.9 and later
	
	def greet(){
		import com.v6ak.conversions.rubyLike.IntConversions._ // This "adds" the times method locally. It is not visible outside this function.
		5 times {
			println("hello")
		}
	}
	
	greet()
	
	/*
	//Following can't be compiled:
	10 times {
		println("Method times is not visible there!")
	}
	*/
	
}
