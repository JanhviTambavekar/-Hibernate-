package model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student 
{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "ROLL_NO") // Existing primary key column
	    private int rollNo;

	    @Column(name = "FIRSTNAME")
	    private String firstName;

	    @Column(name = "LASTNAME")
	    private String lastName;

	    @Column(name = "DEPT")
	    private String department;

	    @OneToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "SUBJECT_ID") // New foreign key column
	    private Subject subject;

	    public Student() {}

	    // Getters and Setters
	    public int getRollNo() {
	        return rollNo;
	    }

	    public void setRollNo(int rollNo) {
	        this.rollNo = rollNo;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public Subject getSubject() {
	        return subject;
	    }

	    public void setSubject(Subject subject) {
	        this.subject = subject;
	    }


}
