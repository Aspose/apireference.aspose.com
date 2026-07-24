---
title: "System::ObjectExt::CoalesceInternal-Methode"
linktitle: "CoalesceInternal"
second_title: "Aspose.Page für C++"
description: "System::ObjectExt::CoalesceInternal-Methode. Implementierung der Übersetzung des ''??''-Operators für nicht-nullbare Typen. Überladung für den Fall, dass RT2 in C++ in RT1 konvertierbar ist."
type: docs
weight: 600
url: /de/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


Implementierung der Übersetzung des '??'-Operators für nicht‑nullable Typen. Überladung für den Fall, dass RT2 in RT1 konvertierbar ist.

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| Parameter | Beschreibung |
| --- | --- |
| T0 | Typ des linken Operanden. |
| T1 | Typ der Lambda‑Ausdrucks, der den rechten Operanden kapselt. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | RT1 | LHS-Wert. |
| func | F | RHS-Ausdruck. |

### ReturnValue

Wenn der LHS-Wert nicht null ist, wird LHS zurückgegeben, andernfalls wird der RHS-Ausdruck berechnet und das Ergebnis zurückgegeben.

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
