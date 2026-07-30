---
title: "System::Is-Methode"
linktitle: "Ist"
second_title: "Aspose.Font für C++"
description: "System::Is-Methode. Top-Level-Matching-Funktion. Wendet ein Muster auf einen Wert in C++ an."
type: docs
weight: 22000
url: /de/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


Top-Level-Matching-Funktion. Wendet ein Muster auf einen Wert an.

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| Parameter | Beschreibung |
| --- | --- |
| A | Muster-Typ (muss von Details::Pattern erben). |
| E | Typ des zu matchenden Werts. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| e | const E\& | Wert, gegen den gematcht wird. |
| a | const A\& | Anzuwendendes Muster. |

### ReturnValue

Wahr, wenn das Muster den Wert trifft.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


Implementiert die 'is'-Konstantmuster-Übersetzung.

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| Parameter | Beschreibung |
| --- | --- |
| ExpressionT | Typ des linken Ausdrucks. |
| ConstantT | Typ des Konstantenausdrucks. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| links | const ExpressionT\& | Ausdruck, der geprüft wird. |
| Konstante | const ConstantT\& | Ausdruck, der mit dem linken verglichen wird. |

### ReturnValue

true, wenn die Typprüfung erfolgreich ist, sonst false.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


Implementiert die Übersetzung des 'is'-Deklarationsmusters.

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| Parameter | Beschreibung |
| --- | --- |
| PatternT | Typ zum Überprüfen. |
| ExpressionT | Typ des linken Ausdrucks. |
| ResultT | Typ des Ergebnisausdrucks. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| links | const ExpressionT\& | Ausdruck, der geprüft wird. |
| result | ResultT\& | Variable, die dem geprüften Typ zugewiesen wird. |

### ReturnValue

true, wenn die Typprüfung erfolgreich ist, sonst false.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
