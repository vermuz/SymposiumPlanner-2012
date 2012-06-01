package ws.prova.mule.impl.symposiumplannersystem;

import org.junit.Test;

import de.fub.csw.sparql.ProvaSparqlSelectPlugin;

import ws.prova.api2.ProvaCommunicatorImpl;
import ws.prova.plugin.registry.ProvaPluginRegistry;
import ws.prova.plugin.registry.impl.ProvaPluginRegistryImpl;

public class ProvaBuiltins1Test {

	static final String kAgent = "prova";

	static final String kPort = null;
	
	@Test
	public void sparql() throws InterruptedException {
		ProvaPluginRegistry ppr = new ProvaPluginRegistryImpl();
		ppr.registerPlugin(new ProvaSparqlSelectPlugin());
		try{
			System.out.println(System.getProperty("user.dir"));
		final String rulebase = "rules/ContractLog/sparql.prova";
		new ProvaCommunicatorImpl(kAgent,kPort,rulebase,ProvaCommunicatorImpl.SYNC);
		}catch(Exception e){
			e.printStackTrace();
		}
	}


}
