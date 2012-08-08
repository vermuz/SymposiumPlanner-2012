      
/***********************************************
* Ultimate Fade-In Slideshow (v1.51): © Dynamic Drive (http://www.dynamicdrive.com)
* This notice MUST stay intact for legal use
* Visit http://www.dynamicdrive.com/ for this script and 100s more.
***********************************************/
 
var fadeimages3=new Array()
////SET IMAGE PATHS. Extend or contract array as needed
fadeimages3[0]=["images/splash/promo_2010date.jpg", "http://www.businessrulesforum.com/", ""] //plain image syntax
//fadeimages3[1]=["images/splash/promo_webinar_515b.jpg", "http://www.businessrulesforum.com/webinars.php?id=515", ""] //plain image syntax
//fadeimages3[3]=["images/splash/promo_2009_alignment.jpg", "http://www.businessrulesforum.com/business-alignment.php", ""] //plain image syntax
//fadeimages3[4]=["images/splash/promo_2009_openrules.jpg", "http://www.businessrulesforum.com/open-source-day.php", ""] //plain image syntax
//fadeimages3[5]=["images/splash/promo_2009_complex.jpg", "http://www.businessrulesforum.com/abstracts.php?id=395", ""] //plain image syntax
//fadeimages3[6]=["images/splash/promo_2009_constraint.jpg", "http://www.businessrulesforum.com/abstracts.php?id=461", ""] //plain image syntax
//fadeimages3[2]=["images/splash/promo_webinar_383b.jpg", "http://www.businessrulesforum.com/webinars.php?info=383", ""] //plain image syntax
//fadeimages3[2]=["images/splash/promo_main.jpg", "http://www.businessrulesforum.com/about-the-conference.php", ""] //plain image syntax
//fadeimages3[3]=["images/splash/promo_schedule.jpg", "http://www.businessrulesforum.com/conference-schedule.php", ""] //plain image syntax



var fadeimages2=new Array()
//SET IMAGE PATHS. Extend or contract array as needed
fadeimages2[0]=["http://www.BusinessRulesForum.com/images/sponsors_diamond.jpg", "http://www.BusinessRulesForum.com/sponsors.php#diamond", ""] //plain image syntax
fadeimages2[1]=["http://www.BusinessRulesForum.com/images/sponsors_platinum.jpg", "http://www.BusinessRulesForum.com/sponsors.php#platinum", ""] //plain image syntax
fadeimages2[2]=["http://www.BusinessRulesForum.com/images/sponsors_gold.jpg", "http://www.BusinessRulesForum.com/sponsors.php#gold", ""] //plain image syntax
fadeimages2[3]=["http://www.BusinessRulesForum.com/images/sponsors_silver.jpg", "http://www.BusinessRulesForum.com/sponsors.php#silver", ""] //plain image syntax
fadeimages2[4]=["http://www.BusinessRulesForum.com/images/sponsors_bronze.jpg", "http://www.BusinessRulesForum.com/sponsors.php#bronze", ""] //plain image syntax
fadeimages2[5]=["http://www.BusinessRulesForum.com/images/sponsors_media.jpg", "http://www.BusinessRulesForum.com/sponsors.php#media", ""] //plain image syntax
fadeimages2[6]=["http://www.BusinessRulesForum.com/images/sponsors_association.jpg", "http://www.BusinessRulesForum.com/sponsors.php#association", ""] //plain image syntax
fadeimages2[7]=["http://www.BusinessRulesForum.com/images/sponsors_standards.jpg", "http://www.BusinessRulesForum.com/sponsors.php#standards", ""] //plain image syntax
//fadeimages2[2]=["http://www.BusinessRulesForum.com/images/sponsors_gold.jpg", "http://www.BusinessRulesForum.com/sponsors.php#gold", ""] //plain image syntax
//fadeimages2[3]=["http://www.BusinessRulesForum.com/images/sponsors_gold2.jpg", "http://www.BusinessRulesForum.com/sponsors.php#gold", ""] //plain image syntax
//fadeimages2[4]=["http://www.BusinessRulesForum.com/images/sponsors_silver.jpg", "http://www.BusinessRulesForum.com/sponsors.php#silver", ""] //plain image syntax
//fadeimages2[5]=["http://www.BusinessRulesForum.com/images/sponsors_media.jpg", "http://www.BusinessRulesForum.com/sponsors.php#media", ""] //plain image syntax
//fadeimages2[6]=["http://www.BusinessRulesForum.com/images/sponsors_media2.jpg", "http://www.BusinessRulesForum.com/sponsors.php#media", ""] //plain image syntax
//fadeimages2[7]=["http://www.BusinessRulesForum.com/images/sponsors_standards.jpg", "http://www.BusinessRulesForum.com/sponsors.php#standards", ""] //plain image syntax

