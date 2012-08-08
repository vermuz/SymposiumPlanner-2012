package pa_Configuration;

public class PAConfiguration {
	private final static String mule = "http://localhost";
	private final static String operatingSystem = "Linux"; //Windows or Linux. Effects the path input of Euler in N3Messge/N3Handler
	private final static String n3WeatherRepository = "http://ruleml.org/WellnessRules2/resources/OA/WeatherUpdater.n3";
	private final static String poslWeatherRepository = "http://ruleml.org/WellnessRules2/resources/OA/WeatherUpdater.posl";
	
	//PatientSupporter
	private final static String patientSupporter_Port = "9994";
	private final static String patientSupporter_globalPOSL = "http://ruleml.org/PatientSupporter/resources/OA/PS-Global.posl";
	private final static String patientSupporter_globalN3 = "http://ruleml.org/PatientSupporter/resources/OA/PS-Global.n3";
	private final static String patientSupporter_RDFTaxonomy = "http://ruleml.org/PatientSupporter/resources/OA/PS-Taxonomy.rdf";
	private final static String patientSupporter_PRM = "http://ruleml.org/PatientSupporter/resources/PA/config.xml";
	private final static String patientSupporter_paRepository = "http://ruleml.org/PatientSupporter/resources/PA/"; //The root of the PA Repository. Final '/' needed
	private final static String patientSupporter_n3Namespace = "http://www.ruleml.org/PatientSupporter#"; //Must match the N3 KB's Namespace
	
	//PatientSupporter-Topics
	private final static String patientSupporter_ShoulderEndpoint = "patientSupporter_Shoulder";
	private final static String patientSupporter_LegEndpoint = "patientSupporter_Leg";
	private final static String patientSupporter_ArmEndpoint = "patientSupporter_Arm";
	private final static String patientSupporter_BackEndpoint = "patientSupporter_Back";
	private final static String patientSupporter_HeadEndpoint = "patientSupporter_Head";
	private final static String patientSupporter_NeckEndpoint = "patientSupporter_Neck";
	private final static String patientSupporter_TorsoEndpoint = "patientSupporter_Torso";
	
	//WellnessRules2
	private final static String wellnessRules2_Port = "9999";
	private final static String wellnessRules2_globalPOSL = "http://ruleml.org/WellnessRules2/resources/OA/WR-Global.posl";
	private final static String wellnessRules2_globalN3 = "http://ruleml.org/WellnessRules2/resources/OA/WR-Global.n3";
	private final static String wellnessRules2_RDFTaxonomy = "http://ruleml.org/WellnessRules2/resources/OA/WR-Taxonomy.rdf";
	private final static String wellnessRules2_PRM = "http://ruleml.org/WellnessRules2/resources/PA/config.xml";
	private final static String wellnessRules2_paRepository = "http://www.ruleml.org/WellnessRules2/resources/PA/"; //The root of the PA Repository. Final '/' needed
	private final static String wellnessRules2_n3Namespace = "http://www.ruleml.org/WellnessRules2#"; //Must match the N3 KB's Namespace
	//WellnessRules2-Topics
	private final static String wellnessRules2_WalkingEndpoint = "wellnessRules2_Walking";
	private final static String wellnessRules2_RunningEndpoint = "wellnessRules2_Running";
	private final static String wellnessRules2_SwimmingEndpoint = "wellnessRules2_Swimming";
	private final static String wellnessRules2_SkatingEndpoint = "wellnessRules2_Skating";
	private final static String wellnessRules2_YogaEndpoint = "wellnessRules2_Yoga";
	private final static String wellnessRules2_HikingEndpoint = "wellnessRules2_Hiking";
	private final static String wellnessRules2_BaseballEndpoint = "wellnessRules2_Baseball";
	//WellnessRules
	private final static String wellnessRules_Port = "9995";
	private final static String wellnessRules_globalPOSL = "http://ruleml.org/WellnessRules/PA/WR-Global.posl";
	private final static String wellnessRules_globalN3 = "http://ruleml.org/WellnessRules/PA/WR-Global.n3";
	private final static String wellnessRules_RDFTaxonomy = "http://ruleml.org/WellnessRules/PA/WR-Taxonomy.rdf";
	private final static String wellnessRules_PRM = "http://ruleml.org/WellnessRules/PA/config.xml";
	private final static String wellnessRules_paRepository = "http://www.ruleml.org/WellnessRules/PA/"; //The root of the PA Repository. Final '/' needed
	private final static String wellnessRules_n3Namespace = "http://www.ruleml.org/WellnessRules#"; //Must match the N3 KB's Namespace
	//WellnessRules-Topics
	private final static String wellnessRules_WalkingEndpoint = "wellnessRules_Walking";
	private final static String wellnessRules_RunningEndpoint = "wellnessRules_Running";
	private final static String wellnessRules_SwimmingEndpoint = "wellnessRules_Swimming";
	private final static String wellnessRules_SkatingEndpoint = "wellnessRules_Skating";
	private final static String wellnessRules_YogaEndpoint = "wellnessRules_Yoga";
	private final static String wellnessRules_HikingEndpoint = "wellnessRules_Hiking";
	private final static String wellnessRules_BaseballEndpoint = "wellnessRules_Baseball";
	//SymposiumPlanner10
	private final static String symposiumPlanner10_Port = "9993";
	private final static String symposiumPlanner10_RDFTaxonomy = "http://www.jdrew.org/oojdrew/ruleSetsRuleML-2009/publicityChairOntologyRuleML-2009.rdf";
	//SymposiumPlanner10-Topics
	private final static String symposiumPlanner10_GeneralChairEndpoint = "ruleml2010_GeneralChair";
	private final static String symposiumPlanner10_GeneralChairPOSL = "http://ruleml.org/RuleML-2010/RuleResponder/ruleSetsRuleML-2010/generalChairRuleML-2010.posl";
	private final static String symposiumPlanner10_LiaisonChairEndpoint = "ruleml2010_LiaisonChair";
	private final static String symposiumPlanner10_LiaisonChairPOSL = "http://ruleml.org/RuleML-2010/RuleResponder/ruleSetsRuleML-2010/liaisonChairRuleML-2010.posl";
	private final static String symposiumPlanner10_PanelChairEndpoint = "ruleml2010_PanelChair";
	//TODO: Fix this missing link
	private final static String symposiumPlanner10_PanelChairPOSL = "http://155.207.113.24:8080/ruleSetsRuleML-2010/panelChairRuleML-2010.posl";
	private final static String symposiumPlanner10_ProgramChairEndpoint = "ruleml2010_ProgramChair";
	private final static String symposiumPlanner10_ProgramChairPOSL = "http://ruleml.org/RuleML-2010/RuleResponder/ruleSetsRuleML-2010/programChairRuleML-2010.posl";
	private final static String symposiumPlanner10_PublicityChairEndpoint = "ruleml2010_PublicityChair";
	private final static String symposiumPlanner10_PublicityChairPOSL = "http://ruleml.org/RuleML-2010/RuleResponder/ruleSetsRuleML-2010/publicityChairRuleML-2010.posl";
	private final static String symposiumPlanner10_RRChairEndpoint = "ruleml2010_RRChair";
	private final static String symposiumPlanner10_RRChairPOSL = "http://ruleml.org/RuleML-2010/RuleResponder/ruleSetsRuleML-2010/rrChairRuleML-2010.posl";
	
