<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <title>Atmos7</title>
  </head>
  <body class="bg-light">


    <!-- Cabeçalho -->
    <header class="p-3 bg-dark text-white">
        <div class="container">
          <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
            <a href="/" class="d-flex align-items-center mb-2 mb-lg-0 text-white text-decoration-none">
            </a>
    
            <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
              <li><a href="index.html" class="nav-link px-2 text-white">Início</a></li>
              <li><a href="promocoes.html" class="nav-link px-2 text-white">Promoções</a></li>
              <li><a href="hoteis.html" class="nav-link px-2 text-white">Hotéis</a></li>
              <li><a href="destinos.html" class="nav-link px-2 text-white">Destinos</a></li>
              <li><a href="ajuda.html" class="nav-link px-2 text-white">Ajuda</a></li>
              <li><a href="contato.html" class="nav-link px-2 text-white">Contato</a></li>
            </ul>
    
            <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3">
              <input type="search" class="form-control form-control-dark" placeholder="Pesquisar..." aria-label="Search">
            </form>
    
            <div class="text-end">
              <button type="button" class="btn btn-outline-light me-2">Entrar</button>
              <button type="button" class="btn btn-warning">Cadastrar</button>
            </div>
          </div>
        </div>
      </header>
      <!-- Cabeçalho -->
      
      
      <!-- Consulta-->
	<div class="container pb-lg-5 px-md-5">
    <div class="container py-5" id="icon-grid">
      <h2 class="pb-2 border-bottom text-center"><strong>Consultar Destinos</strong></h2>
    </div>
    
     <form action="CreateAndFind" method="GET" class="d-flex">
        <input name="pesquisa" class="form-control me-2" type="search" placeholder="Digite o Destino" aria-label="Search">
        <button class="btn btn-primary" type="submit">Buscar</button>
     </form>
	
    </div>
	<!-- Fim Consulta-->
	
	<br>
<div class="container">
	<div class="row">
		<div class="cold-md-7">
			<hr>
			<h3>Viagens</h3>
			<hr>
			<table class="table">
				<thead>
					<tr>
						<th>#</th>
						<th>Origem</th>
						<th>Destino</th>
						<th>Data Ida</th>
						<th>Data Volta</th>
						<th>Preco</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${viagens}" var="viagem">
							<tr>
								<td>${viagem.idDestino}</td>
								<td>${viagem.origem}</td>
								<td>${viagem.destino}</td>
								<td>${viagem.dataIda}</td>
								<td>${viagem.dataVolta}</td>
								<td>${viagem.preco}</td>
								<td>
									<a href="ViagemDestroy?viagemId=${viagem.idDestino}">deletar</a> |
									<a href="ViagemUpdate?viagemId=${viagem.idDestino}">atualizar</a>
								</td>
							</tr>
						</c:forEach>
				</tbody>
			</table>
			<h5><a href="destino.html">Voltar</a></h5>
		</div>
	</div>
</div>



<!--Rodapé / Footer-->
    <div class="container">
      <footer class="py-5">
          <div class="row justify-content-center">
  
            <div class="col-md-3 mb-3">
              <h5>Termos</h5>
              <ul class="nav flex-column">
                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Condições Gerais</a></li>
                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Politica de Privacidade</a></li>
                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Código de Conduta Ética</a></li>
              </ul>
            </div>
         
            <div class="col-md-3 mb-3">
              <h5>Canais de Atendimento</h5>
              <ul class="nav flex-column">
                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">SAC</a></li>
                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Central de Realcionamento</a></li>
                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Pós venda</a></li>
                <li class="nav-item mb-2"><a href="#" class="nav-link p-0 text-muted">Remarcações</a></li>
              </ul>
            </div>
            
          <div class="col-md-4 mb-3">
          <form>
            <h5>Cadastre seu email</h5>
            <div class="form-group">
              <label for="exampleInputEmail1">E receba mensalmente nossas melhores ofertas</label>
              <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Seu email">
              <small id="emailHelp" class="form-text text-muted">Nunca vamos compartilhar seu email, com ninguém.</small>
            </div>
            <button type="submit" class="btn btn-primary">Inscrever</button>
          </form>
          </div>
    
        <div class="d-flex justify-content-between py-4 my-4 border-top">
          <p>© 2022 Atmos Company, Inc. Todos os Diretos reservados.</p>
          <ul class="list-unstyled d-flex">
            <li class="ms-3"><a class="link-dark" href="#"><svg class="bi" width="24" height="24"><use xlink:href="#twitter"></use></svg></a></li>
            <li class="ms-3"><a class="link-dark" href="#"><svg class="bi" width="24" height="24"><use xlink:href="#instagram"></use></svg></a></li>
            <li class="ms-3"><a class="link-dark" href="#"><svg class="bi" width="24" height="24"><use xlink:href="#facebook"></use></svg></a></li>
          </ul>
        </div>
        </div>
      </footer>
    </div>
    <!--Rodapé / Footer-->





    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->
  </body>
</html>
