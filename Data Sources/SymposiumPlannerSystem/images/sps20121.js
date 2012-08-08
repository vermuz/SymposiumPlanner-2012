function elementSelected(){
          var choice = document.form1.select1.selectedIndex;
		  
		  //CONTACT QUERIES//
		  //ECAI 2012 general chair contact
		  var choice0 = 
			      "<Atom>" + "\n         " +
			      "<Rel>getContact</Rel>" + "\n         " + 
				  "<Ind>ruleml2012ATecai_GeneralChair</Ind>" + "\n         " +
				  "<Var>Contact</Var>" + "\n      " +
			      "</Atom>" + "\n";
        
		 //ECAI2012 publicity chair contact
	     var choice1 = 
			      "<Atom>" + "\n         " +
			      "<Rel>getContact</Rel>" + "\n         " + 
				  "<Ind>ruleml2012ATecai_PublicityChair</Ind>" + "\n         " +
				  "<Var>Contact</Var>" + "\n      " +
			      "</Atom>" + "\n";  
		
		//ECAI 2012 program chair contact
		var choice2 = 
			    "<Atom>" + "\n         " +
			    "<Rel>getContact</Rel>" + "\n         " + 
				"<Ind>ruleml2012ATecai_ProgramChair</Ind>" + "\n         " +
				"<Var>Contact</Var>" + "\n      " +
			    "</Atom>" + "\n";
				
		//ECAI 2012 Doctoral Symposium chair contact
		var choice3 = 
			    "<Atom>" + "\n         " +
			    "<Rel>getContact</Rel>" + "\n         " + 
				"<Ind>ruleml2012ATecai_DocSymposiumChair</Ind>" + "\n         " +
				"<Var>Contact</Var>" + "\n      " +
			    "</Atom>" + "\n";
				
		//ECAI 2012 Local chair contact
		var choice4 = 
			    "<Atom>" + "\n         " +
			    "<Rel>getContact</Rel>" + "\n         " + 
				"<Ind>ruleml2012ATecai_LocalChair</Ind>" + "\n         " +
				"<Var>Contact</Var>" + "\n      " +
			    "</Atom>" + "\n";
				
		//ECAI 2012 MetaData and Social chair contact
		var choice5 = 
			    "<Atom>" + "\n         " +
			    "<Rel>getContact</Rel>" + "\n         " + 
				"<Ind>ruleml2012ATecai_MetaAndSocialChair</Ind>" + "\n         " +
				"<Var>Contact</Var>" + "\n      " +
			    "</Atom>" + "\n";
				
		//ECAI 2012 Steering chair contact
		var choice6 = 
			    "<Atom>" + "\n         " +
			    "<Rel>getContact</Rel>" + "\n         " + 
				"<Ind>ruleml2012ATecai_SteeringChair</Ind>" + "\n         " +
				"<Var>Contact</Var>" + "\n      " +
			    "</Atom>" + "\n";
				
		//ECAI 2012 Intl Rule Steering Chair contact
		var choice7 = 
			    "<Atom>" + "\n         " +
			    "<Rel>getContact</Rel>" + "\n         " + 
				"<Ind>ruleml2012ATecai_IntlRuleChalSteerCommitChair</Ind>" + "\n         " +
				"<Var>Contact</Var>" + "\n      " +
			    "</Atom>" + "\n";
				
		//ECAI 2012 Intl Rule Challenge Chair contact
		var choice8 = 
			    "<Atom>" + "\n         " +
			    "<Rel>getContact</Rel>" + "\n         " + 
				"<Ind>ruleml2012ATecai_IntlRuleChalChair</Ind>" + "\n         " +
				"<Var>Contact</Var>" + "\n      " +
			    "</Atom>" + "\n";
		
        //SPONSORING
		//publicity chair sponsoring
		var choice9 = 
			      "<Atom>" + "\n         " +
			      "<Rel>sponsor</Rel>" + "\n         " + 
				"<Expr>" + "\n            " +
				"<Fun>contact</Fun>" + "\n            " +
				"<Ind>Mark</Ind>" + "\n            " +
				"<Ind>JBoss</Ind>" + "\n         " +
				"</Expr>" + "\n         " + 
			    "<Ind type=\"integer\">500</Ind>" + "\n         " +
				"<Expr>" + "\n            " +
				"<Fun>results</Fun>" + "\n            " +
				"<Var>Level</Var>" + "\n            " +
				"<Var>Benefits</Var>" + "\n            " +
				"<Var>DeadlineResults</Var>" + "\n         " +
				"</Expr>" + "\n         " + 
				"<Expr>" + "\n            " +
				"<Fun>performative</Fun>" + "\n            " +
				"<Var>Action</Var>" + "\n         " +
				"</Expr>" + "\n      " + 
			    "</Atom>" + "\n";
        
		//PUBLICITY CHAIR QUERIES				  
        //Publicity chair view media partners
		var choice10 = 		
				"<Atom>" + "\n         " +
			    "<Rel>meetingMediaPartner</Rel>" + "\n         " + 
				"<Var>Meeting</Var>" + "\n         " + 
				"<Var>PartnerName</Var>" + "\n      " + 
				"</Atom>" + "\n";
				
		//Publicity chair view organization partners
		var choice11 = 		
				"<Atom>" + "\n         " +
			    "<Rel>meetingPartner</Rel>" + "\n         " + 
				"<Var>Meeting</Var>" + "\n         " + 
				"<Var>PartnerName</Var>" + "\n      " + 
				"</Atom>" + "\n";
				
		//Publicity Chair view sponsors with regards to level
		var choice12 = 		
				"<Atom>" + "\n         " +
			    "<Rel>viewSponsors</Rel>" + "\n         " + 
				"<Var>Meeting</Var>" + "\n         " + 
				"<Var>Company</Var>" + "\n         " + 
				"<Var>SponsorLevel</Var>" + "\n      " + 
				"</Atom>" + "\n";
				
		//Publicity chair view sponsors
		var choice13 = 		
				"<Atom>" + "\n         " +
			    "<Rel>viewSponsors</Rel>" + "\n         " + 
				"<Var>Meeting</Var>" + "\n         " + 
				"<Var>Company</Var>" + "\n      " + 
				"</Atom>" + "\n";
				
		//Publicity chair Media Partners by Services
		var choice14 = 		
				"<Atom>" + "\n         " +
			    "<Rel>mediaPartnerByServices</Rel>" + "\n         " + 
				"<Var>Partner</Var>" + "\n         " + 
				"<Var>Service</Var>" + "\n      " + 
				"<Var>Contact</Var>" + "\n      " + 
				"<Var>CategoryofKnowledge</Var>" + "\n      " + 
				"</Atom>" + "\n";
				
		//Publicity chair Which Media Partners are a Community
		var choice15 = 		
				"<Atom>" + "\n         " +
			    "<Rel>mediaPartnerCommunity</Rel>" + "\n         " + 
				"<Var>Community</Var>" + "\n         " + 
				"<Var>Interest</Var>" + "\n      " + 
				"</Atom>" + "\n";
				
		//Publicity chair News Feeds
		var choice16 = 		
				"<Atom>" + "\n         " +
			    "<Rel>mediaNewsFeedResources</Rel>" + "\n         " + 
				"<Var>Resource</Var>" + "\n         " + 
				"<Var>ResourceURI</Var>" + "\n      " + 
				"</Atom>" + "\n";
				
		//Program Chair Retrieve Tracks
		var choice17 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getTracks</Rel>" + "\n\t\t" +
			"<Var>Track</Var>" + "\n\t    " +
			"</Atom>";
			      
		var choice18 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getTopicsOfATrack</Rel>" + "\n\t\t" +
			"<Ind type=\"string\">Business Rules and Processes</Ind>" + "\n\t\t" +
			"<Var>Topic</Var>" + "\n\t    " +
			"</Atom>";
			
		//Program Chair Retrieve Track of a Topic
		var choice19 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getTrackOfATopic</Rel>" + "\n\t\t" +
			"<Ind type=\"string\">Rule interchange language for the legal domain</Ind>" + "\n\t\t" +
			"<Var>Track</Var>" + "\n\t    " +
			"</Atom>";

	    //Program Chair Retrieve all Track Chairs
		var choice20 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getTrackChairs</Rel>" + "\n\t\t" +
			"<Var>TrackChairs</Var>" + "\n\t    " +
			"</Atom>";
			
		//Program Chair Retrieve names of Chairs for specific Track
		var choice21 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getChairsOfTrack</Rel>" + "\n\t\t" +
			"<Ind type=\"string\">LegalRuleML</Ind>" + "\n\t\t" +
			"<Var>Chairs</Var>" + "\n\t    " +
			"</Atom>";
			
		//Submission Query
        var choice22 = 
			    "<Atom>" + "\n         " +
			    "<Rel>submission</Rel>" + "\n         " + 
				"<Expr>" + "\n            " +
				"<Fun>contact</Fun>" + "\n            " +
				"<Ind>Mark</Ind>" + "\n            " +
				"<Ind>JBoss</Ind>" + "\n         " +
				"<Ind>USA</Ind>" + "\n         " +
				"<Ind>markDOTjbossATgmailDOTcom</Ind>" + "\n         " +
				"</Expr>" + "\n         " + 
			    "<Ind type=\"string\">Rules and Automated Reasoning</Ind>" + "\n         " +
			    "<Ind type=\"string\">Full Paper</Ind>" + "\n         " +
				"<Ind type=\"string\">rules; reasoning</Ind>" + "\n         " +
			    "</Atom>" + "\n";
				
		var messageHeader =
                  "<RuleML xmlns=\n   \"http://www.ruleml.org/0.91/xsd\"" + "\n" +
				  " xmlns:xsi=\n   \"http://www.w3.org/2001/XMLSchema-instance\"" + "\n" +
				  " xsi:schemaLocation=\n   \"http://www.ruleml.org/0.91/xsd" + "\n   " +
				  " http://ibis.in.tum.de/research/" + "\n    " + "ReactionRuleML/0.2/rr.xsd\"" + "\n" +
				  " xmlns:ruleml2012=" + "\n   " + "\"http://ibis.in.tum.de/projects/paw#\">" + "\n" +
				  "\n " + "<Message mode=\"outbound\"" + "\n  " + "directive=\"query-sync\">" +
			      "\n   " + "<oid>" + "\n      " + 
			      "<Ind>SymposiumPlannerSystem</Ind>" + "\n   " +
			      "</oid>" + "\n   " +
			      "<protocol>" + "\n      " +
			      "<Ind>esb</Ind>" + "\n   " +
			      "</protocol>" + "\n   " +
			      "<sender>" + "\n      " +
			      "<Ind>User</Ind>" + "\n   " +
			      "</sender>" + "\n   " +
			      "<content>" + "\n      ";					
		
	    var messageFooter = 			     
				"   " + "</content>" + "\n " +
			      "</Message>" + "\n" +
			      "</RuleML>";
		
		if(choice == 0){
			document.form2.box1.value = messageHeader + choice0 + messageFooter;
		}else if(choice == 1){
			document.form2.box1.value = messageHeader + choice1 + messageFooter;
		}else if(choice == 2){
			document.form2.box1.value = messageHeader + choice2 + messageFooter;
		}else if(choice == 3){
			document.form2.box1.value = messageHeader + choice3 + messageFooter;
		}else if(choice == 4){
			document.form2.box1.value = messageHeader + choice4 + messageFooter;
		}else if(choice == 5){
			document.form2.box1.value = messageHeader + choice5 + messageFooter;
		}else if(choice == 6){
			document.form2.box1.value = messageHeader + choice6 + messageFooter;
		}else if(choice == 7){
			document.form2.box1.value = messageHeader + choice7 + messageFooter;
		}else if(choice == 8){
			document.form2.box1.value = messageHeader + choice8 + messageFooter;
		}else if(choice == 9){
			document.form2.box1.value = messageHeader + choice9 + messageFooter;
		}else if(choice == 10){
			document.form2.box1.value = messageHeader + choice10 + messageFooter;
		}else if(choice == 11){
			document.form2.box1.value = messageHeader + choice11 + messageFooter;
		}else if(choice == 12){
			document.form2.box1.value = messageHeader + choice12 + messageFooter;
		}else if(choice == 13){
			document.form2.box1.value = messageHeader + choice13 + messageFooter;
		}else if(choice == 14){
			document.form2.box1.value = messageHeader + choice14 + messageFooter;
		}else if(choice == 15){
			document.form2.box1.value = messageHeader + choice15 + messageFooter;
		}else if(choice == 16){
			document.form2.box1.value = messageHeader + choice16 + messageFooter;
		}else if(choice == 17){
			document.form2.box1.value = messageHeader + choice17 + messageFooter;
		}else if(choice == 18){
			document.form2.box1.value = messageHeader + choice18 + messageFooter;
		}else if(choice == 19){
			document.form2.box1.value = messageHeader + choice19 + messageFooter;
		}else if(choice == 20){
			document.form2.box1.value = messageHeader + choice20 + messageFooter;
		}else if(choice == 21){
			document.form2.box1.value = messageHeader + choice21 + messageFooter;
		}else if(choice == 22){
			document.form2.box1.value = messageHeader + choice21 + messageFooter;
		}
}



