//Steven Kast
//CSE 271, Dr. Bravo
//February 9, 2016
//Lab 03, Implementing Classes

public class Student {
	
	private String name;
	private double totalScore;
	private double averageScore;
	private double quizCount;
	
	//Constructors
	public Student(String name){
		this.name = name;
		totalScore = 0;
		averageScore = 0;
	}
	//end Constructors

	//Getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalScore() {
		return totalScore;
	}

	public double getAverageScore() {
		averageScore = totalScore/quizCount;
		return averageScore;
	}
	//end getters and setters
	
	//Methods
	public void addQuiz(int quiz){
		totalScore += quiz;
		quizCount++;
	}
	//end 
	
}
