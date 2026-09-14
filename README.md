# 💰 Gestor de Saldo em Java

Aplicação de console desenvolvida em Java para praticar fundamentos da linguagem, programação orientada a objetos e boas práticas de organização de código.

O projeto simula operações básicas de uma conta bancária, permitindo consultar o saldo, realizar depósitos e efetuar saques com validações.

## 🚀 Funcionalidades

- Consulta do saldo atual;
- Realização de depósitos;
- Validação de depósitos maiores que zero;
- Realização de saques;
- Validação de saques maiores que zero;
- Bloqueio de saques superiores ao saldo disponível;
- Menu interativo pelo terminal;
- Encerramento controlado da aplicação.

## 🛠️ Tecnologias e conceitos aplicados

- Java 17+;
- `BigDecimal` para operações financeiras;
- Programação orientada a objetos;
- Encapsulamento;
- Interfaces;
- Métodos e parâmetros;
- Estruturas condicionais;
- Estrutura de repetição;
- `switch`;
- `Scanner`;
- Tratamento básico de entradas do usuário;
- Git e GitHub.

## 🧱 Organização do projeto

O código está organizado no pacote `Gestor_de_Saldo`:

- `Main.java`: Ponto de entrada da aplicação e controle do menu.
- `Conta.java`: Implementação da lógica de negócios e cálculos.
- `MeuSaldo.java`: Interface que define o contrato das operações bancárias.


```text
Gestor_de_Saldo/
├── Main.java
├── Conta.java
└── MeuSaldo.java
