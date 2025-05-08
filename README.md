## ☕ Projeto ONE - Desafio Java "Extrato Bancário"

---

Este projeto foi desenvolvido como parte do **Desafio da Formação Java** do programa **Oracle Next Education (ONE)**, em parceria com a Alura. A aplicação simula o controle de uma conta bancária, permitindo ao usuário:

- Verificar saldo
- Efetuar transferências (saída de valores)
- Receber depósitos (entrada de valores)
- Encerrar a aplicação

O menu interativo permanece ativo até que o usuário escolha a opção de sair, validando sempre saldo suficiente para saques e tratando opções inválidas.

<br>

---

## 🚀 Funcionalidades

<br>
✅ <strong>Exibição de dados do cliente:</strong> Ao iniciar a aplicação, são apresentados o nome do cliente, o tipo de conta e o saldo inicial.<br><br>
✅ <strong>Menu interativo:</strong> Um menu com quatro opções permite ao usuário escolher entre consultar saldo, transferir valor, receber valor ou sair da aplicação.<br><br>
✅ <strong>Transferência com validação:</strong> Ao tentar transferir um valor, o sistema verifica se o saldo é suficiente antes de concluir a operação.<br><br>
✅ <strong>Recebimento de valores:</strong> Permite adicionar um valor à conta, atualizando o saldo imediatamente.<br><br>
✅ <strong>Loop contínuo de operação:</strong> O menu é exibido repetidamente até que o usuário escolha a opção de sair.<br><br>
✅ <strong>Mensagens de erro:</strong> Caso o usuário insira uma opção inválida, o sistema informa o erro de forma clara.<br><br>
<br>

---

## 🖥️ Como Funciona

<br>

1. O programa inicia exibindo as informações básicas do cliente.
2. Em seguida, entra em um loop de execução com as opções:
    - `1`: Consultar o saldo
    - `2`: Transferir valor
    - `3`: Receber valor
    - `4`: Sair
3. O usuário interage por meio do console, inserindo números correspondentes às opções.
4. A cada operação, o saldo é atualizado e exibido na tela.

<br>

---

## 🛠️ Tecnologias Utilizadas

<br>

- **Java** – Linguagem principal utilizada para desenvolver toda a lógica da aplicação.
- **JDK (Java Development Kit)** – Kit necessário para compilar e executar o programa Java.
- **Terminal/Console** – Interface utilizada para interação com o usuário por meio de linha de comando (CLI).
- **Scanner (java.util.Scanner)** – Classe responsável por capturar as entradas do usuário durante a execução.

<br>

---

## 📷 Demonstração (Console)

<br>
<p align="center"><img src="/assets/demonstracao-app-java-extrato-bancario.gif" alt="GIF Demonstrativo da Aplicação" style="max-width: 100%; height: auto;"></p>
<br><br>

---

## 🔗 Como Executar

<br>

1. **Clone o repositório:**

```bash
git clone https://github.com/ramonmonda/one-challenge-java-extrato-bancario
```

2. **Acesse o diretório do projeto:**

```bash
cd one-challenge-java-extrato-bancario
```

3. **Compile o código Java:**

```bash
javac Main.java
```

4. **Execute a aplicação:**

```bash
java Main
```

<br>

<p align="center">
    <strong>📢 Sinta-se à vontade para contribuir com sugestões e melhorias!</strong><br><br>
</p>

