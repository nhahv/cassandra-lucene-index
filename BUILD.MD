### vietnamese_analyzer/pom.xml
```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>vn.tick</groupId>
    <artifactId>vietnamese_analyzer</artifactId>
    <version>1.0-SNAPSHOT</version>
    <modules>
        <module>VnCoreNLP</module>
    </modules>
    <dependencies>
        <dependency>
            <groupId>VnCoreNLP</groupId>
            <artifactId>VnCoreNLP</artifactId>
            <version>1.1.2</version>
        </dependency>
    </dependencies>
</project>
```
- [ ] Update VnCoreNLP-VnCoreNLP-1.1.2 dependency version to match with module
- [ ] Set project artifact version

### plugin\pom.xml
- [ ] Update maven-antrun-plugin version to match