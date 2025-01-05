# HTML
---
## Estrutura básica

* **Corpo principal de um documento em HTML**
```
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta name="viewportcontent="width=device-widthinitial-scale=1.0">
        <title>Título da Página</title>
    </head>
    <body>
        <!-- Conteúdo da página vai aqui -->
    </body>
</html>
```
* **Cabeçalhos(Headings)**
Use `h1` a `h6` para definir títutlos e subitítulos.

```
<h1>Título Principal</h1>
<h2>Subtítulo</h2>
```

* **Parágrafos**
```
<p>Este é o primeiro parágrafo.</p>
<p>Este é o segundo parágrafo.</p>
```

* **Listas Ordenadas**
```
<ol>
    <li>Item 1</li>
    <li>Item 2</li>
</ol>
```
* **Listas não ordenadas**
```
<ul>
    <li>Item A</li>
    <li>Item B</li>
</ul>
```
* **Links**
```
<a href="https://www.example.com">Visite o Example</a>
```

* **Imagens**
```
<img src="caminho/para/imagem.jpg" alt="Descrição da Imagem">
```

* **Divisões(Divs) e Spans**
Use 'div' para seções de blocos e 'span' para seções de linhas.

```
<div>
    <p>Este é um exemplo de divisão.</p>
</div>
<span>Este é um exemplo de span.</span>
```
---

## Elementos Semânticos

Ajudam a definir a estrutura e o significado do conteúdo.

* **Exemplo da estrutura**

![Diagrama](https://i.sstatic.net/fzLpL.png)

* **Header**
Definição dos cabeçalhos da página.
```
<header>
    <h1>Cabeçalho da Página</h1>
</header>
```

* **Nav**
Utilizada para navegação.
```
<nav>
    <ul>
        <li><a href="#home">Home</a></li>
        <li><a href="#sobre">Sobre</a></li>
        <li><a href="#contato">Contato</a></li>
    </ul>
</nav>
```

* **Main**
Conteúdo principal.

```
<main>
    <h2>Conteúdo Principal</h2>
    <p>Texto principal da página.</p>
</main>
```

* **Section**
Seções de conteúdo.

```
<section>
    <h2>Seção</h2>
    <p>Conteúdo da seção.</p>
</section>
```

* **Article**
Artigos independentes.

```
<article>
    <h2>Artigo</h2>
    <p>Conteúdo do artigo.</p>
</article>
```

* **Aside**
Conteúdo relacionado como barras laterais, informações de copright, anúncios e links de rodapés.

```
<aside>
    <h2>Aside</h2>
    <p>Conteúdo relacionado, como uma barra lateral.</p>
</aside>
```

* **Footer**
Um simples rodapé.

```
<footer>
    <p>Rodapé da Página</p>
</footer>
```
----

## Aplicanto os conceitos da semântica

* **Aplicação da semântica**

```
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exemplo de Estrutura Semântica</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <!-- Cabeçalho da Página -->
    <header>
        <nav>
            <ul class="nav-menu">
                <li><a href="#home">Home</a></li>
                <li><a href="#sobre">Sobre</a></li>
                <li><a href="#servicos">Serviços</a></li>
                <li><a href="#contato">Contato</a></li>
            </ul>
        </nav>
    </header>

    <!-- Seção Principal do Conteúdo -->
    <main>
        <!-- Artigo Principal -->
        <article>
            <h1>Título do Artigo</h1>
            <p>Este é o conteúdo principal do artigo. Aqui você pode colocar parágrafos, imagens, vídeos e outros elementos.</p>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam non urna vitae augue pharetra blandit.</p>

            <!-- Seção Dentro do Artigo -->
            <section>
                <h2>Seção do Artigo</h2>
                <p>Conteúdo da seção dentro do artigo.</p>
                <p>Proin facilisis libero vitae tortor mollis, nec sollicitudin lorem volutpat.</p>
            </section>

            <!-- Rodapé do Artigo -->
            <footer>
                <p>Escrito por: Autor do Artigo</p>
                <p>Data: 01 de Janeiro de 2025</p>
            </footer>
        </article>
    </main>

    <!-- Barra Lateral com Conteúdo Relacionado -->
    <aside>
        <h2>Conteúdo Relacionado</h2>
        <p>Informações adicionais, links ou anúncios podem ser colocados aqui.</p>
    </aside>

    <!-- Rodapé da Página -->
    <footer>
        <p>&copy; 2025 MinhaMarca. Todos os direitos reservados.</p>
    </footer>
</body>
</html>

```