function elementSelected3(){

        var choice = document.form3.select3.selectedIndex;
		
		//CONTACT Queries
		//ECAI 2012 general chair contact
		var choice0 = 
			      "<Atom>" + "\n         " +
			      "<Rel>getContact</Rel>" + "\n         " + 
				  "<Ind>ruleml2012ATecai_GeneralChair</Ind>" + "\n         " +
				  "<Var>Contact</Var>" + "\n      " +
			      "</Atom>" + "\n";
				  
		//ECAI2012 publicity chair contact
	    var choice1 = 
			      "<Atom>" + "\n         " +
			      "<Rel>getContact</Rel>" + "\n         " + 
				  "<Ind>ruleml2012ATecai_PublicityChair</Ind>" + "\n         " +
				  "<Var>Contact</Var>" + "\n      " +
			      "</Atom>" + "\n"; 
				  
		//ECAI 2012 program chair contact
		var choice2 = 
			    "<Atom>" + "\n         " +
			    "<Rel>getContact</Rel>" + "\n         " + 
				"<Ind>ruleml2012ATecai_ProgramChair</Ind>" + "\n         " +
				"<Var>Contact</Var>" + "\n      " +
			    "</Atom>" + "\n";
				
		//publicity chair sponsoring
		var choice3 = 
			      "<Atom>" + "\n         " +
			      "<Rel>sponsor</Rel>" + "\n         " + 
				"<Expr>" + "\n            " +
				"<Fun>contact</Fun>" + "\n            " +
				"<Ind>Mark</Ind>" + "\n            " +
				"<Ind>JBoss</Ind>" + "\n         " +
				"</Expr>" + "\n         " + 
			    "<Ind type=\"integer\">500</Ind>" + "\n         " +
				"<Expr>" + "\n            " +
				"<Fun>results</Fun>" + "\n            " +
				"<Var>Level</Var>" + "\n            " +
				"<Var>Benefits</Var>" + "\n            " +
				"<Var>DeadlineResults</Var>" + "\n         " +
				"</Expr>" + "\n         " + 
				"<Expr>" + "\n            " +
				"<Fun>performative</Fun>" + "\n            " +
				"<Var>Action</Var>" + "\n         " +
				"</Expr>" + "\n      " + 
			    "</Atom>" + "\n";
				
		//Publicity chair view media partners
		var choice4 = 		
				"<Atom>" + "\n         " +
			    "<Rel>meetingMediaPartner</Rel>" + "\n         " + 
				"<Var>Meeting</Var>" + "\n         " + 
				"<Var>PartnerName</Var>" + "\n      " + 
				"</Atom>" + "\n";
				
		//Publicity chair view organization partners
		var choice5= 		
				"<Atom>" + "\n         " +
			    "<Rel>meetingPartner</Rel>" + "\n         " + 
				"<Var>Meeting</Var>" + "\n         " + 
				"<Var>PartnerName</Var>" + "\n      " + 
				"</Atom>" + "\n";
				
		//Publicity Chair view sponsors with regards to level
		var choice6 = 		
				"<Atom>" + "\n         " +
			    "<Rel>viewSponsors</Rel>" + "\n         " + 
				"<Var>Meeting</Var>" + "\n         " + 
				"<Var>Company</Var>" + "\n         " + 
				"<Var>SponsorLevel</Var>" + "\n      " + 
				"</Atom>" + "\n";
				
		//Publicity chair view sponsors
		var choice7 = 		
				"<Atom>" + "\n         " +
			    "<Rel>viewSponsors</Rel>" + "\n         " + 
				"<Var>Meeting</Var>" + "\n         " + 
				"<Var>Company</Var>" + "\n      " + 
				"</Atom>" + "\n";
				
		//Publicity chair Media Partners by Services
		var choice8 = 		
				"<Atom>" + "\n         " +
			    "<Rel>mediaPartnerByServices</Rel>" + "\n         " + 
				"<Var>Partner</Var>" + "\n         " + 
				"<Var>Service</Var>" + "\n      " + 
				"<Var>Contact</Var>" + "\n      " + 
				"<Var>CategoryofKnowledge</Var>" + "\n      " + 
				"</Atom>" + "\n";
				
		//Publicity chair Which Media Partners are a Community
		var choice9 = 		
				"<Atom>" + "\n         " +
			    "<Rel>mediaPartnerCommunity</Rel>" + "\n         " + 
				"<Var>Community</Var>" + "\n         " + 
				"<Var>Interest</Var>" + "\n      " + 
				"</Atom>" + "\n";
				
		//Publicity chair News Feeds
		var choice10 = 		
				"<Atom>" + "\n         " +
			    "<Rel>mediaNewsFeedResources</Rel>" + "\n         " + 
				"<Var>Resource</Var>" + "\n         " + 
				"<Var>ResourceURI</Var>" + "\n      " + 
				"</Atom>" + "\n";
				
		//Program Chair Retrieve Tracks
		var choice11 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getTracks</Rel>" + "\n\t\t" +
			"<Var>Track</Var>" + "\n\t    " +
			"</Atom>";
			      
		var choice12 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getTopicsOfATrack</Rel>" + "\n\t\t" +
			"<Ind type=\"string\">Rules and the Semantic Web</Ind>" + "\n\t\t" +
			"<Var>Topic</Var>" + "\n\t    " +
			"</Atom>";
			
		//Program Chair Retrieve Track of a Topic
		var choice13 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getTrackOfATopic</Rel>" + "\n\t\t" +
			"<Ind type=\"string\">Rule interchange language for the legal domain</Ind>" + "\n\t\t" +
			"<Var>Track</Var>" + "\n\t    " +
			"</Atom>";

	    //Program Chair Retrieve all Track Chairs
		var choice14 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getTrackChairs</Rel>" + "\n\t\t" +
			"<Var>TrackChairs</Var>" + "\n\t    " +
			"</Atom>";

	    //Program Chair Retrieve names of Chairs for specific Track
		var choice15 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getChairsOfTrack</Rel>" + "\n\t\t" +
			"<Ind type=\"string\">LegalRuleML</Ind>" + "\n\t\t" +
			"<Var>Chairs</Var>" + "\n\t    " +
			"</Atom>";
			
		//Program Chair Find Tracks relevant to Keywords (string)
	  var choice16 =
			"<Atom>" + "\n\t\t" +
			"<Rel>findTracks</Rel>" + "\n\t\t" +
			"<Ind type=\"string\">defeasibility; rule exceptions</Ind>" + "\n\t\t" +
			"<Var>ScoredTrack</Var>" + "\n\t    " +
			"</Atom>";
			
		//Program Chair Retrieve Important Dates
		var choice17 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getImportantDates</Rel>" + "\n\t\t" +
			"<Var>Title</Var>" + "\n\t\t" +
			"<Expr>" + "\n\t\t" +
			"  <Fun>dateTime</Fun>" + "\n\t\t" +
			"  <Var>StartYear</Var>" + "\n\t\t" +
			"  <Var>StartMonth</Var>" + "\n\t\t" +
			"  <Var>StartDay</Var>" + "\n\t\t" +
			"  <Var>StartHour</Var>" + "\n\t\t" +
			"  <Var>StartMinute</Var>" + "\n\t\t" +
			"</Expr>" + "\n\t\t" +
			"<Expr>" + "\n\t\t" +
			"  <Fun>dateTime</Fun>" + "\n\t\t" +
			"  <Var>EndYear</Var>" + "\n\t\t" +
			"  <Var>EndMonth</Var>" + "\n\t\t" +
			"  <Var>EndDay</Var>" + "\n\t\t" +
			"  <Var>EndHour</Var>" + "\n\t\t" +
			"  <Var>EndMinute</Var>" + "\n\t\t" +
			"</Expr>" + "\n\t   "+
			"</Atom>";
			
	 	//Program Chair Retrieve Important Dates
		var choice18 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getItemOfImportantDates</Rel>" + "\n\t\t" +
			"<Ind>RuleML-2012@ECAI dates</Ind>" + "\n\t\t" +
			"<Expr>" + "\n\t\t" +
			"  <Fun>dateTime</Fun>" + "\n\t\t" +
			"  <Var>StartYear</Var>" + "\n\t\t" +
			"  <Var>StartMonth</Var>" + "\n\t\t" +
			"  <Var>StartDay</Var>" + "\n\t\t" +
			"  <Var>StartHour</Var>" + "\n\t\t" +
			"  <Var>StartMinute</Var>" + "\n\t\t" +
			"</Expr>" + "\n\t\t" +
			"<Expr>" + "\n\t\t" +
			"  <Fun>dateTime</Fun>" + "\n\t\t" +
			"  <Var>EndYear</Var>" + "\n\t\t" +
			"  <Var>EndMonth</Var>" + "\n\t\t" +
			"  <Var>EndDay</Var>" + "\n\t\t" +
			"  <Var>EndHour</Var>" + "\n\t\t" +
			"  <Var>EndMinute</Var>" + "\n\t\t" +
			"</Expr>" + "\n\t   "+
			"</Atom>";
			
		//Program Chair Retrieve Important Dates
		var choice19 =
				"<Atom>" + "\n\t\t" +
			    "<Rel>getTrackPapers</Rel>" + "\n\t\t" +
                "<Ind>accepted</Ind>" + "\n\t\t" +
			    "<Var>TrackPapers</Var>" + "\n\t    " +
			    "</Atom>";
		var choice20 =
			    "<Atom>" + "\n\t\t" +
			    "<Rel>getFullPapers</Rel>" + "\n\t\t" +
                "<Ind>accepted</Ind>" + "\n\t\t" +
			    "<Var>FullPapers</Var>" + "\n\t    " +
			    "</Atom>";	
		var choice21 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getAuthorsOfPaper</Rel>" + "\n\t\t" +
			"<Ind>'Business Process Data Compliance'</Ind>" + "\n\t\t" +
			"<Var>Authors</Var>" + "\n\t    " +
			"</Atom>";
		var choice22 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getShortPapers</Rel>" + "\n\t\t" +
            "<Ind>accepted</Ind>" + "\n\t\t" +
			"<Var>ShortPapers</Var>" + "\n\t    " +
			"</Atom>";		
		var choice23 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getPosterPapers</Rel>" + "\n\t\t" +
            "<Ind>accepted</Ind>" + "\n\t\t" +
			"<Var>PosterPapers</Var>" + "\n\t    " +
			"</Atom>";	
		var choice24 =
			"<Atom>" + "\n\t\t" +
			"<Rel>getDoctoralConsortiumPapers</Rel>" + "\n\t\t" +
            "<Ind>accepted</Ind>" + "\n\t\t" +
			"<Var>DoctoralConsortiumPapers</Var>" + "\n\t    " +
			"</Atom>";
			
		 var messageHeader =
                  "<RuleML xmlns=\n   \"http://www.ruleml.org/0.91/xsd\"" + "\n" +
				  " xmlns:xsi=\n   \"http://www.w3.org/2001/XMLSchema-instance\"" + "\n" +
				  " xsi:schemaLocation=\n   \"http://www.ruleml.org/0.91/xsd" + "\n   " +
				  " http://ibis.in.tum.de/research/" + "\n    " + "ReactionRuleML/0.2/rr.xsd\"" + "\n" +
				  " xmlns:ruleml2012=" + "\n   " + "\"http://ibis.in.tum.de/projects/paw#\">" + "\n" +
				  "\n " + "<Message mode=\"outbound\"" + "\n  " + "directive=\"query-sync\">" +
			      "\n   " + "<oid>" + "\n      " + 
			      "<Ind>RuleML-2012-ECAI</Ind>" + "\n   " +
			      "</oid>" + "\n   " +
			      "<protocol>" + "\n      " +
			      "<Ind>esb</Ind>" + "\n   " +
			      "</protocol>" + "\n   " +
			      "<sender>" + "\n      " +
			      "<Ind>User</Ind>" + "\n   " +
			      "</sender>" + "\n   " +
			      "<content>" + "\n      ";			
				  
		var messageFooter = 			     
				"   " + "</content>" + "\n " +
			      "</Message>" + "\n" +
			      "</RuleML>";
				  
		if(choice == 0){
			document.form2.box1.value = messageHeader + choice0 + messageFooter;
		}else if(choice == 1){
			document.form2.box1.value = messageHeader + choice1 + messageFooter;
		}else if(choice == 2){
			document.form2.box1.value = messageHeader + choice2 + messageFooter;
		}else if(choice == 3){
			document.form2.box1.value = messageHeader + choice3 + messageFooter;
		}else if(choice == 4){
			document.form2.box1.value = messageHeader + choice4 + messageFooter;
		}else if(choice == 5){
			document.form2.box1.value = messageHeader + choice5 + messageFooter;
		}else if(choice == 6){
			document.form2.box1.value = messageHeader + choice6 + messageFooter;
		}else if(choice == 7){
			document.form2.box1.value = messageHeader + choice7 + messageFooter;
		}else if(choice == 8){
			document.form2.box1.value = messageHeader + choice8 + messageFooter;
		}else if(choice == 9){
			document.form2.box1.value = messageHeader + choice9 + messageFooter;
		}else if(choice == 10){
			document.form2.box1.value = messageHeader + choice10 + messageFooter;
		}else if(choice == 11){
			document.form2.box1.value = messageHeader + choice11 + messageFooter;
		}else if(choice == 12){
			document.form2.box1.value = messageHeader + choice12 + messageFooter;
		}else if(choice == 13){
			document.form2.box1.value = messageHeader + choice13 + messageFooter;
		}else if(choice == 14){
			document.form2.box1.value = messageHeader + choice14 + messageFooter;
		}else if(choice == 15){
			document.form2.box1.value = messageHeader + choice15 + messageFooter;
		}else if(choice == 16){
			document.form2.box1.value = messageHeader + choice16 + messageFooter;
		}else if(choice == 17){
			document.form2.box1.value = messageHeader + choice17 + messageFooter;
		}else if(choice == 18){
			document.form2.box1.value = messageHeader + choice18 + messageFooter;
		}else if(choice == 19){
			document.form2.box1.value = messageHeader + choice19 + messageFooter;
		}else if(choice == 20){
			document.form2.box1.value = messageHeader + choice20 + messageFooter;
		}else if(choice == 21){
			document.form2.box1.value = messageHeader + choice21 + messageFooter;
		}else if(choice == 22){
			document.form2.box1.value = messageHeader + choice22 + messageFooter;
		}else if(choice == 23){
			document.form2.box1.value = messageHeader + choice23 + messageFooter;
		}else if(choice == 24){
			document.form2.box1.value = messageHeader + choice24 + messageFooter;
		}
	}
//RuleML Structure 
function elementSelected4(){

       var choice = document.form4.select4.selectedIndex;
	   //RuleML Struct general chair contact
		var choice0 = 
			      "<Atom>" + "\n         " +
			      "<Rel>getContact</Rel>" + "\n         " + 
				"<Ind>ruleml2012ATbrf_GeneralChair</Ind>" + "\n         " +
				
			      "<Var>Contact</Var>" + "\n      " +
			      "</Atom>" + "\n";
    }
