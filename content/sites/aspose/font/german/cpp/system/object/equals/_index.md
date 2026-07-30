---
title: "System::Object::Equals method"
linktitle: "Gleich"
second_title: "Aspose.Font für C++"
description: "System::Object::Equals method. Vergleicht Objekte unter Verwendung der C# Object.Equals‑Semantik in C++."
type: docs
weight: 300
url: /de/cpp/system/object/equals/
---
## Object::Equals(ptr) method


Vergleicht Objekte unter Verwendung der C# [Object.Equals](./) Semantik.

```cpp
virtual bool System::Object::Equals(ptr obj)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | ptr | [Object](../) zum Vergleich mit dem aktuellen Objekt. |

### ReturnValue

True, wenn Objekte als gleich betrachtet werden, andernfalls false.

## Siehe auch

* Typedef [ptr](../ptr/)
* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(double const\&, double const\&) method


Emuliert den C#‑artigen Gleitkomma‑Vergleich, bei dem zwei NaNs als gleich betrachtet werden, obwohl NaN gemäß IEC 60559:1989 zu keinem Wert, einschließlich NaN, gleich ist.

```cpp
bool System::Object::Equals(double const &objA, double const &objB)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| objA | double const\& | LHS Fließkommawert. |
| objB | double const\& | RHS Fließkommawert. |

### ReturnValue

Wahr, wenn **objA** und **objB** beide NaN oder gleich sind, andernfalls falsch.

## Siehe auch

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(float const\&, float const\&) method


Emuliert den C#‑artigen Gleitkomma‑Vergleich, bei dem zwei NaNs als gleich betrachtet werden, obwohl NaN gemäß IEC 60559:1989 zu keinem Wert, einschließlich NaN, gleich ist.

```cpp
bool System::Object::Equals(float const &objA, float const &objB)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| objA | float const\& | LHS Fließkommawert. |
| objB | float const\& | RHS Fließkommawert. |

### ReturnValue

Wahr, wenn **objA** und **objB** beide NaN oder gleich sind, andernfalls falsch.

## Siehe auch

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


Vergleicht Referenztyp‑Objekte im C#‑Stil.

```cpp
template<typename T1,typename T2> static std::enable_if<IsSmartPtr<T1>::value &&IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Typ des ersten Objekts zum Vergleichen. |
| T2 | Typ des zweiten Objekts zum Vergleichen. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| objA | T1 const\& | Erstes Objekt zum Vergleichen. |
| objB | T2 const\& | Zweites Objekt zum Vergleichen. |

### ReturnValue

Wahr, wenn Objekte entweder per Referenz oder semantisch (durch einen [Object.Equals](./)-ähnlichen Vergleich) übereinstimmen, andernfalls falsch.

## Siehe auch

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Object::Equals(T1 const\&, T2 const\&) method


Vergleicht Werttyp‑Objekte im C#‑Stil.

```cpp
template<typename T1,typename T2> static std::enable_if<!IsSmartPtr<T1>::value &&!IsSmartPtr<T2>::value, bool>::type System::Object::Equals(T1 const &objA, T2 const &objB)
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Typ des ersten Objekts zum Vergleichen. |
| T2 | Typ des zweiten Objekts zum Vergleichen. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| objA | T1 const\& | Erstes Objekt zum Vergleichen. |
| objB | T2 const\& | Zweites Objekt zum Vergleichen. |

### ReturnValue

Wahr, wenn Objekte als gleich betrachtet werden durch den verfügbaren Gleichheitsoperator, andernfalls falsch.

## Siehe auch

* Class [Object](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