var fadebgcolor="#EEEEEE"

////NO need to edit beyond here/////////////
 
var fadearray=new Array() //array to cache fadeshow instances
var fadeclear=new Array() //array to cache corresponding clearinterval pointers
 
var dom=(document.getElementById) //modern dom browsers
var iebrowser=document.all
 
function fadeshow(theimages, fadewidth, fadeheight, borderwidth, delay, pause, displayorder){
this.pausecheck=pause
this.mouseovercheck=0
this.delay=delay
this.degree=10 //initial opacity degree (10%)
this.curimageindex=0
this.nextimageindex=1
fadearray[fadearray.length]=this
this.slideshowid=fadearray.length-1
this.canvasbase="canvas"+this.slideshowid
this.curcanvas=this.canvasbase+"_0"
if (typeof displayorder!="undefined")
theimages.sort(function() {return 0.5 - Math.random();}) //thanks to Mike (aka Mwinter) :)
this.theimages=theimages
this.imageborder=parseInt(borderwidth)
this.postimages=new Array() //preload images
for (p=0;p<theimages.length;p++){
this.postimages[p]=new Image()
this.postimages[p].src=theimages[p][0]
}
 
var fadewidth=fadewidth+this.imageborder*2
var fadeheight=fadeheight+this.imageborder*2
 
if (iebrowser&&dom||dom) //if IE5+ or modern browsers (ie: Firefox)
document.write('<div id="master'+this.slideshowid+'" style="position:relative;width:'+fadewidth+'px;height:'+fadeheight+'px;overflow:hidden;"><div id="'+this.canvasbase+'_0" style="position:absolute;width:'+fadewidth+'px;height:'+fadeheight+'px;top:0;left:0;filter:progid:DXImageTransform.Microsoft.alpha(opacity=10);opacity:0.1;-moz-opacity:0.1;-khtml-opacity:0.1;background-color:'+fadebgcolor+'"></div><div id="'+this.canvasbase+'_1" style="position:absolute;width:'+fadewidth+'px;height:'+fadeheight+'px;top:0;left:0;filter:progid:DXImageTransform.Microsoft.alpha(opacity=10);opacity:0.1;-moz-opacity:0.1;-khtml-opacity:0.1;background-color:'+fadebgcolor+'"></div></div>')
else
document.write('<div><img name="defaultslide'+this.slideshowid+'" src="'+this.postimages[0].src+'"></div>')
 
if (iebrowser&&dom||dom) //if IE5+ or modern browsers such as Firefox
this.startit()
else{
this.curimageindex++
setInterval("fadearray["+this.slideshowid+"].rotateimage()", this.delay)
}
}

