@echo off
IF dummy==dummy%1 (
set /p ip="Enter the IP that will be hosting the servlets: " 
) ELSE (
set ip=%1
)


call ServletMaker %ip% SymposiumPlanner ECAI2012DocSymposiumChair ServletMaker
call ServletMaker %ip% SymposiumPlanner ECAI2012GeneralChair ServletMaker
call ServletMaker %ip% SymposiumPlanner ECAI2012IntlRuleChalChair ServletMaker
call ServletMaker %ip% SymposiumPlanner ECAI2012IntlRuleChalSteerCommitChair ServletMaker
call ServletMaker %ip% SymposiumPlanner ECAI2012LiaisonChair ServletMaker
call ServletMaker %ip% SymposiumPlanner ECAI2012LocalChair ServletMaker
call ServletMaker %ip% SymposiumPlanner ECAI2012MetaAndSocialChair ServletMaker
call ServletMaker %ip% SymposiumPlanner ECAI2012PanelChair ServletMaker
call ServletMaker %ip% SymposiumPlanner ECAI2012ProgramChair ServletMaker
call ServletMaker %ip% SymposiumPlanner ECAI2012PublicityChair ServletMaker
call ServletMaker %ip% SymposiumPlanner ECAI2012SteeringChair ServletMaker

call ServletMaker %ip% SymposiumPlanner STRUCT2012AdvisoryBoard ServletMaker
call ServletMaker %ip% SymposiumPlanner STRUCT2012CEI ServletMaker
call ServletMaker %ip% SymposiumPlanner STRUCT2012CoChairs ServletMaker
call ServletMaker %ip% SymposiumPlanner STRUCT2012DefeasibleLogic ServletMaker
call ServletMaker %ip% SymposiumPlanner STRUCT2012MAS ServletMaker
call ServletMaker %ip% SymposiumPlanner STRUCT2012ModalLogic ServletMaker
call ServletMaker %ip% SymposiumPlanner STRUCT2012PSOA ServletMaker
call ServletMaker %ip% SymposiumPlanner STRUCT2012ReactionRules ServletMaker
call ServletMaker %ip% SymposiumPlanner STRUCT2012TGAgent ServletMaker
call ServletMaker %ip% SymposiumPlanner STRUCT2012UnCertReason ServletMaker