package com.v6ak.conversions.rubyLike

/*
This is the reusable version. You can anytime import it by following line:
import com.v6ak.conversions.rubyLike.IntConversions._
*/

object IntConversions{
	
	// define a reusable conversion
	implicit def toTimes(n: Int) = new {
		def times(f: =>Unit){
			var i = 0	// we can do it in imperative way
			while(i<n){
				f
				i += 1
			}
		}
	}

	
}
