object salary{
	def main(Args:Array[String]){
		var sal: Double=0;
		var normalhours: Int=0;
		var othours: Int=0;
		println("Enter the number of normalhours");
		normalhours=scala.io.StdIn.readInt();
		println("Enter the number of othours");
		othours=scala.io.StdIn.readInt();
	    sal =(normalhours*150 +othours*75)*90/100;
		println(sal);
	
	
	
	}
	
	
	



}