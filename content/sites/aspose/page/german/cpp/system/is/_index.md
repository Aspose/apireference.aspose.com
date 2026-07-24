---
title: "System::Is-Methode"
linktitle: "Ist"
second_title: "Aspose.Page für C++"
description: "System::Is-Methode. Top-level Abgleichsfunktion. Wendet ein Muster auf einen Wert in C++ an."
type: docs
weight: 21900
url: /de/cpp/system/is/
---
## System::Is(const E\&, const A\&) method


Top-level Abgleichsfunktion. Wendet ein Muster auf einen Wert an.

```cpp
template<typename A,typename E> std::enable_if_t<std::is_base_of<Details::Pattern, A>::value, bool> System::Is(const E &e, const A &a)
```


| Parameter | Beschreibung |
| --- | --- |
| A | Muster-Typ (muss von Details::Pattern erben). |
| E | Typ des zu prüfenden Wertes. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| e | const E\& | Wert, gegen den geprüft wird. |
| a | const A\& | Anzuwendendes Muster. |

### ReturnValue

Wahr, wenn das Muster auf den Wert zutrifft.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, const ConstantT\&) method


Implementiert die Übersetzung des konstanten 'is'-Musters.

```cpp
template<class ExpressionT,class ConstantT> std::enable_if_t<!std::is_base_of<Details::Pattern, ConstantT>::value, bool> System::Is(const ExpressionT &left, const ConstantT &constant)
```


| Parameter | Beschreibung |
| --- | --- |
| ExpressionT | Linker Ausdruckstyp. |
| ConstantT | Typ des konstanten Ausdrucks. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| links | const ExpressionT\& | Ausdruck, der geprüft wird. |
| Konstante | const ConstantT\& | Ausdruck, der mit dem linken verglichen wird. |

### ReturnValue

wahr, wenn die Typprüfung erfolgreich ist, sonst falsch.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::Is(const ExpressionT\&, ResultT\&) method


Implementiert die Übersetzung des 'is'-Deklarationsmusters.

```cpp
template<class PatternT,class ExpressionT,class ResultT> bool System::Is(const ExpressionT &left, ResultT &result)
```


| Parameter | Beschreibung |
| --- | --- |
| PatternT | Typ zu prüfen. |
| ExpressionT | Linker Ausdruckstyp. |
| ResultT | Typ des Ergebnisausdrucks. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| links | const ExpressionT\& | Ausdruck, der geprüft wird. |
| result | ResultT\& | Variable, die dem geprüften Typ zugewiesen wird. |

### ReturnValue

wahr, wenn die Typprüfung erfolgreich ist, sonst falsch.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
