---
title: "System::operator- method"
linktitle: "operator-"
second_title: "Aspose.Font per C++"
description: "System::operator- method. Restituisce una nuova istanza della classe Decimal che rappresenta un valore risultato della sottrazione del valore rappresentato dall'oggetto Decimal specificato dal valore specificato in C++."
type: docs
weight: 28200
url: /it/cpp/system/operator-/
---
## System::operator-(const T\&, const Decimal\&) method


Restituisce una nuova istanza della classe [Decimal](../decimal/) che rappresenta un valore che è il risultato della sottrazione del valore rappresentato dall'oggetto [Decimal](../decimal/) specificato dal valore specificato.

```cpp
template<typename T,typename _> Decimal System::operator-(const T &x, const Decimal &d)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | const T\& | Il valore da cui sottrarre |
| d | const Decimal\& | L'oggetto [Decimal](../decimal/) che rappresenta il valore sottratto |

### ReturnValue

Una nuova istanza della classe [Decimal](../decimal/) che rappresenta un valore che è il risultato della sottrazione del valore rappresentato da **d** da **x**.

## Vedi anche

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(const T1\&, const Nullable\<T2\>\&) method


Sottrae valori non nullable e nullable.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some - other.get_Value())> System::operator-(const T1 &some, const Nullable<T2> &other)
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Tipo dell'operando sinistro. |
| T2 | Tipo dell'operando destro. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| alcuni | const T1\& | Operando sinistro. |
| altro | const Nullable\<T2\>\& | Operando destro. |

### ReturnValue

Risultato della sottrazione.

## Vedi anche

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(DayOfWeek, DayOfWeek) method


Calcola il numero di giorni tra due giorni della settimana.

```cpp
auto System::operator-(DayOfWeek a, DayOfWeek b)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| a | DayOfWeek | Il minuendo |
| b | DayOfWeek | Il sottraendo |

### ReturnValue

Il numero di giorni tra i giorni feriali **a** e **b**; il valore restituito è un numero negativo se *goes* after ****

## Vedi anche

* Enum [DayOfWeek](../dayofweek/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator-(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Disconnette tutti i callback nel delegato destro dalla fine dell'elenco dei callback del delegato sinistro.

```cpp
template<typename T> MulticastDelegate<T> System::operator-(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | Il delegato da cui verranno rimossi i callback. |
| rhv | MulticastDelegate\<T\> | Il delegato i cui callback verranno rimossi. |

### ReturnValue

Restituisce un delegato che contiene i callback del valore sinistro, ma senza quelli del valore destro.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
