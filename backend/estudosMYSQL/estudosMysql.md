# <center>MYSQL</center>
---
<table style="width: 100%; font-size: 14px; background-color:rgb(250, 248, 248);">
    <thead style="background-color:rgb(206, 203, 203)">
        <tr>
            <th colspan='5'>Tipos primitivos</th>
        </tr>
    </thead>
    <body>
        <tr>
            <td style="font-weight: bold; background-color:rgb(206, 203, 203)">Numérico</td>
            <td><b>Inteiro:</b>TinyInt, SmallInt, Int, MediumInt, BigInt.</td>
            <td><b>Real:</b> Decimal, Float, Double</td>
            <td colspan='2'><b>Lógico:</b>Bit, Boolean.</td>
        </tr>
        <tr>
            <td style="font-weight: bold; background-color:rgb(206, 203, 203)">Data/Tempo</td>
            <td colspan='4'>Date, DateTime, TimeStamp, Time, Year.</td>
        </tr>
        <tr>
            <td style="font-weight: bold; background-color:rgb(206, 203, 203)">Literal</td>
            <td><b>Caractere:</b> Char, Varchar.</td>
            <td><b>Texto:</b> TinyText, Text, MediumText, LongText.</td>
            <td><b>Binário:</b> TinyBlob, Blob, MediunBlob, LongBlob.</td>
            <td><b>Coleção:</b> Enum, Set</td>
        </tr>
        <tr>
            <td style="font-weight: bold; background-color:rgb(206, 203, 203)">Espacial</td>
            <td colspan='4'>Geometry, Point, Polygon, MultiPolygon (Guarda informações volumetricas)</td>
        </tr>
    </body>
</table>

<table style="width: 100%;  font-size: 14px; background-color:rgb(250, 248, 248);">
    <thead style="background-color:rgb(206, 203, 203)">
        <th>Tipos de comandos</th>
        <th>Propósito</th>
        <th>Exemplos</th>
    </thead>
    <body>
        <tr>
            <td style="background-color:rgb(206, 203, 203)"><b>DDL</b> (Data Definition  Language)</td>
            <td>Definem a estrutura do banco  de dados</td>
            <td>CREATE, ALTER e DROP.</td>
        </tr>
        <tr>
            <td style="background-color:rgb(206, 203, 203)"><b>DML</b> (Data Manipulation Language)</td>
            <td>Manipulação dos dados</td>
            <td>INSERT, UPDATE, DELETE</td>
        </tr>
        <tr>
            <td style="background-color:rgb(206, 203, 203)"><b>DQL</b> (Data Query Language)</td>
            <td>Consultar dados</td>
            <td>SELECT</td>
        </tr>
        <tr>
            <td style="background-color:rgb(206, 203, 203)"><b>DCL</b> (Data Control Language)</td>
            <td>Controle e gerenciamente de segurança</td>
            <td>GRANT, REVOKE</td>
        </tr>
    </body>
</table>

---

<table style="width: 100%;  font-size: 14px; background-color:rgb(250, 248, 248);">
    <thead style="background-color:rgb(206, 203, 203)">
        <th colspan="2">Operadores de comparação</th>
    </thead>
    <body>
        <tr>
            <td style="background-color:rgb(206, 203, 203)">Igual</td>
            <td>=</td>
        </tr>
        <tr>
            <td style="background-color:rgb(206, 203, 203)">OU</td>
            <td><></td>
        </tr>
        <tr>
            <td style="background-color:rgb(206, 203, 203)">Diferente</td>
            <td>!=</td>
        </tr>
        <tr>
            <td style="background-color:rgb(206, 203, 203)">Maior</td>
            <td>></td>
        </tr>
        <tr>
            <td style="background-color:rgb(206, 203, 203)">Menor</td>
            <td><</td>
        </tr>
        <tr>
            <td style="background-color:rgb(206, 203, 203)">Maior ou Igual</td>
            <td>>=</td>
        </tr>
        <tr>
            <td style="background-color:rgb(206, 203, 203)">Menor ou Igual</td>
            <td><=</td>
        </tr>
    </body>
</table>

<table style="width: 100%;  font-size: 14px;  background-color:rgb(250, 248, 248);">
    <thead>
        <th colspan='2' style="background-color:rgb(206, 203, 203)">Comandos básicos</th>
    </thead>
    <body>
        <tr>
            <td>
                <b>Selecionar um banco</b>
            </td>
            <td>
                <code>USE 'nome_banco';</code>
            </td>
        </tr>
        <tr>
            <td>
                <b>Mostrar os bancos criados</b>
            </td>
            <td>
                <code>SHOW DATABASES;</code>
            </td>
        </tr>
        <tr>
            <td>
                <b>Mostrar banco aberto</b>
            </td>
            <td>
                <code>STATUS;</code>
            </td>
        </tr>
        <tr>
            <td>
                <b>Mostrar as tabelas</b>
            </td>
            <td>
                <code>SHOW TABLES;</code>
            </td>
        </tr>
        <tr>
            <td>
                <b>Apagar banco</b>
            </td>
            <td>
                <code>DROP DATABASE 'nome_banco';</code>
            </td>
        </tr>
    </body>
