<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>PI2 Comércio</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <header>
    <h1>PI2 Comércio</h1>
    <p>Um projeto de comércio eletrônico simples</p>
  </header>

  <main>
    <section>
      <h2>Sobre</h2>
      <p>
        O PI2 Comércio é um projeto de comércio eletrônico simples que permite aos usuários comprar e vender produtos.
        O projeto está <strong>em andamento</strong> e é desenvolvido em Python e utiliza as bibliotecas Flask, PostgreSQL, Docker, JQuery, Bootstrap e Google Cloud Platform.
      </p>
    </section>

    <section>
      <h2>Requisitos</h2>
      <ul>
        <li>Python 3.8 ou superior</li>
        <li>pip</li>
      </ul>
    </section>

    <section>
      <h2>Instalação</h2>
      <ol>
        <li>Clone o repositório do GitHub.</li>
        <li>Abra o terminal na pasta do projeto.</li>
        <li>Instale as dependências com o comando:
          <pre>pip install poetry</pre>
        </li>
        <li>Instale o projeto com o comando:
          <pre>poetry install</pre>
        </li>
        <li>Inicie o servidor com o comando:
          <pre>poetry run uvicorn main:app --reload</pre>
        </li>
      </ol>
      <p class="mt-2">


      </p>
    </section>

    <section>
      <h2>Uso</h2>
      <p>
        Para usar o PI2 Comércio, siga estas etapas:

        <ol>
          <li>Acesse o site no seu navegador.</li>
          <li>Crie uma conta ou faça login com uma conta existente.</li>
          <li>Navegue pelos produtos disponíveis.</li>
          <li>Adicione os produtos que deseja comprar ao seu carrinho.</li>
          <li>Finalize a compra.</li>
        </ol>
      </p>
    </section>

    <section>
      <h2>Contribuir</h2>
      <p>
        Contribuições são bem-vindas! Para contribuir para o projeto, siga estas instruções:

        <ol>
          <li>Forneça um relatório de bug ou solicitação de recurso.</li>
          <li>Envie uma pull request com as suas alterações.</li>
        </ol>
      </p>
    </section>

    <section>
      <h2>Funcionalidades</h2>
      <ul>
        <li>Listagem de produtos</li>
        <li>Detalhes do produto</li>
        <li>Carrinho de compras</li>
        <li>Finalização da compra</li>
        <li>Filtro de produtos</li>
        <li>Pesquisa de produtos</li>
        <li>Compras recorrentes</li>
        <li>Recomendações de produtos</li>
      </ul>
    </section>

    <section>
      <h2>Tecnologias</h2>
      <ul>
        <li>Python 3.8 ou superior</li>
        <li>Flask</li>
        <li>PostgreSQL</li>
        <li>Docker</li>
        <li>JQuery</li>
        <li>Bootstrap</li>
        <li>Google Cloud Platform</li>
      </ul>
    </section>

    <section>
      <h2>Containers</h2>
      <p>
        <ul>
          <li>Windows: <a href="https://docs.docker.com/desktop/install/windows-install/">https://docs.docker.com/desktop/install/windows-install/</a></li>
          <li>Mac: <a href="https://docs.docker.com/desktop/install/mac-install/">https://docs.docker.com/desktop/install/mac-install/</a></li>
          <li>Linux (baseado em Ubuntu): <a href="https://docs.docker.com/engine/install/ubuntu/">https://docs.docker.com/engine/install/ubuntu/</a></li>
        </ul>
        Para iniciar os containers, abra a pasta do projeto no terminal e execute os seguintes comandos:
        
        <pre>docker-compose up -d --build</pre>
      </p>
    </section>
  </main>
</body>
</html>