function fadepic(obj){
if (obj.degree<100){
obj.degree+=10
if (obj.tempobj.filters&&obj.tempobj.filters[0]){
if (typeof obj.tempobj.filters[0].opacity=="number") //if IE6+
obj.tempobj.filters[0].opacity=obj.degree
else //else if IE5.5-
obj.tempobj.style.filter="alpha(opacity="+obj.degree+")"
}
else if (obj.tempobj.style.MozOpacity)
obj.tempobj.style.MozOpacity=obj.degree/101
else if (obj.tempobj.style.KhtmlOpacity)
obj.tempobj.style.KhtmlOpacity=obj.degree/100
else if (obj.tempobj.style.opacity&&!obj.tempobj.filters)
obj.tempobj.style.opacity=obj.degree/101
}
else{
clearInterval(fadeclear[obj.slideshowid])
obj.nextcanvas=(obj.curcanvas==obj.canvasbase+"_0")? obj.canvasbase+"_0" : obj.canvasbase+"_1"
obj.tempobj=iebrowser? iebrowser[obj.nextcanvas] : document.getElementById(obj.nextcanvas)
obj.populateslide(obj.tempobj, obj.nextimageindex)
obj.nextimageindex=(obj.nextimageindex<obj.postimages.length-1)? obj.nextimageindex+1 : 0
setTimeout("fadearray["+obj.slideshowid+"].rotateimage()", obj.delay)
}
}
 
fadeshow.prototype.populateslide=function(picobj, picindex){
var slideHTML=""
if (this.theimages[picindex][1]!="") //if associated link exists for image
slideHTML='<a href="'+this.theimages[picindex][1]+'" target="'+this.theimages[picindex][2]+'">'
slideHTML+='<img src="'+this.postimages[picindex].src+'" border="'+this.imageborder+'px">'
if (this.theimages[picindex][1]!="") //if associated link exists for image
slideHTML+='</a>'
picobj.innerHTML=slideHTML
}
 
 
fadeshow.prototype.rotateimage=function(){
if (this.pausecheck==1) //if pause onMouseover enabled, cache object
var cacheobj=this
if (this.mouseovercheck==1)
setTimeout(function(){cacheobj.rotateimage()}, 100)
else if (iebrowser&&dom||dom){
this.resetit()
var crossobj=this.tempobj=iebrowser? iebrowser[this.curcanvas] : document.getElementById(this.curcanvas)
crossobj.style.zIndex++
fadeclear[this.slideshowid]=setInterval("fadepic(fadearray["+this.slideshowid+"])",50)
this.curcanvas=(this.curcanvas==this.canvasbase+"_0")? this.canvasbase+"_1" : this.canvasbase+"_0"
}
else{
var ns4imgobj=document.images['defaultslide'+this.slideshowid]
ns4imgobj.src=this.postimages[this.curimageindex].src
}
this.curimageindex=(this.curimageindex<this.postimages.length-1)? this.curimageindex+1 : 0
}
 
fadeshow.prototype.resetit=function(){
this.degree=10
var crossobj=iebrowser? iebrowser[this.curcanvas] : document.getElementById(this.curcanvas)
if (crossobj.filters&&crossobj.filters[0]){
if (typeof crossobj.filters[0].opacity=="number") //if IE6+
crossobj.filters(0).opacity=this.degree
else //else if IE5.5-
crossobj.style.filter="alpha(opacity="+this.degree+")"
}
else if (crossobj.style.MozOpacity)
crossobj.style.MozOpacity=this.degree/101
else if (crossobj.style.KhtmlOpacity)
crossobj.style.KhtmlOpacity=this.degree/100
else if (crossobj.style.opacity&&!crossobj.filters)
crossobj.style.opacity=this.degree/101
}
 
 
fadeshow.prototype.startit=function(){
var crossobj=iebrowser? iebrowser[this.curcanvas] : document.getElementById(this.curcanvas)
this.populateslide(crossobj, this.curimageindex)
if (this.pausecheck==1){ //IF SLIDESHOW SHOULD PAUSE ONMOUSEOVER
var cacheobj=this
var crossobjcontainer=iebrowser? iebrowser["master"+this.slideshowid] : document.getElementById("master"+this.slideshowid)
crossobjcontainer.onmouseover=function(){cacheobj.mouseovercheck=1}
crossobjcontainer.onmouseout=function(){cacheobj.mouseovercheck=0}
}
this.rotateimage()
}
