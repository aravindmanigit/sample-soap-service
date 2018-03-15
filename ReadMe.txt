As of now in Eclipse, Glassfish 5 is not supported when we add a new server.

Glassfish4 and Eclipse Cannot bridge runtimes -> for this problem You need to add GlassFish 
into your runtime first before you create GlassFish server, 
go eclipse window menu -> window ->  preference -> server -> RunTime Environments and add 
GlassFish by giving the values of path of glassfish installed path and importantly the location of JDK 
and not JRE

When using JDK1.8 in Glassfish, there may be a possibility of getting the below error

java.lang.AssertionError: org.xml.sax.SAXParseException; systemId: jar:file:/path/to/glassfish/modules/jaxb-osgi.jar!/com/sun/tools/xjc/reader/xmlschema/bindinfo/binding.xsd; lineNumber: 52; columnNumber: 88; schema_reference: Failed to read schema document 'xjc.xsd', because 'file' access is not allowed due to restriction set by the accessExternalSchema property.

For this problem the solution is,

Create a file named jaxp.properties (if it doesn't exist) under /path/to/jdk1.8.0/jre/lib and then write this line in it:

javax.xml.accessExternalSchema = all