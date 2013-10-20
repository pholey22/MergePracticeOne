Set ObjReader = Wscript.StdIn

	Wscript.StdOut.write "Enter a Number: "
	numb = ObjReader.readLine()
	
	
	
	
	If CInt(numb)mod 2 = 0 then
	
		Wscript.StdOut.writeLine "Yayy!"
	Else
	
		Wscript.StdOut.writeLine "Booo!"
		
	End If
	
	
	TestSub
	
	Sub TestSub
	    Wscript.StdOut.writeLine "We're in a subroutine."
	    Wscript.StdOut.writeLine "This is not a good use of a subroutine."
	End Sub
	