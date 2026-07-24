---
title: "System::operator- Methode"
linktitle: "operator-"
second_title: "Aspose.Page für C++"
description: "System::operator- Methode. Gibt eine neue Instanz der Decimal-Klasse zurück, die einen Wert darstellt, der das Ergebnis der Subtraktion des von dem angegebenen Decimal-Objekt repräsentierten Wertes vom angegebenen Wert in C++ ist."
type: docs
weight: 28100
url: /de/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


Gibt eine neue Instanz der [Decimal](../decimal/)-Klasse zurück, die einen Wert darstellt, der das Ergebnis der Subtraktion des von dem angegebenen [Decimal](../decimal/)-Objekts repräsentierten Wertes vom angegebenen Wert ist.

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| x | const T\& | Der Wert, von dem subtrahiert wird |
| d | const Decimal\& | Das [Decimal](../decimal/) Objekt, das den subtrahierten Wert darstellt. |

### ReturnValue

Eine neue Instanz der [Decimal](../decimal/) Klasse, die einen Wert darstellt, der das Ergebnis der Subtraktion des von **d** dargestellten Wertes von **x** ist.

## Siehe auch

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


Subtrahiert nicht-nullbare und nullable Werte.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
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

Substations-Ergebnis.

## Siehe auch

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


Berechnet die Anzahl der Tage zwischen zwei Wochentagen.

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | DayOfWeek | Der Minuend |
| b | DayOfWeek | Der Subtrahend |

### ReturnValue

Die Anzahl der Tage zwischen den Wochentagen **a** und **b**; der Rückgabewert ist eine negative Zahl, wenn *goes* nach ****

## Siehe auch

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Trennt alle Callbacks im rechten Delegaten vom Ende der Callback-Liste des linken Delegaten.

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | Der Delegat, aus dem Callbacks entfernt werden. |
| rhv | MulticastDelegate\<T\> | Der Delegat, dessen Callbacks entfernt werden. |

### ReturnValue

Gibt einen Delegaten zurück, der die Callbacks des linken Werts enthält, jedoch ohne die des rechten Werts.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