	//SymposiumPlanner09
	private final static String symposiumPlanner09_Port = "9996";
	private final static String symposiumPlanner09_RDFTaxonomy = "http://www.jdrew.org/oojdrew/ruleSetsRuleML-2009/publicityChairOntologyRuleML-2009.rdf";
	//SymposiumPlanner09-Topics
	private final static String symposiumPlanner09_PublicityChairEndpoint = "ruleml2009_PublicityChair";
	private final static String symposiumPlanner09_PublicityChairPOSL = "http://www.jdrew.org/oojdrew/ruleSetsRuleML-2009/publicityChairRuleML-2009.posl";
	private final static String symposiumPlanner09_ProgramChairEndpoint = "ruleml2009_ProgramChair";
	private final static String symposiumPlanner09_ProgramChairPOSL = "http://www.jdrew.org/oojdrew/ruleSetsRuleML-2009/programChairRuleML-2009.posl";
	private final static String symposiumPlanner09_PanelChairEndpoint = "ruleml2009_PanelChair";
	private final static String symposiumPlanner09_PanelChairPOSL = "http://www.jdrew.org/oojdrew/ruleSetsRuleML-2009/panelChairRuleML-2009.posl";
	private final static String symposiumPlanner09_LiaisonChairEndpoint = "ruleml2009_LiaisonChair";
	private final static String symposiumPlanner09_LiaisonChairPOSL = "http://www.jdrew.org/oojdrew/ruleSetsRuleML-2009/liaisonChairRuleML-2009.posl";
	private final static String symposiumPlanner09_GeneralChairEndpoint = "ruleml2009_GeneralChair";
	private final static String symposiumPlanner09_GeneralChairPOSL = "http://www.jdrew.org/oojdrew/ruleSetsRuleML-2009/generalChairRuleML-2009.posl";
	
	
	private final static String RULEML2011BRF_DataPath = "http://localhost:8080/RuleML-2011-BRF/";
	//SymposiumPlanner10
	private final static String ruleml2011brf_Port = "";
	private final static String ruleml2011brf_RDFTaxonomy = RULEML2011BRF_DataPath+"publicityChairOntologyBRF-2011.rdf";
	//SymposiumPlanner10-Topics
	private final static String ruleml2011brf_GeneralChairEndpoint = "ruleml2011ATbrf_GeneralChair";
	private final static String ruleml2011brf_GeneralChairPOSL = RULEML2011BRF_DataPath+"generalChairBRF-2011.posl";
	private final static String ruleml2011brf_LiaisonChairEndpoint = "ruleml2011ATbrf_LiaisonChair";
	private final static String ruleml2011brf_LiaisonChairPOSL = RULEML2011BRF_DataPath+"liaisonChairBRF-2011.posl";
	private final static String ruleml2011brf_PanelChairEndpoint = "ruleml2011ATbrf_PanelChair";
	//TODO: Fix this missing link
	private final static String ruleml2011brf_PanelChairPOSL = RULEML2011BRF_DataPath+"panelChairBRF-2011.posl";
	private final static String ruleml2011brf_ProgramChairEndpoint = "ruleml2011ATbrf_ProgramChair";
	private final static String ruleml2011brf_ProgramChairPOSL = RULEML2011BRF_DataPath+"programChairBRF-2011.posl";
	private final static String ruleml2011brf_PublicityChairEndpoint = "ruleml2011ATbrf_PublicityChair";
	private final static String ruleml2011brf_PublicityChairPOSL = RULEML2011BRF_DataPath+"publicityChairBRF-2011.posl";
	private final static String ruleml2011brf_RRChairEndpoint = "ruleml2011ATbrf_RRChair";
	private final static String ruleml2011brf_RRChairPOSL = RULEML2011BRF_DataPath+"rrChairBRF-2011.posl";
	
