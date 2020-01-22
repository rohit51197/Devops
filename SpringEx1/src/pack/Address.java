package pack;

public class Address {
int doorno;
String Streetname;
public int getDoorno() {
	return doorno;
}
public void setDoorno(int doorno) {
	this.doorno = doorno;
}
public String getStreetname() {
	return Streetname;
}
public void setStreetname(String streetname) {
	Streetname = streetname;
}
public Address(int doorno, String streetname) {
	super();
	this.doorno = doorno;
	Streetname = streetname;
}
@Override
public String toString() {
	return "Address [doorno=" + doorno + ", Streetname=" + Streetname + "]";
}

}
