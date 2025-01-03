# CSS (Cascading Style Sheets)

---

## Básico CSS

* **CSS inline**
    * O atributo 'style' é inserido dentro do elemento HTML.

````
    <body Style="background: yellow">
````

* **CSS interno**
    * Uma tag 'style' onde são criadas todo o estilo da página HTML.

````
    <style>
        body{
            background: yellow;
        }
    </style>
````
* **CSS externo**
    * Um documento de estilo com a extensão .css onde serão definidos todo o estilo da página html.
    * A tag link pode ser inserida no cabeçalho do documento como caminho do arquivo.

````
<head>
    <link rel="stylesheet" href="./estilo.css"></link>
</head>
````

----

## Seletores e classes

* **Sintaxe**
````
seletor {
    propriedade: valor;
}
````

* **Seletores básicos**
````
p {
    color: blue;
}
````

* **Seletores de classes**
````
.meu-estilo {
    font-size: 20px;
}
````

* **Seletores de id**
````
#meu-id {
    font-weight: bold;
}
````

* **Agrupamento de seletores**
    * Todos elementos que tiverem as propriedades de estilos iguais podem ser agrupados em um unico estilo.

````
h1, p{
    color: red;
    text-align: center;
}
````

----

## Propiedades do Color

* **Cores**
  * **Nomes de cores**: ````color: red;````
  * **Valores Hexadecimais**: ````color: #ff0000;````
  * **RGB**: ````color: rgb(255, 0, 0);````
  * **RGBA**: ````color: rgba(255, 0, 0, 0.5);````

---

## Propriedades do Background

* **Exemplo de estilos de fundo**

````
<style>
    .exemplo-background{
        height: 300px;
        background-color: gray;
        background-image: url("caminho");
        background-size: cover;
        background-repeat: no-repeat;
        background-position: center;
    }
</style>


<div class="exemplo-background"></div>
````
* **Usando a expressão CSS**
    * Utilizamos a expressão para simplificar o uso da propriedade.
        * ```background: <propriedades referentes ao background>```

````
    height: 300px;
    background: gray url("caminho") no-repeat center;
    background-size: cover;
````
* **Significado das propriedades do background**
    * ````background-image: url("caminho")````: Imagem de fundo.
    * ````background-size: cover````: Serve para ajustar a imagem ao tamanho do elemento.
    * ````background-size: contain ````: Repete a imagem de fundo.
    * ````background-repeat: repeat````: Repete a imagem de fundo.
    * ````background-repeat: repeat-y````: Repete a imagem na vertical.
    * ````background-repeat: repeat-x````: Repete a imagem na horizontal.
    * ````background-repeat: no-repeat ````: Não repete a imagem de fundo.
    * ````background-position: center````: Posiciona no centro, também pode usar essa propriedade para posicionar no topo a esquerda ou a direita do fundo.

----

##  Propriedades  do Border (Borda).

* **Largura, estilo e cor da borda**

````
div {
    border: 2px solid blue;
}
````

* ````border-width:```` Define a largura da borda.
````
div {
    border-width: 5px;
}
````

* ````border-style````: Define o estilo da borda. Os valores possíveis incluem none, solid, dotted, dashed, double, groove, ridge, inset, outset.
````
div {
    border-style: dashed;
}
````

* ````border-color:```` Define a cor da borda.
````
div {
    border-color: red;
}
````

* ````border-top:```` Define a borda superior.
````
div {
    border-top: 3px solid green;
}
````

* ````border-right:```` Define a borda direita.
````
div {
    border-right: 3px solid green;
}
````

* ````border-bottom:```` Define a borda inferior.
````
div {
    border-bottom: 3px solid green;
}
````

* ````border-left:```` Define a borda esquerda.
````
div {
    border-left: 3px solid green;
}
````

* ````border-radius: Para bordas```` arredondadas.
````
div {
    border-radius: 10px;
}
````

* Valores individuais para cada canto:
````
div {
    border-top-left-radius: 10px;
    border-top-right-radius: 5px;
    border-bottom-right-radius: 20px;
    border-bottom-left-radius: 15px;
}

````

* ````border-image:```` Define uma imagem como borda.
````
div {
    border: 10px solid transparent;
    border-image: url('imagem.png') 30 stretch;
}
````

----

## Propriedades de margin

