---
title: "System::operator- method"
linktitle: "operator-"
second_title: "Aspose.Page för C++"
description: "System::operator- method. Returnerar en ny instans av Decimal‑klassen som representerar ett värde som är resultatet av subtraktion av värdet som representeras av det angivna Decimal‑objektet från det angivna värdet i C++."
type: docs
weight: 28100
url: /sv/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


Returnerar en ny instans av klassen [Decimal](../decimal/) som representerar ett värde som är resultatet av subtraktion av värdet som representeras av det angivna [Decimal](../decimal/)‑objektet från det angivna värdet.

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| x | const T\& | Värdet att subtrahera från |
| d | const Decimal\& | Det [Decimal](../decimal/)‑objektet som representerar det subtraherade värdet |

### ReturnValue

En ny instans av [Decimal](../decimal/)-klassen som representerar ett värde som är resultatet av subtraktion av värdet som representeras av **d** från **x**.

## Se även

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


Subtraherar icke‑nullbara och nullbara värden.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
```


| Parameter | Beskrivning |
| --- | --- |
| T1 | Typ av vänster operand. |
| T2 | Typ av höger operand. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| några | const T1\& | Vänster operand. |
| annat | const Nullable\<T2\>\& | Höger operand. |

### ReturnValue

Resultat av subtraktion.

## Se även

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


Beräknar antalet dagar mellan två veckodagar.

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| en | DayOfWeek | Minuenden |
| b | DayOfWeek | Subtrahenden |

### ReturnValue

Antalet dagar mellan veckodagarna **a** och **b**; returvärdet är ett negativt tal om *går* efter ****

## Se även

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Kopplar bort alla återanrop i högra delegaten från slutet av vänstra delegatens återanropslista.

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | Delegaten från vilken återanrop kommer att tas bort. |
| rhv | MulticastDelegate\<T\> | Delegaten vars återanrop kommer att tas bort. |

### ReturnValue

Returnerar en delegat som innehåller återanropen från det vänstra värdet, men utan de från det högra värdet.

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
