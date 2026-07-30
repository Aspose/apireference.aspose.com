---
title: "System::operator+ Methode"
linktitle: "operator+"
second_title: "Aspose.Font für C++"
description: "System::operator+ Methode. Zeichenkettenverkettung in C++."
type: docs
weight: 27600
url: /de/cpp/system/operator+/
---
## System::operator+(const char_t, const String\&) method


[String](../string/) concatenation.

```cpp
String System::operator+(const char_t left, const String &right)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| links | const char_t | Zeichen zum Verketten mit der Zeichenkette. |
| right | const String\& | [String](../string/) zum Verketten. |

### ReturnValue

Verkettete Zeichenkette.

## Siehe auch

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(const T\&, const Decimal\&) method


Gibt eine neue Instanz der Klasse [Decimal](../decimal/) zurück, die einen Wert darstellt, der die Summe des angegebenen Wertes und des von dem angegebenen [Decimal](../decimal/) Objekt dargestellten Wertes ist.

```cpp
template<typename T,typename _> Decimal System::operator+(const T &x, const Decimal &d)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | const T\& | Der erste Summand |
| d | const Decimal\& | Die konstante Referenz auf das [Decimal](../decimal/) Objekt, das den zweiten Summanden darstellt. |

### ReturnValue

Eine neue Instanz der Klasse [Decimal](../decimal/) die einen Wert darstellt, der die Summe von **x** und dem von **d** dargestellten Wert ist.

## Siehe auch

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(const T1\&, const Nullable\<T2\>\&) method


Summiert nicht-nullbare und nullable Werte.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some+other.get_Value())> System::operator+(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Beschreibung |
| --- | --- |
| T1 | Typ des linken Operanden. |
| T2 | Typ des rechten Operanden. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| einige | const T1\& | Linker Operand. |
| andere | const Nullable\<T2\>\& | Rechter Operand. |

### ReturnValue

Summierungsergebnis.

## Siehe auch

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Verbindet alle Rückrufe vom rechten Delegaten bis zum Ende der Rückrufliste des linken Delegaten.

```cpp
template<typename T> MulticastDelegate<T> System::operator+(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | Der Delegat, zu dem Rückrufe hinzugefügt werden. |
| rhv | MulticastDelegate\<T\> | Der Delegat, dessen Rückrufe hinzugefügt werden. |

### ReturnValue

Gibt einen Delegaten zurück, der die Rückrufe des linken Werts enthält und anschließend die des rechten.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringLiteral<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parameter | Beschreibung |
| --- | --- |
| T | [String](../string/) Literaltyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| links | T\& | Literal zum Verketten mit einem String. |
| right | const String\& | [String](../string/) zum Verketten. |

### ReturnValue

Verkettete Zeichenkette.

## Siehe auch

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringPointer<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parameter | Beschreibung |
| --- | --- |
| T | [String](../string/) Zeigertyp. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| left | T\& | [String](../string/) Zeiger zum Verketten mit einem String. |
| right | const String\& | [String](../string/) zum Verketten. |

### ReturnValue

Verkettete Zeichenkette.

## Siehe auch

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