* ````margin:```` Propriedade abreviada para definir as margens em todos os lados de um elemento.
````
div {
    margin: 20px;
}

````

* ````margin-top```` ````margin-right```` ````margin-bottom````  e ````margin-left````
    * Todas  estas propriedades definem uma margen seguidas das direções especificadas.

````
div {
    margin-top: 20px;
}

div {
    margin-right: 20px;
}

div {
    margin-bottom: 20px;
}

div {
    margin-left: 20px;
}

````

---

## Propriedades de padding

Definição do espaço interno do elemento, a distância do conteúdo da borda interna.

* ````padding:```` Propriedade abreviada para definir o preenchimento em todos os lados de um elemento.
    
````
div {
    padding: 20px;
}
````

* ````padding-top````: Define o preenchimento superior.

 ````
div {
    padding-top: 20px;
}
````

* ````padding-right````: Define o preenchimento direito.

````
div {
    padding-right: 20px;
}
````

* ````padding-bottom````: Define o preenchimento inferior.

````
div {
    padding-bottom: 20px;
}
````

* ````padding-left````: Define o preenchimento esquerdo.

````
div {
    padding-left: 20px;
}
````

* Valores Percentuais: É possível usar valores percentuais para definir o preenchimento com base na largura do elemento pai.

````
div {
    padding: 10%;
}
````
---

## Propriedades de Width e Height

As propriedades width e height no CSS são usadas para definir a largura e altura de elementos. Vamos explorar essas propriedades em detalhes:

* ````width````: Define a largura de um elemento. Os valores podem ser definidos em unidades absolutas (como pixels) ou relativas (como porcentagem).

````
div {
    width: 200px; /* Valor absoluto */
}
div {
    width: 50%; /* Valor relativo */
}
````

* ````height````: Define a altura de um elemento. Assim como a largura, os valores podem ser absolutos ou relativos.

````
div {
    height: 100px; /* Valor absoluto */
}
div {
    height: 50%; /* Valor relativo */
}
````

* Valores Automáticos (auto): Usar auto permite que o navegador calcule a largura ou altura automaticamente com base no conteúdo ou no contexto.

````
div {
    width: auto;
    height: auto;
}
````

* Unidades de Medida:

    * Pixeis (px): Unidade fixa.
    ````
    div {
        width: 300px;
        height: 200px;
    }
    ````
* Porcentagem (%): Baseado na largura ou altura do elemento pai.

    * 
    ````
    div {
        width: 50%;
        height: 50%;
    }
    ````

* Viewport Width (vw) e Viewport Height (vh): Unidades relativas ao tamanho da viewport.

    *
    ````
    div {
        width: 50vw; /* 50% da largura da viewport */
        height: 50vh; /* 50% da altura da viewport */
    }
    ````

* Em (em): Relativo ao tamanho da fonte do elemento.

    *
    ````
    div {
        width: 20em;
    }
    ````

* Rem (rem): Relativo ao tamanho da fonte do elemento raiz (root).

    *
    ````
    div {
        width: 10rem;
    }
    ````

* Valores Máximos e Mínimos:

    * max-width: Define a largura máxima de um elemento.
    ````
    div {
        max-width: 100%;
    }
    ````

* ````max-height````: Define a altura máxima de um elemento.

    *
    ````
    div {
        max-height: 500px;
    }
    ````

* ````min-width````: Define a largura mínima de um elemento.

    *
    ````
    div {
        min-width: 200px;
    }
    ````

* ````min-height````: Define a altura mínima de um elemento.

    *
    ````
    div {
        min-height: 150px;
    }
    ````
---

## Propiedades de Text

* As propriedades de texto no CSS permitem estilizar e formatar o texto em uma página web. Aqui estão as principais propriedades de texto:

* ````color````: Define a cor do texto.

````
p {
    color: blue;
}
````

* ````text-align````: Alinha o texto horizontalmente dentro de seu contêiner.

Valores: left, right, center, justify.

````
p {
    text-align: center;
}
````

* ````text-decoration````: Adiciona decoração ao texto, como sublinhado, linha sobre o texto, etc.

Valores: none, underline, overline, line-through, blink.

````
a {
    text-decoration: underline;
}
````

* ````font-family````: Define a família de fontes para o texto.

````
p {
    font-family: 'Arial', sans-serif;
}
````

