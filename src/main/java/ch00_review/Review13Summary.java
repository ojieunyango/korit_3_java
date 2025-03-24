package ch00_review;
/*
목표: 객체지향 설계 및 접근지정자 이해를 바탕으로 다양한 접근 수준의 필드와 메서드를 갖는 캐릭터 클래스를 정의하고 이를 Review13Summary
클래스에서 기능을 테스트합니다

클래스 설계
1. 필드
name 캐릭터 이름 공개가능 -전사
health 체력 읽기만 허용 - 100
power 공격력 같은 패키지만 200
skill 스킬이름 자식클래스만 - 난무
exp 경험치 외부에서 완전 차단 30

2. 메서드
getHealth() 체력값을 반화하는 getter public
attack() 공격동자가시 name이  power로 공격  public
heal()  체력을 10 회복하고 현재 체력 출력
   "체력이 10 회복되었습니다. 현재 체력 : health
 gainExp(int amount) call2  유형
 실행예
 name이 경험치 amount 를 얻엇습니다

 3. Review13Summary 클래스에
 Character character1 = new Character("전사", 25."난무"); 로 생성
 4. 실행 예
 캐릭터 이름 전사
 체력 100
 전사가 25의 힘으로 공격합니다
 전사가 경험치 10을 얻엇으빈다
 */
class  Character {

    // 필드 선언
    public String name;
    private int health;
     int power;
    protected String skill;
    private int exp;

    public int getHealth() {
        return health;
    }

    public void attack(){
        System.out.println(name+"이(가) "+power+"의 힘으로 공격합니다.!");
        this.gainExp(10);
    }
    public void heal(){
        health += 10;
        System.out.println(name+"의 체력이 회복되었습니다. 현재 체력: "+health);
    }


    private void gainExp(int amount){
        exp+=amount;
        System.out.println(name+"이(가) 경험치를 "+amount+"얻었습니다.");
    }

    // 생성자


    public Character(String name, int power, String skill) {
        this.name = name;
        this.power = power;
        this.skill = skill;
        this.health = 100; // 매개변수에 없다는 점에 주목
        this.exp = 0;



    }


    public static class Review13Summary {
            public static void main(String[] args) {
                Character character = new Character("전사",25, "난무" );

                System.out.println("캐릭터 이름: "+ character.name);
                System.out.println("현재 체력: "+character.getHealth());
                character.attack();
                character.heal();

            }
        }
    }




