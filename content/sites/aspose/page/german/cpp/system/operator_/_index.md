---
title: "System::operator*‑Methode"
linktitle: "operator*"
second_title: "Aspose.Page für C++"
description: "System::operator*‑Methode. Gibt eine neue Instanz der Decimal‑Klasse zurück, die einen Wert darstellt, der das Ergebnis der Multiplikation des angegebenen Werts und des durch das angegebene Decimal‑Objekt dargestellten Werts in C++ ist."
type: docs
weight: 27400
url: /de/cpp/system/operator_/
---
## System::operator* method


Gibt eine neue Instanz der [Decimal](../decimal/)‑Klasse zurück, die einen Wert darstellt, der das Ergebnis der Multiplikation des angegebenen Werts und des durch das angegebene [Decimal](../decimal/)‑Objekt dargestellten Werts ist.

```cpp
template<typename T,typename _> Decimal System::operator*(const T &x, const Decimal &d)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | const T\& | Der erste Multiplikator |
| d | const Decimal\& | Das [Decimal](../decimal/)‑Objekt, das den zweiten Multiplikator darstellt |

### ReturnValue

Eine neue Instanz der [Decimal](../decimal/)‑Klasse, die einen Wert darstellt, der das Ergebnis der Multiplikation von **x** und dem durch **d** dargestellten Wert ist.

## Siehe auch

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
Titel: System::operator<‑Methode
Linktitel: operator<
second_title: Aspose.Page für C++
description: 'System::operator< Methode. Bestimmt, ob der angegebene Wert kleiner ist als der von dem angegebenen Nullable-Objekt dargestellte Wert, indem operator<() auf diese Werte in C++ angewendet wird.'
type: docs
Gewicht: 28600
URL: /cpp/system/operator_/
---
## System::operator<(const T1\&, const Nullable\<T2\>\&) method


Bestimmt, ob der angegebene Wert kleiner ist als der von dem angegebenen [Nullable](../nullable/) Objekt, indem [operator<()](./) auf diese Werte angewendet wird.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der Typ des ersten Vergleichswerts |
| T2 | Der zugrunde liegende Typ des [Nullable](../nullable/) Objekts, das den zweiten Vergleichswert darstellt |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| einige | const T1\& | Eine konstante Referenz auf den Wert, der als erster Vergleichswert verwendet werden soll |
| other | const Nullable\<T2\>\& | Eine konstante Referenz auf das [Nullable](../nullable/) Objekt, dessen dargestellter Wert als zweiter Vergleichswert verwendet werden soll |

### ReturnValue

True, wenn der erste Vergleichswert kleiner ist als der zweite Vergleichswert, sonst - false

## Siehe auch

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<(std::nullptr_t, const DateTimeOffset &)
```

## Siehe auch

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, const Nullable\<T\>\&) method


Gibt immer false zurück.

```cpp
template<typename T> bool System::operator<(std::nullptr_t, const Nullable<T> &)
```

## Siehe auch

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, DateTime) method




```cpp
bool System::operator<(std::nullptr_t, DateTime)
```

## Siehe auch

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<(std::nullptr_t, TimeSpan)
```

## Siehe auch

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
Titel: System::operator> Methode
linktitle: operator>
second_title: Aspose.Page für C++
description: 'System::operator> Methode. Bestimmt, ob der angegebene Wert größer ist als der von dem angegebenen Nullable-Objekt dargestellte Wert, indem operator>() auf diese Werte in C++ angewendet wird.'
type: docs
Gewicht: 34100
URL: /cpp/system/operator_/
---
## System::operator>(const T1\&, const Nullable\<T2\>\&) method


Bestimmt, ob der angegebene Wert größer ist als der von dem angegebenen [Nullable](../nullable/) Objekt, indem [operator>()](./) auf diese Werte angewendet wird.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Der Typ des ersten Vergleichswerts |
| T2 | Der zugrunde liegende Typ des [Nullable](../nullable/) Objekts, das den zweiten Vergleichswert darstellt |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| einige | const T1\& | Eine konstante Referenz auf den Wert, der als erster Vergleichswert verwendet werden soll |
| other | const Nullable\<T2\>\& | Eine konstante Referenz auf das [Nullable](../nullable/) Objekt, dessen dargestellter Wert als zweiter Vergleichswert verwendet werden soll |

### ReturnValue

True, wenn der erste Vergleichswert größer ist als der zweite Vergleichswert, sonst - false

## Siehe auch

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>(std::nullptr_t, const DateTimeOffset &)
```

## Siehe auch

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, const Nullable\<T\>\&) method


Gibt immer false zurück.

```cpp
template<typename T> bool System::operator>(std::nullptr_t, const Nullable<T> &)
```

## Siehe auch

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, DateTime) method




```cpp
bool System::operator>(std::nullptr_t, DateTime)
```

## Siehe auch

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>(std::nullptr_t, TimeSpan)
```

## Siehe auch

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
