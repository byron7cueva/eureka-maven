mvn clean compile 

clean org.jacoco:jacoco-maven-plugin:prepare-agent install

mvn compile sonar:sonar -Dsonar.password= -Dsonar.login=squ_43d9c7ce8d34a4c02d52ced33f767b8aa1608b9d