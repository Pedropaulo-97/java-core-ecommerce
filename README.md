# Java Core E-commerce — Projeto de Estudos

Projeto prático desenvolvido como parte de uma mentoria estruturada de **Java Core**, com foco em fundamentos sólidos de Orientação a Objetos, sem uso de frameworks.

> 🎯 **Objetivo:** consolidar os pilares de Java Core através da construção incremental de um sistema de e-commerce, simulando decisões reais de design que um desenvolvedor enfrenta no mercado de trabalho.

## Status do projeto

🚧 **Em construção** — este é um projeto de estudo em evolução contínua, construído fase a fase conforme novos conceitos são aprendidos e aplicados.

## Conceitos aplicados até agora

### Fase 0 — Fundamentos
- JDK, JRE e JVM

### Fase 1 — Orientação a Objetos (concluída)
- Classe e Objeto
- Encapsulamento (atributos `private`, getters/setters com validação de regras de negócio)
- Construtores e sobrecarga de construtores
- Herança (`Tenis` e `Roupa` como subclasses de `Produto`)
- Polimorfismo (método `descricao()` sobrescrito em cada subtipo)
- Abstração (`Produto` como classe abstrata, impedindo instanciação genérica)
- Interfaces (`Avaliavel`, capacidade compartilhada entre tipos distintos)

### Próximas fases
- Coleções (List, Set, Map)
- Tratamento de exceções
- Generics e Streams
- Arquitetura em camadas
- Persistência (arquivos e JDBC)
- Boas práticas e Clean Code

## Estrutura atual

```
com.projeto.ecommerce
├── Produto.java      // classe abstrata base
├── Tenis.java         // extends Produto, implements Avaliavel
├── Roupa.java         // extends Produto, implements Avaliavel
├── Avaliavel.java      // interface
└── Main.java          // ponto de entrada / demonstração
```

## Tecnologias

- Java (sem frameworks)
- IntelliJ IDEA

---

*Projeto em construção — novas funcionalidades e refatorações são adicionadas conforme o aprendizado avança.*
