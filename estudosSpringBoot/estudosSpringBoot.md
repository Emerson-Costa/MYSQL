<h1>
    <center><font color='blue'>SPRING BOOT</font></center>
<h1>
<hr>
    <h2>
        <center>IMPLEMENTAÇÃO DO MODELO CONCEITUAL</center>
    </h2>
</hr>
<hr>
    <div>
        <h3>
            <u>Estrutura de um projeto MVC Spring</u>
        </h3>
        <ul>
            <li><b>Camada de domnínio <i>(Domain)</i></b></li>
            <li><b>Camada de acesso aos dados <i>(Repository)</i></b></li>
            <li><b>Camada de Serviços <i>(Services)</i><b></li>
            <li><b>Controladores REST <i>(Resources)</i><b></li>
        </ul>
    </div>
    <div>
        <h3>
            <u>Passos para criar uma classe de domínio</u>
        </h3>
        <ol>
            <li>Antributos básicos</li>
            <li>Associações (inicie as coleções)</li>
            <li>Construtores (não inclua coleções no construtor com parâmetros)</li>
            <li>Hashcode e Equals (implementação padrão: somente id)</li>
            <li>Serializable (padrão: 1L)</li>
        </ol>
    </div>
</hr>
<hr>
    <h3>
        <u>JPA</u>
    </h3>
    <div>
        <p>JPA é uma API que facilita o armazenamento e a recuperação de dados em um banco de dados relacional usando objetos Java. Ele fornece uma maneira padronizada de definir como os dados dos objetos Java são armazenados em bancos de dados e como esses dados são acessados e manipulados.</p>
        <h4>Principais Componentes do JPA</h4>
        <ul>
            <li><i>EntitityManager:</i> Principal interface do JPA responsável por operações como salvar, atualizar, excluir e consultar entidades.</li>
            <li><i>Entity:</i> Uma classe simples que é mapeada para uma tabela no  banco. É anotada como @Entity para indicar que ela é uma entidade JPA.</li>
            <li><i>Persistence Unit:</i> Um arquivo persistence.xml, ele especifica as configurações de persistência, como provedor JPA, a URL do banco e outras propriedades.</li>
            <li><i>JPQL (Java  Persistence  Query Language):</i> Uma linguaagem de consulta orientada a objetos semelhante ao SQL, mas operando em entidades, não em tabelas.</li>
            <li><i>Annotations:</i> JPA usa anotações para configurar  entidades e relacionamentos, as mais comuns incluem: @Entity, @Table, @Id, @GeneratedValue, @OneToMany, @ManyToOne, etc.</li>
        </ul>
    </div>
