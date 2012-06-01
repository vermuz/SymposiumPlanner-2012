package ws.prova.mule.impl;

import java.io.File;

import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		RuleML2ProvaTranslator translator = new RuleML2ProvaTranslator();
//		Document doc = null;
//		try {
//			doc = (Document) new SAXReader().read(new File("D:\\test.xml"));
//		} catch (DocumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			System.out.println(translator.doTransform(doc.asXML(), "UTF-8"));
//		} catch (TransformerException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		File xmlFile = new File("D:\\test.xml");
		File xsltFile = new File("D:\\rrml2prova.xsl");
		Source xmlSource = new StreamSource(xmlFile);
		Source xsltSource = new StreamSource(xsltFile);
		// the factory pattern supports different XSLT processors
		TransformerFactory transFact = TransformerFactory.newInstance();
		Transformer trans = null;
		try {
			trans = transFact.newTransformer(xsltSource);
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			trans.transform(xmlSource, new StreamResult(System.out));
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
