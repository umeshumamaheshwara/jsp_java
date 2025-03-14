package Hiber;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {
		public static void main(String[] args) {
			EntityManagerFactory e = Persistence.createEntityManagerFactory("dev");
			EntityManager m = e.createEntityManager();
			EntityTransaction t = m.getTransaction();
			boolean f = true;
			while (f) {
				System.out.println("1.add");
				System.out.println("2.fetch");
				System.out.println("3.update");
				System.out.println("4.delete");
				System.out.println("5.exit");
				
				Scanner sc = new Scanner(System.in);
				switch (sc.nextInt()) {
				case 1: {
					Student s = new Student();
					System.out.println("Enter Student Name");
					s.setStudentName(sc.next());
					System.out.println("Enter Phone Number");
					s.setStudentContactNumber(sc.nextLong());
					System.out.println("Enter Degree %");
					s.setDegreePercentage(sc.nextDouble());
					System.out.println("Enter Address");
					s.setAddress(sc.next());
					System.out.println("Select Gender\n1.Male\n2.Female");
					int option = sc.nextInt();
					if (option == 1) {
						s.setGender("male");
					} else if (option == 2) {
						s.setGender("female");
					} else {
						s.setGender("transgender");
					}
					t.begin();
					m.persist(s);
					t.commit();
					System.out.println("Details Added");
				}
					break;
				case 2: {
					System.out.println("Enter id to fetch");
					Student s = m.find(Student.class, sc.nextInt());
					if (s != null){
						System.out.println(s.getStudentName() + "\n" + s.getAddress() + "\n" + s.getDegreePercentage()
								+ "\n" + s.getStudentContactNumber() + "\n" + s.getGender());
					} else
						System.out.println("invalid id");
				}
					break;
				case 3: {
					System.out.println("Enter id to update");
					Student s = m.find(Student.class, sc.nextInt());
					if (s != null) {
						
						System.out.println("1.Name \t 2.Phone \t 3.Degree \t 4.Address \t 5.Gender");
						
						
						int option= sc.nextInt();
						if (option == 1) {
							System.out.println("Enter  name");
							s.setStudentName(sc.next());
							t.begin();
							m.merge(s);
							t.commit();
							
						} else if (option == 2) {
							System.out.println("Enter  Phone Number:");
							s.setStudentContactNumber(sc.nextLong());
							t.begin();
							m.merge(s);
							t.commit();
							
						} else if (option == 3) {
							System.out.println("Enter Degree%:");
							s.setStudentContactNumber(sc.nextLong());
							t.begin();
							m.merge(s);
							t.commit();
						}else if (option == 4) {
							System.out.println("Enter Address:");
							s.setAddress(sc.next());
							t.begin();
							m.merge(s);
							t.commit();
						}else if (option == 5) {
							System.out.println("Enter Gender:");
							s.setAddress(sc.next());
							t.begin();
							m.merge(s);
							t.commit();
						}
						else {
							System.out.println("invalid id");
						}
					
				}
					
			}
					break;

				case 4: {
					System.out.println("Enter id to fetch");
					Student s = m.find(Student.class, sc.nextInt());
					if (s != null) {
						t.begin();
						m.remove(s);
						t.commit();
					} else
						System.out.println("Invalid Id");
				}

					break;
				case 5: {
					f = false;
					System.out.println("Exit....");
				}
					break;

				default:
					System.out.println("Inavlid option...");
					break;
				}

			}
		}
	}