</table>

---

### <center>Formatos condicionais</center>

* Cláusula <code>WHERE</code> filtra os registros de acordo com a condição. 
<pre>
    <code>
        WHERE idade > 18;
    </code>
</pre> 
* Operador <code>BETWEEN</code> verifica valores dentro de um intervalo. 
<pre>
    <code>
        WHERE preco BETWEEN 100 AND 200;
    </code>
</pre>
* Operador <code>IN</code> verifica se um valor está dentro de umconjunto de valores. 
<pre>
    <code>
        WHERE cidade IN ('São Paulo', 'Rio de Janeiro', 'Belo Horizonte');
    </code>
</pre>
* Operador <code>LIKE</code> verifica se um valor epsecífico corresponde a um padrão específico. 
<pre>
    <code>
        WHERE nome LIKE 'E%'; -- Nomes que começam com 'E'.
    </code>
</pre>
* Operador <code>IS NULL</code> verifica se um valor é null. 
<pre>
    <code>
        WHERE email IS NULL;
    </code>
</pre>                                                                                       
* Cláusula <code>EXISTS</code> verifica se uma consulta retorna algum registro.  
<pre>
    <code>
        SELECT * FROM usuarios 
        WHERE EXISTS (SELECT 1 FROM pedidos WHERE pedidos.usuario_id = usuarios.id);
    </code>
</pre>
* Cláusula <code>IF  ELSE</code> (PostegreSQL, SQL Server). 
<pre>
    <code>
        IF EXISTS (<comandos_lógicos>) 
        BEGIN <operacões> 
        END ELSE 
        BEGIN <operacoes> 
        END;
    </code>
</pre>
---

### <center>CREATE | ALTER | DROP</center>

#### ``CREATE``

* Cria um novo banco: 
<pre>
    <code>
        CREATE DATABASE<nome_banco>
        DEFAULT CHARACTER SET utf8
        DEFAULT  COLLATE uf8_general_ci;
    </code>
</pre>                                                        
* Cria uma nova tabela:
<pre>
    <code>
        CREATE TABLE nome_da_tabela (
            coluna1 TIPO_DADO CONSTRAINTS,
            coluna2 TIPO_DADO CONSTRAINTS,
            ...
            PRIMARY KEY (coluna1)
        );
    </code>
</pre>                                                   
* Cria um novo índice:
<pre>
    <code>
        CREATE INDEX nome_do_indice 
        ON nome_da_tabela (coluna1, coluna2);
    </code>
</pre>
* Cria um índice único:
<pre>
    <code>
        CREATE UNIQUE INDEX nome_do_indice 
        ON nome_da_tabela (coluna1, coluna2);
    </code>
</pre>
* Cria  uma View:
<pre>
    <code>
        CREATE VIEW nome_da_view AS
        SELECT coluna1, coluna2
        FROM nome_da_tabela
        WHERE condição;
    </code>
</pre>
* Cria Procedure:
<pre>
    <code>
        CREATE PROCEDURE nome_da_procedure (parâmetros)
        BEGIN
            -- Corpo da procedure
        END;
    </code>
</pre>
* Cria uma função:
<pre>
    <code>
        CREATE FUNCTION nome_da_funcao (parâmetros) RETURNS tipo_de_retorno
        BEGIN
            -- Corpo da função
        RETURN valor;
        END;
    </code>
</pre>
* Cria um gatilho (TRIGGER):
<pre>
    <code>
        CREATE TRIGGER nome_do_trigger
        AFTER INSERT ON nome_da_tabela
        FOR EACH ROW
        BEGIN
            -- Corpo do trigger
        END;
    </code>
</pre>

#### ``ALTER``

* Adicionar uma nova coluna: 
<pre>
    <code>
        ALTER TABLE mome_tabela
        ADD COLUMN nome_coluna;
    </code>
</pre>

* Modificar os dados de uma coluna existente:
<pre>
    <code>
        ALTER TABLE mome_tabela
        MODIFY coluna NOVO_TIPO;
    </code>
</pre>
* Renomear uma coluna:
<pre>
    <code>
        ALTER TABLE mome_tabela
        RENAME COLUMN nome_coluna TO coluna_nova;
    </code>
