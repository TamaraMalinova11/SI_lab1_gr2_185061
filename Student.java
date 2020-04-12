class Student {
	String index;
	String firstName;
	String lastName;
	int[] grades;

	//TODO constructor

	public Student(String index, String firstName, String lastName, int[] grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}


	//TODO seters & getters


	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
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

	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public double getAverage() {
		//TODO
		int sum=0;
		double rez=0;
		for(int i=0;i<grades.length;i++){
			sum+=grades[i];
		}
		return sum/(double)grades.length;
	}

	public int ECTSCredits() {
		//TODO
		int polozheni=0;
		for(int i=0;i<grades.length;i++){
			if(grades[i]>5){
				polozheni++;
			}
		}
		return polozheni*6;
	}
}
class Faculty{
	List<Student> studentList;
	String imeNaFax;

	public Faculty(String imeNaFax) {
		this.imeNaFax = imeNaFax;
	}

	public String getImeNaFax() {
		return imeNaFax;
	}

	public void setImeNaFax(String imeNaFax) {
		this.imeNaFax = imeNaFax;
	}

	public void addStudent(Student student){
		studentList.add(student);
	}

	public void removeStudent(Student student){
		studentList.remove(student);
	}



}
