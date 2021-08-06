#language: pt
#encoding: utf-8

  @test
  Funcionalidade: Realizar Compra no E-commerce

    Cenario: Adicionar produto ao carrinho
      //Dado que um usuario acesse o site "http://automationpractice.com/index.php"
      //Entao pesquisa pelo produto "Faded Short Sleeve T-shirts"
      Dado primeiro iniciar o driver
      Entao que um usuario acesse o site "http://automationpractice.com/index.php"
