# Lab 07 — Figuras Geométricas (Padrão Visitor)

Atividade de laboratório da disciplina de **Métodos Avançados de Programação (MAP)**.

## Sobre o projeto

Implementação do padrão de projeto **Visitor**, que permite adicionar novas operações sobre uma família de objetos sem alterar as classes desses objetos.

- **Elementos**: `Circulo`, `Retangulo`, `Triangulo` e `Trapezio` implementam `ElementoConcretoIF` e aceitam visitantes via `aceitaVisita(VisitorIF)`.
- **Visitantes** (`VisitorIF`): cada um encapsula uma operação diferente:

| Visitor | Operação |
|---|---|
| `VisitorDesenhar` | Desenha a figura |
| `VisitorCalcularArea` | Calcula a área |
| `VisitorCalcularPerimetro` | Calcula o perímetro |
| `VisitorMaximizar` | Dobra as dimensões da figura |

A classe `Main` percorre todas as figuras aplicando os quatro visitantes.

## Tecnologias

- Java
- Maven
- JUnit 5 (testes unitários)

## Como executar

```bash
mvn compile exec:java -Dexec.mainClass="Main"
```

Ou abra o projeto em uma IDE (IntelliJ, Eclipse) e execute a classe `Main`.

## Testes

```bash
mvn test
```

Os testes cobrem as figuras e os visitantes de cálculo de área e perímetro.
