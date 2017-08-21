




































<html lang="en">
<HEAD>










<!-- WSC Console Federation -->





















<style type="text/css">

/* The browser agent is IE */
/* The agent locale is en */
/* The agent OS is NT */
/* The font size multiplier is 1.0 */


/************  LOGIN PAGE ***************/
/*  Check to see if these are still used  */
.login-button-section {  padding-left: 0px; font-family: Verdana,Helvetica, sans-serif;  font-weight:normal; color: #000000; background-color:#CCCCCC; background-image: none;  } 
.login-background { 
    background-repeat: no-repeat; 
    background-position: right top;
    background-color: transparent; 
}

  
  
/* BANNER PAGE */

.top-navigation { color: #000000; font-size:70.0%; background-color:#ADB0EC; font-family: Verdana,Helvetica, sans-serif; padding-left: 10px; padding-right: 5px;}  
.top-nav-item  { color: #000000; font-family: Verdana,Helvetica,sans-serif; font-weight:bold; text-decoration: none  } 
a.top-nav-item  { color: #000000; font-family: Verdana,Helvetica,sans-serif; font-weight:bold;  } 
a:active.top-nav-item  { color: #000000; font-family: sans-serif; }  
a:hover.top-nav-item {  text-decoration: underline}

.header {  margin-top: 0px; margin-right: 0px; margin-bottom: 0px; margin-left: 0px ; font-family: Verdana, Helvetica, sans-serif;  }
.bannerImages {
        border-top: #CCCCCC 1px solid;  border-bottom: 1px solid #CCCCCC;
}




/************* ACCESSIBILITY *************/
/*  Need to determine final form of these */
.accessibility-jumps-bottom { font-size:50%; color: #FFFFFF; margin-top: 20px; margin-bottom: 0px; }
.accessibility-jumps-top { font-size:50%; color: #FFFFFF; margin-top: -20px; margin-bottom: 0px; }
.accessibility-jumps-bottom a  { color: #FFFFFF;}
.accessibility-jumps-top a  { color: #FFFFFF;}


/*************** WIZARDS *****************/
/*  Need to determine if these are still used */
th.wizard-step  { border-top: 1px solid #FFFFFF; border-left: 1px solid #88a4d7; border-bottom: 1px solid #88a4d7; border-right: 1px solid #88a4d7; color: #006699; font-size:72.0%; background-color:#d1d9ec; font-family: Verdana,Helvetica, sans-serif;   padding-left: 8px; padding-right: 8px; padding-top: 5px; padding-bottom: 5px; text-align: left }
.wizard-step  {  background-color:#FFFFFF; font-family: Verdana,Helvetica, sans-serif;  font-size: 65.0%; text-align: left;  color: #000000;}
.wizard-step-text { background-color:#FFFFFF; font-family: Verdana,Helvetica, sans-serif;  font-size: 65.0%; text-align: left;  color: #000000;  }
.wizard-button-section {  font-family: Verdana,Helvetica, sans-serif;  text-align: left; font-weight:normal; color: #000000; background-color:#B5C5DD; border-top: 1px solid #FFFFFF; border-left: 1px solid #FFFFFF; } 
.wizard-step-expanded { 
        color: #000000;  background-color:#FFFFFF; font-family: Verdana,Helvetica, sans-serif; font-weight:normal; 
        /*border-bottom: 1px solid #88a4d7; */
        border-right: 1px solid white; padding-left: 8px; padding-right: 8px; padding-top: 5px; padding-bottom: 5px; text-align: left 
}        
.wizard-table {  background-color:#708eb7; border: 1px solid #708eb7; }
.wizard-step-title {
    background-color:#b5c5dd;
    font-size:70.0%;
    font-weight: bold;    
}

/*************** TABS *****************/


.tabs-on { 
    color: #000000; 
    font-size:65.0%; 
    background-color:#FFFFFF; 
    font-family: Verdana, sans-serif; 
    font-weight:normal; 
    border-bottom: 0px solid #FFFFFF; 
    border-right: 1px solid #88a4d7;
    border-top: 1px solid #88a4d7; 
    border-left: 1px solid #88a4d7; 
    padding-left: 8px; 
    padding-right: 8px; 
    padding-top: 5px; 
    padding-bottom: 5px; 
    text-align: left;
}
.tabs-off { 
    border-top: 1px solid #88a4d7;   
    border-bottom: 1px solid #88a4d7; 
    border-right: 1px solid #88a4d7; 
    border-left: 1px solid #88a4d7; 
    color: #006699; 
    font-size:65.0%; 
    background-color:#d1d9ec; 
    font-family: Verdana, sans-serif;   
    padding-left: 8px; 
    padding-right: 8px; 
    padding-top: 5px; 
    padding-bottom: 5px; 
    text-align: left; 
} 

.blank-tab { 
    background-color:#FFFFFF;  
    border-bottom: 1px solid #88a4d7;  
}

.wizard-tabs-on { 
    border-right: 0px solid #88a4d7; 
    color: #FBEC97; 
    font-size:65.0%; 
    background-color:#708eb7; 
    font-family: Verdana,Helvetica, sans-serif; 
    font-weight:bold;
    padding-left: 0px; 
    padding-top: 6px; 
    text-align: left; 
}
.wizard-tabs-off { 
    border-right: 0px solid #88a4d7; 
    color: #FFFFFF; 
    font-size:65.0%; 
    background-color:#708eb7; 
    font-family: Verdana,Helvetica, sans-serif;   
    padding-left: 0px; 
    padding-top: 5px; 
    text-align: left;
}
.wizard-tabs-image { 
    background-color:#708eb7; 
    padding-left: 0px; 
    padding-top: 5px; 
    text-align: right;    
} 

.tabs-item { color: #006699; 
    font-family: Verdana, sans-serif;
    text-decoration: none;   
}
a:active.tabs-item  { color: #000000 }
.tabsColumn { background-color:#b5c5dd; border-left: 1px solid #88a4d7; border-right: 0px solid #88a4d7; border-top: 1px solid #88a4d7; border-bottom: 1px solid #88a4d7; }

.navtabs-on { color: #000000; font-size:65.0%; background-color:#FFFFFF; font-family: Verdana, sans-serif;  border-left: 1px solid #CCCCCC; border-top: 1px solid #CCCCCC; border-right: 1px solid #CCCCCC;  padding-left: 8px; padding-right: 8px; padding-top: 5px; padding-bottom: 5px; text-align: center }
.navtabs-off { color: #000000; font-size:65.0%; background-color:#E2E2E2; font-family: Verdana, sans-serif;  border-left: 1px solid #C0C0C0; border-top: 1px solid #C0C0C0; border-right: 1px solid #C0C0C0; border-bottom: 1px solid #CCCCCC; padding-left: 8px; padding-right: 8px; padding-top: 5px; padding-bottom: 5px; text-align: center    } 
.navtabs-item { color: #000000;  background-color:#E2E2E2; font-family: Verdana, sans-serif; text-decoration:none }
.navblank-tab { background-color:#FFFFFF;  border-bottom: 1px solid #CCCCCC;  }

.nav-perspectives {
    color: #000000; 
    font-size:65.0%; 
    background-color:#FFFFFF; 
    font-family: Verdana, sans-serif;  
    padding-left: 0px; padding-right: 5px; 
    padding-top: 5px; padding-bottom: 5px; 
    text-align: left; 
}


/*************** FORMS and CONTENT *************/



LI { 
    margin-left: 0.75em;padding-top: 1px; padding-bottom: 1px;font-family: Verdana, sans-serif; 
    
}
UL { 
    margin-left: 0.75em;margin-bottom: 0px; margin-top: 0px; font-size:65.0%; list-style-position: outside; list-style-type: square; color: #BCBCBC
}
.nav-bullet {
    font-size:130.0%; 
    margin-left: 1.0em;    
}

.navigation-bullet {
    font-size:130.0%; 
    margin-left: 0.75em;
}
.security-bullet{
   font-size:65.0%; padding-left: 1em; margin-left: 1.0em; margin-bottom: 2px; margin-top:0em;  list-style-position: outside; list-style-type: square; color: black
}

LABEL {
    margin-left: 0.5em; margin-bottom: .5em; overflow: visible; margin-right: 0em;
    
    
}
.requiredField {
    margin-left: -0.75em;
} 

.chkbox {  
    margin-left: 0em; 
} 

 
FIELDSET { 
    border: 1px solid #E7E7E7; 
    padding-bottom: 1em;
    margin-top: 0em;
    margin-left: 0em;
    /*background-color: #F7F7F7;*/
}

FIELDSET TABLE { 
    margin-left: 0em;
}



LEGEND  {   color: #336699;  
            font-weight: bold; 
            

            font-size:85.0%;
            /*border-bottom: 1px solid #C0C0C0;*/
            margin-top: .25em;
            /*background-color: #F7F7F7;*/
            white-space: nowrap;    
            
}
.readOnlyElement { 
    /*overflow:scroll;*/
    
    margin-left: 0.5em;
    color: #666666; 
    border:1px #666666 solid;
    background-color:#FFFFFF;
    margin-top:0em;
    padding: 1px;     
}
.readOnlyAreaElement { height:5em;overflow:auto;margin-left: 2.25em;color: #666666; border:1px #666666 solid;background-color:#FFFFFF;margin-top:0em;padding: 2px; }

PRE {
    font-size: 105%;
}
    
  



FIELDSET .categorizedField { 
    margin-left: 0em;
    padding-left: 0em;
}
.black-bullet {
    color: #000000;
}

.addprop-heading {
    color:#336699; 
    margin-left: -.5em; margin-right: 0em;
    font-weight: bold;
    font-size:100.0%;  
    margin-top: .75em;
}


.addprop-bullet {
    margin-left: 1.25em; margin-right: 0em;
}



.collectionLabel {
    margin-left: 0em;
    margin-right: -1em;
}

OL {
    color: #000000;
}

.fieldset-noborder { border: 0px }

HR {
    color:#88a4d7; margin-left: -.35em; margin-right: 0em;
}

    
SELECT {  font-family: Verdana,sans-serif; font-size:95.0%; 
          border:1px #000000 solid; 
          margin-top: 0em;
          padding: 2px; 
          margin-left: 0.4em;
}
TEXTAREA {  font-size:95.0%; 
            font-family: Verdana,sans-serif; 
            border:1px solid; 
            margin-top: 0em;
            padding: 2px;
            margin-left: 0.4em;
            /*width: 80%;*/
            border-color:#336699 #8CB1D1 #8CB1D1 #336699;
}
FORM { 
    margin-bottom:0px; margin-top: 0px; padding-top: 0px; padding-bottom: 0px;
}


.textEntryReadOnly {
    color:#666666;
    font-family: Verdana,sans-serif; 
    background-color:#FFFFFF;
    margin-left: 0.5em;
    font-size:95.0%; 
    margin-top: 0em;    
    font-family: Verdana,sans-serif; 
    margin-top: 0em;
    border-bottom-width:1px;
    border-style:solid;
    padding-right:1px;
    border-right-width:1px;
    border-left-width:1px;
    padding-top:1px;
    border-color:#CCCCCC #CCCCCC #CCCCCC #CCCCCC;
    padding-bottom:1px;
    border-top-width:1px;
    padding-left:1px;
    
    
}
.textEntryRequired {
    BACKGROUND-COLOR: #fff7de;
    margin-left: 0.5em;
    font-size:95.0%; 
    margin-top: 0em;    
    font-family: Verdana,sans-serif; 
    margin-top: 0em;
    border-bottom-width:1px;
    border-style:solid;
    padding-right:1px;
    border-right-width:1px;
    border-left-width:1px;
    padding-top:1px;
    border-color:#336699 #8CB1D1 #8CB1D1 #336699;
    padding-bottom:1px;
    border-top-width:1px;
    padding-left:1px;

}
.textEntryRequiredLong {
    BORDER-RIGHT: #cccccc 1px solid; 
    BORDER-TOP: #a5a684 1px solid; 
    BORDER-LEFT: #a5a684 2px solid; 
    BORDER-BOTTOM: #cccccc 1px solid; 
    BACKGROUND-COLOR: #fff7de;
    margin-left: 0.5em;
    font-size:95.0%; 
}
  
.textEntryReadOnlyRequired {
    color:#666666;
    font-family: Verdana,sans-serif; 
    background-color:#ECECEC;
	BORDER-RIGHT: #cccccc 1px solid; 
    BORDER-TOP: #a5a684 1px solid; 
    BORDER-LEFT: #a5a684 2px solid; 
    BORDER-BOTTOM: #cccccc 1px solid;
    padding: 2px;
    /*width: 12em; */
    margin-top: 0em;
    margin-left: 0.5em;
    font-size:95.0%;
}
.textEntry {
    font-family: Verdana,sans-serif; 
    margin-top: 0em;
    border-bottom-width:1px;
    background-color:#FFFFFF;
    border-style:solid;
    padding-right:1px;
    border-right-width:1px;
    border-left-width:1px;
    padding-top:1px;
    border-color:#336699 #8CB1D1 #8CB1D1 #336699;
    padding-bottom:1px;
    border-top-width:1px;
    padding-left:1px;
    margin-left: 0.5em;
    font-size:95.0%;
}

.fileUpload {
    font-family: Verdana,sans-serif; 
    margin-top: 0em;
    border-bottom-width:1px;
    background-color:#FFFFFF;
    border-style:solid;
    padding-right:1px;
    border-right-width:1px;
    border-left-width:1px;
    padding-top:1px;
    border-color:#336699 #8CB1D1 #8CB1D1 #336699;
    padding-bottom:1px;
    border-top-width:1px;
    padding-left:1px;
    margin-left: 0.5em;
    font-size:95.0%;
    /*width: 30em;*/
}

.noIndentTextEntry {
    font-family: Verdana,sans-serif; 
    margin-top: 0em;
    border-bottom-width:1px;
    background-color:#FFFFFF;
    border-style:solid;
    padding-right:1px;
    border-right-width:1px;
    border-left-width:1px;
    padding-top:1px;
    border-color:#336699 #8CB1D1 #8CB1D1 #336699;
    padding-bottom:1px;
    border-top-width:1px;
    padding-left:1px;
    margin-left: 0.15em;
    font-size:95.0%;
    /*width: 12em; */
}
.noIndentTextEntryLong {
    font-family: Verdana,sans-serif; 
    margin-top: 0em;
    border-bottom-width:1px;
    background-color:#FFFFFF;
    border-style:solid;
    padding-right:1px;
    border-right-width:1px;
    border-left-width:1px;
    padding-top:1px;
    border-color:#336699 #8CB1D1 #8CB1D1 #336699;
    padding-bottom:1px;
    border-top-width:1px;
    padding-left:1px;
    margin-left: 0.15em;
    font-size:95.0%;
    width: 24em;
}


.textEntryLong {
    font-family: Verdana,sans-serif; 
    margin-top: 0em;
    border-bottom-width:1px;
    background-color:#FFFFFF;
    border-style:solid;
    padding-right:1px;
    border-right-width:1px;
    border-left-width:1px;
    padding-top:1px;
    border-color:#336699 #8CB1D1 #8CB1D1 #336699;
    padding-bottom:1px;
    border-top-width:1px;
    padding-left:1px;
    margin-left: 0.5em;
    font-size:95.0%;
    width: 23em;
}

.textEntryReadOnlyLong {
    color:#666666;
    font-family: Verdana,sans-serif; 
    background-color:#FFFFFF;
    border: 1px #CCCCCC solid;
    margin-top: 0em;
    border-bottom-width:1px;
    padding-right:1px;
    padding-top:1px;
    padding-bottom:1px;
    padding-left:1px;
    margin-left: 0.5em;
    font-size:95.0%;
    width: 23em;
}

.noIndentLabel {
    margin-left: 0.25em; padding-bottom: 1em;  
} 

.perspectiveImg {
    margin-bottom: 0em;
    margin-left: 0.25em;
}
.nav-perspectives {
    width: 100%;
    border-bottom: 1px solid #CCCCCC;
    margin-bottom: 0.5em;
    margin-left: 0em;
    margin-top: 0em;
}
.hidden {
	display: none;
}

           
/******* BUTTONS ********/

.buttons  {  font-family: Verdana,Helvetica, sans-serif; 
    font-size:70.0%; 
    margin: 1px 2px 1px 2px; border-top: 1px outset #B1B1B1; 
    border-right: 1px outset #000000; border-bottom: 1px outset #000000; 
    border-left: 1px outset #B1B1B1; 
    
}

.buttons-filter  {  
    font-family: Verdana,Helvetica, sans-serif; font-size:95.0%; margin: 1px 2px 1px 2px; border-top: 1px outset #B1B1B1; border-right: 1px outset #000000; border-bottom: 1px outset #000000; border-left: 1px outset #B1B1B1; 
}
.buttons#functions  {   font-size:95.0%;
    font-weight:normal; font-family: Verdana, sans-serif; 
    BORDER-RIGHT: #336699 1px solid; BORDER-TOP: #8cb1d1 1px solid; 
    BORDER-LEFT: #8cb1d1 1px solid; BORDER-BOTTOM: #336699 1px solid; 
    BACKGROUND-COLOR: #EAF1FF   
}
 

.function-button-section { 
    font-size:70.0%; 
    padding-left: 8px; font-family: 
    Verdana,Helvetica, sans-serif;  
    text-align: left;  
    color: #000000;  
    font-weight: normal; 
    background-color: #d1d9e8;  
    border-left: 1px solid #FFFFFF; 
    border-top: 1px solid #FFFFFF; 
    padding-top: 0.25em; 
}

                                     
.table-button-section { 
    font-size:65.0%; 
    padding-left: 8px; font-family: 
    Verdana,Helvetica, sans-serif;  
    text-align: left;  
    color: #000000;  
    font-weight: normal; 
    background-color: #d1d9e8; 
    border-left: 1px solid #FFFFFF; 
    border-top: 1px solid #FFFFFF; 
    padding-top: 0.25em; 
} 


.paging-button-section { 
    font-size:65.0%; 
    padding-left: 8px; 
    font-family: Verdana,Helvetica, sans-serif;  
    text-align: left;  
    color: #000000; 
    background-color: #d1d9e8; 
    font-weight: normal; 
    border-top: 1px solid #FFFFFF;
} 

.file-button-section { 
    font-size:95.0%; 
    padding-left: 8px; font-family: 
    Verdana,Helvetica, sans-serif;  
    text-align: left;  
    color: #000000;  
    font-weight: normal; 
    background-color: #d1d9e8; 
    border-left: 1px solid #FFFFFF; 
    border-top: 1px solid #FFFFFF; 
    padding-top: 0.25em; 
} 

.paging-table { 
    background-color: #d1d9e8; 
    border-left: 1px solid #88a4d7; 
    border-right: 1px solid #88a4d7; 
    border-bottom: 1px solid #88a4d7;   
}
.table-totals {
    font-size:65.0%; border-top: 1px solid #ffffff; padding-left: 1em; font-family: Verdana,Helvetica, sans-serif;  text-align: left;  color: #000000; background-color: #d1d9e8; font-weight: normal;   
}

.wizard-button-section .buttons#navigation   {  font-family: Verdana, sans-serif; font-size: 70.0%;  border-top: 1px outset #B1B1B1; border-right: 1px outset #000000; border-bottom: 1px outset #000000; border-left: 1px outset #B1B1B1;  margin-top:2px;}

.navigation-button-section   {  
    background-color:#FFFFFF; 
    margin-top:1em;
    font-size:90.0%;
    text-align: left;
    padding-left: 0.25em;
}

.buttons#preview {
    margin-top: 0em;
    margin-bottom: 1em;
    BORDER-RIGHT: #336699 1px solid; 
    BORDER-TOP: #8cb1d1 1px solid;
    BORDER-LEFT: #8cb1d1 1px solid; 
    BORDER-BOTTOM: #336699 1px solid; 
    BACKGROUND-COLOR: #EAF1FF;
    font-size:65.0%;
}

.buttons#section-button {
    margin-top: 0em;
    margin-bottom: 1em;
    BORDER-RIGHT: #336699 1px solid; 
    BORDER-TOP: #8cb1d1 1px solid;
    BORDER-LEFT: #8cb1d1 1px solid; 
    BORDER-BOTTOM: #336699 1px solid; 
    BACKGROUND-COLOR: #EAF1FF;
    font-size:70.0%; 
}
.buttons#navigation {
    margin-top: 1em;
    BORDER-RIGHT: #336699 1px solid; 
    BORDER-TOP: #8cb1d1 1px solid;
    BORDER-LEFT: #8cb1d1 1px solid; 
    BORDER-BOTTOM: #336699 1px solid; 
    BACKGROUND-COLOR: #EAF1FF;
    font-size:70.0%; 
}
.buttons#other {  
    font-family: Verdana,Helvetica, sans-serif; 
    font-size:95.0%; 
    BORDER-RIGHT: #336699 1px solid; BORDER-TOP: #8cb1d1 1px solid; BORDER-LEFT: #8cb1d1 1px solid; 
    BORDER-BOTTOM: #336699 1px solid; BACKGROUND-COLOR: #EAF1FF 
}
.special {
    font-family: Verdana,Helvetica, sans-serif; 
    font-size:95.0%; 
    BORDER-RIGHT: #336699 1px solid; BORDER-TOP: #8cb1d1 1px solid; BORDER-LEFT: #8cb1d1 1px solid; 
    BORDER-BOTTOM: #336699 1px solid; BACKGROUND-COLOR: #EAF1FF 
}
.buttons#steps {  
    font-family: Verdana, sans-serif; 
    font-size:95.0%;  
    margin: 0px;
    padding: 0px; 
    border: 0px solid black; 
    text-decoration:underline; 
    color:#FFFFFF; 
    background-color: #708eb7;
    cursor: pointer;
    cursor: hand;
}
.buttons#paging-next {  
    background-image: url(images/wtable_next.gif);
    background-repeat:no-repeat;
    background-position:bottom left;
    height: 27;
    width: 27;
    text-align: right;
    font-family: Verdana,Helvetica, sans-serif; font-size:0.0%; margin: 2px 2px -2px 2px; BORDER-RIGHT: #336699 0px solid; BORDER-TOP: #8cb1d1 0px solid; BORDER-LEFT: #8cb1d1 0px solid; BORDER-BOTTOM: #336699 0px solid; BACKGROUND-COLOR: #d1d9e8;color:#d1d9e8
}
.buttons#paging-prev {  
    background-image: url(images/wtable_previous.gif);
    background-repeat:no-repeat;
    background-position:bottom left;
    height: 27;
    width: 27;
    text-align: right;
    font-family: Verdana,Helvetica, sans-serif; font-size:0.0%; margin: 2px 2px -2px 2px; BORDER-RIGHT: #336699 0px solid; BORDER-TOP: #8cb1d1 0px solid; BORDER-LEFT: #8cb1d1 0px solid; BORDER-BOTTOM: #336699 0px solid; BACKGROUND-COLOR: #d1d9e8;color:#d1d9e8
}

.buttons#paging-prev-disabled { 
    background-image: url(images/blank20.gif);
    background-repeat:no-repeat;
    background-position:bottom left;
    height: 27;
    width: 27;
    text-align: right;
    text-decoration:none;
    font-family: Verdana,Helvetica, sans-serif; font-size:0.0%; margin: 2px 2px -2px 2px; BORDER-RIGHT: #336699 0px solid; BORDER-TOP: #8cb1d1 0px solid; BORDER-LEFT: #8cb1d1 0px solid; BORDER-BOTTOM: #336699 0px solid; BACKGROUND-COLOR: #d1d9e8;color:#d1d9e8
}
.buttons#paging-next-disabled {   
    background-image: url(images/blank20.gif);
    background-repeat:no-repeat;
    background-position:bottom left;
    height: 27;
    width: 27;    
    text-align: right;
    text-decoration:none;
    font-family: Verdana,Helvetica, sans-serif; font-size:0.0%; margin: 2px 2px -2px 2px; BORDER-RIGHT: #336699 0px solid; BORDER-TOP: #8cb1d1 0px solid; BORDER-LEFT: #8cb1d1 0px solid; BORDER-BOTTOM: #336699 0px solid; BACKGROUND-COLOR: #d1d9e8;color:#d1d9e8
}

.button-section {  
    padding-top: 0em; 
    margin-top: 0em; 
    margin-left: 0em; 
    font-family: Verdana, sans-serif;  
    text-align: left; 
    font-weight:normal; 
    color: #000000; 
    /*background-color:#FFFFFF; 
    border-top: 1px solid #336699*/
    background-color: #d1d9e8; 
    border-left: 1px solid #88a4d7; 
    border-right: 1px solid #88a4d7; 
    border-top: 1px solid #88a4d7;
    border-bottom: 1px solid #88a4d7;     
} 

.linkButton {
    BORDER-RIGHT: #336699 1px solid; 
    BORDER-TOP: #8cb1d1 1px solid;
    BORDER-LEFT: #8cb1d1 1px solid; 
    BORDER-BOTTOM: #336699 1px solid; 
    BACKGROUND-COLOR: #EAF1FF;
    padding: 2px;
    padding-left:3px;
    margin-top: 5px;
    font-size: 65.0%;
    text-decoration: none;    
    color:black;
    white-space: nowrap; 
    text-align: center;   
}


	

/*  SYSTEM STATUS AREA  */

.tray-text {   font-family: Verdana,Helvetica, sans-serif; font-size:70.0%; background-color:#FFFFFF; color: #000000;  }
.was-message-item  { color: #000000; font-family: Verdana,Helvetica,sans-serif; font-weight:bold; font-size:70.0%;  } 
.was-message-item a { font-weight: normal }





/* TABLES */
.table-text-white {   font-family: Verdana,Helvetica, sans-serif; font-size:65.0%; background-color: #ffffff; background-image: none; }
.table-text {   font-family: Verdana, sans-serif; font-size:65.0%;  
    background-image: none; 
    background-color: #ffffff;
    overflow: auto;
    
}

.table-text-help-portlet {   font-family: Verdana, sans-serif; font-size:65.0%;  
    background-image: none; 
    background-color: #ffffff;
    overflow: auto;
}

.table-text-gray {   
    font-family: Verdana, sans-serif; font-size:65.0%;  background-image: none; color: #336699 
}
.table-text#running { color: green; font-family: Verdana,Helvetica, sans-serif; font-size:70.0%; background-color: #F7F7F7; background-image: none; }
.table-text#stopped { color: black; font-family: Verdana,Helvetica, sans-serif; font-size:70.0%; background-color: #F7F7F7; background-image: none; }
.table-text#problems { color: red; font-family: Verdana,Helvetica, sans-serif; font-size:70.0%; background-color: #F7F7F7; background-image: none; }
.table-text#unknown { color: orange; font-family: Verdana,Helvetica, sans-serif; font-size:70.0%; background-color: #F7F7F7; background-image: none; }
.column-head {  padding-left: .35em; font-family: Verdana,Helvetica, sans-serif; font-size: 70.0%; font-weight:bold; text-align: left; color: #FFFFFF; background-color: #8691C7; background-image: none; }  
.column-head-name { 
    border-top: 1px solid #FFFFFF; border-left: 1px solid #FFFFFF; 
    padding-left: .35em; font-family: Verdana,Helvetica, sans-serif; 
    font-size: 65.0%;font-weight:normal; text-align: left; 
    color: #000000; background-color: #d1d9e8; 
    background-image: none; 
    
    
}   

.column-head-name-showFilter {  
    border-top: 1px solid #FFFFFF; border-left: 1px solid #FFFFFF; padding-left: .35em; font-family: Verdana,Helvetica, sans-serif; font-size: 65.0%;font-weight:normal; text-align: left; color: #000000; background-image: none; 
}   
.column-head-filter {  
    border-top: 1px solid #FFFFFF; border-left: 1px solid #FFFFFF; padding-left: .35em; font-family: Verdana,Helvetica, sans-serif; font-size:65.0%;font-weight:normal; text-align: left; color: #000000; background-color: #d1d9e8; background-image: none; 
}   
.column-head-prefs {  padding-left: .35em; font-family: Verdana,Helvetica, sans-serif; font-size:70.0%; font-weight:bold; text-align: left; color: #FFFFFF; background-color:#6B7A92; background-image: none; }  





.table-row-SELECTED {   
    font-family: Verdana,sans-serif; 
    font-size:65.0%; 
    background-color: #E7E7E7; 
}
.table-row {   
    font-family: Verdana,Helvetica, sans-serif; font-size:65.0%; background-color: #f7f7f7; 
}
.collection-table-text {
    border-top: 1px solid #FFFFFF; 
    border-left: 1px solid #FFFFFF; 
    padding-left: .35em; font-family: 
    Verdana,Helvetica, sans-serif;
    font-weight:normal; 
    text-align: left;
    overflow: visible; 
}

.collection-table-property-text {
    margin-top: -0.5em;font-family: Verdana,Helvetica, sans-serif;font-weight:normal; text-align: left; font-size:65.0%;
}


.framing-table { background-color: #88a4d7; background-image: none; }
.noframe-framing-table  { background-color: #767776; background-image: none; border-right: 1px solid #CCCCCC; border-bottom: 1px solid #CCCCCC;  border-left: 1px solid #CCCCCC; }

.layout-manager {  
    background-color:#FFFFFF; 
    border-right: 1px solid #88a4d7; 
    border-bottom: 1px solid #88a4d7;
    border-left: 1px solid #88a4d7; 
    min-width:600px;
    width:expression(document.body.clientWidth < 600? "600px": "auto" );
}
.layout-manager#notabs {  
    background-color:#FFFFFF; 
    /*border-top: 1px solid #88a4d7; 
    border-bottom: 1px solid #88a4d7;
    border-right: 1px solid #88a4d7;*/
    border: 0px;
    
}
 
.highlighted { background-color: #FFFFCC  }
.not-highlighted { background-color: #FFFFFF  }
.description-text { padding-left: 5px; font-family: Verdana,Helvetica, sans-serif; font-size:70.0%; background-color: #FFFFFF}
.instruction-text { 
    font-weight:normal;padding-left: 5px; 
    margin-top: 8px; margin-bottom: 6px; 
    font-family: Verdana, Helvetica, sans-serif; 
    font-size:65.0%; 
    background-color: #FFFFFF;
}
.information {  font-family: Verdana, Helvetica, sans-serif; font-size:70.0%; color:#993300;}
.paging-text { font-size: 71.0%}
.runtime-checkbox { font-size:70.0%; font-family: Verdana,Helvetica, sans-serif;  text-align: left; font-weight:normal; color: #000000; background-color:#CCCCCC; }

.find-filter {  
    font-family: Verdana, sans-serif; 
    font-size: 65.0%; 
    color: #000000;  
    margin-left: 3px;  
}

.find-filter-expanded {   font-family: Verdana,Helvetica, sans-serif; font-size: 71.0%; color: #000000; background-color: #AABFDF;  padding-left: 20px; padding-top: 5px; padding-bottom: 5px; border-bottom: 1px solid #88a4d7; border-top: 1px solid #88a4d7;  }
.find-filter-text {   font-family: Verdana,Helvetica, sans-serif; font-size: 71.0%; color: #000000; background-color: #AABFDF; }
.collection-total {   font-family: Verdana,Helvetica, sans-serif; font-size: 71.0%; color: #000000; background-color: #FFFFFF;  }
.collection-total-expanded {   padding-left: 40px; font-family: Verdana,Helvetica, sans-serif; font-size: 71.0%; color: #000000; background-color: #FFFFFF;  }

.complex-property { 
    font-family: Verdana,Helvetica, sans-serif; 
    font-size:65.0%; 
    padding-left: 2.5em;  
}

.expand-task {
    margin-top: 2px; margin-bottom: 2px; text-decoration: none; color: #000000;    
}


.column-filter-expanded {   
    font-family: Verdana,Helvetica, sans-serif; 
    font-size: 65.0%; 
    color: #000000; 
    background-color: #88a4d7;  
    padding-left:1em; padding-top: 0px; 
    padding-bottom: 0px; 
    /**border-bottom: 1px solid #AABFDF; 
    border-top: 1px solid #AABFDF;**/
}



/*  BODY STYLES */

a {color:#0000FF }
a:active { color:#666666 }
#plusminus {text-decoration: none; color: #000000; }
.content {  background-color: #FFFFFF ; font-family: Verdana, Helvetica, sans-serif; scrollbar-face-color:#CCCCCC; scrollbar-shadow-color:#FFFFFF; scrollbar-highlight-color:#FFFFFF; scrollbar-3dlight-color:#6B7A92; scrollbar-darkshadow-color:#6B7A92; scrollbar-track-color:#E2E2E2; scrollbar-arrow-color:#6B7A92 }
.topology-view {  padding-top: 5px;  font-family: Verdana, Helvetica, sans-serif; font-size:70.0%; background-color: #FFFFFF}
.topology-view H1#bread-crumb{  font-family: Verdana, Helvetica, sans-serif; font-size: 130%; background-color: #FFFFFF ; letter-spacing: -.03em;  margin-top: .75em; margin-bottom: -.25em;}
.topology-view p.instruction-text{  padding-left:.5em; font-family: Verdana, Helvetica, sans-serif; font-size: 100%; background-color: #FFFFFF}


.navtree {  
    margin-left: 4px;
    margin-right:0px;
    font-size:70.0%;
    background-color: #FFFFFF; 
    font-family: Verdana, sans-serif; 
    border-right: 1px solid #CCCCCC; 
    margin-top: 0px; 
    scrollbar-face-color:#CCCCCC; 
    scrollbar-shadow-color:#FFFFFF; 
    scrollbar-highlight-color:#FFFFFF; 
    scrollbar-3dlight-color:#6B7A92; 
    scrollbar-darkshadow-color:#6B7A92; 
    scrollbar-track-color:#E2E2E2; 
    scrollbar-arrow-color:#6B7A92;
    width:expression(document.body.clientWidth < 200? "200px": "auto" );
}



.navigation-table { background-color: #FFFFFF; font-family: Verdana, Helvetica, sans-serif; }
.navigation-table-entry {  font-family: Verdana, Helvetica, sans-serif; font-size:70.0%; }

.main-task {
    font-size:90.0%; 
    padding: 0em;
    margin-top: .5em; 
    margin-bottom:0em; 
    text-decoration: none; 
    color: #000000; 
    background-color:#DCDFEF; 
    border:1px solid #CCCCCC;    
}
.sub-task {
    font-size:90.0%; 
    padding: .0em;
    margin-top: .25em; 
    margin-bottom:0em; 
    text-decoration: none; 
    color: #000000; 
}

.nav-child {
    padding-top: 1px;
    padding-bottom:1px;
    padding-left:1em;
}
.nav-child-container {
    display:none;
    background-color:#F7F7F7;
    border-left:1px solid #CCCCCC;
    border-bottom:1px solid #CCCCCC;
    border-right:1px solid #CCCCCC;
    padding-top:.25em;
    padding-right:.5em;
    padding-bottom:.25em;
    padding-left: 1.25em;
    margin-bottom:.5em;
}
.sub-child-container {
    display:none;
    background-color:#F7F7F7;
    /*border-left:1px solid #CCCCCC;
    border-bottom:1px solid #CCCCCC;
    border-right:1px solid #CCCCCC;*/
    padding-top:0em;
    padding-right:.5em;
    padding-bottom:.25em;
    padding-left: 1.5em;
}




/*  TITLES  */

H1 { font-family: Verdana,Helvetica, sans-serif; font-size:65.0%; ; margin-left: 5px }
H1#title-bread-crumb { font-family: Verdana,Helvetica, sans-serif; font-size:65.0%; margin-top:.5em; margin-bottom: 0em; }
H1#bread-crumb { font-family: Verdana,Helvetica, sans-serif; font-size:65.0%;   margin-top: .5em; margin-bottom: 0em; }
H3#bread-crumb { 
    font-family: Verdana,Helvetica, sans-serif; font-size:65.0%; margin-top: 0em;  margin-bottom: 0em;
}

H2 { 
    margin-left:0em; 
    margin-right: 3px; 
    margin-top: 0px; background-color:#FFFFFF; font-size:65.0%; 
    border-bottom: 2px solid #336699; 
    margin-bottom: 3px; FONT-FAMILY: Verdana, Helvetica, sans-serif; COLOR: #336699; 
    word-wrap: normal;
}
H3 {
    border-bottom: 1px solid #336699;
    margin-top: 1em;
    margin-bottom: 0em;
    margin-left: 1em;
    width: 100%;
    font-size:60.0%;
    color: #336699;
}
.property-section-title {
    font-family: Verdana,sans-serif; 
    text-align: left; 
    background-color: #FFFFFF;
}

/******* Additional Properties Categories ************/
.main-category {
    font-size:65.0%; 
    padding: 0em;
    margin-top: .5em; 
    margin-bottom:0em; 
    text-decoration: none; 
    color: #336699; 
    font-weight:bold;
    border-bottom: 2px solid #336699; 
    width: 100%;
    margin-left:0em;
    white-space: nowrap; 
       
}
.sub-category {
    font-size:60.0%; 
    padding-top: 0.5em;
    margin-top: .25em; 
    margin-bottom:0em; 
    text-decoration: none; 
    color: #336699;
    width: 100%;
    margin-left:0em;
}

.main-child {
    padding-top: 1px;
    padding-bottom:1px;
    /*margin-left:1em;*/
    padding-left:0.8em;
    font-size:50.0%; 
    min-width:100px;
}
.main-category-container {
    padding-top:.25em;
    padding-right:.5em;
    padding-bottom:.25em;
    padding-left: .5em;
    margin-bottom:.5em;
    min-width:100px;
    width:expression(document.body.clientWidth< 100? "100px": "auto" );    
}
.sub-category-container {
    padding-top:0em;
    padding-right:.5em;
    padding-bottom:.25em;
    padding-left: 1em;
}
                                                                                                              




/* HELP PAGES */

.help {  font-size:70.0%; margin: 0px; background-color: #FFFFFF ; font-family: Verdana, Helvetica, sans-serif }
.index-link { font-family: Verdana, Helvetica, sans-serif; font-size: 75.0%; text-align: right; padding-top: 10px; padding-right: 10px; }


/* TREES */

#Item0 { font-weight: bold; padding-top: 5px}

.indent1 {   padding-left:0px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px  } 
.indent2 {   padding-left:19px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px  }
.indent3 {   padding-left:38px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px   }
.indent4 {   padding-left:57px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px  }
.indent5 {   padding-left:76px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px   }
.indent6 {   padding-left:95px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px   }
.indent7 {   padding-left:114px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px   }
.indent8 {   padding-left:133px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px   }
.indent9 {   padding-left:152px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px   }
.indent10 {   padding-left:171px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px   }
.indent1kids {   padding-left:-19px; font-family: Verdana,Helvetica, sans-serif; margin-top: 10px; margin-bottom: 4px; font-weight: bold; margin-left: 5px  } 
.indent2kids {   padding-left:0px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px  }
.indent3kids {   padding-left:19px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px   }
.indent4kids {   padding-left:38px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px  }
.indent5kids {   padding-left:57px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px   }
.indent6kids {   padding-left:76px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px   }
.indent7kids {   padding-left:95px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px   }
.indent8kids {   padding-left:114px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px   }
.indent9kids {   padding-left:133px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px   }
.indent10kids {   padding-left:152px; font-family: Verdana,Helvetica, sans-serif; margin-top: 1px; margin-bottom: 1px; margin-left: 5px   }






/* VALIDATION ERRORS */

.validation-error {
    color: #CC0000; font-family: Verdana,Helvetica, sans-serif; 
}
.validation-warn-info {
    color: #000000; font-family: Verdana,Helvetica, sans-serif; 
}
.validation-header { 
    color: #FFFFFF; background-color:#6B7A92; font-family: Verdana, sans-serif;
    font-weight:bold; 
    font-size: 65.0% 
}



/* HOMEPAGE STYLES */



.nolines {  font-size: 75.0%; border: 0px solid #CCCCFF;  }
.linesmost { font-size: 75.0%;   border-left: 0px; border-bottom: 0px; border-top: 1px solid #CCCCFF; border-right: 1px solid #CCCCFF;  background-color: #FFFFFF; padding-bottom: 12px}
.purpletext { font-family: sans-serif; color: #9933CC; font-size: 104.0%;}
.purplebold { font-weight: bold; color: #9933CC; font-size: 107.0%; font-family: Helvetica,sans-serif;}
.graytext { font-family: sans-serif; color: #666666; font-size: 104.0%;}
.graybold { font-weight: bold; color: #363636; font-size: 107.0%; font-family: Helvetica,sans-serif;}
.desctextabout { font-family: sans-serif; color: #363636; font-size: 101%; padding-bottom: 5px; line-height: 160%}
.desctexthead { font-weight: 600; font-family: sans-serif; color: #333333; font-size: 104.0%; padding-bottom: 5px; line-height: 155%}
.desctext { font-family: sans-serif; color: #666666; font-size: 90.0%; line-height: 130%}
.bluebold { font-weight: bold; color: #330066; font-size: 107.0%; font-family: Helvetica,sans-serif;}
a .purpletext { text-decoration: underline #000000}
a .purplebold { text-decoration: underline  #000000}
a .bluebold  {  text-decoration: underline; color: blue  }
a .graybold  {  text-decoration: underline  #000000}


 
/***********  NEW STYLES ***********/ 
.portalPage { margin-top: 10px; margin-left: 8px; background-color:#FFFFFF; border-bottom: 1px solid #CCCCCC; margin-bottom: 10px; FONT-FAMILY: Verdana, Helvetica, sans-serif; COLOR: #CCCCCC; }
.portalPage a { text-decoration: none; font-weight: normal; text-align: right; FONT-FAMILY: Verdana, Helvetica, sans-serif; }
.pageTitle { color: #999999; FONT-FAMILY: Verdana, Helvetica, sans-serif; font-size:70.0%; text-align: left }
.pageClose { FONT-FAMILY: Verdana, Helvetica, sans-serif; font-size:65.0%; text-align: right }    

.wpsToolBar {
	FONT-SIZE: 60.0%; COLOR: #000000; FONT-FAMILY: Verdana, Verdana, Helvetica, sans-serif; BACKGROUND-COLOR: #F7F7F7
}
.wpsToolBarIcon {
	BORDER-RIGHT: #ffffff 0px; PADDING-RIGHT: 0px; BORDER-TOP: #ffffff 1px solid; PADDING-LEFT: 0px; FONT-SIZE: 60.0%; PADDING-BOTTOM: 0px; MARGIN: 0px; BORDER-LEFT: #ffffff 1px solid; COLOR: #ffffff; PADDING-TOP: 0px; BORDER-BOTTOM: #ffffff 1px solid; FONT-FAMILY: Verdana, Verdana, Helvetica, sans-serif; BACKGROUND-COLOR: #5495d5
}
.wpsToolBarIconOn {
	BORDER-RIGHT: #ffffff 0px; PADDING-RIGHT: 0px; BORDER-TOP: #ffffff 1px solid; PADDING-LEFT: 0px; FONT-SIZE: 60.0%; PADDING-BOTTOM: 0px; MARGIN: 0px; BORDER-LEFT: #ffffff 1px solid; COLOR: #666666; PADDING-TOP: 0px; BORDER-BOTTOM: #ffffff 1px solid; FONT-FAMILY: Verdana, Verdana, Helvetica, sans-serif; BACKGROUND-COLOR: #3d67bb
}
.wpsToolBarLink {
    FONT-FAMILY: Verdana, Verdana, Helvetica, sans-serif; TEXT-DECORATION: none
}
.wpsToolBarLink:visited {
	FONT-FAMILY: Verdana, Verdana, Helvetica, sans-serif; TEXT-DECORATION: none
}
.wpsToolBarLink:hover {
	COLOR: #336699; FONT-FAMILY: Verdana, Verdana, Helvetica, sans-serif; TEXT-DECORATION: none
}
.wpsToolBarSeparator {
	BACKGROUND-COLOR: #F7F7F7
}
.wpsToolbarBannerBackground {
	BORDER-RIGHT: #ffffff 0px; PADDING-RIGHT: 0px; BACKGROUND-POSITION: left bottom; BORDER-TOP: #ffffff 1px solid; PADDING-LEFT: 0px; BACKGROUND-IMAGE: url(../../banner.jpg); PADDING-BOTTOM: 0px; MARGIN: 0px; BORDER-LEFT: #ffffff 1px solid; PADDING-TOP: 0px; BORDER-BOTTOM: #ffffff 1px solid; BACKGROUND-REPEAT: repeat-x; BACKGROUND-COLOR: #cfd9e5
}
.wpsLinkBar {
	FONT-SIZE: 60.0%; COLOR: #ffffff; BACKGROUND-REPEAT: no-repeat; FONT-FAMILY: Verdana, Verdana, Helvetica, sans-serif; BACKGROUND-COLOR: #ffffff
}
.wpsLinkBarLink {
	FONT-SIZE: 60.0%; COLOR: #817279; FONT-FAMILY: Verdana, Verdana, Helvetica, sans-serif; TEXT-DECORATION: underline
}
.wpsLinkBarLink:visited {
	FONT-SIZE: 60.0%; COLOR: #817279; FONT-FAMILY: Verdana, Verdana, Helvetica, sans-serif; TEXT-DECORATION: underline
}
.wpsLinkBarLink:hover {
	FONT-SIZE: 60.0%; COLOR: #817279; FONT-FAMILY: Verdana, Verdana, Helvetica, sans-serif; TEXT-DECORATION: underline
}

.wpsGpFilter {
	BACKGROUND-COLOR: #d4d4d4; font-family: Verdana,Helvetica, sans-serif; font-size: 70.0%; 
}
.wpsGpFilterLabel {
	FONT-WEIGHT: bold; BACKGROUND-COLOR: #d4d4d4; font-family: Verdana,Helvetica, sans-serif; font-size: 70.0%; 
}
.wpsPortletTitle {
	text-align: left;border-left: #000000 1px solid;  border-top: #000000 1px solid; border-bottom: #000000 1px solid; FONT-SIZE: 60.0%; COLOR: #ffffff; FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif; BACKGROUND-COLOR: #5495d5;
}
.wpsPortletTitleControls {
	text-align: right;border-top: #000000 1px solid; border-right: #000000 1px solid; border-bottom: #000000 1px solid; FONT-SIZE: 60.0%; COLOR: #ffffff; FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif; BACKGROUND-COLOR: #5495d5;
}


.wpsPortletArea {
        border-left: #CCCCCC 1px solid; 
        border-right: #CCCCCC 1px solid; 
        border-bottom: #CCCCCC 1px solid; 
        BACKGROUND-COLOR: #FFFFFF;
        padding: 0.75em;
}




.wpsTaskBarTable {
	COLOR: #000000; BACKGROUND-COLOR: #d4d4d4;  border-bottom: 1px solid #CCCCCC; border-top: 1px solid #CCCCCC; border-left: 1px solid #CCCCCC; margin: 3px;
}
.wpsTaskBar {
	COLOR: #000000; BACKGROUND-COLOR: #d4d4d4; border-top: 1px solid #CCCCCC; border-bottom: 1px solid #CCCCCC;
}
.wpsTaskBarText {
	FONT-SIZE: 60.0%; COLOR: #000000; FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif; TEXT-DECORATION: none
}



.wpsLoginHeadText {
	FONT-WEIGHT: bold; FONT-SIZE: small; MARGIN: 0px; COLOR: #000000; FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif; BACKGROUND-COLOR: #e8e8e8
}
.wpsLoginText {
	FONT-SIZE: 60.0%; MARGIN: 0px; COLOR: #000000; FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif; BACKGROUND-COLOR: #e8e8e8
}



 
.taskHead { 
    background-color: #CCCCCC
}
.taskHead a { 
	FONT-SIZE: 60.0%; COLOR: #000000; FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif; TEXT-DECORATION: none
}

.wasMessagePortlet {
    margin-left: 10px; margin-top: 0px;
}
.messagePortlet {
    background-color: #F7F7F7; border: 1px solid #88a4d7;
}
.messageTitle {
    FONT-SIZE: 65.0%;
    /*background-color:#DCDFEF;*/
}
#inlineMessage .buttons {
    FONT-SIZE: 70.0%; background-color:#E2E2E2
}
.wasMessageArea {
        border-left: #CCCCCC 1px solid; border-right: #CCCCCC 1px solid; BACKGROUND-COLOR: #FFFFFF
}
.wpsTaskBarTableFrame {
    margin-bottom: 12px; margin-right: 0px;padding-top: 8px;width:100%;background-color:#CCCCCC
}
.validationMessages {
    margin-left: 10px; 
}
.wasPortlet {
    margin-left: 10px; margin-top: 0px;
}
.wasUniPortlet {
    margin-top: 10px;
}
  
   

.navPortlet {
    margin-left: 5px; margin-top: 8px;
}
.navPortletTasks {
    margin-left: 5px; margin-bottom: 5px;
}



.navPortletTitle {
	font-weight:normal;text-align: left;border-left: #CCCCCC 1px solid;  border-top: #CCCCCC 1px solid; border-bottom: #CCCCCC 1px solid; FONT-SIZE: 60.0%; COLOR: #000000; FONT-FAMILY: Verdana, Arial, Helvetica, sans-serif; BACKGROUND-COLOR: #E7E7E7;
}

.navPortletTitleControls {
	text-align: right;border-top: #CCCCCC 1px solid; border-right: #CCCCCC 1px solid; border-bottom: #CCCCCC 1px solid; FONT-SIZE: 60.0%; COLOR: #000000; FONT-FAMILY: Verdana, sans-serif; BACKGROUND-COLOR: #E7E7E7;
}
.navPortletArea {
        border-left: #E2E2E2 1px solid; border-right: #E2E2E2 1px solid; border-bottom: #E2E2E2 1px solid; BACKGROUND-COLOR: #FFFFFF;
}

.contentFrame {
    border-top: 1px solid #88a4d7; border-bottom: 1px solid #88a4d7;
}
.collection-form {
    border-top: 1px solid #88a4d7;
}
.nav-select-element {
    font-family: Verdana,sans-serif; 
    font-size:95.0%; 
    border:1px #000000 solid; 
    margin-top: 0em;
    padding: 2px; 
    margin-left: 0em;    
}   

.helpTextDIV {
   /* border-bottom:1px #336699 solid;
    border-left:1px #336699 solid;  */
    font-family: Verdana,sans-serif; 
    font-size:95.0%;
    margin-left: 2.5em;
    padding:0em;
    color: #C0C0C0;
    margin-bottom: -1em; 
    margin-top: 0.15em;
    margin-right:2em; 
    width:90%;
}

.checkboxhelpTextDIV {
   /* border-bottom:1px #336699 solid;
    border-left:1px #336699 solid;  */
    font-family: Verdana,sans-serif; 
    font-size:95.0%;
    margin-left: 2.5em;
    padding:0em;
    color: #C0C0C0;
    margin-top: 0.15em;
    margin-right:2em; 
    width:90%;
}

.helpSectionTitles {
    font-weight:bold;

    font-size:65.0%;
    margin-bottom:.25em;
}

#fieldHelpPortlet {
    max-height:200px;
    min-width: 150px;
    /*width:expression(document.body.clientWidth < 150? "150px": "auto" );*/
    overflow: auto;
}

* html .hpContainer {
     margin-left: -200px;
     position: relative;
}

* html .hpMinWidth {
     padding-left: 200px;
}

* html .hpWidth {
     margin: 0 auto;
     width: auto;
     min-width: 200px;
}

/*\*/
* html .hpContainer, * html .hpLayout, * html .hpMinWidth, * html .hpWidth  {
     height: 1px;
}
/*/

</style>


<script LANGUAGE="JavaScript">
var pleaseWait = "Please Wait...";

var statusStarted = "Started";
var statusStopped = "Stopped";
var statusUnavailable = "Unavailable";
var statusUnknown = "Unknown";
var statusPartialStart = "Partial Start";
var statusPartialStop = "Partial Stop";
var statusSynchronized = "Synchronized";
var statusNotSynchronized = "Not synchronized";


if (statusStarted == "null") { statusStarted = "Started" }
if (statusStopped == "null") { statusStopped = "Stopped" }
if (statusUnavailable == "null") { statusUnavailable = "Unavailable" }
if (statusUnknown == "null") { statusUnknown = "Unknown" }
if (statusPartialStart == "null") { statusPartialStart = "Partial Start" }
if (statusPartialStop == "null") { statusPartialStop = "Partial Stop" }
if (statusSynchronized == "null") { statusSynchronized = "Synchronized" }
if (statusNotSynchronized == "null") { statusStarted = "Not Synchronized" }
statusArray = new Array(statusStarted,statusStopped,statusUnavailable,statusUnknown,statusPartialStart,statusPartialStop,statusSynchronized,statusNotSynchronized);
var statusIconStarted = '/ibm/console/images/running.gif';        
var statusIconStopped = '/ibm/console/images/stop.gif';
var statusIconUnavailable = '/ibm/console/images/unavail.gif';
var statusIconUnknown = '/ibm/console/images/unknown.gif';
var statusIconPartialStart = '/ibm/console/images/part_start.gif';
var statusIconPartialStop = '/ibm/console/images/part_stop.gif';
var statusIconSynchronized = '/ibm/console/images/synch.gif';
var statusIconNotSynchronized = '/ibm/console/images/not_synch.gif';                
statusIconArray = new Array(statusIconStarted,statusIconStopped,statusIconUnavailable,statusIconUnknown,statusIconPartialStart,statusIconPartialStop,statusIconSynchronized,statusIconNotSynchronized);

var moveInListError = "You must select an entry to be moved.";
var noInfoAvailable = "For field help information, select a field label or list marker when the help cursor appears.";

var lookInPageHelp = "";

var selectText = "Select";
//F04026-42139                      
var csrfURLParameter = "&csrfid=-402451829&";
</script>




<script language="JavaScript" src="/ibm/console/scripts/menu_functions.js"></script>


</HEAD>


<body class="content" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">










<div class="accessibility-jumps-top">
    Accessibility anchor links, skip to the following content sections:  
    <a href="#title">title</a>,
    <a href="#main">main</a>,
    <a href="#important">important messages</a>   
</div>





    
        
        
        
        
        
        
    












<!--WSC Console: needed for Federation-->













   
<a name="title"></a>















  <TABLE WIDTH="98%" CELLPADDING="0" CELLSPACING="0" BORDER="0" class="portalPage">
      <TR>
          <TD CLASS="pageTitle">Application servers
          </TD>
          <TD CLASS="pageClose"><A HREF="/ibm/console/navigation.do?wpageid=com.ibm.isclite.welcomeportlet.layoutElement.A&moduleRef=com.ibm.isclite.ISCAdminPortlet">Close page</A>
          </TD>
      </TR>
  </TABLE>


  <TABLE WIDTH="100%" CELLPADDING="0" CELLSPACING="0" BORDER="0">
  <TR>
  
    
  
  <TD valign="top">
  
  <TABLE WIDTH="98%" CELLPADDING="0" CELLSPACING="0" BORDER="0" CLASS="wasPortlet">

  <TR>
      <TH class="wpsPortletTitle" width="100%">Application servers</TH>
      <TH class="wpsPortletTitleControls">            
          
          <a href="/ibm/help/index.jsp?topic=/com.ibm.ws.console.servermanagement/urun_rsvr.html" tabindex="100" target='WAS_help'><img src="/ibm/console/images/title_help.gif" border="0" alt="View more information about this page" align="texttop"></a>
	  </TH>
	  <TH class="wpsPortletTitleControls">
          <A href="javascript:showHidePortlet('wasUniPortlet')">
              <img id="wasUniPortletImg" SRC="/ibm/console/images/title_minimize.gif" alt="Expand or collapse" border="0" align="texttop" tabindex="1"/>
          </A>    
      </TH>
  </TR>

  
  <TBODY ID="wasUniPortlet">
    <TR>   
  <TD CLASS="wpsPortletArea" COLSPAN="3" >
    
        <a name="important"></a> 
        
        <h1 id="title-bread-crumb">Application servers</h1>
        


   


   <p class="instruction-text">
       Use this page to view a list of the application servers in your environment and the status of each of these servers. You can also use this page to change the status of a specific application server.
   </p>


        
       




<a name="main"></a>


<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="0" WIDTH="100%" SUMMARY="List layout table">

	<TBODY>
		<TR>
			<TD CLASS="layout-manager" id="notabs">

    
        
    












































          








<SCRIPT>
// Added because Mozilla wants to use the TBODY and table-row-group to show/hide table rows
if (isDom) {
    showString = "table-row-group";
} else {
    showString = "inline";
}
function showHideFilter() {
    var filterTableImg = document.getElementById ("filterTableImg");
    
    if (filterTableImg.src.indexOf("wtable_filter_row_show") > 0) {
        disFilter = showString;
        filterTableImg.src = "/ibm/console/images/wtable_filter_row_hide.gif";
        filterTableImg.title = "Hide filter function";
    } else {
        filterTableImg.src = "/ibm/console/images/wtable_filter_row_show.gif";
        filterTableImg.title = "Show filter function";
        disFilter = "none";
    }

    document.getElementById("filterControls").style.display = disFilter;
}


function clearFilter(theForm) {
    //document.getElementById("searchFilter").value = "";
    elements = document.getElementsByName("searchPattern");
    for(var i = 0; i<elements.length; i++){
    	elements.item(i).value="*";
    }
    elements = document.getElementsByName("unused");
    for(var i = 0; i<elements.length; i++){
    	elements.item(i).value="*";
    }
    //document.getElementById("searchPattern").value = "*";
    //document.getElementById("searchAction").click();
    elForm = document.getElementById(theForm);
    iscDeselectAll(theForm);
    //elForm.submit();
    document.getElementById("searchAction").click();
}

function onenter(e, theForm) {
    var keyCodeChar  
      
	if (e && e.which){
        e = e;
        keyCodeChar = e.which;
    }
    else{
        e = event;
        keyCodeChar = e.keyCode;
    }
    
    if (keyCodeChar == 13){
		document.getElementById("searchAction").click();
        return false;
    }
	else{
		return true;
    }
}


var SELECTEDFilter = "";
var firstCol = "";

firstCol = "name";

SELECTEDFilter = "name";

</SCRIPT>















































<!-- d226010 -->

<!-- d226010 -->



 
 

<!-- gets all the Collection items which matches with the contextType and 
     compatibilty criteria using plugin registry API -->


 
 
 



            

  

   

            
            
                           
        
           
        
        
        
            
            
        




















<form name="PreferenceForm" method="get" action="/ibm/console/preferenceAction.do" class="nopad"><input type=hidden name='csrfid' value='s71pP1Ati78iFwT4Vzie2gg'/>


        <table border="0" cellpadding="2" cellspacing="0" valign="top" width="100%" summary="Framing Table" >
        <tbody>
          <tr valign="top"> 
            <td class="table-text-white" id="prefs" nowrap scope="rowgroup"> 
              <a href="javascript:showHideSection('com_ibm_ws_prefsTable')" CLASS="expand-task">
              <img id="com_ibm_ws_prefsTableImg" SRC="/ibm/console/images/arrow_collapsed.gif" alt="Show preferences" border="0" align="texttop" tabindex="1"/>
              Preferences</A>
              <input type="hidden" name="show" value="collapsed">
            </td>
          </tr>
          </tbody>
        </table>
        
        
      


        <table id="com_ibm_ws_prefsTable" style="display:none" border="0" cellpadding="2" cellspacing="0" valign="top" width="100%" summary="Framing Table" >
          <tbody>
                    
              <tr> 
                <td class="complex-property"> 
                  <table border="0" cellpadding="4" cellspacing="1" width="90%" summary="Properties Table">
                  
                      <tr>
                      
                            <td class="find-filter"  scope="row" valign="top" nowrap>
                      
                               <label FOR="text1" TITLE="Specifies the maximum number of rows that displays when the collection is large. Those rows not displayed appear on the next page.">
                               Maximum rows
                               </label>                                
                                <BR> 
                        
                        
                        
                        
                             
                                        <INPUT type="text" id="text1" class="textEntry" name="text1" size="25" value="20" TITLE="Specifies the maximum number of rows that displays when the collection is large. Those rows not displayed appear on the next page."/>
                                        
                                    
                                 
                             
                             
                        
                        
                          
                        <INPUT type="hidden"  name="dataType1"     value="unsigned" />
                        <INPUT type="hidden"  name="node1"         value="UI/Collections/ApplicationServer/Preferences#maximumRows" />
                        <INPUT type="hidden"  name="defaultValue1" value="20" /> 
                        
                        
                        
                     
                      <tr>
                      
                            <td class="find-filter"  scope="row" valign="top" nowrap>
                      
                      

                       
                   
                        
                           
                           
                                                   
                           
                          <label FOR="checkbox2" TITLE="Specifies whether to use the same filter criteria entered in the show filter function to display this page the next time you visit it.">                          
                               <INPUT class="chkbox" id="checkbox2" type="checkbox" name="checkbox2"   /> 
                               Retain filter criteria.
                          </label>

                       
                       
                       
                        <INPUT type="hidden"   name="node2"         value="UI/Collections/ApplicationServer/Preferences#retainSearchCriteria" />
                        <INPUT type="hidden"   name="defaultValue2" value="false" />
                        
                    
                   
                      <tr>
                      
                            <td class="find-filter"  scope="row" valign="top" nowrap>
                      
                      

                       
                   
                        
                           
                           
                                                   
                           
                          <label FOR="checkbox3" TITLE="When enabled, the collection will include application servers that belong to a server cluster. ">                          
                               <INPUT class="chkbox" id="checkbox3" type="checkbox" name="checkbox3"  CHECKED /> 
                               Include cluster members in the collection
                          </label>

                       
                       
                       
                        <INPUT type="hidden"   name="node3"         value="UI/Collections/ApplicationServer/Preferences#showClusterMembers" />
                        <INPUT type="hidden"   name="defaultValue3" value="true" />
                        
                    
                   
                      <tr>
                      
                            <td class="find-filter"  scope="row" valign="top" nowrap>
                      
                      

                       
                   
                        
                           
                           
                                                   
                           
                          <label FOR="checkbox4" TITLE="When enabled, the last confirmation criteria entered will be retained. When the user returns to this collection, the page will initially use the retained confirmation criteria to display the collection.">                          
                               <INPUT class="chkbox" id="checkbox4" type="checkbox" name="checkbox4"   /> 
                               Show confirmation for stop command
                          </label>

                       
                       
                       
                        <INPUT type="hidden"   name="node4"         value="UI/Collections/ApplicationServer/Preferences#showStopConf" />
                        <INPUT type="hidden"   name="defaultValue4" value="true" />
                        
                    
                   
                      <tr>
                      
                            <td class="find-filter"  scope="row" valign="top" nowrap>
                      
                      

                       
                   
                        
                           
                           
                                                   
                           
                          <label FOR="checkbox5" TITLE="When enabled, the last confirmation criteria entered will be retained. When the user returns to this collection, the page will initially use the retained confirmation criteria to display the collection.">                          
                               <INPUT class="chkbox" id="checkbox5" type="checkbox" name="checkbox5"  CHECKED /> 
                               Show confirmation for immediate stop command
                          </label>

                       
                       
                       
                        <INPUT type="hidden"   name="node5"         value="UI/Collections/ApplicationServer/Preferences#showImmStopConf" />
                        <INPUT type="hidden"   name="defaultValue5" value="true" />
                        
                    
                   
                      <tr>
                      
                            <td class="find-filter"  scope="row" valign="top" nowrap>
                      
                      

                       
                   
                        
                           
                           
                                                   
                           
                          <label FOR="checkbox6" TITLE="When enabled, the last confirmation criteria entered will be retained. When the user returns to this collection, the page will initially use the retained confirmation criteria to display the collection.">                          
                               <INPUT class="chkbox" id="checkbox6" type="checkbox" name="checkbox6"  CHECKED /> 
                               Show confirmation for terminate command
                          </label>

                       
                       
                       
                        <INPUT type="hidden"   name="node6"         value="UI/Collections/ApplicationServer/Preferences#showTerminateConf" />
                        <INPUT type="hidden"   name="defaultValue6" value="true" />
                        
                    
                   
            
                     </td>
                    </tr>
                
               
  
          <INPUT type="hidden" name="counter" VALUE="6" />
          
                   <tr> 
                  <td valign="top" class="navigation-button-section"> 
                    <input type="submit" name="submit2" value="Apply" class="buttons" id="section-button">
                    
                    <INPUT type="hidden" name="submit2" value="Enter" />
                    <input type="reset" value="Reset" class="buttons" id="section-button">
                  </td>
                </tr>

              </table>
            </td>
          </tr>
          </tbody>
        </table>

</form>


                 
                                        






<form name="com.ibm.ws.console.servermanagement.GenericServerCollectionForm" method="post" action="/ibm/console/collectionButton.do" id="com.ibm.ws.console.servermanagement.GenericServerCollectionForm"><input type=hidden name='csrfid' value='s71pP1Ati78iFwT4Vzie2gg'/>

				










  
















  


<!-- gets all the action list items which matches with the contextType and 
     compatibilty criteria using plugin registry API -->




        


        <table border="0" cellpadding="3" cellspacing="0" valign="top" width="100%" summary="Framing Table" CLASS="button-section">
        <tr valign="top">
        <td class="table-button-section"  nowrap> 
        
        
    

    
    
    
    
    
    
    <input type="submit" name="button.new" value="New" class="buttons" id="functions"/>
    
    
    
    
    <input type="submit" name="button.delete" value="Delete" class="buttons" id="functions"/>
    
    
    
    
    <input type="submit" name="button.templates" value="Templates..." class="buttons" id="functions"/>
    
    
    
    
    <input type="submit" name="button.start" value="Start" class="buttons" id="functions"/>
    
    
    
    
    <input type="submit" name="button.stop" value="Stop" class="buttons" id="functions"/>
    
    
    
    
    <input type="submit" name="button.immediateStop" value="ImmediateStop" class="buttons" id="functions"/>
    
    
    
    
    <input type="submit" name="button.terminate" value="Terminate" class="buttons" id="functions"/>
    
    
      
    
    

    <input type="hidden" name="definitionName" value="ApplicationServer.collection.buttons.panel"/>
    <input type="hidden" name="buttoncontextType" value="ApplicationServer"/>
    <input type="hidden" name="buttoncontextId" value="cells:wpgCell:nodes:bcgdmgr"/>
    <input type="hidden" name="buttonperspective" value="null"/> 
     <input type="hidden" name="formAction" value="applicationServerCollection.do"/>  
    

    
    
        </td>
        </tr>
        </table>



 


				
				

                    <table CLASS="button-section" border="0" cellpadding="3" cellspacing="0" valign="top" width="100%" summary="Generic funtions for the table, such as content filtering">
        <tr valign="top">
        <td class="function-button-section"  nowrap>
        <table border="0" cellpadding="0" cellspacing="0" valign="top" ><tr>
        
        <td>
        <A id="selectAllButton" HREF="javascript:iscSelectAll('com.ibm.ws.console.servermanagement.GenericServerCollectionForm')" tabindex="1" CLASS="expand-task">
            <IMG id="selectAllImg" align="top" SRC="/ibm/console/images/wtable_select_all.gif" ALT='Select all items' BORDER="0" ALIGN="texttop"> 
        </A>
        </td>
        <td>
        <A id="deselectAllButton" HREF="javascript:iscDeselectAll('com.ibm.ws.console.servermanagement.GenericServerCollectionForm')" tabindex="1" CLASS="expand-task">
            <IMG id="deselectAllImg" align="top" SRC="/ibm/console/images/wtable_deselect_all.gif" ALT='Deselect all items' BORDER="0" ALIGN="texttop"> 
        </A>  
        </td>
        
		<td>
        <A HREF="javascript:showHideFilter()" tabindex="1" CLASS="expand-task">
            <IMG id="filterTableImg" align="top" SRC="/ibm/console/images/wtable_filter_row_show.gif" ALT='Show filter function' BORDER="0" ALIGN="texttop"> 
        </A>
        </td>
        <td>
        <A HREF="javascript:clearFilter('com.ibm.ws.console.servermanagement.GenericServerCollectionForm')" tabindex="1" CLASS="expand-task">
            <IMG  id="clearFilterImg" align="top" SRC="/ibm/console/images/wtable_clear_filters.gif" ALT='Clear filter value' BORDER="0" ALIGN="texttop"/> 
        </A>
        </td>
        </table></tr>
        </td>        
        </tr>
        </table>

  
               
                                
				<TABLE BORDER="0" CELLPADDING="3" CELLSPACING="1" WIDTH="100%" SUMMARY="List table" CLASS="framing-table">
                   
					<TR>
                    
						<TH NOWRAP VALIGN="TOP" CLASS="column-head-name" SCOPE="col" id="selectCell" WIDTH="1%">
                        Select
                        </TH>
                                        

                    
						
					                    
						<TH VALIGN="MIDDLE" CLASS="column-head-name" SCOPE="col" NOWRAP  WIDTH="19.8%">
					
							Name
					
							<A HREF="applicationServerCollection.do?SortAction=true&col=name&order=DSC">
					
                                <IMG SRC="/ibm/console/images/Sort_ascend2.gif" align="texttop" BORDER="0"  ALT="Sorted in ascending order. Click to sort in descending order."></A>
					
                    
						</TH>
                        
                          
                                       
						
					                    
						<TH VALIGN="MIDDLE" CLASS="column-head-name" SCOPE="col" NOWRAP  WIDTH="19.8%">
					
							Node
					
							<A HREF="applicationServerCollection.do?SortAction=true&col=node&order=ASC">
                            <IMG SRC="/ibm/console/images/Sort_none.gif" align="texttop" BORDER="0"  ALT="The column is not sorted. Click to specify ascending order."></A>
					
                    
						</TH>
                        
                          
                                       
						
					                    
						<TH VALIGN="MIDDLE" CLASS="column-head-name" SCOPE="col" NOWRAP  WIDTH="19.8%">
					
							Version
					
							<A HREF="applicationServerCollection.do?SortAction=true&col=expandedVersion&order=ASC">
                            <IMG SRC="/ibm/console/images/Sort_none.gif" align="texttop" BORDER="0"  ALT="The column is not sorted. Click to specify ascending order."></A>
					
                    
						</TH>
                        
                          
                                       
						
					                    
						<TH VALIGN="MIDDLE" CLASS="column-head-name" SCOPE="col" NOWRAP  WIDTH="19.8%">
					
							Cluster Name
					
							<A HREF="applicationServerCollection.do?SortAction=true&col=clusterName&order=ASC">
                            <IMG SRC="/ibm/console/images/Sort_none.gif" align="texttop" BORDER="0"  ALT="The column is not sorted. Click to specify ascending order."></A>
					
                    
						</TH>
                        
                          
                                       
						
					                    
						<TH VALIGN="MIDDLE" CLASS="column-head-name" SCOPE="col" NOWRAP  WIDTH="19.8%">
					
							Status
					
                    
                        <A HREF="com.ibm.ws.console.servermanagement.forwardCmd.do?forwardName=ApplicationServer.content.main"><IMG SRC="/ibm/console/images/refresh.gif"  ALT="Specifies the refresh view." align="texttop" border="0"/></A>    
                    
						</TH>
                        
                          
                                       
						
                        
					</TR>
                    
                    
            
            
<SCRIPT language="JavaScript">
	var filterOptions = new Array(5);
	var filterText = new Array(5);
	
	
			filterOptions[0]=new Array(1);
			filterOptions[0][0]="name"
			filterText[0]=new Array(0);
			
			filterOptions[1]=new Array(1);
			filterOptions[1][0]="node"
			filterText[1]=new Array(0);
			
			filterOptions[2]=new Array(1);
			filterOptions[2][0]="version"
			filterText[2]=new Array(0);
			
			filterOptions[3]=new Array(1);
			filterOptions[3][0]="clusterName"
			filterText[3]=new Array(0);
			
			filterOptions[4]=new Array(4);
			filterOptions[4][0]="status"
			filterText[4]=new Array(3);
			
				filterOptions[4][1]="ExecutionState.STARTED";
				filterText[4][0]="Started";
				
				filterOptions[4][2]="ExecutionState.STOPPED";
				filterText[4][1]="Stopped";
				
				filterOptions[4][3]="ExecutionState.UNAVAILABLE";
				filterText[4][2]="Unavailable";
				
	
	
	function updateSearchPattern(){
		var filterValue = document.getElementById("searchFilter").value;
		var searchPattern = document.getElementById("searchPattern").value;
		for (var i=0; i < 5; i++){
			if(filterValue == filterOptions[i][0]){
				var selectInput = document.getElementById("SelectBoxFilterInput");
				var textInput = document.getElementById("rawTextFilterInput");
				var selectBox = document.getElementById("searchPatternSelect");
				var textBox = document.getElementById("searchPattern");
				if(filterOptions[i].length == 1){
					selectInput.style.display="none";
					textInput.style.display="";
					selectBox.name="unused";
					textBox.name="searchPattern";
				}
				else{
					selectInput.style.display="";
					textInput.style.display="none";
					textBox.name="unused";
					selectBox.name="searchPattern";
					selectBox.options.length=0;
					selectBox.options[0]=new Option("*","*");
					for(var j=0; j < filterOptions[i].length-1; j++){
						selectBox.options[j+1]=new Option(filterText[i][j],filterOptions[i][j+1]);
						if(filterText[i][j] == searchPattern){
							selectBox.options[j+1].selected="True";
						}
					}
				}
				return;
			}
		}
	}
</SCRIPT>

            <TBODY ID="filterControls" STYLE="display:none">
            <TR  width="100%">
            <TD CLASS="column-filter-expanded" COLSPAN=6>
            <BR>To filter the following table, select the column by which to filter, then enter filter criteria (wildcards: *,?,%).
            <table width="10%" border="0">
            <tr>
            <td NOWRAP CLASS="column-filter-expanded" align="left" valign="top">
            <LABEL for="searchFilter" title="Select the column by which to filter">Filter</LABEL><br>
                <select NAME="searchFilter" ID="searchFilter" onchange="updateSearchPattern()">
            
            				<OPTION VALUE="name" SELECTED="SELECTED">Name</OPTION>
            
            				<OPTION VALUE="node">Node</OPTION>
            
            				<OPTION VALUE="clusterName">Cluster Name</OPTION>
            
            				<OPTION VALUE="status">Status</OPTION>
            
		</select>
            
            </td>
            <td NOWRAP CLASS="column-filter-expanded" align="left" valign="top">
            
            <table>
            <tbody id="SelectBoxFilterInput" ><tr><td CLASS="column-filter-expanded">
            <LABEL for="searchPatternSelect" title="Enter the filter criteria">Search term(s):</LABEL><br>
            <SELECT class="textEntry" NAME="searchPattern" ID="searchPatternSelect" onkeypress="return onenter(event, this.form)">
            </SELECT>
            </td><td CLASS="column-filter-expanded">
            <INPUT TYPE="submit" NAME="searchAction" ID="searchActionSelect" VALUE="Go" CLASS="buttons-filter">
            </td></tr></tbody>
            <tbody id="rawTextFilterInput" ><tr><td CLASS="column-filter-expanded">
            <LABEL for="searchPattern" title="Enter the filter criteria">Search term(s):</LABEL><br>            
            
            <INPUT TYPE="text" class="textEntry" NAME="searchPattern" ID="searchPattern" VALUE="*" onkeypress="return onenter(event, this.form)">
             </td><td CLASS="column-filter-expanded">
            <INPUT TYPE="submit" NAME="searchAction" ID="searchAction" VALUE="Go" CLASS="buttons-filter">
            </tr></td></tbody>
			</table>
            <br><BR>            
            </td>
            </tr>
            </table>
                                    

            </TD> 
            </TR>
            </TBODY>
            
<SCRIPT language="JavaScript">
	updateSearchPattern();
	if("none" != "none"){
		showHideFilter();
	}
</SCRIPT>
  

            
            
            
               
                                      
					
                    
					
                  
					<TR CLASS="table-row">
					
						<TD VALIGN="top"  WIDTH="1%" HEADERS="header1" class="collection-table-text">
                        <label class="collectionLabel" for="selectedObjectIds" TITLE="Select Row 1">
                        <input type="checkbox" name="selectedObjectIds" value="cells:wpgCell:nodes:dehensv549p2.wpg.node:servers:GIBUIServer" onclick="checkChecks(this)" onkeypress="checkChecks(this)">
                        </LABEL>
						</TD>
					
                    
                    
					
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
							<A HREF="applicationServerCollection.do?EditAction=true&contextId=cells%3AwpgCell%3Anodes%3Adehensv549p2.wpg.node%3Aservers%3AGIBUIServer&resourceUri=server.xml&perspective=tab.configuration">GIBUIServer</A>
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          dehensv549p2.wpg.node&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          ND 6.1.0.47&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          GIBUICluster&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                    
                    
                    
                    <A target="statuswindow" href="/ibm/console/status?text=true&type=server&node=dehensv549p2.wpg.node&name=GIBUIServer&time=1501471739384">
                    <IMG name="statusIcon" border="0" onfocus='getObjectStatus("/ibm/console/status?text=true&type=server&node=dehensv549p2.wpg.node&name=GIBUIServer&time=1501471739384",this)' onmouseover='getObjectStatus("/ibm/console/status?text=true&type=server&node=dehensv549p2.wpg.node&name=GIBUIServer&time=1501471739384",this)' SRC="/ibm/console/status?type=server&node=dehensv549p2.wpg.node&name=GIBUIServer&time=1501471739384" ALT="Users with accessibility needs can click on the image to obtain status." TITLE="Users with accessibility needs can click on the image to obtain status.">
                    </A>
                        

                     
						</TD>
						
					</TR>
                    
					
                    
					
                  
					<TR CLASS="table-row">
					
						<TD VALIGN="top"  WIDTH="1%" HEADERS="header1" class="collection-table-text">
                        <label class="collectionLabel" for="selectedObjectIds" TITLE="Select Row 2">
                        <input type="checkbox" name="selectedObjectIds" value="cells:wpgCell:nodes:dehensv550p2.wpg.node:servers:GIBUIServer" onclick="checkChecks(this)" onkeypress="checkChecks(this)">
                        </LABEL>
						</TD>
					
                    
                    
					
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
							<A HREF="applicationServerCollection.do?EditAction=true&contextId=cells%3AwpgCell%3Anodes%3Adehensv550p2.wpg.node%3Aservers%3AGIBUIServer&resourceUri=server.xml&perspective=tab.configuration">GIBUIServer</A>
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          dehensv550p2.wpg.node&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          ND 6.1.0.47&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          GIBUICluster&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                    
                    
                    
                    <A target="statuswindow" href="/ibm/console/status?text=true&type=server&node=dehensv550p2.wpg.node&name=GIBUIServer&time=1501471739385">
                    <IMG name="statusIcon" border="0" onfocus='getObjectStatus("/ibm/console/status?text=true&type=server&node=dehensv550p2.wpg.node&name=GIBUIServer&time=1501471739385",this)' onmouseover='getObjectStatus("/ibm/console/status?text=true&type=server&node=dehensv550p2.wpg.node&name=GIBUIServer&time=1501471739385",this)' SRC="/ibm/console/status?type=server&node=dehensv550p2.wpg.node&name=GIBUIServer&time=1501471739385" ALT="Users with accessibility needs can click on the image to obtain status." TITLE="Users with accessibility needs can click on the image to obtain status.">
                    </A>
                        

                     
						</TD>
						
					</TR>
                    
					
                    
					
                  
					<TR CLASS="table-row">
					
						<TD VALIGN="top"  WIDTH="1%" HEADERS="header1" class="collection-table-text">
                        <label class="collectionLabel" for="selectedObjectIds" TITLE="Select Row 3">
                        <input type="checkbox" name="selectedObjectIds" value="cells:wpgCell:nodes:dehensv549p2.wpg.node:servers:bcgmas" onclick="checkChecks(this)" onkeypress="checkChecks(this)">
                        </LABEL>
						</TD>
					
                    
                    
					
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
							<A HREF="applicationServerCollection.do?EditAction=true&contextId=cells%3AwpgCell%3Anodes%3Adehensv549p2.wpg.node%3Aservers%3Abcgmas&resourceUri=server.xml&perspective=tab.configuration">bcgmas</A>
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          dehensv549p2.wpg.node&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          ND 6.1.0.47&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          bcgmasCluster&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                    
                    
                    
                    <A target="statuswindow" href="/ibm/console/status?text=true&type=server&node=dehensv549p2.wpg.node&name=bcgmas&time=1501471739385">
                    <IMG name="statusIcon" border="0" onfocus='getObjectStatus("/ibm/console/status?text=true&type=server&node=dehensv549p2.wpg.node&name=bcgmas&time=1501471739385",this)' onmouseover='getObjectStatus("/ibm/console/status?text=true&type=server&node=dehensv549p2.wpg.node&name=bcgmas&time=1501471739385",this)' SRC="/ibm/console/status?type=server&node=dehensv549p2.wpg.node&name=bcgmas&time=1501471739385" ALT="Users with accessibility needs can click on the image to obtain status." TITLE="Users with accessibility needs can click on the image to obtain status.">
                    </A>
                        

                     
						</TD>
						
					</TR>
                    
					
                    
					
                  
					<TR CLASS="table-row">
					
						<TD VALIGN="top"  WIDTH="1%" HEADERS="header1" class="collection-table-text">
                        <label class="collectionLabel" for="selectedObjectIds" TITLE="Select Row 4">
                        <input type="checkbox" name="selectedObjectIds" value="cells:wpgCell:nodes:dehensv550p2.wpg.node:servers:bcgmas" onclick="checkChecks(this)" onkeypress="checkChecks(this)">
                        </LABEL>
						</TD>
					
                    
                    
					
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
							<A HREF="applicationServerCollection.do?EditAction=true&contextId=cells%3AwpgCell%3Anodes%3Adehensv550p2.wpg.node%3Aservers%3Abcgmas&resourceUri=server.xml&perspective=tab.configuration">bcgmas</A>
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          dehensv550p2.wpg.node&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          ND 6.1.0.47&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          bcgmasCluster&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                    
                    
                    
                    <A target="statuswindow" href="/ibm/console/status?text=true&type=server&node=dehensv550p2.wpg.node&name=bcgmas&time=1501471739385">
                    <IMG name="statusIcon" border="0" onfocus='getObjectStatus("/ibm/console/status?text=true&type=server&node=dehensv550p2.wpg.node&name=bcgmas&time=1501471739385",this)' onmouseover='getObjectStatus("/ibm/console/status?text=true&type=server&node=dehensv550p2.wpg.node&name=bcgmas&time=1501471739385",this)' SRC="/ibm/console/status?type=server&node=dehensv550p2.wpg.node&name=bcgmas&time=1501471739385" ALT="Users with accessibility needs can click on the image to obtain status." TITLE="Users with accessibility needs can click on the image to obtain status.">
                    </A>
                        

                     
						</TD>
						
					</TR>
                    
					
                    
					
                  
					<TR CLASS="table-row">
					
						<TD VALIGN="top"  WIDTH="1%" HEADERS="header1" class="collection-table-text">
                        <label class="collectionLabel" for="selectedObjectIds" TITLE="Select Row 5">
                        <input type="checkbox" name="selectedObjectIds" value="cells:wpgCell:nodes:dehensv549p2.wpg.node:servers:bcgserver" onclick="checkChecks(this)" onkeypress="checkChecks(this)">
                        </LABEL>
						</TD>
					
                    
                    
					
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
							<A HREF="applicationServerCollection.do?EditAction=true&contextId=cells%3AwpgCell%3Anodes%3Adehensv549p2.wpg.node%3Aservers%3Abcgserver&resourceUri=server.xml&perspective=tab.configuration">bcgserver</A>
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          dehensv549p2.wpg.node&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          ND 6.1.0.47&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          bcgserverCluster&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                    
                    
                    
                    <A target="statuswindow" href="/ibm/console/status?text=true&type=server&node=dehensv549p2.wpg.node&name=bcgserver&time=1501471739385">
                    <IMG name="statusIcon" border="0" onfocus='getObjectStatus("/ibm/console/status?text=true&type=server&node=dehensv549p2.wpg.node&name=bcgserver&time=1501471739385",this)' onmouseover='getObjectStatus("/ibm/console/status?text=true&type=server&node=dehensv549p2.wpg.node&name=bcgserver&time=1501471739385",this)' SRC="/ibm/console/status?type=server&node=dehensv549p2.wpg.node&name=bcgserver&time=1501471739385" ALT="Users with accessibility needs can click on the image to obtain status." TITLE="Users with accessibility needs can click on the image to obtain status.">
                    </A>
                        

                     
						</TD>
						
					</TR>
                    
					
                    
					
                  
					<TR CLASS="table-row">
					
						<TD VALIGN="top"  WIDTH="1%" HEADERS="header1" class="collection-table-text">
                        <label class="collectionLabel" for="selectedObjectIds" TITLE="Select Row 6">
                        <input type="checkbox" name="selectedObjectIds" value="cells:wpgCell:nodes:dehensv550p2.wpg.node:servers:bcgserver" onclick="checkChecks(this)" onkeypress="checkChecks(this)">
                        </LABEL>
						</TD>
					
                    
                    
					
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
							<A HREF="applicationServerCollection.do?EditAction=true&contextId=cells%3AwpgCell%3Anodes%3Adehensv550p2.wpg.node%3Aservers%3Abcgserver&resourceUri=server.xml&perspective=tab.configuration">bcgserver</A>
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          dehensv550p2.wpg.node&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          ND 6.1.0.47&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                          bcgserverCluster&nbsp;
					
						</TD>
						
					
						<TD VALIGN="top"  HEADERS="header2" class="collection-table-text">
					
                    
                    
                    
                    <A target="statuswindow" href="/ibm/console/status?text=true&type=server&node=dehensv550p2.wpg.node&name=bcgserver&time=1501471739386">
                    <IMG name="statusIcon" border="0" onfocus='getObjectStatus("/ibm/console/status?text=true&type=server&node=dehensv550p2.wpg.node&name=bcgserver&time=1501471739386",this)' onmouseover='getObjectStatus("/ibm/console/status?text=true&type=server&node=dehensv550p2.wpg.node&name=bcgserver&time=1501471739386",this)' SRC="/ibm/console/status?type=server&node=dehensv550p2.wpg.node&name=bcgserver&time=1501471739386" ALT="Users with accessibility needs can click on the image to obtain status." TITLE="Users with accessibility needs can click on the image to obtain status.">
                    </A>
                        

                     
						</TD>
						
					</TR>
                    
					
                    
                    
				</TABLE>
                
                <input type="hidden" name="collectionFormAction" value="applicationServerCollection.do"/>

                  
</form>










    
































<!--Number Per Page: 20<BR>Total rows: 6<BR>Filtered rows: 6<BR>Current page: 1<BR>-->



<form action="applicationServerCollection.do" name="com.ibm.ws.console.servermanagement.GenericServerCollectionForm" type="com.ibm.ws.console.servermanagement.GenericServerCollectionForm" class="nopad">
<input type=hidden name="csrfid" value="-402451829">
<TABLE class="paging-table" BORDER="0" CELLPADDING="5" CELLSPACING="0" WIDTH="100%" SUMMARY="Table for displaying paging function">
	<TR>
			

            <TD CLASS="table-totals" VALIGN="baseline">               
            Total 6
             &nbsp;&nbsp;&nbsp;               


        
		</TD>
	</TR>

</TABLE>

</form>





                        </TD>
               </TR>
        </TBODY>
</TABLE>




  </td>
 </tr>
  </TBODY>
 </table>
 </TD>

        








<!--WSC Console: needed for Federation-->


<!--CommandAssistance LI3509-->




	<script language="JavaScript">
	var federationAdder = 0;
	</script>



   <!-- CommandAssistance LI3509-59 start -->
	<script language="JavaScript">

   function loadCAWindow(username)
   {
      initializeCAWindowVar();
      if (top.CAWindowHandle==null ||
          top.CAWindowHandle.closed)
      {
         //alert("caWindow is null or closed");
         var windowName = "wsadminCAWindow" + username;
         //alert(windowName);
         top.CAWindowHandle = window.open('com.ibm.ws.console.core.commandassistance.forwardCmd.do?csrfid=-402451829&forwardName=console.commandassistance.main', windowName, 'resizable=yes,scrollbars=yes,width=700,height=350');
         top.CAWindowHandle.focus();
      }
      else
      {
         //alert("caWindow exits - give focus and reload");
         top.CAWindowHandle.focus();
         top.CAWindowHandle.location.reload();
      }
   }


   function reloadCAWindow()
   {
      //alert("in reloadCAWindow()");
      if (top.CAWindowHandle!=null && !top.CAWindowHandle.closed)
      {
         top.CAWindowHandle.location.reload();
      }
   }

   function initializeCAWindowVar() {
      // Create it if it doesn't exist yet, read the value if it does
      if (top.CAWindowVar == null) {
         top.CAWindowVar = "initialized";
         top.CAWindowHandle = null;
      }
   }


	</script>
   <!-- CommandAssistance LI3509-59 end -->

         

      <TD valign="top" WIDTH="20%" >

      <!--WSC Console Federation-->
     <div class="hpWidth">
     <div class="hpMinWidth">
     <div class="hpLayout">
     <div class="hpContainer">
      <DIV ID="wasHelpPortletPos" style="position:relative">
      <TABLE WIDTH="90%" CELLPADDING="0" CELLSPACING="0" BORDER="0" CLASS="wasPortlet">
      <TR>
      	
        <TH class="wpsPortletTitle">
        
        Help</TH>
      	
        <TH class="wpsPortletTitleControls">
        
        <A href="javascript:showHidePortlet('wasHelpPortlet')">
        <img id="wasHelpPortletImg" SRC="/ibm/console/images/title_minimize.gif" alt="Expand or collapse" border="0" align="texttop" tabindex="1"/>
        </A>
        </TH>
      </TR>


      <TBODY ID="wasHelpPortlet" style="display:table-row-group">
      <TR>
      	
      <TD CLASS="wpsPortletArea" COLSPAN="2" valign="top">
        


      <div class="helpSectionTitles">Field help</div>

      
      <DIV CLASS="table-text-help-portlet" ID="fieldHelpPortlet">
      
         For field help information, select a field label or list marker when the help cursor appears.
      </DIV>





      <div STYLE="margin-top:1.25em" class="helpSectionTitles">
           Page help</div>
      
      <DIV CLASS="table-text-help-portlet" id="pageHelpLink">
      

	   <a href="/ibm/help/index.jsp?topic=/com.ibm.ws.console.servermanagement/urun_rsvr.html" tabindex="100" target='WAS_help'>More information about this page</a>

      </DIV>



<script language="JavaScript">
  var helpProdVersion = "was-nd-dist";
  var helpWASVersion = "pix";
  var helpNewMehod = "true";

  if (!top.helpProdVersion) {
       top.helpProdVersion = helpProdVersion;
  }

  if (helpNewMehod == "true") {
     if (!top.helpWASVersion) {
          top.helpWASVersion = helpWASVersion;
     }
  }
</script>



      
      






      </TD>
      </TR>

      </TBODY>



      </TABLE>

      </DIV>
     </div>
     </div>
     </div>
     </div>


    </TD>

       



</TR>
</TABLE>









</body>
</html>


