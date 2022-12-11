<h1>Singleton</h1>

<h2>Integrantes do trabalho</h2>
<td><li>Patrick Gonçalves</li>
  <li>Rodrigo Pedrotti</li></td>

<h2><b>Design Patterns</b></h2>
<p>Elementos da programação orientada a objetos, encontrados em várias linguagens de programação como Java, C#, Delphi, 
entre outras, pelo(s) qual(is) nos permite abstrair de maneira mais eficiente e porque não eficaz a recuperação de dados 
através de uma simples codificação própria para cada elemento de um Design Pattern.</p>

<p>O nome vem da lógica que temos que ter "as melhores práticas para resolver problemas conhecidos".</p>

<h2><b>Então o que é o Singleton </b></h2>
<p>Garantir que uma classe tenha somente uma instância e fornece um ponto global de acesso para a mesma.
Ou seja, uma classe gerencia a própria instância dela além de evitar que qualquer outra classe crie uma instância dela. 
Para criar a instancia tem-se que passar pela classe obrigatoriamente, nenhuma outra classe pode instanciar ela. 
O Padrão Singleton também oferece um ponto global de acesso a sua instância. A própria classe sempre vai oferecer a 
própria instância dela e caso não tenha ainda uma instância, então ela mesma cria e retorna essa nova instância criada.</p>

<h2><b>Entendendo um pouco melhor sobre o padrão</b></h2>

![padraosingleton_java1](https://user-images.githubusercontent.com/34414598/48813997-52483380-ed20-11e8-9f33-f0065e73e4f0.jpg)

<p>Observando a imagem acima verificamos que ela se refereque ela se refere ao diagrama de classe do padrão Singleton, nela tem-se o atributo singleton que é do tipo da sua própria classe e é estático, nessa variável tem-se a única instância da classe. Nos métodos pode-se observar a presença do construtor da classe Singleton() que é PRIVADO. Ou seja, um construtor privado não permite que a classe seja instanciada a não ser que seja feito por ela mesmo na qual será instanciada pelo método getInstance() que é estático e assim pode ser acessado de qualquer outra classe sem precisar instanciar Singleton.</p>

<h2>Verificando a funcionalidade, na prática, do padrão de desenvolvimento</h2>

<p>Criando uma classe Singleton com um construtor privado e um método getInstancia para realizar a verificação se a mesma é nula, se nula instância o objeto, caso não seja nula mantém a instância já criada.</p>

![classe singleton](https://user-images.githubusercontent.com/34414598/49014036-e6255f80-f165-11e8-8328-228faaeab474.jpg)

<p>Criando a classe principal com um construtor de Singleton, verificamos que ocorre um erro pelo fato de o mesmo ser privado, sendo necessária a instância da classe pelo método getInstancia.</p>

![principal com erro](https://user-images.githubusercontent.com/34414598/49016887-90a18080-f16e-11e8-9f3b-171468a64820.jpg)

<p>Reajustando a classe principal, retirando a instância pelo construtor e colocando a instância dentro de um laço de repetição.</p>

![principal sem erro](https://user-images.githubusercontent.com/34414598/49014102-1967ee80-f166-11e8-9e0f-0783eff1c6d4.jpg)

<p>Verificamos que a classe é instanciada somente uma vez, mostrando a mensagem contida no método getInstancia que está dentro da classe Singleton.</p>

![terminal](https://user-images.githubusercontent.com/34414598/49014123-2be22800-f166-11e8-9830-69259bd972ef.jpg)