	private final static String RULEML2011IJCAI_DataPath = "http://localhost:8080/RuleML-2011-IJCAI/";
	//ruleml2011ijcai
	private final static String ruleml2011ijcai_Port = "";
	private final static String ruleml2011ijcai_RDFTaxonomy = RULEML2011IJCAI_DataPath+"publicityChairOntologyIJCAI-2011.rdf";
	//ruleml2011ijcai-Topics
	private final static String ruleml2011ijcai_PublicityChairEndpoint = "ruleml2011ATijcai_PublicityChair";
	private final static String ruleml2011ijcai_PublicityChairPOSL = RULEML2011IJCAI_DataPath+"publicityChairIJCAI-2011.posl";
	private final static String ruleml2011ijcai_ProgramChairEndpoint = "ruleml2011ATijcai_ProgramChair";
	private final static String ruleml2011ijcai_ProgramChairPOSL = RULEML2011IJCAI_DataPath+"programChairIJCAI-2011.posl";
	private final static String ruleml2011ijcai_PanelChairEndpoint = "ruleml2011ATijcai_PanelChair";
	private final static String ruleml2011ijcai_PanelChairPOSL = RULEML2011IJCAI_DataPath+"panelChairIJCAI-2011.posl";
	private final static String ruleml2011ijcai_LiaisonChairEndpoint = "ruleml2011ATijcai_LiaisonChair";
	private final static String ruleml2011ijcai_LiaisonChairPOSL = RULEML2011IJCAI_DataPath+"liaisonChairIJCAI-2011.posl";
	private final static String ruleml2011ijcai_GeneralChairEndpoint = "ruleml2011ATijcai_GeneralChair";
	private final static String ruleml2011ijcai_GeneralChairPOSL = RULEML2011IJCAI_DataPath+"generalChairIJCAI-2011.posl";
	
	
	//RuleML2012ECAI
	private final static String ruleml2012ecai_Port = "9998";
	private final static String RULEML2012ECAI_DataPath = "http://localhost:8080/RuleML-2012-ECAI/";
	private final static String ruleml2012ecai_RDFTaxonomy = RULEML2012ECAI_DataPath+"publicityChairOntologyECAI-2012.rdf";
	private final static String ruleml2012ecai_PublicityChairEndpoint = "ruleml2012ATecai_PublicityChair";
	private final static String ruleml2012ecai_PublicityChairPOSL = RULEML2012ECAI_DataPath+"publicityChairECAI-2012.posl";
	private final static String ruleml2012ecai_ProgramChairEndpoint = "ruleml2012ATecai_ProgramChair";
	private final static String ruleml2012ecai_ProgramChairPOSL = RULEML2012ECAI_DataPath+"programChairECAI-2012.posl";
	private final static String ruleml2012ecai_PanelChairEndpoint = "ruleml2012ATecai_PanelChair";
	private final static String ruleml2012ecai_PanelChairPOSL = RULEML2012ECAI_DataPath+"panelChairECAI-2012.posl";
	private final static String ruleml2012ecai_LiaisonChairEndpoint = "ruleml2012ATecai_LiaisonChair";
	private final static String ruleml2012ecai_LiaisonChairPOSL = RULEML2012ECAI_DataPath+"liaisonChairECAI-2012.posl";
	private final static String ruleml2012ecai_GeneralChairEndpoint = "ruleml2012ATecai_GeneralChair";
	private final static String ruleml2012ecai_GeneralChairPOSL = RULEML2012ECAI_DataPath+"generalChairECAI-2012.posl";
	
	//New PAs
	private final static String ruleml2012ecai_DocSymposiumChairEndpoint = "ruleml2012ATecai_DocSymposiumChair";
	private final static String ruleml2012ecai_DocSymposiumChairPOSL = RULEML2012ECAI_DataPath+"DocSymposiumChairECAI-2012.posl";
	private final static String ruleml2012ecai_localChairEndpoint = "ruleml2012ATecai_localChair";
	private final static String ruleml2012ecai_localChairPOSL = RULEML2012ECAI_DataPath+"localChairECAI-2012.posl";
	private final static String ruleml2012ecai_metadataAndSocialChairEndpoint = "ruleml2012ATecai_metadataAndSocialChair";
	private final static String ruleml2012ecai_metadataAndSocialChairPOSL = RULEML2012ECAI_DataPath+"metadataAndSocialChairECAI-2012.posl";
	private final static String ruleml2012ecai_steeringChairEndpoint = "ruleml2012ATecai_steeringChair";
	private final static String ruleml2012ecai_steeringChairPOSL = RULEML2012ECAI_DataPath+"steeringChairECAI-2012.posl";
	private final static String ruleml2012ecai_IntlRuleSteeringChairEndpoint = "ruleml2012ATecai_IntlRulesteeringChair";
	private final static String ruleml2012ecai_IntlRuleSteeringChairPOSL = RULEML2012ECAI_DataPath+"IntlRulesteeringChairECAI-2012.posl";
	private final static String ruleml2012ecai_IntlRuleChalChairEndpoint = "ruleml2012ATecai_IntlRuleChalChair";
	private final static String ruleml2012ecai_IntlRuleChalChairPOSL = RULEML2012ECAI_DataPath+"IntlRuleChalChairECAI-2012.posl";
	
	
	//RuleML-Structure
	private final static String ruleml2012struct_Port = "9993";
	private final static String ruleml2012struct_DataPath = "http://localhost:8080/RuleML-2012-STRUCT/";
	private final static String rulemlstruct_RDFTaxonomy = ruleml2012struct_DataPath+"TGAgentOntologySTRUCT-2012.rdf";
	
