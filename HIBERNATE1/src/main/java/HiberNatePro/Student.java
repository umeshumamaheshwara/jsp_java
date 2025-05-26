package HiberNatePro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
		
		@Id
		
		private int id;
		@Column(nullable = false)
		private String Name;
		private String Address;
		@Column(unique = true , nullable = false)
		private long  phoneNumber;
		
		private double percentage;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public double getPercentage() {
			return percentage;
		}
		public void setPercentage(double percentage) {
			this.percentage = percentage;
		}

}
