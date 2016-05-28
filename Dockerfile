FROM tomcat:8.0-jre8

COPY * /usr/local/tomcat/webapps/

EXPOSE 8080
CMD ["catalina.sh", "run"]



