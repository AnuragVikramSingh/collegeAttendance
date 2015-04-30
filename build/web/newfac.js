function newfaculty()
{
   var n=document.Newfaculty.name.value;
   var e=document.Newfaculty.email.value;
   var p=document.Newfaculty.pass.value;
   var bool=true;
   n=n.toLowerCase();
   var str="abcdefghijklmnopqrstuvwxyz";
   if(n==="null"||e==="null"||p==="null")
   {
       bool=false;
       
   }
   else
   {
      for(var x=0;x<n.length;x++)
      {
          if(str.indexOf((n.charAt(x)))<=0)
          {
              document.writln((str.indexOf((n.charAt(x)))<=0));
              bool=false;
          }
          
      }
     
   }
   return bool;
}
   

