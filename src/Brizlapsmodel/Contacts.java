package Brizlapsmodel;

public class Contacts {
        private String firstname;
		private String lastname;
        private String address;
        private String city;
        private String state;
        private int zip;
        private long phonenumber;
        private String email;
		public  String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getZip() {
			return zip;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		public long getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(long phonenumber) {
			this.phonenumber = phonenumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String toString() {
			return "Contacts [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city="
					+ city + ", state=" + state + ", zip=" + zip + ", phonenumber=" + phonenumber + ", email=" + email
					+ "]";
		}
        
}
