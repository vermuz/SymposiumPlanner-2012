@echo off

IF dummy==dummy%1 (
set /p ip="Enter the IP that will be hosting the servlet: " 
) ELSE (
set ip=%1
)
IF dummy==dummy%2 (
set /p useCase="Enter the name of the Use Case (ie WellnessRules2):" 
) ELSE (
set useCase=%2
)
IF dummy==dummy%3 (
set /p paName="Enter the name of the servlet (ie WellnessRules2Running): "
) ELSE (
set paName=%3
)
IF dummy==dummy%4 (
set /p authorName="Authors name: "  
) ELSE (
set authorName=%4
)

md PAServlets\%paName%
md PAServlets\%paName%\META-INF
md PAServlets\%paName%\WEB-INF
md PAServlets\%paName%\WEB-INF\lib
md PAServlets\%paName%\WEB-INF\classes
md PAServlets\%paName%\WEB-INF\classes\pa_Configuration
md PAServlets\%paName%\WEB-INF\classes\pa_%useCase%

set manifest_loc=PAServlets\%paName%\META-INF\MANIFEST.MF
set web_loc=PAServlets\%paName%\WEB-INF\web.xml
set config_loc=PAServlets\%paName%\WEB-INF\config.xml

echo Manifest-Version: 1.0 > %manifest_loc%
echo Ant-Version: Apache Ant 1.6.5 >> %manifest_loc%
echo Created-By: 1.5.0_06-b05 (Sun Microsystems Inc.) >> %manifest_loc%
echo Built-By: %authorName% >> %manifest_loc%
echo Main-class: %paName%.class >> %manifest_loc%

echo ^<sign^> >> %config_loc%
echo ^<url^>%ip%^</url^> >> %config_loc%
echo ^<context^>%paName%^</context^> >> %config_loc%
echo ^<delay^>5000^</delay^> >> %config_loc%
echo ^<log^>yes^</log^> >> %config_loc%
echo ^</sign^> >> %config_loc%

echo ^<?xml version="1.0" encoding="ISO-8859-1"?^> > %web_loc%
echo ^<!DOCTYPE web-app >> %web_loc%
echo PUBLIC "-//Sun Microsystems, Inc.//DTD Web Application 2.2//EN" >> %web_loc%
echo "http://java.sun.com/j2ee/dtds/web-app_2_2.dtd"^> >> %web_loc%
echo ^<web-app^> >> %web_loc%
echo ^<display-name^>%paName%^</display-name^> >> %web_loc%
echo ^<description^>Takes incoming messages and excutes queries^</description^> >> %web_loc%
echo ^<servlet^> >> %web_loc%
echo ^<servlet-name^>%paName%^</servlet-name^> >> %web_loc%
echo ^<servlet-class^>pa_%useCase%.%paName%^</servlet-class^> >> %web_loc%
echo ^</servlet^> >> %web_loc%
echo ^<servlet-mapping^> >> %web_loc%
echo ^<servlet-name^>%paName%^</servlet-name^> >> %web_loc%
echo ^<url-pattern^>/^</url-pattern^> >> %web_loc%
echo ^</servlet-mapping^> >> %web_loc%
echo ^</web-app^> >> %web_loc%

xcopy "target\classes\lib" "PAServlets\%paName%\WEB-INF\lib"
xcopy "target\classes\pa_Configuration" "PAServlets\%paName%\WEB-INF\classes\pa_Configuration"
xcopy "target\classes\pa_%useCase%" "PAServlets\%paName%\WEB-INF\classes\pa_%useCase%"