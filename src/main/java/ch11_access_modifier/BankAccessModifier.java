package ch11_access_modifier;
/*
접근 지정자(Access Modifier) :
        클래스, 메서드, (필드) 변수(속성) 등에 대한 접근 권한을 제어하는데 사용되는 명령어

    종류  :
        1) public
        2) protected
        3) (default)
        4) private

    작성 가이드라인
        1. BankAccessModifier
            1) 필드
                accountNum(계좌번호, 정수)
                accountHolder(예금주이름, 문자열)
                balance(잔액, 정수)
                pinNumber(비밀번호, 4자리 정수 0 ~ 9999)

            2) 생성자
                기본 생성자
                계좌번호만 받는 생성자
                계좌번호, 예금주를 받는 생성자
                계좌번호, 예금주, 초기 잔액을 받는 생성자
                계좌번호, 예금주, 초기 잔액, 비밀번호를 받는 생성자

            3) 메서드
                Setter / Getter
                    특히 Setter의 경우에는 유효성 검증 로직을 삽입해야 함.
                        -> 잔액은 음수일 수 없음.
                        -> 비밀번호는 0 이상 9999 이하까지만 가능 -> 실패하면 "불가능한 비밀번호입니다."
                deposit(int amount, int inputPin) -> 입금 관련 메서드 / call2()
                    - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
                    - 유효한 금액인지 검증(amount가 0초과) -> 실패하면 "불가능한 입력 금액입니다."
                    - 콘솔창에
                        입금 성공! 현재 잔액 : 000000원

                withdraw(int amount, int inputPin) -> 출금 관련 메서드 / call2()
                    - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
                    - 유효한 금액인지 검증(amount 0초과) -> 실패하면 "불가능한 입력 금액입니다."
                    - 출금 후 잔액이 0 이상인지 확인 -> 음수라면 "출금 불가입니다."
                    - 콘솔창에
                        출력 성공! 현재 잔액 : 00000원

                showAccountInfo() / call1()
                    - 콘솔창에
                        안근수 님의 계좌번호는 1234567이며, 현재 잔액은 100,000원입니다.

                여러분이 직접 BankAccessModifierMain 클래스를 생성하고, 객체를 만들어서
                setter / getter를 이용하여 계좌 정보 입력 및 출력을 해보고,
                deposit() / withdraw()를 실행시켜서 입금 성공 및 실패 사례를 확인하고,
                통과되는지 검증해보시기 바랍니다.

 */
public class BankAccessModifier {
    private int accountNum = 0;
    private String accountHolder = "";
    private int balance = 0;
    private int pinNumber = 0;




    public BankAccessModifier(int accountNum) {
        this.accountNum = accountNum;
    }

    public BankAccessModifier(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public BankAccessModifier(int accountNum, int balance, String accountHolder) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public BankAccessModifier(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;

    }


    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }


    public void showInfo() {

//
//        System.out.println("출금 불가입니다.");
        System.out.println(accountHolder + "님의 계좌번호는 " + accountNum + "이며, 현재 잔액은 " + balance + "원입니다.");
    }

    void deposit(int amount, int inputPin) {  //call2 유형
        if (inputPin == pinNumber) { // 계좌비밀번호와 argument로 입력한 비밀번호 일치
            if (amount > 0) {
                balance += amount;
                System.out.println("입금성공! 현재잔액: " + balance);
            } else {
                System.out.println("불가능한 입력 금액입니다.");
            }
            } else{
                System.out.println("비밀번호가 틀렸습니다.");
                return; //메서도 종료
            }

        }


        void withdraw ( int amount, int inputPin) {
            if (inputPin == pinNumber) {
                if (amount > 0) {
                    int charge = balance - amount;
                    balance -= amount;
                    System.out.println("출금성공! 현재잔액: " + balance);

                    if (charge >= 0) {
                    } else {
                        System.out.println(" 잔액이 부족합니다.");
                    }
                } else {
                    System.out.println("출금 불가입니다.");
                }
            }else {
                System.out.println("비밀번호가 틀렸습니다.");
                return;
                }

            }
        }
