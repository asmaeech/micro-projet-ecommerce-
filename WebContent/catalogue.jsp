<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="bean.Produit"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link href="css/bootstrap.css" rel="stylesheet" >
                <link href="css/style.css" rel="stylesheet" >

        <title>Les produits</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="/MyApplication/produitServlet">Nos produits<span class="sr-only">(current)</span></a>
      </li>
      
      <li class="nav-item">
        <a class="nav-link" href="/MyApplication/logoutServlet">Déconnecter</a>
      </li>
      
    </ul>
  </div>
</nav>
        <div class="jumbotron jumbotron-fluid">
  <div class="container">
    <h1 class="display-4">Nos produits</h1>
    <p class="lead">IRISI-Shopping vous souhaite un bon shopping .</p>
  </div>
</div>
        <div class="container">
        
       
        <form action="produitServlet" method="POST">
        <% List<Produit> produits=(List<Produit>)request.getAttribute("listProd"); %>
        <% int i=0;%>
        <div class="row">
        <% for( Produit p :  produits){ %>
        
        
            <div class="col-3">   
           <div class="gallery-card">
     <div class="gallery-card-body">
         <label class="block-check">
      <img src="<%=p.getImage() %>" class="img-responsive" />
   <% i=++i; %>
         <input type="checkbox" name="check" value="<%= i %>"  >
        <span class="checkmark"></span>
        </label>
        <div class="mycard-footer">
        <p><%= p.getDesination()%></p>
        <span><h5><%= p.getPrix()+"DH"%></h5></span>
            <input type="number" class="form-control  my_coustom_input"  name="qte<%= i %>" placeholder="quantité demandée">
        </div>
        </div>
         </div>
            </div>
        
         
          <% } %>
        </div>
          <input type="submit" value="Valider"  class="btn btn-primary " style="width:90px">
          </form>
      
            
      
    </body>
</html>
