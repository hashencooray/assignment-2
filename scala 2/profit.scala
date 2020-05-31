object profit{
	def main(Args:Array[String]){
		var prof: Double=0;
		var ticketprice: Int=0;
		var members: Int=0;
		println("Enter the ticketprice");
		ticketprice=scala.io.StdIn.readInt();
		members=180-ticketprice/5*20
		prof=ticketprice*members-500-members*3;
		println(prof);
	
	
	
	}
	
	
	



}