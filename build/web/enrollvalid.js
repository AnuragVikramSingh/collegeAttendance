function valid()
{
   var n=document.Student.enroll.value;
   var len=n.length;
   n=n.toUpperCase();
   var x=0;
   var bool=true;
   if(len===12)
   {
       
       for(x=0;x<=11;x++)
       {   
           if(x===4||x===5)
           {
             if(x===5)
                   continue;
               var br=n.substring(4,6);
               if((br==="IT")||(br==="CS")||(br==="CE")||(br==="ME")||
                       (br==="EX")||(br==="EI")||(br==="MC")||(br==="EE")
                       ||(br==="EC"))
               {
                   bool=true;
               }
               else
                    bool=false;
            }
            else if(("0123456789".indexOf((n.charAt(x))))<0)
               bool=false;
            else
           {
           }
           
       }
    }
    else
        bool=false;
    if(bool)
         return true;
    else
        document.write("Error in enroll");
        return false;
         
}


