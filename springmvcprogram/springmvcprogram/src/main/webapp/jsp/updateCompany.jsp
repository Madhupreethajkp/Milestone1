<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   import="java.util.*,com.example.springmvc.model.Company"   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

   
  <link rel="stylesheet" type="text/css" href="style.css"/>
  <style>
 
#excel
{
font-size : 30px;
text-align : center;
}

#select_text
{
font-size : 22px;
} 
.nav{
 height:150px;
 width:1000px;
}
 
  </style>
</head>
<body><div class="menu">
<h1 style="float:left">STOCK MARKET CHARTING</h1>
  <a href="index.html"  style="text-decoration:none;float:right">LOGOUT</a> 

</div>

<center><h1>Admin Landing Page</h1></center>



<br>

<br>
<br>

<div style="margin:60px;z-index:-1">
<button class="button1" type="submit" ><span><a href="importData.html" style="text-decoration:none; color:white">Import Data</a></span></button>
<button class="button1" type="submit" ><span><a href="manageCompany.html" style="text-decoration:none; color:white">Manage Company</span></button>
<button class="button1" type="submit" ><span><a href="manageExchange.html" style="text-decoration:none; color:white">Manage Exchange</span></button>
<button class="button1" type="submit"  ><span><a href="addIPO.html" style="text-decoration:none; color:white">Update IPO Details</span></button>
</div>

  <div class="container" style="color:black">
     
              <%
                  List companyList=(List)request.getAttribute("updateCompany");
                  System.out.println(companyList);
              %>
              <%for(int i=0;i<companyList.size();i++)
              {
	             Company e = (Company)companyList.get(i);
              
	          %>
              
   <center><div class="panel-heading" style="color:black"><h3>Company Details</h3></div></center>
                <div class="panel panel-info">
                       
                        <div class="panel-body" style="color:black">
                        <div class="row">
                            <div  class="col-md-2">

                            </div>

                            <div  class="col-md-2" style="color:black">
                            <p><%= e. getCompanyName()%></p> 
                            </div>

                            <div  class="col-md-2" style="color:black">
                            <p><%= e. getCEO() %></p>  
                            </div>

                            <div  class="col-md-4" style="color:black">
                            <P><%= e.getBriefWriteup() %></P>   
                            </div>

                            
                            <div  class="col-md-2">
                            <a href="" type="button" class="btn btn-info" data-toggle="modal" data-target="#myModal" >EDIT</a>
                            </div>

                        </div>
                        </div>
                      </div>

                      <%  } %>
                          <div class="modal fade" id="myModal" role="dialog">
                                <div class="modal-dialog">
                                
                                  <!-- Modal content-->
                                  <div class="modal-content">
                                    <div class="modal-header">
                                      <button type="button" class="close" data-dismiss="modal">&times;</button>
                                      <h2 class="modal-title">Edit Company Details</h2>
                                    </div>
                                    <div class="modal-body">
                                            <form action="/action_page.php">
                                                <label for="cname">Company Name</label>
                                                <input type="text" id="cname" name="companyname" placeholder="Company Name">
                                            
                                                <label for="lname">Stock Exchange</label>
                                                <input type="text" id="stock_change" name="stockexchange" placeholder="Stock Exchange">
                
                                            
                                                <label for="briefwriteup">Brief WriteUp</label>
                                                <textarea id="brief" name="briefwriteup" placeholder="Brief WriteUp" style="height:200px"></textarea>
                                             
                                            <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal" style="float:left">Close</button>
        
                                                <input type="submit" value="Update"  style="font-size:12px">
                                                </div>
                                              </form>
                                    </div>
                    
                                  </div>
                                  
                                </div>
                              </div>
        </div>
                          
 
</body>

</html>