	//*/*****************/*//*/*//*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/
	private final static String ruleml2012struct_TGAgentEndpoint = "ruleml2012ATstruct_TGAgent";
	private final static String ruleml2012struct_TGAgentPOSL = ruleml2012struct_DataPath+"RuleMLStructTGAgent.posl";
	//********************************************************************************************************************
	private final static String ruleml2012struct_AdvisoryBoardEndpoint = "ruleml2012ATstruct_AdvisoryBoard";
	private final static String ruleml2012struct_AdvisoryBoardPOSL = ruleml2012struct_DataPath+"RuleMLStructAdvisoryBoard.posl";
	private final static String ruleml2012struct_CEIEndpoint = "ruleml2012ATstruct_CEI";
	private final static String ruleml2012struct_CEIPOSL = ruleml2012struct_DataPath+"RuleMLStructCEI.posl";
	private final static String ruleml2012struct_CoChairsEndpoint = "ruleml2012ATstruct_CoChairs";
	private final static String ruleml2012struct_CoChairsBoardPOSL = ruleml2012struct_DataPath+"RuleMLStructCoChairs.posl";
	private final static String ruleml2012struct_DefeasibleLogicEndpoint = "ruleml2012ATstruct_DefeasibleLogic";
	private final static String ruleml2012struct_DefeasibleLogicPOSL = ruleml2012struct_DataPath+"RuleMLStructDefeasibleLogic.posl";
	private final static String ruleml2012struct_MASEndpoint = "ruleml2012ATstruct_MAS";
	private final static String ruleml2012struct_MASPOSL = ruleml2012struct_DataPath+"RuleMLStructMAS.posl";
	private final static String ruleml2012struct_ModalLogicEndpoint = "ruleml2012ATstruct_ModalLogic";
	private final static String ruleml2012struct_ModalLogicPOSL = ruleml2012struct_DataPath+"RuleMLStructModalLogic.posl";
	private final static String ruleml2012struct_PSOAEndpoint = "ruleml2012ATstruct_PSOA";
	private final static String ruleml2012struct_PSOAPOSL = ruleml2012struct_DataPath+"RuleMLStructPSOA.posl";
	private final static String ruleml2012struct_ReactionRulesEndpoint = "ruleml2012ATstruct_ReactionRules";
	private final static String ruleml2012struct_ReactionRulesPOSL = ruleml2012struct_DataPath+"RuleMLStructReactionRules.posl";
	private final static String ruleml2012struct_SteeringCommitteeEndpoint = "ruleml2012ATstruct_SteeringCommittee";
	private final static String ruleml2012struct_SteeringCommitteePOSL = ruleml2012struct_DataPath+"RuleMLStructSteeringCommittee.posl";
	private final static String ruleml2012struct_UnCertReasonEndpoint = "ruleml2012ATstruct_UnCertReason";
	private final static String ruleml2012struct_UnCertReasonPOSL = ruleml2012struct_DataPath+"RuleMLStructUnCertReason.posl";
	
		
	//RULEML Organisation
	
