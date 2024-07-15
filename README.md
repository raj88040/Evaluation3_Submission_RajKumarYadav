Project title - Beeceptor Posthook API Testing
Your name - Raj Kumar Yadav
Prerequisites-
Tool - 1)Postman
       2)STS
Description - 
Open Postman and create a new workspace by clicking on your workspace name in the top-left corner and selecting "Create Workspace".
then crete Collection and Create an environment And Perform All Request(PUT, PATCH, DELETE, GET, POST)


STS- Open STS and cteate maven Project then create Pacage in Java test and then Create class in Pakage and Add Dependencies.
And Perform All Request(PUT, PATCH, DELETE, GET, POST)

Dependencies - 
<!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>4.5.1</version>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.7.1</version>
    <scope>test</scope>
</dependency>
<!-- https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple -->
<dependency>
    <groupId>com.googlecode.json-simple</groupId>
    <artifactId>json-simple</artifactId>
    <version>1.1.1</version>
</dependency>
<dependency>
    <groupId>org.jsoup</groupId>
    <artifactId>jsoup</artifactId>
    <version>1.14.3</version>
</dependency>
<dependency>
   <groupId>io.rest-assured</groupId>
   <artifactId>json-path</artifactId>
   <version>4.5.1</version>
   </dependency>
<dependency>
   <groupId>io.rest-assured</groupId>
   <artifactId>xml-path</artifactId>
   <version>4.5.1</version>
   </dependency>
<dependency>
   <groupId>io.rest-assured</groupId>
   <artifactId>json-schema-validator</artifactId>
   <version>4.5.1</version>
   </dependency>

