# Projeto FiapGames - Thiago Sobral de Alvarenga

## 📊 Informações do Aluno

- **Nome:** Thiago Sobral de Alvarenga
- **RM:** 562695
- **Turma:** 2CCPG
- **Curso:** Ciência da Computação
- **GitHub:** @thiago-alvarenga07

---

## 🎯 Descrição do projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programção Orientada a Objetos, 
onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana)

---

## ✅ Checklist de Implementação

- [x] Aula 1 - Classes e Objetos
- [x] Aula 2 - Métodos
- [x] Aula 3 - Encapsulamento
- [x] Aula 4 - Construtores
- [x] Aula 5 - Associação
- [x] Aula 6 - Herança
- [x] Aula 7 - Poliformismo
- [x] Aula 8 - Classes Abstratas
- [x] Aula 9 - Interfaces

---

## 🤔 Perguntas de Reflexão

### Aula 1 - Classes e objetos

**Pergunta:** Por que precisamos criar uma classe `Passageiro`? Não seria mais fácil apenas
 criar variáveis soltas no main, como `String nome Ana = "Ana"` e `double saldoAna = 50.0`?

**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a classe ajuda a resolver isso?

**Resposta:**
Ao criar uma classe você permite a redução do tamanho do código para situações 
que o código possua mais de um usuário, ao criar um usuário utilizando uma classe
 você utiliza apenas uma linha para cada, sem utilizar uma classe o código todo que está
 no arquivo da classe teria que se repetir pela quantidade de usuários que serão criados 
 impossibilitado a criação de milhares de usuários manualmente.

---

### Aula 2 - Métodos

**Pergunta:** "Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo`
 \+ 100 diretamente no código principal, por que dá tanto trabalho criar um método
 específico chamado `adicionarSaldo\(valor\)` para fazer isso? Quais seriam os
 riscos para a nossa startup de mobilidade se deixássemos qualquer programador
  alterar o saldo diretamente?"

**Resposta:**
Ao criar os métodos dentro da classe o código além de ficar mais organizado, pois cada função 
ficará dentro de da classe que a utiliza a startup fica mais segura, pois impede que o programador
não consiga alterar no saldo diretamente, já que isso pode facilitar com que programadores alterem de maneira 
mau intencionada, além de facilitar a alteração dos métodos, pois fica tudo em um só lugar,
além de que você pode colocar um alerta no método para escrever quem mudou o saldo e quanto foi alterado,
possibilitando maior controle sobre a segurança.

### Aula 3 - Encapsulamento

**Pergunta:** "No nosso código, os atributos são `private`, mas os métodos `getSaldo\(\)` e `getNome\(\)` 
são `public`. Por que é seguro deixar o `get` público, mas perigoso deixar o atributo original público?

Pense bem: Qual a diferença entre dar a alguém uma CÓPIA de um documento seu, e entregar o documento ORIGINAL 
para a pessoa rasurar? "

**Resposta:**

O "get" serve apenas como uma cópia como menciona a pergunta, não é possível alterar 
o valor de uma váraivel com o método "get", já o "set" é como o documento original, 
através do método set podemos definir ou alterar o valor de uma váriavel o get é apenas 
criado para podermos utiliza-lo no sistema principal para exibir as informações ao usuário 
só podemos alterar o valor de uma variável através de um método que valide antes se podemos ou não
mexer na informação.

### Aula 4 - Construtores

**Pergunta:** "Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito importantes:

> 1. Nós **não** criamos o método `setModelo\(\)`.
> 2. O `setPlaca\(\)` foi criado como **privado**, e criamos um método público chamado `atualizarPlaca\(\)` para acessá-lo.

Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em 'Gerar Getters e Setters para tudo' 
automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?"

Dica: Pense sobre o que pode ou não mudar fisicamente em um carro, e a diferença entre 
"alterar um dado no banco" e "executar um processo real no Detran"_"

**Resposta:**
O modelo de um carro nunca pode ser alterado, ao ser criado não tem porque criar 
um método set que possibilite a alteração, o método atualizarPlaca é público pois, 
ele passa por uma verificação para que possa ser alterado então não possibilita a 
alteração tão facilmente da placa, isso demonstra porque não podemos gerar Getters e Setters 
automaticamente, pois dependendo da variável ela pode ter ou não um método set.

### Aula 5 - Associação

**Pergunta:** ""No construtor da `Viagem`, nós exigimos o objeto inteiro \(`Passageiro solicitante`\). 
Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas 
a String do nome no construtor da Viagem \(`String nomeDoPassageiro`\) em vez do objeto todo?"

Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? 
Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela?"

**Resposta:**
Mesmo que no momento de criação da viagem no resumo só pessa o nome do passageiro, 
em algum outro momento da viagem, o construtor pode precisar de alguma outra informação 
do passageiro, como no exemplo dado na pergunta, no momento em que o saldo será descontado 
para realizar o pagamento da viagem, além de que, se o sistema possuir duas pessoas com o mesmo nome,
se tivermos acesso a todas as outras informações do passageiro poderemos diferencia-las.

### Aula 6 - Herança

