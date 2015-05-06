rd /s /q "D:\Program Files (x86)\apache-tomcat-7.0.57\webapps\oms-tasly-ext-web"
del /q "D:\Program Files (x86)\apache-tomcat-7.0.57\webapps\oms-tasly-ext-web.war"
copy oms-tasly-ext-web\target\oms-tasly-ext-web-1.0-SNAPSHOT.war "D:\Program Files (x86)\apache-tomcat-7.0.57\webapps\oms-tasly-ext-web.war"