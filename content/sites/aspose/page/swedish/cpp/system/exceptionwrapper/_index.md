---
title: "System::ExceptionWrapper‑klass"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Page för C++"
description: "System::ExceptionWrapper‑klass. Mall som representerar ett omslag för undantag som härstammar från Exception‑klassen i C++."
type: docs
weight: 2600
url: /sv/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


Mall som representerar en omslag för undantag som är härledda från klassen [Exception](../exception/).

```cpp
template<typename T>class ExceptionWrapper
```

## Metoder

| Metod | Beskrivning |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | Skapar en null-instans av klassen [ExceptionWrapper](./) som inte representerar något undantag. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | Skapar en instans av klassen [ExceptionWrapper](./) som innehåller den överförda pekaren. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | Kopieringskonstruktor. |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | Flyttkonstruktor. |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | Konstruktor som vidarebefordrar parametrar till klasskonstruktörerna för [Exception](../exception/) och skapar en smart pekare som håller en ny instans av klassen [Exception](../exception/). |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | Implicit typomvandlingsoperator till [SharedPtr<Object>](../sharedptr/) |
| [operator->](./operator-_/)() const | Tillåter åtkomst till medlemmarna i objektet [Exception](../exception/). |
| [operator=](./operator=/)(const ExceptionWrapper\&) | Tilldelningsoperator. |
| [operator=](./operator=/)(ExceptionWrapper\&&) | Flyttilldelningsoperator. |
| static [Type](./type/)() | Genväg för att hämta [System::TypeInfo](../typeinfo/)-objektet för typen [Exception](../exception/). |
## Typedefs

| Typedef | Beskrivning |
| --- | --- |
| [ExceptionType](./exceptiontype/) | Används för typomvandlingsfunktioner. |
## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
