public class Inheritance {
    public static void main(String[] args) {
        Mother mother = new Mother();

        Son son = new Son();
        son.ptintMotherAge();

        son.setBloodType("A");
        System.out.println(son.getBloodType());


    }
}

// 부모 클래스 정의
class Mother {
    int motherAge = 50;
    String hometown = "경상도";
    boolean isMarried = true;
    String bloodType = "O";
// String bloodType

    public Mother() {
        System.out.println("welcome to super class.");
    }
}

// 자식 클래스 정의(부모 클래스 상속)
class Son extends Mother {
    int sonAge = 23;
    String hometown = "서울";

    public Son() {
        System.out.println("welcome to sub class");
    }

    public void ptintMotherAge() {
        System.out.println("Mother's Age : " + super.motherAge);
    }

    public String getBloodType(){
        return super.bloodType;
    }

    
    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }

}
