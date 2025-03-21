package ch00_review;
class Data{
    private int intData;
    private String strDate;

    public int getIntData() {
        return intData;
    }

    public void setIntData(int intData) {
        this.intData = intData;
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) {
        this.strDate = strDate;
    }

}

public class Review10 {
    public static void main(String[] args) {


        Data data1 = new Data();
        data1.setIntData(1750);
        data1.setStrDate("집가는 시간!!!!!!!!!!");

        System.out.println("오늘 "+ data1.getStrDate() + data1.getIntData()+"에 집간다아아아아아아ㅏ아아아아아");
    }
}