* ````font-size````: Define o tamanho da fonte.

````
p {
    font-size: 16px;
}
````

* ````font-weight````: Define a espessura do texto.

Valores: normal, bold, bolder, lighter, ou números (100 a 900).

````
p {
    font-weight: bold;
}
````

````font-style````: Define o estilo da fonte.

Valores: normal, italic, oblique.

````
p {
    font-style: italic;
}
````

* ````text-transform````: Controla a capitalização do texto.

Valores: none, capitalize, uppercase, lowercase.

````
p {
    text-transform: uppercase;
}
````

````line-height````: Define a altura da linha (espaçamento entre linhas).

````
p {
    line-height: 1.5;
}
````

* ``letter-spacing``: Define o espaçamento entre letras.

````
p {
    letter-spacing: 2px;
}
````

* ``word-spacing``: Define o espaçamento entre palavras.

````
p {
    word-spacing: 4px;
}
````

* ``text-shadow``: Adiciona sombra ao texto.

````
h1 {
    text-shadow: 2px 2px 4px #000000;
}
````

* ``white-space``: Define como o espaço em branco dentro de um elemento é tratado.

Valores: normal, nowrap, pre, pre-wrap, pre-line.

````
p {
    white-space: pre;
}
````

* ``text-indent``: Indenta a primeira linha de um parágrafo.

````
p {
    text-indent: 50px;
}
````

---

## Proipriedades da font

As propriedades de fonte no CSS são usadas para controlar a aparência do texto. Vamos explorar as principais propriedades de font:

* ``font-family``: Define a família de fontes para o texto.

´´´´
p {
    font-family: 'Arial', sans-serif;
}
´´´´

* ``font-size``: Define o tamanho da fonte.

````
p {
    font-size: 16px;
}
````

* ``font-style``: Define o estilo da fonte.

Valores: normal, italic, oblique.

````
p {
    font-style: italic;
}
````

* ``font-weight``: Define a espessura do texto.

Valores: normal, bold, bolder, lighter, ou números (100 a 900).

````
p {
    font-weight: bold;
}
````

* ``font-variant``: Define variantes de fontes, como todas as letras maiúsculas em um menor tamanho (small-caps).

````
p {
    font-variant: small-caps;
}
````

* ``font-stretch``: Define a largura da fonte.

Valores: normal, condensed, expanded, semi-condensed, semi-expanded, extra-condensed, extra-expanded, etc.

````
p {
    font-stretch: expanded;
}
````

* ``line-height``: Define a altura da linha (espaçamento entre linhas).

````
p {
    line-height: 1.5;
}
````

* Propriedade Abreviada font: A propriedade font é uma forma abreviada de definir font-style, font-variant, font-weight, font-size, line-height, e font-family.

````
p {
    font: italic small-caps bold 16px/1.5 'Arial', sans-serif;
}
````

* Exemplo prático:

````
body {
    font-family: 'Roboto', sans-serif;
    font-size: 18px;
    font-weight: 400;
    line-height: 1.6;
}
h1 {
    font-family: 'Georgia', serif;
    font-size: 2em;
    font-style: italic;
    font-weight: 700;
}
p {
    font-variant: small-caps;
    font-stretch: semi-condensed;
}
````
---

## Estilização de Links

Estilizar links no CSS permite que você personalize a aparência dos links em sua página web, melhorando a estética e a experiência do usuário. Aqui estão algumas maneiras de estilizar links:

* Alterar a Cor do Link:

````
a {
    color: blue; /* Cor do link */
}
````

* Estilizar Diferentes Estados de Links: Links podem ter diferentes estados: link normal, link visitado, link ao passar o mouse (hover), link ativo (active).

````
a:link {
    color: blue; /* Link normal */
}
a:visited {
    color: purple; /* Link visitado */
}
a:hover {
    color: red; /* Link ao passar o mouse */
}
a:active {
    color: green; /* Link ativo */
}
````

* Remover Sublinhado do Link:

````
a {
    text-decoration: none; /* Remove sublinhado */
}
````

* Adicionar Estilo ao Passar o Mouse (Hover):

````
a:hover {
    text-decoration: underline; /* Adiciona sublinhado */
    color: red; /* Muda a cor */
}
````

* Adicionar Estilo ao Link Ativo:

````
a:active {
    text-decoration: none;
    color: green;
}
````

