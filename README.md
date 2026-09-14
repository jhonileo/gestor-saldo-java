# 💰 Gestor de Saldo em Java

Este projeto é uma aplicação de console desenvolvida para consolidar os fundamentos da linguagem **Java**, focando em boas práticas de programação, lógica de negócio e os primeiros passos na **Orientação a Objetos**.

## 🚀 Funcionalidades
- **Consulta de Saldo:** Visualização instantânea do saldo atual.
- **Depósito Validado:** O sistema impede depósitos de valores negativos ou zerados através de um laço de repetição.
- **Saque com Verificação:** Implementação de regra de negócio que impede saques superiores ao saldo disponível, garantindo a integridade dos dados.
- **Interface e Contratos:** Uso de Interfaces para definir o comportamento esperado das classes, promovendo um código mais organizado e escalável.

## 🛠️ Tecnologias e Conceitos Aplicados
- **Java 17+**: Uso de tipos modernos e sintaxe atualizada.
- **Scanner**: Interação robusta com o usuário via terminal.
- **Switch-Case**: Organização limpa do menu de navegação.
- **Encapsulamento e Interfaces**: Separação de responsabilidades entre `Main`, `conta` e `MeuSaldo`.
- **Git/GitHub**: Controle de versão e documentação de projeto.

## 📂 Estrutura do Projeto
O código está organizado no pacote `Gestor_de_Saldo`:
- `Main.java`: Ponto de entrada da aplicação e controle do menu.
- `Saldo.java`: Implementação da lógica de negócios e cálculos.
- `MeuSaldo.java`: Interface que define o contrato das operações bancárias.

---
*Projeto desenvolvido como parte da trilha de estudos para Desenvolvedor Back-End Java.*
