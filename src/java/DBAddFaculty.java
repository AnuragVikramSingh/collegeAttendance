import java.sql.*;
public class DBAddFaculty 
{
    String name,pass,sqes,ans,br,email;
    public DBAddFaculty(String name, String pass,String sqes,String ans,String br,String email)
    {
        this.name=name;
        this.pass=pass;
        this.email=email;
        this.br=br;
        this.sqes=sqes;
        this.ans=ans;
    }
    public boolean store()
    {
        System.out.println(name);
        System.out.println(pass);
        System.out.println(email);
        System.out.println(br);
        System.out.println(sqes);
        System.out.println(ans);
        
        boolean result=true;
         if(name!=null&&pass!=null&&email!=null&&br!=null&&sqes!=null&&ans!=null)
            {
              try
              {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","");
                Statement st=con.createStatement();
                String msg="INSERT INTO faculty VALUES(\'"+name+"\',\'"+br+"\',\'"+email+"\',\'"+pass+"\',\'"+sqes+"\',\'"+ans+"\',"+0+")";
                System.out.println(msg);
                st.executeUpdate(msg);
                st.close();
                result=true;
                System.out.println(result);
             }
             catch(Exception e)
             {
                System.out.println(e);
               
             }
        }
            else 
               result=false;
        return result;
    }
}
