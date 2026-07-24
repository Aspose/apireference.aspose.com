---
title: "System::ExceptionWrapper klasse"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Page voor C++"
description: "System::ExceptionWrapper klasse. Sjabloon dat een wrapper van uitzonderingen vertegenwoordigt die afgeleid zijn van de Exception‑klasse in C++."
type: docs
weight: 2600
url: /nl/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


Sjabloon dat een wrapper van uitzonderingen vertegenwoordigt die afgeleid zijn van de [Exception](../exception/) klasse.

```cpp
template<typename T>class ExceptionWrapper
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | Construeert een null‑instantie van de [ExceptionWrapper](./) klasse die geen enkele uitzondering vertegenwoordigt. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | Construeert een instantie van de [ExceptionWrapper](./) klasse die de doorgegeven pointer bevat. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | Copy-constructor. |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | Move-constructor. |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | Constructor die parameters doorstuurt naar de constructors van de [Exception](../exception/) klasse en een smart pointer maakt die een nieuwe [Exception](../exception/) klasse‑instantie bevat. |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | Impliciete cast‑operator naar [SharedPtr<Object>](../sharedptr/) |
| [operator->](./operator-_/)() const | Staat toe om leden van het [Exception](../exception/) object te benaderen. |
| [operator=](./operator=/)(const ExceptionWrapper\&) | Toewijzingsoperator. |
| [operator=](./operator=/)(ExceptionWrapper\&&) | Verplaatsings-toewijzingsoperator. |
| static [Type](./type/)() | Snelkoppeling om het [System::TypeInfo](../typeinfo/) object voor het [Exception](../exception/) type te verkrijgen. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [ExceptionType](./exceptiontype/) | Gebruikt voor cast‑functies. |
## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
