
#  Selenium Automation (Java + JUnit)

This project is created to practice **UI Test Automation** using **Selenium WebDriver** and **JUnit 5**, focusing on automating the login function on the Guru99 demo website.

---

## Features
- Selenium WebDriver  
- JUnit 5 (BeforeAll, AfterAll, ParameterizedTest)  
- Data-Driven Testing (MethodSource)  
- XPath & CSS Selector  
- Assertions for login validation  
- ChromeDriver setup or WebDriverManager support  

---

## Project Structure
```

src/
└── test/java/tiana/
├── DemoGuru99Test.java
└── DemoGuru99DDTTest.java

```

---

##  How to Run

### ** Install Maven dependencies**
```

mvn clean install

```

### ** Download ChromeDriver (if not using WebDriverManager)**  
Get the correct ChromeDriver version here:  
https://googlechromelabs.github.io/chrome-for-testing/

➜ Place `chromedriver.exe` in the project root folder.

### ** Run tests**
```

mvn test

```
or run directly from IntelliJ.


##  Author
**Nguyễn Thị Tú Anh** – Selenium Automation Practice
```


