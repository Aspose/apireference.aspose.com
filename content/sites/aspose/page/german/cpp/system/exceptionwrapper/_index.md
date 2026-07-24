---
title: "System::ExceptionWrapper‑Klasse"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Page für C++"
description: "System::ExceptionWrapper‑Klasse. Template, das einen Wrapper für Ausnahmen darstellt, die von der Exception‑Klasse in C++ abgeleitet sind."
type: docs
weight: 2600
url: /de/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


Vorlage, die einen Wrapper für Ausnahmen darstellt, die von der Klasse [Exception](../exception/) abgeleitet sind.

```cpp
template<typename T>class ExceptionWrapper
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | Erstellt eine Null-Instanz der Klasse [ExceptionWrapper](./), die keine Ausnahme darstellt. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | Erstellt eine Instanz der Klasse [ExceptionWrapper](./), die den übergebenen Zeiger enthält. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | Kopierkonstruktor. |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | Move-Konstruktor. |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | Konstruktor, der Parameter an die Konstruktoren der Klasse [Exception](../exception/) weiterleitet und einen Smart‑Pointer erzeugt, der eine neue Instanz der Klasse [Exception](../exception/) hält. |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | Impliziter Cast‑Operator zu [SharedPtr<Object>](../sharedptr/) |
| [operator->](./operator-_/)() const | Ermöglicht den Zugriff auf Mitglieder des Objekts [Exception](../exception/). |
| [operator=](./operator=/)(const ExceptionWrapper\&) | Zuweisungsoperator. |
| [operator=](./operator=/)(ExceptionWrapper\&&) | Move-Zuweisungsoperator. |
| static [Type](./type/)() | Abkürzung, um das Objekt [System::TypeInfo](../typeinfo/) für den Typ [Exception](../exception/) zu erhalten. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [ExceptionType](./exceptiontype/) | Wird für Casting‑Funktionen verwendet. |
## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
