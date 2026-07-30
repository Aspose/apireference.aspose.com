---
title: "classe System::ExceptionWrapper"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Font per C++"
description: "Classe System::ExceptionWrapper. Modello che rappresenta un involucro per le eccezioni derivate dalla classe Exception in C++."
type: docs
weight: 2600
url: /it/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


Modello che rappresenta un involucro per le eccezioni derivate dalla classe [Exception](../exception/).

```cpp
template<typename T>class ExceptionWrapper
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | Crea un'istanza nulla della classe [ExceptionWrapper](./) che non rappresenta alcuna eccezione. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | Crea un'istanza della classe [ExceptionWrapper](./) che contiene il puntatore passato. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | Costruttore di copia. |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | Costruttore di spostamento. |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | Costruttore che inoltra i parametri ai costruttori della classe [Exception](../exception/) e crea uno smart pointer che contiene una nuova istanza della classe [Exception](../exception/). |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | Operatore di cast implicito a [SharedPtr<Object>](../sharedptr/) |
| [operator->](./operator-_/)() const | Consente di accedere ai membri dell'oggetto [Exception](../exception/). |
| [operator=](./operator=/)(const ExceptionWrapper\&) | Operatore di assegnazione. |
| [operator=](./operator=/)(ExceptionWrapper\&&) | Operatore di assegnazione di spostamento. |
| static [Type](./type/)() | Scorciatoia per ottenere l'oggetto [System::TypeInfo](../typeinfo/) per il tipo [Exception](../exception/). |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [ExceptionType](./exceptiontype/) | Utilizzato per funzioni di casting. |
## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
