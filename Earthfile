build:
  FROM maven:3.8.3-jdk-11-slim
  WORKDIR /repo

  COPY ./pom.xml pom.xml
  RUN mvn dependency:resolve

  COPY ./src/ src/
  RUN mvn clean package
  
  SAVE ARTIFACT /repo/target/keycloak-rest-provider-1.0-SNAPSHOT.jar /keycloak-rest-provider-1.0.jar
  SAVE ARTIFACT /repo/target AS LOCAL ./earthly-output


k8s:
 LOCALLY
 RUN kubectl create cm kc-rest-provider --from-file=keycloak-rest-provider-1.0-SNAPSHOT.jar=./earthly-output/keycloak-rest-provider-1.0-SNAPSHOT.jar -o yaml --dry-run=client | kubectl -n tools replace -f -
