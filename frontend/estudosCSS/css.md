# CSS (Cascading Style Sheets)

---

## Básico CSS

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

* **Cores**
  * **Nomes de cores**: ````color: red;````
  * **Valores Hexadecimais**: ````color: #ff0000;````
  * **RGB**: ````color: rgb(255, 0, 0);````
  * **RGBA**: ````color: rgba(255, 0, 0, 0.5);````

---
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
