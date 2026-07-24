---
title: "System::operator+ methode"
linktitle: "operator+"
second_title: "Aspose.Page voor C++"
description: "System::operator+ methode. Stringconcatenatie in C++."
type: docs
weight: 27500
url: /nl/cpp/system/operator+/
---
## System::operator+(const char_t, const String\&) method


[String](../string/) concatenation.

```cpp
String System::operator+(const char_t left, const String &right)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| links | const char_t | Karakter om aan de string te concatenaten. |
| right | const String\& | [String](../string/) om te concatenaten. |

### ReturnValue

Samengevoegde string.

## Zie ook

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T\&, const Decimal\&) method


Retourneert een nieuw exemplaar van de klasse [Decimal](../decimal/) dat een waarde vertegenwoordigt die de som is van de opgegeven waarde en de waarde die wordt vertegenwoordigd door het opgegeven [Decimal](../decimal/) object.

```cpp
template<typename T,typename _> Decimal System::operator+(const T &x, const Decimal &d)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | const T\& | De eerste term |
| d | const Decimal\& | De constante referentie naar het [Decimal](../decimal/) object dat de tweede term vertegenwoordigt. |

### ReturnValue

Een nieuw exemplaar van de klasse [Decimal](../decimal/) dat een waarde vertegenwoordigt die de som is van **x** en de waarde die wordt vertegenwoordigd door de **d**.

## Zie ook

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(const T1\&, const Nullable\<T2\>\&) method


Somt niet‑nullbare en nullable waarden op.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some+other.get_Value())> System::operator+(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Type van de linker operand. |
| T2 | Type van de rechter operand. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| enkele | const T1\& | Linker operand. |
| anders | const Nullable\<T2\>\& | Rechter operand. |

### ReturnValue

Somresultaat.

## Zie ook

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Verbindt alle callbacks van de rechter delegate met het einde van de callback‑lijst van de linker delegate.

```cpp
template<typename T> MulticastDelegate<T> System::operator+(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | De delegate waaraan callbacks worden toegevoegd. |
| rhv | MulticastDelegate\<T\> | De delegate waarvan de callbacks worden toegevoegd. |

### ReturnValue

Retourneert een delegate die de callbacks van de linkerwaarde bevat en daarna die van de rechter.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringLiteral<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parameter | Beschrijving |
| --- | --- |
| T | [String](../string/) lettertype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| links | T\& | Letterlijke waarde om aan de string te concatenaten. |
| right | const String\& | [String](../string/) om te concatenaten. |

### ReturnValue

Samengevoegde string.

## Zie ook

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringPointer<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parameter | Beschrijving |
| --- | --- |
| T | [String](../string/) pointertype. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| left | T\& | [String](../string/) pointer om aan de string te concatenaten. |
| right | const String\& | [String](../string/) om te concatenaten. |

### ReturnValue

Samengevoegde string.

## Zie ook

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