* Usar Imagens como Links:

````
a {
    display: inline-block;
}
a img {
    border: none; /* Remove borda */
}
````

* Botões de Links Estilizados:

````
a.button {
    display: inline-block;
    padding: 10px 20px;
    background-color: #007bff;
    color: white;
    text-align: center;
    text-decoration: none;
    border-radius: 5px;
}
a.button:hover {
    background-color: #0056b3;
}
````

* Usar Variáveis CSS: Você pode definir variáveis para reutilizar estilos em diferentes partes do seu CSS.

````
:root {
    --link-color: blue;
    --link-hover-color: red;
}
a {
    color: var(--link-color);
    text-decoration: none;
}
a:hover {
    color: var(--link-hover-color);
    text-decoration: underline;
}
````

* Aqui está um exemplo prático:

````
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Exemplo de Estilização de Links</title>
    <style>
        /* Estilos de link */
        a {
            color: blue;
            text-decoration: none;
        }
        a:visited {
            color: purple;
        }
        a:hover {
            color: red;
            text-decoration: underline;
        }
        a:active {
            color: green;
        }
        /* Botão de link estilizado */
        a.button {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: white;
            text-align: center;
            text-decoration: none;
            border-radius: 5px;
        }
        a.button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <h1>Estilizando Links no CSS</h1>
    <p>Exemplo de <a href="#">link normal</a>.</p>
    <p>Exemplo de <a href="#" class="button">botão de link estilizado</a>.</p>
</body>
</html>
````

---


* **Podem ser definidos n valores referente as direções: *topo, direita, inferior e esquerda.***

    * **Dois valores correspondem as direções: *superior e inferior*.**
        *   ````
            div {
                margin: 20px 10px;
            }
            ````

        * **Três valores correpondem as  direções: *esquerda, direita, inferior*.**

        *   ````
            div {
                margin: 20px 10px 15px;
            }
            ````

        *   **Quatro valores: Aplica margens em sentido horário: *(topo, direita, inferior, esquerda)* .**

            ````
                div {
                    margin: 20px 10px 15px 5px;
                }
            ````
          
*   **Margem Automática (auto): Utilizada principalmente para centralizar elementos horizontalmente dentro de um contêiner.**

    ````
    div {
        margin: 0 auto;
    }
    ````
  
*   **Valores Negativos: É possível usar valores negativos para margens, o que pode ser útil para ajustar a posição de elementos.**

    ````
        div {
            margin-top: -10px;
        }
    ````
----


## Intermediário de CSS

* **Box Model**
    * Todo elemento é conisderado uma caixa composta por:
        * conteúdo, padding (preenchimento), border(borda) e margin (margem).

* ****
````
div {
    width: 300px;
    padding: 10px;
    border: 1px solid black;
    margin: 20px;
}
````

* **Layout com Flexbox**
    * Uma maneira muito eficaz de se criar layouts.

````
.container {
    display: flex;
    justify-content: center;
    align-items: center;
}
.item {
    flex: 1;
}
````

* **Grid**
    * Outra maneira eficaz de criar layouts.
````
.grid-container {
    display: grid;
    grid-template-columns: auto auto auto;
    gap: 10px;
}
.grid-item {
    background-color: lightgrey;
    padding: 20px;
    text-align: center;
}
````
---

## Avançado de CSS

* **Animações com transições**
````
.botao {
    transition: background-color 0.5s;
}
.botao:hover {
    background-color: green;
}
````

* **Criação de animações complexas**
````
@keyframes exemplo {
    from {background-color: red;}
    to {background-color: yellow;}
}
.animacao {
    animation-name: exemplo;
    animation-duration: 4s;
    animation-iteration-count: infinite;
}
````

* **Pseudo-classes**
    * Aplicam estilos a estados específicos de um elemento
````
a:hover {
    color: red;
}
````

* **Pseudo-elementos**
````
p::first-line {
    font-weight: bold;
}
````

* **Media Queries**
    * Adaptam elementos para diferentes tamanhos de telas.
````
@media (max-width: 600px) {
    .container {
        flex-direction: column;
    }
}
````

* **Variáveis CSS**
````
:root {
    --cor-primaria: blue;
}
.elemento {
    color: var(--cor-primaria);
}
````
----
## Detalhes a serem definidos.