	//private final static String ruleml2012ecai_Port = "";
	//private final static String RULEML2012ECAI_DataPath = "http://localhost:8080/RuleML-2012-ECAI/";
	//private final static String ruleml2012ecai_RDFTaxonomy = RULEML2012ECAI_DataPath+"publicityChairOntologyECAI-2012.rdf";
	//private final static String ruleml2012ecai_PublicityChairEndpoint = "ruleml2012ATecai_PublicityChair";
	//private final static String ruleml2012ecai_PublicityChairPOSL = RULEML2012ECAI_DataPath+"publicityChairECAI-2012.posl";
	//private final static String ruleml2012ecai_ProgramChairEndpoint = "ruleml2012ATecai_ProgramChair";
	//private final static String ruleml2012ecai_ProgramChairPOSL = RULEML2012ECAI_DataPath+"programChairECAI-2012.posl";
	//private final static String ruleml2012ecai_PanelChairEndpoint = "ruleml2012ATecai_PanelChair";
	//private final static String ruleml2012ecai_PanelChairPOSL = RULEML2012ECAI_DataPath+"panelChairECAI-2012.posl";
	//private final static String ruleml2012ecai_LiaisonChairEndpoint = "ruleml2012ATecai_LiaisonChair";
	//private final static String ruleml2012ecai_LiaisonChairPOSL = RULEML2012ECAI_DataPath+"liaisonChairECAI-2012.posl";
	//private final static String ruleml2012ecai_GeneralChairEndpoint = "ruleml2012ATecai_GeneralChair";
	//private final static String ruleml2012ecai_GeneralChairPOSL = RULEML2012ECAI_DataPath+"generalChairECAI-2012.posl";
	
	
	//SymposiumPlanner08
	private final static String symposiumPlanner08_Port = "9997";
	private final static String symposiumPlanner08_RDFTaxonomy = "http://www.jdrew.org/oojdrew/ruleSetsRuleML-2008/publicityChairOntologyRuleML-2008.rdf";
	//SymposiumPlanner09-Topics
	private final static String symposiumPlanner08_WebChairEndpoint = "ruleml2008_WebChair";
	private final static String symposiumPlanner08_WebChairPOSL = "http://www.jdrew.org/oojdrew/ruleSetsRuleML-2008/webChairRuleML-2008.posl";
	private final static String symposiumPlanner08_PublicityChairEndpoint = "ruleml2008_PublicityChair";
	private final static String symposiumPlanner08_PublicityChairPOSL = "http://www.jdrew.org/oojdrew/ruleSetsRuleML-2008/publicityChairRuleML-2008.posl";
	private final static String symposiumPlanner08_LiaisonChairEndpoint = "ruleml2008_LiaisonChair";
	private final static String symposiumPlanner08_LiaisonChairPOSL = "http://www.jdrew.org/oojdrew/ruleSetsRuleML-2008/liaisonChairRuleML-2008.posl";
	private final static String symposiumPlanner08_GeneralChairEndpoint = "ruleml2008_GeneralChair";
	private final static String symposiumPlanner08_GeneralChairPOSL = "http://www.jdrew.org/oojdrew/ruleSetsRuleML-2008/generalChairRuleML-2008.posl";
	private final static String symposiumPlanner08_ChallengeChairEndpoint = "ruleml2008_ChallengeChair";
	private final static String symposiumPlanner08_ChallengeChairPOSL = "http://www.jdrew.org/oojdrew/ruleSetsRuleML-2008/challengeChairRuleML-2008.posl";
	private final static String symposiumPlanner08_PanelChairEndpoint = "ruleml2008_PanelChair";
	private final static String symposiumPlanner08_PanelChairPOSL = "http://www.jdrew.org/oojdrew/ruleSetsRuleML-2008/panelChairRuleML-2008.posl";
	//WeatherUpdater
	private final static String city = "Fredericton";
	private final static String province = "NB";
	private final static long weatherUpdaterTime = 21600000; //ms per update
	private final static String weatherURL = "http://www.google.com/ig/api?weather=";
	private final static String language = "&hl=en"; //English
	//PA GLOBAL
	public static String getAddress()  {
		return mule;
	}
	public static String getOperatingSystem() {
		return operatingSystem;
	}
	public static String getPOSLWeatherRepository() {
		return poslWeatherRepository;
	}
	public static String getN3WeatherRepository() {
		return n3WeatherRepository;
	}
	//INSTANTIATION SPECIFIC
	public static String getPort(String instantiation) throws BadConfigurationException {
		if(instantiation.equals("WellnessRules2"))
			return wellnessRules2_Port;
		else if(instantiation.equals("WellnessRules"))
			return wellnessRules_Port;
		else if(instantiation.equals("ruleml2011brf"))
			return ruleml2011brf_Port;
		else if(instantiation.equals("ruleml2011ijcai"))
			return ruleml2011ijcai_Port;
		//RuleML 2012
		else if(instantiation.equals("ruleml2012ecai"))
			return ruleml2012ecai_Port;
		else if(instantiation.equals("ruleml2012struct"))
			return ruleml2012struct_Port;
		else if(instantiation.equals("SymposiumPlanner10"))
			return symposiumPlanner10_Port;
		else if(instantiation.equals("SymposiumPlanner09"))
			return symposiumPlanner09_Port;
		else if(instantiation.equals("SymposiumPlanner08"))
			return symposiumPlanner08_Port;
		else if(instantiation.equals("PatientSupporter"))
			return patientSupporter_Port;
		else
			throw new BadConfigurationException("ERROR: Could not find PORT configuration for " + instantiation);
	}
	public static String getGlobalPOSL(String instantiation) throws BadConfigurationException {
		if(instantiation.equals("WellnessRules2"))
			return wellnessRules2_globalPOSL;
		else if(instantiation.equals("WellnessRules"))
			return wellnessRules_globalPOSL;
		else if(instantiation.equals("PatientSupporter"))
			return patientSupporter_globalPOSL;
		else
			throw new BadConfigurationException("ERROR: Could not find GlobalPOSL configuration for " + instantiation);
	}
	public static String getGlobalN3(String instantiation) throws BadConfigurationException {
		if(instantiation.equals("WellnessRules2"))
			return wellnessRules2_globalN3;
		else if(instantiation.equals("WellnessRules"))
			return wellnessRules_globalN3;
		else if(instantiation.equals("PatientSupporter"))
			return patientSupporter_globalN3;
		else
			throw new BadConfigurationException("ERROR: Could not find GlobalN3 configuration for " + instantiation);
	}
	public static String getRDFTaxonomy(String instantiation) throws BadConfigurationException {
		if(instantiation.equals("WellnessRules2"))
			return wellnessRules2_RDFTaxonomy;
		else if(instantiation.equals("WellnessRules"))
			return wellnessRules_RDFTaxonomy;
		else if(instantiation.equals("ruleml2011ijcai")) 
			return ruleml2011ijcai_RDFTaxonomy;
		//RuleML 2012
		else if(instantiation.equals("ruleml2012ecai")) 
			return ruleml2012ecai_RDFTaxonomy;
		else if(instantiation.equals("ruleml2012struct")) 
		    return rulemlstruct_RDFTaxonomy;
		else if(instantiation.equals("ruleml2011brf")) 
			return ruleml2011brf_RDFTaxonomy;
		else if(instantiation.equals("SymposiumPlanner09")) 
			return symposiumPlanner09_RDFTaxonomy;
		else if(instantiation.equals("SymposiumPlanner10")) 
			return symposiumPlanner10_RDFTaxonomy;
		else if(instantiation.equals("SymposiumPlanner08")) 
			return symposiumPlanner08_RDFTaxonomy;
		else if(instantiation.equals("PatientSupporter")) 
			return patientSupporter_RDFTaxonomy;
		else
			throw new BadConfigurationException("ERROR: Could not find RDFTaxonomy configuration for " + instantiation);
	}
	public static String getProfileRM(String instantiation) throws BadConfigurationException {
		if(instantiation.equals("WellnessRules2"))
			return wellnessRules2_PRM;
		else if(instantiation.equals("WellnessRules"))
			return wellnessRules_PRM;
		else if(instantiation.equals("PatientSupporter"))
			return patientSupporter_PRM;
		else
			throw new BadConfigurationException("ERROR: Could not find ProfileResponsibilityMatrix configuration for " + instantiation);
	}
	public static String getPARepository(String instantiation) throws BadConfigurationException {
		if(instantiation.equals("WellnessRules2"))
			return wellnessRules2_paRepository;
		else if(instantiation.equals("WellnessRules"))
			return wellnessRules_paRepository;
		else if(instantiation.equals("PatientSupporter"))
			return patientSupporter_paRepository;
		else
			throw new BadConfigurationException("ERROR: Could not find PARepository configuration for " + instantiation);
	}
	public static String getN3Namespace(String instantiation) throws BadConfigurationException {
		if(instantiation.equals("WellnessRules2")) 
			return wellnessRules2_n3Namespace;
		else if(instantiation.equals("WellnessRules"))
			return wellnessRules_n3Namespace;
		else if(instantiation.equals("PatientSupporter"))
			return patientSupporter_n3Namespace;
		else
			throw new BadConfigurationException("ERROR: Could not find N3Namspace configuration for " + instantiation);
	}
	//WeatherUpdater
	public static String getCity() {
		return city;
	}
	public static String getProvince() {
		return province;
	}
	public static long getWeatherUpdaterTime() {
		return weatherUpdaterTime;
	}
	public static String getWeatherURL() {
		return weatherURL;
	}
	public static String getLanguage() {
		return language;
	}
	//TOPIC SPECIFIC
	public static String getEndpointName(String instantiation, String topic) throws BadConfigurationException {
		//WellnessRules2
		if(instantiation.equals("WellnessRules2")) {
			if(topic.equals("Walking"))
				return wellnessRules2_WalkingEndpoint;
			else if(topic.equals("Running")) 
				return wellnessRules2_RunningEndpoint;
			else if(topic.equals("Swimming")) 
				return wellnessRules2_SwimmingEndpoint;
			else if(topic.equals("Skating")) 
				return wellnessRules2_SkatingEndpoint;
			else if(topic.equals("Yoga")) 
				return wellnessRules2_YogaEndpoint;
			else if(topic.equals("Hiking")) 
				return wellnessRules2_HikingEndpoint;
			else if(topic.equals("Baseball")) 
				return wellnessRules2_BaseballEndpoint;
			else 
				throw new BadConfigurationException("ERROR: Could not find ENDPOINT configuration for " + topic + " topic attached to " + instantiation);
		}
		//PatientSupporter
		else if(instantiation.equals("PatientSupporter")) {
			if(topic.equals("Shoulder"))
				return patientSupporter_ShoulderEndpoint;
			else if(topic.equals("Leg")) 
				return patientSupporter_LegEndpoint;
			else if(topic.equals("Arm")) 
				return patientSupporter_ArmEndpoint;
			else if(topic.equals("Back")) 
				return patientSupporter_BackEndpoint;
			else if(topic.equals("Head")) 
				return patientSupporter_HeadEndpoint;
			else if(topic.equals("Neck")) 
				return patientSupporter_NeckEndpoint;
			else if(topic.equals("Torso")) 
				return patientSupporter_TorsoEndpoint;
			else 
				throw new BadConfigurationException("ERROR: Could not find ENDPOINT configuration for " + topic + " topic attached to " + instantiation);
		}
		//WellnessRules
		else if(instantiation.equals("WellnessRules")) {
			if(topic.equals("Walking"))
				return wellnessRules_WalkingEndpoint;
			else if(topic.equals("Running")) 
				return wellnessRules_RunningEndpoint;
			else if(topic.equals("Swimming")) 
				return wellnessRules_SwimmingEndpoint;
			else if(topic.equals("Skating")) 
				return wellnessRules_SkatingEndpoint;
			else if(topic.equals("Yoga")) 
				return wellnessRules_YogaEndpoint;
			else if(topic.equals("Hiking")) 
				return wellnessRules_HikingEndpoint;
			else if(topic.equals("Baseball")) 
				return wellnessRules_BaseballEndpoint;
			else 
				throw new BadConfigurationException("ERROR: Could not find ENDPOINT configuration for " + topic + " topic attached to " + instantiation);
		}
		//ruleml2011brf
		else if(instantiation.equals("ruleml2011brf")) {
			if(topic.equals("GeneralChair"))
				return ruleml2011brf_GeneralChairEndpoint;
			else if(topic.equals("LiaisonChair"))
				return ruleml2011brf_LiaisonChairEndpoint;
			else if(topic.equals("PanelChair")) 
				return ruleml2011brf_PanelChairEndpoint;
			else if(topic.equals("ProgramChair"))
				return ruleml2011brf_ProgramChairEndpoint;
			else if(topic.equals("PublicityChair"))
				return ruleml2011brf_PublicityChairEndpoint;
			else if(topic.equals("RRChair"))
				return ruleml2011brf_RRChairEndpoint;
			else 
				throw new BadConfigurationException("ERROR: Could not find ENDPOINT configuration for " + topic + " topic attached to " + instantiation);
		}
		//ruleml2011ijcai
		else if(instantiation.equals("ruleml2011ijcai")) {
			if(topic.equals("PublicityChair"))
				return ruleml2011ijcai_PublicityChairEndpoint;
			else if(topic.equals("ProgramChair"))
				return ruleml2011ijcai_ProgramChairEndpoint;
			else if(topic.equals("PanelChair"))
				return ruleml2011ijcai_PanelChairEndpoint;
			else if(topic.equals("LiaisonChair"))
				return ruleml2011ijcai_LiaisonChairEndpoint;
			else if(topic.equals("GeneralChair"))
				return ruleml2011ijcai_GeneralChairEndpoint;
			else 
				throw new BadConfigurationException("ERROR: Could not find ENDPOINT configuration for " + topic + " topic attached to " + instantiation);
		}
		//==========================================================================================================
		//ruleml2012ecai
		else if(instantiation.equals("ruleml2012ecai")) {
			if(topic.equals("PublicityChair"))
		    	return ruleml2012ecai_PublicityChairEndpoint;
			else if(topic.equals("ProgramChair"))
				return ruleml2012ecai_ProgramChairEndpoint;
			else if(topic.equals("PanelChair"))
				return ruleml2012ecai_PanelChairEndpoint;
	    	else if(topic.equals("LiaisonChair"))
				return ruleml2012ecai_LiaisonChairEndpoint;
		    else if(topic.equals("GeneralChair"))
				return ruleml2012ecai_GeneralChairEndpoint;
		    else if(topic.equals("DocConsortiumChair"))
				return ruleml2012ecai_DocSymposiumChairEndpoint;
		    else if(topic.equals("LocalChair"))
				return ruleml2012ecai_localChairEndpoint;
		    else if(topic.equals("MetaAndSocialChair"))
				return ruleml2012ecai_metadataAndSocialChairEndpoint;
		    else if(topic.equals("SteeringChair"))
				return ruleml2012ecai_steeringChairEndpoint;
		    else if(topic.equals("IntlRuleChalSteerCommitChair"))
		    	return ruleml2012ecai_IntlRuleSteeringChairEndpoint;
		    else if(topic.equals("IntlRuleChalChair"))
		    	return ruleml2012ecai_IntlRuleChalChairEndpoint;
			else 
				throw new BadConfigurationException("ERROR: Could not find ENDPOINT configuration for " + topic + " topic attached to " + instantiation);
		}
		//=============================================================================================================
		else if(instantiation.equals("ruleml2012struct")){
			if(topic.equals("TGAgent"))
				return ruleml2012struct_TGAgentEndpoint;
			else if(topic.equals("AdvisoryBoard"))
				return ruleml2012struct_AdvisoryBoardEndpoint;
			else if(topic.equals("CEI"))
				return ruleml2012struct_CEIEndpoint;
			else if(topic.equals("CoChairs"))
				return ruleml2012struct_CoChairsEndpoint;
			else if(topic.equals("DefeasibleLogic"))
				return ruleml2012struct_DefeasibleLogicEndpoint;
			else if(topic.equals("MAS"))
				return ruleml2012struct_MASEndpoint;
			else if(topic.equals("ModalLogic"))
				return ruleml2012struct_ModalLogicEndpoint;
			else if(topic.equals("PSOA"))
				return ruleml2012struct_PSOAEndpoint;
			else if(topic.equals("ReactionRules"))
				return ruleml2012struct_ReactionRulesEndpoint;
			else if(topic.equals("SteeringCommittee"))
				return ruleml2012struct_SteeringCommitteeEndpoint;
			else if(topic.equals("UnCertReason"))
				return ruleml2012struct_UnCertReasonEndpoint;
			else 
				throw new BadConfigurationException("ERROR: Could not find ENDPOINT configuration for " + topic + " topic attached to " + instantiation);
		}
		//=============================================================================================================
		//SymposiumPlanner10
		else if(instantiation.equals("SymposiumPlanner10")) {
			if(topic.equals("GeneralChair"))
				return symposiumPlanner10_GeneralChairEndpoint;
			else if(topic.equals("LiaisonChair"))
				return symposiumPlanner10_LiaisonChairEndpoint;
			else if(topic.equals("PanelChair")) 
				return symposiumPlanner10_PanelChairEndpoint;
			else if(topic.equals("ProgramChair"))
				return symposiumPlanner10_ProgramChairEndpoint;
			else if(topic.equals("PublicityChair"))
				return symposiumPlanner10_PublicityChairEndpoint;
			else if(topic.equals("RRChair"))
				return symposiumPlanner10_RRChairEndpoint;
			else 
				throw new BadConfigurationException("ERROR: Could not find ENDPOINT configuration for " + topic + " topic attached to " + instantiation);
		}
		//SymposiumPlanner09
		else if(instantiation.equals("SymposiumPlanner09")) {
			if(topic.equals("PublicityChair"))
				return symposiumPlanner09_PublicityChairEndpoint;
			else if(topic.equals("ProgramChair"))
				return symposiumPlanner09_ProgramChairEndpoint;
			else if(topic.equals("PanelChair"))
				return symposiumPlanner09_PanelChairEndpoint;
			else if(topic.equals("LiaisonChair"))
				return symposiumPlanner09_LiaisonChairEndpoint;
			else if(topic.equals("GeneralChair"))
				return symposiumPlanner09_GeneralChairEndpoint;
			else 
				throw new BadConfigurationException("ERROR: Could not find ENDPOINT configuration for " + topic + " topic attached to " + instantiation);
		}
		//SymposiumPlanner08
		else if(instantiation.equals("SymposiumPlanner08")) {
			if(topic.equals("WebChair"))
				return symposiumPlanner08_WebChairEndpoint;
			else if(topic.equals("PublicityChair"))
				return symposiumPlanner08_PublicityChairEndpoint;
			else if(topic.equals("LiaisonChair")) 
				return symposiumPlanner08_LiaisonChairEndpoint;
			else if(topic.equals("GeneralChair"))
				return symposiumPlanner08_GeneralChairEndpoint;
			else if(topic.equals("ChallengeChair"))
				return symposiumPlanner08_ChallengeChairEndpoint;
			else if(topic.equals("PanelChair"))
				return symposiumPlanner08_PanelChairEndpoint;
			else 
				throw new BadConfigurationException("ERROR: Could not find ENDPOINT configuration for " + topic + " topic attached to " + instantiation);
		}
		else
			throw new BadConfigurationException("ERROR: Could not find ENDPOINT configuration for " + instantiation);
	}
	//=====================================================================================================================================
	public static String getPOSL(String instantiation,String topic) throws BadConfigurationException {
		if(instantiation.equals("ruleml2012ecai")) {
			if(topic.equals("PublicityChair"))
				return ruleml2012ecai_PublicityChairPOSL;
			else if(topic.equals("ProgramChair"))
				return ruleml2012ecai_ProgramChairPOSL;
			else if(topic.equals("PanelChair"))
				return ruleml2012ecai_PanelChairPOSL;
			else if(topic.equals("LiaisonChair"))
				return ruleml2012ecai_LiaisonChairPOSL;
			else if(topic.equals("GeneralChair"))
				return ruleml2012ecai_GeneralChairPOSL;
			else if(topic.equals("DocConsortiumChair"))
				return ruleml2012ecai_DocSymposiumChairPOSL;
			else if(topic.equals("LocalChair"))
				return ruleml2012ecai_localChairPOSL;
			else if(topic.equals("MetaAndSocialChair"))
				return ruleml2012ecai_metadataAndSocialChairPOSL;
			else if(topic.equals("SteeringChair"))
				return ruleml2012ecai_steeringChairPOSL ;
			else if(topic.equals("IntlRuleChalSteerCommitChair"))
				return ruleml2012ecai_IntlRuleSteeringChairPOSL;
			else if(topic.equals("IntlRuleChalChair"))
				return ruleml2012ecai_IntlRuleChalChairPOSL;
			else
				throw new BadConfigurationException("ERROR: Could not find POSL configuration for " + topic + " topic attached to " + instantiation);
		}
		//********************************************************************************************
		if(instantiation.equals("ruleml2012struct")) {
			if(topic.equals("TGAgent"))
				return ruleml2012struct_TGAgentPOSL;
			else if(topic.equals("AdvisoryBoard"))
				return ruleml2012struct_AdvisoryBoardPOSL;
			else if(topic.equals("CEI"))
				return ruleml2012struct_CEIPOSL;
			else if(topic.equals("CoChairs"))
				return ruleml2012struct_CoChairsBoardPOSL;
			else if(topic.equals("DefeasibleLogic"))
				return ruleml2012struct_DefeasibleLogicPOSL;
			else if(topic.equals("MAS"))
				return ruleml2012struct_MASPOSL;
			else if(topic.equals("ModalLogic"))
				return ruleml2012struct_ModalLogicPOSL;
			else if(topic.equals("PSOA"))
				return ruleml2012struct_PSOAPOSL;
			else if(topic.equals("ReactionRules"))
				return ruleml2012struct_ReactionRulesPOSL;
			else if(topic.equals("SteeringCommittee"))
				return ruleml2012struct_SteeringCommitteePOSL;
			else if(topic.equals("UnCertReason"))
				return ruleml2012struct_UnCertReasonPOSL;
			else
				throw new BadConfigurationException("ERROR: Could not find POSL configuration for " + topic + " topic attached to " + instantiation);
		}
		//********************************************************************************************
		else if(instantiation.equals("ruleml2011ijcai")) {
			if(topic.equals("PublicityChair"))
				return ruleml2011ijcai_PublicityChairPOSL;
			else if(topic.equals("ProgramChair"))
				return ruleml2011ijcai_ProgramChairPOSL;
			else if(topic.equals("PanelChair"))
				return ruleml2011ijcai_PanelChairPOSL;
			else if(topic.equals("LiaisonChair"))
				return ruleml2011ijcai_LiaisonChairPOSL;
			else if(topic.equals("GeneralChair"))
				return ruleml2011ijcai_GeneralChairPOSL;
			else
				throw new BadConfigurationException("ERROR: Could not find POSL configuration for " + topic + " topic attached to " + instantiation);
		}
		else if(instantiation.equals("SymposiumPlanner10")) {
			if(topic.equals("GeneralChair"))
				return symposiumPlanner10_GeneralChairPOSL;
			else if(topic.equals("LiaisonChair"))
				return symposiumPlanner10_LiaisonChairPOSL;
			else if(topic.equals("PanelChair"))
				return symposiumPlanner10_PanelChairPOSL;
			else if(topic.equals("ProgramChair"))
				return symposiumPlanner10_ProgramChairPOSL;
			else if(topic.equals("PublicityChair"))
				return symposiumPlanner10_PublicityChairPOSL;
			else if(topic.equals("RRChair"))
				return symposiumPlanner10_RRChairPOSL;
			else
				throw new BadConfigurationException("ERROR: Could not find POSL configuration for " + topic + " topic attached to " + instantiation);
		}
		else if(instantiation.equals("SymposiumPlanner09")) {
			if(topic.equals("PublicityChair"))
				return symposiumPlanner09_PublicityChairPOSL;
			else if(topic.equals("ProgramChair"))
				return symposiumPlanner09_ProgramChairPOSL;
			else if(topic.equals("PanelChair"))
				return symposiumPlanner09_PanelChairPOSL;
			else if(topic.equals("LiaisonChair"))
				return symposiumPlanner09_LiaisonChairPOSL;
			else if(topic.equals("GeneralChair"))
				return symposiumPlanner09_GeneralChairPOSL;
			else
				throw new BadConfigurationException("ERROR: Could not find POSL configuration for " + topic + " topic attached to " + instantiation);
		}
		
		else if(instantiation.equals("ruleml2011brf")) {
			if(topic.equals("PublicityChair"))
				return ruleml2011brf_PublicityChairPOSL;
			else if(topic.equals("ProgramChair"))
				return ruleml2011brf_ProgramChairPOSL;
			else if(topic.equals("PanelChair"))
				return ruleml2011brf_PanelChairPOSL;
			else if(topic.equals("LiaisonChair"))
				return ruleml2011brf_LiaisonChairPOSL;
			else if(topic.equals("GeneralChair"))
				return ruleml2011brf_GeneralChairPOSL;
			else
				throw new BadConfigurationException("ERROR: Could not find POSL configuration for " + topic + " topic attached to " + instantiation);
		}
		else if(instantiation.equals("SymposiumPlanner08")) {
			if(topic.equals("WebChair"))
				return symposiumPlanner08_WebChairPOSL;
			else if(topic.equals("PublicityChair"))
				return symposiumPlanner08_PublicityChairPOSL;
			else if(topic.equals("LiaisonChair"))
				return symposiumPlanner08_LiaisonChairPOSL;
			else if(topic.equals("GeneralChair"))
				return symposiumPlanner08_GeneralChairPOSL;
			else if(topic.equals("ChallengeChair"))
				return symposiumPlanner08_ChallengeChairPOSL;
			else if(topic.equals("PanelChair"))
				return symposiumPlanner08_PanelChairPOSL;
			else
				throw new BadConfigurationException("ERROR: Could not find POSL configuration for " + topic + " topic attached to " + instantiation);
		}
		else
			throw new BadConfigurationException("ERROR: Could not find POSL configuration for " + instantiation);
	}
}
