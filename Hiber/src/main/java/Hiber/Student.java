package Hiber;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
		@Id
		@GeneratedValue
		private int studentId;
		private String studentName;
		@Column(unique = true)
		private long studentContactNumber;
		private double degreePercentage;
		private String address;
		private String gender;

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public long getStudentContactNumber() {
			return studentContactNumber;
		}

		public void setStudentContactNumber(long studentContactNumber) {
			this.studentContactNumber = studentContactNumber;
		}

		public double getDegreePercentage() {
			return degreePercentage;
		}

		public void setDegreePercentage(double degreePercentage) {
			this.degreePercentage = degreePercentage;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

	}
	
