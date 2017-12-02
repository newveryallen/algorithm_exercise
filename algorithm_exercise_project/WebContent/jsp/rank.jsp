<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="<%=request.getContextPath()%>/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>程式解題系統</title>
</head>
<body>
     
<!--   navbar  -->
  <nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">LS</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="<%=request.getContextPath()%>/jsp/problem.jsp">Problems</a></li>
        <li><a href="<%=request.getContextPath()%>/jsp/submission.jsp">Submissions</a></li>
        <li class="active"><a href="#">Rank</a></li>
        <li><a href="#">Forum</a></li>
        <li><a href="#">Contest</a></li>
      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Search">
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#">Login</a></li>    
        <li><a href="#">Register</a></li> 
        <li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>  
		
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<!--   navbar  -->

<!--  table part -->
  <table class="table table-hover">
     <thead>
		  <tr>
		     <th>RANK</th>
		     <th>ID</th>
		     <th>SCORE</th>

		  </tr>
      </thead>     
	  <tbody>
	    <tr>
	      <td>1</td>
	      <td>she(熱血中年男子)</td>
	      <td>100</td>
	    </tr>
	    <tr>
	      <td>2</td>
	      <td>Lucas</td>
	      <td>60</td>
	    </tr>	    
	  </tbody>      
  </table>
<!--  table part -->



	<div class="center-block">
		<ul class="pagination" >
		  <li><a href="#">1</a></li>
		  <li class="active"><a href="#">2</a></li>
		  <li><a href="#">3</a></li>
		  <li><a href="#">4</a></li>
		  <li><a href="#">5</a></li>
		</ul>
	</div>


</body>
</html>