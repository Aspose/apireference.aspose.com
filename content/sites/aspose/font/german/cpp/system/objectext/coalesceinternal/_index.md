---
title: "System::ObjectExt::CoalesceInternal Methode"
linktitle: "CoalesceInternal"
second_title: "Aspose.Font für C++"
description: "System::ObjectExt::CoalesceInternal Methode. Implementierung der ''??''‑Operator‑Übersetzung für nicht‑nullable Typen. Überladung für den Fall, dass RT2 in RT1 konvertierbar ist in C++."
type: docs
weight: 700
url: /de/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


Implementierung der Übersetzung des '??'-Operators für nicht-nullbare Typen. Überladung für den Fall, dass RT2 in RT1 konvertierbar ist.

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| Parameter | Beschreibung |
| --- | --- |
| T0 | LHS-Werttyp. |
| T1 | Typ der Lambda, die den RHS-Ausdruck kapselt. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | RT1 | LHS-Wert. |
| func | F | RHS‑Ausdruck. |

### ReturnValue

Wenn der LHS‑Wert nicht null ist, wird LHS zurückgegeben, andernfalls wird der RHS‑Ausdruck berechnet und das Ergebnis zurückgegeben.

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