</pre>
* Remover uma coluna: 
<pre>
    <code>
        ALTER TABLE mome_tabela
        DROP COLUMN nome_coluna;
    </code>
</pre>
* Adicionar chave primária:
<pre>
    <code>
        ALTER TABLE mome_tabela
        ADD PRIMARY KEY (nome_coluna);
    </code>
</pre>                                                                      
* Remover chave primária:
<pre>
    <code>
        ALTER TABLE mome_tabela
        DROP PRIMARY KEY;
    </code>
</pre>
* Adicionar Índice:  
<pre>
    <code>
        ALTER TABLE mome_tabela
        ADD INDEX indice_nome (nome_coluna);
    </code>
</pre>                                                       
* Remover Índice:
<pre>
    <code>
        ALTER TABLE mome_tabela
        DROP INDEX indice_nome;
    </code>
</pre>
* Adicionar chave estrangeira: 
<pre>
    <code>
        ALTER TABLE mome_tabela
        ADD CONSTRAINT fk_nome 
        FOREIGN KEY (nome_coluna) 
        REFERENCES outra_tabela ( coluna_referenciada);
    </code>
</pre>
* Remover chave estrangeira:  
<pre>
    <code>
        ALTER TABLE mome_tabela
        DROP FOREIGN KEY fk_nome;
    </code>
</pre>                                                                 
* Renomear tabela:     
<pre>
    <code>
        ALTER TABLE mome_tabela
        RENAME TO tabela_nova;
    </code>
</pre>
* Modificar restrições de coluna: 
<pre>
    <code>
        ALTER TABLE mome_tabela
        MODIFY nome_coluna TIPO NOT NULL;
        MODIFY nome_coluna TIPO DEFAULT'valor_padrao';
    </code>
</pre>        
* Habilitar/Desabilitar Chave Estrangeira:
<pre>
    <code>
        ALTER TABLE mome_tabela
        SETforeign_keychecks = 0;--Desabilita
        SETforeign_keychecks = 1;-- Habilita
    </code>
</pre> 

#### ``DROP``

* Remover Banco.
<pre>
    <code>
        DROP  DATABASE nome_banco;
    </code>
</pre>
* Remover taberla. 
<pre>
    <code>
        DROP TABLE nome_tabela;
    </code>
</pre>
* Remover  índice de uma tabela. 
<pre>
    <code>
        DROP INDEX nome_indice ON  nome_tabela;
    </code>
</pre>
* Remover uma  view. 
<pre>
    <code>
        DROP VIEW  nome_view;
    </code>
</pre>
* Remover um procedimento (Procedure). 
<pre>
    <code>
        DROP PROCEDURE nome_procedure;
    </code>
</pre>
* Remover uma função. 
<pre>
    <code>
        DROP FUNCTION nome_funcao;
    </code>
</pre>
* Remover um gatilho (Trigger). 
<pre>
    <code>
        DROP TRIGGER nome_trigger;
    </code>
</pre>
* Remover uma sequência. 
<pre>
    <code>
        DROP SEQUENCE nome_sequencia;
    </code>
</pre>
* Remover um usuário. 
<pre>
    <code>
        DROP USER nome_usuario;
    </code>
</pre>
* Remover uma chave estrangeira.

<pre>
    <code>
        ALTER TABLE nome_Tabela 
        DROP FOREINGN KEY nome_FK;
    </code>
</pre>

---

## <center>INSERT | UPDATE | DELETE</center>

#### ``INSERT``

* Inserir novos registros:
<pre>
    <code>
        INSERT INTO nome_tabela (coluna1,coluna2, coluna3)
        VALUES (valor1, valor2, valor3);
    </code>
</pre>

* Inserir registros usando a cláusula SET especificando os valores:
<pre>
    <code>
        INSERT INTO nome_tabela SET
        coluna1 = valor1,
        coluna2 = valor2,
        coluna3 = valor3;
    </code>
</pre>

* Inserir registros copiando-os de uma outra tabela:
<pre>
    <code>
        INSERT INTO nome_tabela (coluna1, coluna2, coluna3)
        SELECT  colunaA, colunaB, colunaC
        FROM outra_tabela
        WHERE condição;
    </code>
</pre>

* Inserir registros ignorando erros de duplicidade (chaves primárias duplicadas):
<pre>
    <code>
        INSERT INTO nome_tabela (coluna2, coluna3)
        VALUES (valor1, valor2, valor3);
    </code>
</pre>

* Inserir novos registros ignorando os existentes se houver conflito de chaves duplicadas:
<pre>
    <code>
        INSERT INTO nome_tabela INTO (coluna1, coluna2, coluna3)
        VALUES (valor1, valor2, valor3)
        ON DUPLICATE KEY UPDATE
        coluna1 = valor2_novo,
        coluna2 = valor3_novo;
    </code>
