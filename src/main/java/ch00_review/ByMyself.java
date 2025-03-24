package ch00_review;
import java.util.Scanner;
public class ByMyself {

    Scanner scanner = new Scanner(System.in);



    String name ="";

    String[] subject = {"수학, 영어, 과학, 국어, 역사"};

    String[] grade =new String[5];

    double[] score = new double [5];

    double sum =0;

    double average =0;

    int numofsub = 5;







    public void setName() {

        System.out.println("이름을 입력하세요.");

        this.name = scanner.nextLine();

    }

    public void setSubjectAndScores() {

        this.subject = subject;

        for(int i = 0; i < subject.length; i++) {

            System.out.println(subject[i]+"점수를 입력하세요.");

            score[i]= scanner.nextDouble();



        }



    }

    public void setGrade(String[] grades) {

        this.grade = grades;

        for (int i = 0; i < grade.length; i++) {

            if (score[i] > 90) {

                grades[i] = "A";

            }else if(score[i] > 80) {

                grades[i]="B";

            }else if(score[i] > 70) {

                grades[i]="C";

            }else if(score[i] > 60) {

                grades[i]="D";

            }else {

                grades[i]="F";

            }



        }

    }



    public void setSum(double sum) {

        for(int i = 0; i < score.length; i++) {

            sum+=score[i];





        }

        this.sum = sum;

    }

    public void setAverage(double average) {

        this.average = average;

        average = sum / numofsub;



    }



    public void printResults() {

        System.out.println("학생이름: "+name);

        for (int i = 0; i < subject.length; i++) {

            System.out.println(subject[1]+": "+score[i] + "학점: "+ grade[i]);

            System.out.println("총합: "+sum);

            System.out.println("평균: "+average);



        }



}



        public static void main(String[] args) {

            ByMyself student1 = new ByMyself();



//           ByMyself.setName();
//
//            ByMyself.setSubjectAndScores();
//
//           ByMyself.setGrade();
//
//            ByMyself.setSum(0);
//
//            ByMyself.setAverage(0);
//
//            ByMyself.printResults();



        }



    }