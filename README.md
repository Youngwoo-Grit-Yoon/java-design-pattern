# Java Design Pattern
## 참고 링크
https://refactoring.guru/ko/design-patterns/catalog  
https://youtube.com/playlist?list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&si=hyV8TM0lHuvnqsqA
## 공부 내용
### Abstract Factory - 생성 패턴
```text
public class AbstractFactory implements DesignPattern  {
    @Override
    public void run() {
        BankUserFactory bankUserFactory = new BankUserFactory();
        InsuranceUserFactory insuranceUserFactory = new InsuranceUserFactory();
        SecuritiesUserFactory securitiesUserFactory = new SecuritiesUserFactory();

        // 은행
        Agent bankAgent = bankUserFactory.createAgent();
        Client bankClient = bankUserFactory.createClient();

        // 보험
        Agent insuranceAgent = insuranceUserFactory.createAgent();
        Client insuranceClient = insuranceUserFactory.createClient();

        // 증권
        Agent securitiesAgent = securitiesUserFactory.createAgent();
        Client securitiesClient = securitiesUserFactory.createClient();
    }
}
```
### Factory Method - 생성 패턴
```text
public class FactoryMethod implements DesignPattern {
    @Override
    public void run() {
        AmazonConnectCreator amazonConnectCreator = new AmazonConnectCreator();
        SalesforceCreator salesforceCreator = new SalesforceCreator();
        ZendeskCreator zendeskCreator = new ZendeskCreator();

        CTI amazonConnectCTI = amazonConnectCreator.createCTI();
        amazonConnectCTI.makeCall();

        CTI salesforceCTI = salesforceCreator.createCTI();
        salesforceCTI.makeCall();

        CTI zendeskCTI = zendeskCreator.createCTI();
        zendeskCTI.makeCall();
    }
}
```
### Chain of Responsibility - 행동 패턴
```text
public class ChainOfResponsibility implements DesignPattern {
    @Override
    public void run() {
        Database database = new Database();

        Handler handler = new UserExistHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());

        AuthService service = new AuthService(handler);
        service.logIn("user_username", "user_password");
        service.logIn("admin_username", "admin_password");
        service.logIn("username", "password");
    }
}
```
### Adapter - 구조 패턴
```text
public class Adapter implements DesignPattern  {
    @Override
    public void run() {
        XmlData xmlData = new XmlData();

        // Old
        DatabaseStatistics databaseStatisticsApp = new DatabaseStatisticsApp();
        databaseStatisticsApp.showInboundCalls(xmlData);

        // New
        BoardStatisticsApp boardStatisticsApp = new BoardStatisticsApp();
        DatabaseStatistics boardStatisticsAppAdapter = new BoardStatisticsAppAdapter(boardStatisticsApp);
        boardStatisticsAppAdapter.showInboundCalls(xmlData);
    }
}
```
### Bridge - 구조 패턴
```text
public class Bridge implements DesignPattern {
    @Override
    public void run() {
        Company bank = new Bank();
        Company insurance = new Insurance();
        Company securities = new Securities();

        AlarmService email = new Email(bank);
        email.send();

        AlarmService push = new Push(insurance);
        push.send();

        AlarmService sms = new SMS(securities);
        sms.send();
    }
}
```