---
title: "System::ExceptionWrapper Klasse"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Font für C++"
description: "System::ExceptionWrapper Klasse. Vorlage, die einen Wrapper für Ausnahmen darstellt, die von der Exception-Klasse in C++ abgeleitet sind."
type: docs
weight: 2600
url: /de/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


Vorlage, die einen Wrapper für Ausnahmen darstellt, die von der [Exception](../exception/) Klasse abgeleitet sind.

```cpp
template<typename T>class ExceptionWrapper
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | Erstellt eine Null-Instanz der [ExceptionWrapper](./) Klasse, die keine Ausnahme darstellt. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | Erstellt eine Instanz der [ExceptionWrapper](./) Klasse, die den übergebenen Zeiger enthält. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | Kopierkonstruktor. |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | Move-Konstruktor. |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | Konstruktor, der Parameter an die Konstruktoren der [Exception](../exception/) Klasse weiterleitet und einen Smart-Pointer erstellt, der eine neue [Exception](../exception/) Klasseninstanz hält. |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | Impliziter Cast-Operator zu [SharedPtr<Object>](../sharedptr/) |
| [operator->](./operator-_/)() const | Ermöglicht den Zugriff auf Mitglieder des [Exception](../exception/) Objekts. |
| [operator=](./operator=/)(const ExceptionWrapper\&) | Zuweisungsoperator. |
| [operator=](./operator=/)(ExceptionWrapper\&&) | Move-Zuweisungsoperator. |
| static [Type](./type/)() | Abkürzung, um das [System::TypeInfo](../typeinfo/) Objekt für den [Exception](../exception/) Typ zu erhalten. |
## Typedefs

| Typedef. | Beschreibung |
| --- | --- |
| [ExceptionType](./exceptiontype/) | Wird für Casting-Funktionen verwendet. |
## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
