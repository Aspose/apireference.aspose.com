---
title: "System::ObjectExt::Equals Methode"
linktitle: "Gleich"
second_title: "Aspose.Font für C++"
description: "System::ObjectExt::Equals Methode. Ersatz für C# Object.Equals‑Aufrufe, die für jeden Typ in C++ funktionieren. Überladung für String‑Literal mit String‑Vergleich in C++."
type: docs
weight: 800
url: /de/cpp/system/objectext/equals/
---
## ObjectExt::Equals(const char_t(&), String) method


Ersatz für C# [Object.Equals](../../object/equals/) Aufrufe, die für jeden Typ in C++ funktionieren. Überladung für String‑Literal mit String‑Vergleich.

```cpp
template<size_t> static bool System::ObjectExt::Equals(const char_t(&obj)[N], String another)
```


| Parameter | Beschreibung |
| --- | --- |
| N | [String](../../string/) Literalgröße. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const char_t(&) | [String](../../string/) Literal. |
| another | String | [String](../../string/). |

### ReturnValue

Wahr, wenn die Zeichenketten übereinstimmen, sonst falsch.

## Siehe auch

* Class [String](../../string/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const double\&, const double\&) method


Emuliert den C#‑artigen Gleitkomma‑Vergleich, bei dem zwei NaNs als gleich betrachtet werden, obwohl NaN gemäß IEC 60559:1989 zu keinem Wert, einschließlich NaN, gleich ist.

```cpp
bool System::ObjectExt::Equals(const double &obj, const double &another)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const double\& | LHS Fließkommawert. |
| ein weiteres | const double\& | RHS Fließkommawert. |

### ReturnValue

Wahr, wenn **obj** und **another** beide NaN oder gleich sind, sonst falsch.

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const float\&, const float\&) method


Emuliert den C#‑artigen Gleitkomma‑Vergleich, bei dem zwei NaNs als gleich betrachtet werden, obwohl NaN gemäß IEC 60559:1989 zu keinem Wert, einschließlich NaN, gleich ist.

```cpp
bool System::ObjectExt::Equals(const float &obj, const float &another)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const float\& | LHS Fließkommawert. |
| ein weiteres | const float\& | RHS Fließkommawert. |

### ReturnValue

Wahr, wenn **obj** und **another** beide NaN oder gleich sind, sonst falsch.

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method




```cpp
template<typename T,typename T2> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


Ersatz für C# [Object.Equals](../../object/equals/) Aufrufe, die für jeden Typ in C++ funktionieren. Überladung für Smart-Pointer-Typen.

```cpp
template<typename T,typename T2> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Erster Objekttyp. |
| T2 | Zweiter Objekttyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T\& | Erstes Objekt. |
| ein weiteres | const T2\& | Zweites Objekt. |

### ReturnValue

Wahr, wenn Objekte als gleich betrachtet werden, sonst falsch.

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(const T\&, const T2\&) method


Ersatz für C# [Object.Equals](../../object/equals/) Aufrufe, die für jeden Typ in C++ funktionieren. Überladung für skalare Typen.

```cpp
template<typename T,typename T2> static std::enable_if<!IsSmartPtr<T>::value &&std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(const T &obj, const T2 &another)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Erster Objekttyp. |
| T2 | Zweiter Objekttyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | const T\& | Erstes Objekt. |
| ein weiteres | const T2\& | Zweites Objekt. |

### ReturnValue

Wahr, wenn Objekte als gleich betrachtet werden, sonst falsch.

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Equals(T, const T2\&) method


Ersatz für C# [Object.Equals](../../object/equals/) Aufrufe, die für jeden Typ in C++ funktionieren. Überladung für Strukturtypen.

```cpp
template<typename T,typename T2> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, bool>::type System::ObjectExt::Equals(T obj, const T2 &another)
```


| Parameter | Beschreibung |
| --- | --- |
| T | Erster Objekttyp. |
| T2 | Zweiter Objekttyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| obj | T | Erstes Objekt. |
| ein weiteres | const T2\& | Zweites Objekt. |

### ReturnValue

Wahr, wenn Objekte als gleich betrachtet werden, sonst falsch.

## Siehe auch

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
