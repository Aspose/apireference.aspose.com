---
title: "System::operator- methode"
linktitle: "operator-"
second_title: "Aspose.Page voor C++"
description: "System::operator- methode. Retourneert een nieuw exemplaar van de Decimal‑klasse dat een waarde vertegenwoordigt die het resultaat is van de aftrekking van de waarde die wordt weergegeven door het opgegeven Decimal‑object van de opgegeven waarde in C++."
type: docs
weight: 28100
url: /nl/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


Retourneert een nieuw exemplaar van de [Decimal](../decimal/)‑klasse dat een waarde vertegenwoordigt die het resultaat is van de aftrekking van de waarde die wordt weergegeven door het opgegeven [Decimal](../decimal/)‑object van de opgegeven waarde.

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| x | const T\& | De waarde waarvandaan afgetrokken wordt |
| d | const Decimal\& | Het [Decimal](../decimal/)‑object dat de afgetrokken waarde vertegenwoordigt |

### ReturnValue

Een nieuw exemplaar van de [Decimal](../decimal/)‑klasse dat een waarde vertegenwoordigt die het resultaat is van de aftrekking van de waarde die wordt weergegeven door **d** van **x**.

## Zie ook

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


Trek niet‑nullbare en nullable waarden af.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
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

Resultaat van aftrekking.

## Zie ook

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


Berekent het aantal dagen tussen twee weekdagen.

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| een | DayOfWeek | De minuend |
| b | DayOfWeek | De subtrahend |

### ReturnValue

Het aantal dagen tussen weekdagen **a** en **b**; de retourwaarde is een negatief getal als *gaat* na ****

## Zie ook

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Ontkoppelt alle callbacks in de rechter delegate vanaf het einde van de callback‑lijst van de linker delegate.

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | De delegate waarvan de callbacks worden verwijderd. |
| rhv | MulticastDelegate\<T\> | De delegate waarvan de callbacks worden verwijderd. |

### ReturnValue

Retourneert een delegate die de callbacks van de linkerwaarde bevat, maar zonder die van de rechterwaarde.

## Zie ook

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
