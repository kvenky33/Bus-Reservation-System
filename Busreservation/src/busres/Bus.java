package busres;

public class Bus {

private int busnumber;
private boolean AC;
private int seatcapacity;

 Bus(int number, boolean ac, int capacity){
	 this.busnumber= number;
	 this.AC = ac;
	 this.seatcapacity = capacity;
 }
 public int getBusnumber() {
	 return busnumber;
 }
 
 public boolean isAC() {
	 return AC;
 }
 
 public void setAC(boolean flag) {
	 AC = flag;
 }
 public int getcapacity() {
	 return seatcapacity;
 }
public int getOperation(){
	return opeartion;
}
 public void setcapacity(int cap) {
	 seatcapacity = cap;
 }
 public void Businformation() {
	 System.out.println("Bus No:"+busnumber+" ; " + "Ac :"+AC +" ; " +"Totalcapacity :"+ seatcapacity);
 }
}
