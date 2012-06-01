@set CONFIG_HOME=.
@set PROVA_HOME=.
@set PROVA_LIBS=%PROVA_HOME%/lib

@set OLD_CLASSPATH=%CLASSPATH%

:: Building the Classpath
@set  OLD_CLASSPATH=$CLASSPATH
@set CLASSPATH=%CLASSPATH%/rules;
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/activation.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/activecluster.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/activeio.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/activemq-core.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/ant.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/antlr-runtime.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/antlr.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/aopalliance.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/arq-extra.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/arq.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/asm-commons.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/asm-tree.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/asm.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/aspectjrt.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/aterm.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/axion.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/axis.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/backport-util-concurrent.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/base64.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cglib-full.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cglib-nodep.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/classworlds.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.antlr.runtime.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.activemq-5.1.0.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.commons.beanutils.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.commons.collections.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.commons.lang.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.commons.logging.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.org.apache.log4j.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.slf4j.api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/com.springsource.slf4j.log4j.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-attributes-api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-beanutils.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-cli.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-codec.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-collections.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-dbcp.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-digester.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-discovery.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-httpclient.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-io.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-jxpath.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-lang.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-logging.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-pool.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/commons-primitives.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/concurrent.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/core.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cxf-api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cxf-common-schemas.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cxf-common-utilities.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cxf-rt-bindings-soap.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cxf-rt-bindings-xml.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cxf-rt-core.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cxf-rt-databinding-aegis.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cxf-rt-databinding-jaxb.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cxf-rt-frontend-jaxws.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cxf-rt-frontend-simple.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cxf-rt-transports-local.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cxf-rt-ws-addr.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cxf-rt-ws-security.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/cxf-tools-common.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/derby.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/dom4j.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/FastInfoset.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/gdata-calendar-1.0.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/gdata-calendar.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/gdata-client-1.0.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/gdata-client.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/geronimo-annotation_1.0_spec.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/geronimo-ejb_2.1_spec.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/geronimo-j2ee-connector_1.5_spec.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/geronimo-j2ee-management_1.0_spec.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/geronimo-jaxrpc_1.1_spec.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/geronimo-jms_1.1_spec.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/geronimo-jta_1.0.1B_spec.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/geronimo-stax-api_1.0_spec.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/geronimo-ws-metadata_2.0_spec.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/howl-logger.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/hsqldb.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/http.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/icu4j.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/iri.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jade.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jadetools.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jakarta-regexp.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/javacc.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jaxb-api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jaxb-impl.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jaxb-xjc.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jaxen.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jaxp-api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jaxws-api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jcl-over-slf4j.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jcommon.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jdepend.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jdom.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jena.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jetty-util.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jetty.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jfreechart.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jmock-cglib.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jmock.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/joda-time.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jsr250-api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/jug-asl.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/junit.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/junitperf.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/log4j.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/lucene-core.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mail.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-artifact-manager.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-artifact.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-compiler-plugin.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-core.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-error-diagnostics.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-model.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-monitor.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-plugin-api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-plugin-descriptor.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-plugin-parameter-documenter.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-plugin-registry.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-profile.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-project.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-repository-metadata.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-settings.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/maven-toolchain.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-core-tests.test-jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-core.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-module-annotations.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-module-boot.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-module-builders.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-module-client.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-module-cxf.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-module-management.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-module-spring-config.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-module-spring-extras.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-module-spring-security.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-module-xml.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-tests-functional.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-transport-axis.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-transport-http.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-transport-jms.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-transport-servlet.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-transport-soap.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-transport-ssl.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-transport-tcp.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-transport-vm.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mule-transport-xfire.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mx4j-impl.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mx4j-jmx.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mx4j-remote.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mx4j-tools.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/mysql-connector-java.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/neethi.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/pellet.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/plexus-compiler-api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/plexus-compiler-manager.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/plexus-container-default.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/plexus-utils.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/rdf-api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/regexp.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/relaxngDatatype.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/saaj-api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/saaj-impl.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/saxon-dom.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/saxon-xqj.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/saxon.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/slf4j-api-1.6.1.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/slf4j-log4j12-1.6.1.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/sparql-0.1-SNAPSHOT.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/smack.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/smackx.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/spring-aop.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/spring-asm.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/spring-beans.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/spring-context.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/spring-core.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/spring-expression.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/spring-jdbc.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/spring-jms.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/spring-security-core.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/spring-tx.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/spring-web.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/spring.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/stax-api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/stax-utils.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/stax.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/stringtemplate.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/symposiumplannersystem-1.0-SNAPSHOT.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/tomcat-apr.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/tomcat-util.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/wagon-provider-api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/wrapper.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/ws.prova.compact-3.1.3.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/wsdl4j.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/wss4j.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/wstx-asl.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xalan.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xbean.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xbean_xpath.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xercesImpl.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xfire-aegis.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xfire-annotations.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xfire-core.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xfire-java5.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xfire-jsr181-api.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xml-apis.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xml-resolver.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xmlpublic.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/XmlSchema.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xmlsec.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xpp3_min.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xsdlib.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/xstream.jar
@set CLASSPATH=%CLASSPATH%;%PROVA_LIBS%/yjp-controller-api-redist.jar

ECHO (make sure you have configured your HTTP proxy if behind a firewall)
ECHO (Starting Rule Responder)
java -Xms512m -Xmx512m -XX:NewSize=256m -XX:MaxNewSize=256m ws.prova.mule.impl.ESBManager start mule-all-config.xml