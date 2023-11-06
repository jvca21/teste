<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <title>PI2 Comércio</title>
  <link rel="stylesheet" href="style.css">
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f0f0f0;
      margin: 0;
      padding: 0;
    }

    header {
      background-color: #333;
      color: #fff;
      text-align: center;
      padding: 20px;
    }

    h1 {
      font-size: 36px;
      margin: 0;
    }

    p {
      font-size: 18px;
      margin: 0;
    }

    main {
      max-width: 800px;
      margin: 0 auto;
      padding: 20px;
      background-color: #fff;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    section {
      margin-bottom: 20px;
      padding: 20px;
      border: 1px solid #ddd;
      background-color: #f9f9f9;
    }

    h2 {
      font-size: 24px;
    }

    p, ul, ol {
      font-size: 16px;
    }

    pre {
      background-color: #f4f4f4;
      padding: 5px;
    }
  </style>
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
        Containers
        Para iniciar os containers, abra a pasta do projeto no terminal e execute os seguintes comandos:
        <pre>docker-compose up -d --build</pre>
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
