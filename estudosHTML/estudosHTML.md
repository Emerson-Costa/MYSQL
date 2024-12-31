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
Conteúdo relacionado como barras laterais.

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
<body>
 
  <header>
    <h1>Welcome On Our Website!</h1>
    <p>Here is our logo and slogan.</p>
  </header>
   
  <nav>
    <header>
      <h2>Choose Your Interest</h2>
    </header>
    <ul>
      <li>Menu 1</li>
      <li>Menu 2</li>
      <li>Menu 3</li>
    </ul>
  </nav>
   
  <article>
    <header>
      <h1>Title of Article</h1>
      <h2>Subtitle of Article</h2>
    </header>
     
    <section>
      <h3>First Logical Part (e.g. "Theory")</h3>
      <p>Paragraph 1 in first section</p>
       
      <h4>Some Other Subheading in First Section</h4>
      <p>Paragraph 2 in first section</p>
    </section>
     
    <section>
      <h3>Second Logical Part (e.g. "Practice")</h3>
      <p>Paragraph 1 in second section</p>
      <p>Paragraph 2 in second section</p>
    </section>
   
    <footer>
      <h4>Author Bio</h4>
      <p>Paragraph in Article's Footer</p>
    </footer>
   
  </article>
   
  <aside>
     
    <h2>Get To Know Us Better</h2>
     
    <section>
      <h3>Popular Posts</h3>
      <ul>...</ul>
    </section>
     
    <section>
      <h3>Partners</h3>
      <ul>...</ul>
    </section>
     
    <section>
      <h3>Testimonials</h3>
      <ul>...</ul>
    </section>
   
  </aside>
   
  <footer>
    <ul>
      <li>Copyright</li>
      <li>Social Media Links</li>
    </ul>
  </footer>
 
</body>
```
![Exemplo 01](estudosHTML\imagens\semantica01.pngg)

![Exemplo 02](estudosHTML/imagens/semantica02.png)