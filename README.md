# Programação Orientada a Objetos em Java — Atividade MAPA

Exercícios práticos dos fundamentos de **Programação Orientada a Objetos (POO)** em Java, organizados em ordem de dificuldade: primeiro classes e objetos, depois métodos e construtores, encapsulamento e, por fim, herança e polimorfismo.

> Referência: *Programação Avançada* — Edmar Alves Senne. Florianópolis, SC: Arqué, 2025. Unidade 2, p. 50.

## 📚 Conceitos praticados

| Conceito | Onde aparece |
|---|---|
| Classes e objetos | Exercícios 1 e 2 |
| Métodos e construtores | Exercícios 2 e 3 |
| Encapsulamento (getters e setters) | Exercício 4 |
| Herança | Exercícios 5 e 6 |
| Polimorfismo (sobrescrita de métodos) | Exercícios 5 e 6 |

## 🗂️ Exercícios

### 1. Criando a primeira classe — [`exercicio1/`](src/exercicio1)
Classe `Pessoa` com os atributos `nome`, `idade` e `cidade`. Um objeto é instanciado e seus dados são exibidos no console.

### 2. Classe Retângulo com métodos — [`exercicio2/`](src/exercicio2)
Classe `Retangulo` com `largura`, `altura` e o método `calcularArea()`, que retorna a área.

### 3. Conta bancária — [`exercicio3/`](src/exercicio3)
Classe `ContaBancaria` com construtor e os métodos `depositar()`, `sacar()` e `exibirSaldo()`. Valores inválidos e saques maiores que o saldo são recusados.

### 4. Produto com encapsulamento — [`exercicio4/`](src/exercicio4)
Classe `Produto` com atributos `private` acessados por getters e setters. O setter impede preço negativo.

### 5. Funcionário e Gerente — [`exercicio5/`](src/exercicio5)
`Gerente` herda de `Funcionario` e sobrescreve `calcularBonus()`: o funcionário recebe 10% do salário e o gerente, 20%. Os dois objetos são tratados como `Funcionario`, mas cada um executa a sua própria versão do método.

### 6. Sistema de veículos — [`exercicio6/`](src/exercicio6)
`Carro` e `Bicicleta` herdam de `Veiculo` e sobrescrevem `mover()`. Um array de `Veiculo` percorre os objetos e cada um exibe o seu próprio comportamento.

## ▶️ Como executar

Pré-requisito: **JDK 17 ou superior**. Cada exercício fica na sua própria pasta (pacote) dentro de `src`, com a classe `ExercicioN` (que tem o `main`) e as classes que ela usa.

```bash
# dentro da pasta src
javac exercicio1/*.java
java exercicio1.Exercicio1
```

No **VS Code** (com o Extension Pack for Java), abra o arquivo e clique em **Run**, logo acima do método `main`.

## 🖥️ Exemplo de saída (Exercício 5)

```
Ana (Funcionário) - Bônus: R$ 300.0
Carlos (Gerente) - Bônus: R$ 600.0
```

## 👤 Autor

**Wanderson Silva** — estudante de Análise e Desenvolvimento de Sistemas.