</pre>

* Inserir novos registros utilizando valores padrão definidos nas colunas:
<pre>
    <code>
        INSERT INTO nome_tabela DEFAULT VALUES;
    </code>
</pre>

#### ``UPDATE``

* Atualização Básica.
<pre>
    <code>
        UPDATE tabela
        SET coluna = valor
        WHERE condicao;
    </code>
</pre>

* Atualização em múltiplas colunas.
<pre>
    <code>
        UPDATE tabela
        SET coluna1 = valor1, coluna2 = valor2
        WHERE condicao;
    </code>
</pre>

* Atualização com JOIN.
<pre>
    <code>
        UPDATE tabela1
        INNER JOIN tabela2 ON tabela1.coluna = tabela2.coluna
        SET tabela1.coluna = valor
        WHERE condicao;
    </code>
</pre>

* Atualização condicional com CASE.
<pre>
    <code>
        SET coluna = CASE
            WHEN condicao1 THEN valor1
            WHEN condicao2 THEN valor2
            ELSE valor_default
        END
        WHERE condicao;
    </code>
</pre>

* Atualização com Subquery.
<pre>
    <code>
        UPDATE tabela
        SET coluna = (SELECT valor FROM outra_tabela WHERE condicao)
        WHERE condicao;
    </code>
</pre>

#### ``DELETE``

* Deleção básica.
<pre>
    <code>
        DELETE FROM tabela
        WHERE condicao;
    </code>
</pre>

* Deleção de todos os registros
<pre>
    <code>
       DELETE FROM tabela; 
    </code>
</pre>

* Deleção com JOIN
<pre>
    <code>
        DELETE tabela1
        FROM tabela1
        INNER JOIN tabela2 ON tabela1.coluna = tabela2.coluna
        WHERE condicao
    </code>
</pre>

* Deleção com subquery
<pre>
    <code>
        DELETE FROM tabela
        WHERE EXISTS (SELECT 1 FROM outra_tabela WHERE condicao);
    </code>
</pre>

* Deleção condicional
<pre>
    <code>
        DELETE FROM tabela
        WHERE EXISTS (SELECT 1 FROM outra_tabela WHERE condicao);
    </code>
</pre>

---

#### ``SELECT``

* Seleção básica.
<pre>
    <code>
        SELECT * FROM coluna1, coluna2
        FROM nome-tabela;
    </code>
</pre>

* Selecionar todas as colunas.
<pre>
    <code>
        SELECT * FROM nome-tabela
    </code>
</pre>

* Seleção com condições.
<pre>
    <code>
        SELECT coluna1, coluna2
        FROM nome-tabela
        WHERE condicao;
    </code>
</pre>

* Seleção com ordenação.
<pre>
    <code>
        SELECT coluna1, coluna2
        FROM tabela
        ORDER BY coluna1 ASC/DESC;
    </code>
</pre>

* Seleção com limites.
<pre>
    <code>
        SELECT coluna1, coluna2
        FROM nome-tabela
        LIMIT numero-linhas;
    </code>
</pre>

* Seleção com agrupamentos.
<pre>
    <code>
        SELECT coluna, COUNT(*)  
        FROM nome-tabela
        GROUP BY coluna;
    </code>
</pre>

* Seleção com agrupamento e condição.
<pre>
    <code>
        SELECT coluna, COUNT(*)  
        FROM nome-tabela
        GROUP BY coluna 
        HAVING COUNT(*) > numero-linhas;   
    </code>
</pre>

* Seleção com JOIN
<pre>
    <code>
        SELECT tabela1.coluna, tabela2.coluna
        FROM tabela1
        INNER JOIN tabela2 ON tabela1.coluna = tabela2.coluna;
    </code>
</pre>

* Seleção com subquery.
<pre>
    <code>
       SELECT coluna1, coluna2
       FROM tabela
       WHERE coluna IN (SELECT coluna FROM outra-tabela WHERE condicao);
    </code>
</pre>

* Seleção distinta
<pre>
    <code>
        SELECT DISTINCT coluna
        FROM tabela;
    </code>
</pre>





                                                                                       
                                                                                      
                                                                                                
                                                                                      
                                                                                      
                                                                                      
                                                                            
<!--
    <table>: Define o início da tabela.

    <thead>: Define o cabeçalho da tabela.

    <tbody>: Define o corpo da tabela.

    <tr>: Define uma linha na tabela.

    <th>: Define uma célula de cabeçalho na tabela.

    <td>: Define uma célula normal na tabela.

    colspan: Atributo usado para mesclar colunas.

    rowspan: Atributo usado para mesclar linhas.

    style: Atributo inline para adicionar estilos diretamente.
-->
