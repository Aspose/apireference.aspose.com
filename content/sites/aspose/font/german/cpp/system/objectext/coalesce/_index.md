---
title: "System::ObjectExt::Coalesce Methode"
linktitle: "Coalesce"
second_title: "Aspose.Font für C++"
description: "System::ObjectExt::Coalesce Methode. Implementierung der ''??''‑Operator‑Übersetzung für nullable Typen in C++."
type: docs
weight: 500
url: /de/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


Implementierung der Übersetzung des '??'-Operators für nullable Typen.

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| Parameter | Beschreibung |
| --- | --- |
| T0 | LHS-Werttyp. |
| T1 | Typ der Lambda, die den RHS-Ausdruck kapselt. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | System::Nullable\<T0\> | LHS-Wert. |
| func | T1 | RHS‑Ausdruck. |

### ReturnValue

Wenn der LHS‑Wert nicht null ist, wird LHS zurückgegeben, andernfalls wird der RHS‑Ausdruck berechnet und das Ergebnis zurückgegeben.

## Siehe auch

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


Implementierung der Übersetzung des '??'-Operators für nicht-nullbare Typen.

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| Parameter | Beschreibung |
| --- | --- |
| T0 | LHS-Werttyp. |
| T1 | Typ der Lambda, die den RHS-Ausdruck kapselt. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | T0 | LHS-Wert. |
| func | T1 | RHS‑Ausdruck. |

### ReturnValue

Wenn der LHS‑Wert nicht null ist, wird LHS zurückgegeben, andernfalls wird der RHS‑Ausdruck berechnet und das Ergebnis zurückgegeben.

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