</hr>
<hr>
    <h3>
        <u>Anotações</u>
    </h3>
        <p><code>@Entity</code>: Marca uma classe Java como entidade.</p>
        <pre>
            <code>
                import javax.persistence.Entity;
                //
                @Entity
                public class Usuario {  }
            </code>   
        </pre>
        <p><code>@Table</code>: Especifica a tablea do banco a qual a entidade será mapeada.</p>
        <pre>
            <code>
                import javax.persistence.Entity;
                import javax.persistence.Table;
                //
                @Entity
                @Table(name = "usuarios")
                public class Usuario {  }
            </code>
        </pre>
        <p><code>@Id</code>: Define o campo da chave primária da entidade.</p>
        <pre>
            <code>
                import javax.persistence.Id; 
                //
                @Id 
                private Long id;
            </code>
        </pre>
        <p><code>@GeneratedValue</code>: Especifica  o valor do campo que será gerado automaticamente.</p>
        <pre>
            <code>
                import javax.persistence.GeneratedValue;
                import javax.persistence.GenerationType;
                //
                @Id
                @GeneratedValue(strategy = GenerationType.IDENTITY)
                private Long id;
            </code>
        </pre>
        <p><code>@Column</code>: Detalhes da coluna como nome, tipo e e restrições</p>
         <pre>
            <code>
                import javax.persistence.Column;
                //
                @Column(name = "nome_completo", nullable = false)
                private String nome;
                //
                @Column(unique = true)
                private String email;
            </code>
         </pre>
         <p><code>@Temporal</code>: Tipo de dado de tempo como: DATE, TIME, TIMESTAMP para  campos Date ou Calendar.</p>
         <pre>
            <code>
                import javax.persistence.TemporalType;
                //
                @Temporal(TemporalType.DATE) 
                private Date dataNascimento;
            </code>
         </pre>
        </p><code>@Transient</code>: Indica o campo que não deve ser persistido no banco.<p> 
        <pre>
            <code>
                import javax.persistence.Transient;
                @Transient private int idadeCalculada;
            </code>
        </pre>    
        </p><code> @OneToMany</code>: Relacionamentode um  para muitos entre duas entidades.<p> 
        <pre>
            <code>
                import javax.persistence.OneToMany; 
                import java.util.List;
                // O 'usuario' é um atributo da classe Pedido.
                @OneToMany(mappedBy = "usuario")  
                private List<Pedido> pedidos;
            </code>
        </pre>
        </p><code>@ManyToOne</code>: Relacionamento  de muitos  para um entre duas entidades.<p> 
        <pre>
            <code>
                import javax.persistence.ManyToOne;
                //Atributo da classe pedido, cada pedido pertence a um único usuário.
                @ManyToOne 
                private Usuario usuario; 
            </code>
        </pre>
        </p><code>@OneToOne</code>: Relacionamento de um para um entre duas entidades.<p> 
        <pre>
            <code>
                import javax.persistence.OneToOne;
                //
                @OneToOne 
                private Endereco endereco;
            </code>
        </pre>      
        </p><code>@ManyToMany</code>: Relacionamento de muitos para muitos entre duas entidades.<p> 
        <pre>
            <code>
                import javax.persistence.ManyToMany; 
                import java.util.List;
                //
                @ManyToMany 
                private List<'Grupo> grupos;
            </code>
        </pre> 
        </p><code> @JoinColumn</code>: Especifica a coluna de junção para um relacionamento.<p> 
        <pre>
            <code>
                import javax.persistence.JoinColumn;
                //
                @ManyToOne @JoinColumn(name = "usuario_id") 
                private Usuario usuario;
            </code>
        </pre>   
        </p><code>@Embedable</code>: Uma classe pode sem embutida em  uma entidade, também muito utilizada como chave composta.<p> 
        <pre>
            <code>
                import javax.persistence.Embeddable;
                //
                @Embeddable 
                public class Endereco { 
                    private String rua; 
                    private String cidade; 
                    private String estado; 
                }
            </code>
        </pre>                               
        <p><code>@MappedSuperclass</code>: Indica uma super classe que não será mapeada na tabela.</p>
        <pre>
            <code>
                import javax.persistence.MappedSuperclass;
                //
                @MappedSuperclass 
                public abstract class Pessoa { 
                    private String nome;
                    private String cpf; 
                }     
            </code>
        </pre>
        <p><code>@Inheritance</code>: Define a estratégia de herança entre  classes e entidades. Pode ser usada com @DiscriminatorColumn.
        <pre>
            <code>
                import javax.persistence.Entity; 
                import javax.persistence.Inheritance; 
                import javax.persistence.InheritanceType; 
                import javax.persistence.DiscriminatorColumn;
                //
                @Entity @Inheritance(strategy = InheritanceType.SINGLE_TABLE) 
                @DiscriminatorColumn(name = "tipo_pessoa") 
                public abstract class Pessoa { 
                    private String nome; 
                }                   
            </code>
        </pre>
        <p><code>@DiscriminatorColumn e @DiscriminatorValue</code>: Usadas como Herança para especificar a coluna e os valores discriminadores.
        <pre>
            <code>
                import javax.persistence.Entity;
                import javax.persistence.DiscriminatorValue;
                //
                @Entity
                @DiscriminatorValue("FUNCIONARIO")
                public class Funcionario extends Pessoa {
                    private double salario;
                }                 
            </code>
        </pre>
</hr>
<hr>
    <h3>
        <u>Serialização JSON</u>
    </h3>
</hr>
<hr>
    <h2>
        <center>OPERAÇÕES DE CRUD E CASOS DE USO</center>
    </h2>
</hr>
<!--
<hr>
    <h3>
        <u></u>
    </h3>
</hr>
-->                                       