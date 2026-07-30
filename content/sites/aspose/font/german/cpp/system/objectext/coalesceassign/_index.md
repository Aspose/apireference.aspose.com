---
title: "System::ObjectExt::CoalesceAssign-Methode"
linktitle: "CoalesceAssign"
second_title: "Aspose.Font für C++"
description: "System::ObjectExt::CoalesceAssign-Methode. Implementierung der Übersetzung des ''??='' Operators in C++."
type: docs
weight: 600
url: /de/cpp/system/objectext/coalesceassign/
---
## ObjectExt::CoalesceAssign method


Implementierung der Übersetzung des '??='-Operators.

```cpp
template<typename T0,typename T1> static T0 & System::ObjectExt::CoalesceAssign(T0 &value, T1 func)
```


| Parameter | Beschreibung |
| --- | --- |
| T0 | LHS-Werttyp. |
| T1 | Typ der Lambda, die den RHS-Ausdruck kapselt. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | T0\& | LHS-Wert. |
| func | T1 | RHS‑Ausdruck. |

### ReturnValue

Wenn der LHS‑Wert nicht null ist, wird LHS zurückgegeben, andernfalls wird der RHS‑Ausdruck berechnet und das Ergebnis zurückgegeben.

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