**Pergunta:** ""No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` 
herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de `Carro` NÃO consegue fazer `this.placa = "ABC"`. 
Ele é obrigado a usar o `super\(\)` ou o `setPlaca\(\)`.

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas 
que isso está protegendo?

**Resposta:**
O uso obrigatório do super no construtor ou de métodos específicos de acesso garante 
que a classe filha respeite o Encapsulamento. Isso protege as regras de negócio da classe mãe, 
pois toda e qualquer modificação precisa passar pelos filtros e validações que ela definiu. 
Assim, garantimos que o objeto nunca entre em um estado inválido, mantendo o sistema padronizado e protegido 
contra erros acidentais de outros programadores que herdarem seu código.

### Aula 7 - Poliformismo

**Pergunta:** No nosso loop `for \(Veiculo veiculo : frota\)`, a variável `veiculo` é do tipo genérico `Veiculo`. 
Se esquecêssemos de criar o método `calcularAutonomia\(\)` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo 
dentro do loop, mesmo sabendo que ele existe dentro do `Carro` e da `Moto`? Por que o contrato precisa existir na 
base da hierarquia?

**Resposta:**
Não, você não conseguiria chamá-lo. O Java realiza uma verificação rigorosa de 
tipos durante a compilação; se você diz ao código que está lidando com um Veiculo, 
ele só permite acessar o que está explicitamente declarado na classe Veiculo. 
O compilador não "adivinha" que ali dentro existe um Carro ou uma Moto com métodos extras,
impossibilitando chamar a mãe no loop.

### Aula 8 - Classes Abstratas

**Pergunta:** "Pense no mundo real: Faz sentido existir um objeto que é APENAS 'Veículo' sem ser um tipo específico? 
Você já entrou em uma concessionária e comprou "um veículo" genérico, sem ser carro, moto, caminhão ou nada disso?

Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? Por que ele não 
deduz isso sozinho?

Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new Veiculo\(\)` 
e quebrar a lógica do nosso sistema?

**Resposta:**
O Java não deduz sozinho pois o nome da classe é algo que é criado pelo programador 
quem deve interpretar se o que está sendo criado é abstrato ou não é o próprio 
desenvolvedor. Ao usar abstract, você impõe uma trava de segurança o Java impede a 
criação de objetos genéricos e obriga todas as subclasses a implementarem os 
comportamentos necessários.

### Aula 9 - Interfaces

**Pergunta:** "Por que Java permite herança simples \(apenas uma mãe\), mas múltipla implementação de interfaces 
\(vários contratos\)?

Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo \(herança múltipla\), o que 
aconteceria se AMBAS as mães tivessem um método chamado `ligar\(\)`?

Como as interfaces resolvem esse problema?

**Resposta:**
Em alguns casos podemos ter mães com um método igual e se uma classe filha tentasse
 herdar as duas o Java não saberia o que fazer gerando um erro, a implementação permite 
 herdar apenas um método em específico impossibilitando o problema que poderia ser criado ao
 tentarmos fazer com que um filho herdasse duas mães diferentes, por isso interfaces
 nos auxiliam nesses casos.

---

## 🚀 Desafios Técnicos Implementados

### Desafio Pessoal FiapGames

**Qual foi o domínio que você escolheu para seu projeto pessoal?**

Loja de jogos

**Quais classes você criou?**

Classes: Carrinho, CarroEletrico, Mouse, MouseSemFio, Playstation, Produto, Usuario, Recarregavel

**Qual foi o maior desafio técnico que você enfrentou?**

Pessoalmente o maior defaio técnico que eu enfrentei foi ter que alterar entre 
diferentes objetos, para a realização do desafio pessoal, já que ao decorrer das 
aulas fui percebendo que em alguns dos ensinamentos o objeto que eu hava escolhido,
 não possiblitava a aplicação do que foi aprendido na aula do dia, e também tive um pouco
 de dificuldade no momento que estava aprendendo como e para que funcionam os 
getters e setters já que visualmente no código eles não mudam tanto a estrutura da classe.
 Tive um problema também em que fiquei utilizando a IDE eclipse por grande parte das aulas,
 não gostei dela pois a que eu utilzava antes é mais versatil e facilita meu uso para diferentes
 linguagens de programação, porém acabei trocando para o vs code após um tempo, tinha optado
 utilizar mais a IDE apresentada pelo professor para conhecer outras, mas depois acabei 
voltando para o vs code por preferência.

---

## 🎓 Conclusão

**O que você aprendeu nestas 9 aulas?**

Aprendi a utilizar Java e aprofundei meus conhecimentos adquiridos no final do meu 
primeiro ano de Ciência da Computação sobre orientação ao objeto.

**Qual conceito foi mais difícil de entender?**

O conceito que mais tive dificuldade foi de entender a funcionalidade dos getters e
 setters por não mudarem tanto a estrutura visual do código, porém ao refazer a leitura
 da documentação da aula pude entender melhor como funciona os dois métodos.

**O que você melhoraria no seu projeto se pudesse refazer?**

Eu teria escolhido variáveis diferentes já sabendo de como fica o resultado final e
 escolheria outro objeto que se encaixasse mais com o que foi aprendido em aula.

