---
title: "System::operator+ metodo"
linktitle: "operator+"
second_title: "Aspose.Font per C++"
description: "System::operator+ metodo. Concatenazione di stringhe in C++."
type: docs
weight: 27600
url: /it/cpp/system/operator+/
---
## System::operator+(const char_t, const String\&) method


[String](../string/) concatenation.

```cpp
String System::operator+(const char_t left, const String &right)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| sinistra | const char_t | Carattere da concatenare alla stringa. |
| right | const String\& | [String](../string/) da concatenare. |

### ReturnValue

Stringa concatenata.

## Vedi anche

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(const T\&, const Decimal\&) method


Restituisce una nuova istanza della classe [Decimal](../decimal/) che rappresenta un valore che è la somma del valore specificato e del valore rappresentato dall'oggetto [Decimal](../decimal/) specificato.

```cpp
template<typename T,typename _> Decimal System::operator+(const T &x, const Decimal &d)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | const T\& | Il primo addendo |
| d | const Decimal\& | Il riferimento costante all'oggetto [Decimal](../decimal/) che rappresenta il secondo addendo |

### ReturnValue

Una nuova istanza della classe [Decimal](../decimal/) che rappresenta un valore che è la somma di **x** e del valore rappresentato da **d**.

## Vedi anche

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(const T1\&, const Nullable\<T2\>\&) method


Somma valori non nullabili e nullabili.

```cpp
template<typename T1,typename T2,typename> System::Nullable<decltype(some+other.get_Value())> System::operator+(const T1 &some, const Nullable<T2> &other)
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

Risultato della somma.

## Vedi anche

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(MulticastDelegate\<T\>, MulticastDelegate\<T\>) method


Collega tutti i callback dal delegato destro alla fine dell'elenco dei callback del delegato sinistro.

```cpp
template<typename T> MulticastDelegate<T> System::operator+(MulticastDelegate<T> lhv, MulticastDelegate<T> rhv)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| lhv | MulticastDelegate\<T\> | Il delegato a cui vengono aggiunti i callback. |
| rhv | MulticastDelegate\<T\> | Il delegato i cui callback vengono aggiunti. |

### ReturnValue

Restituisce un delegato che contiene i callback del valore sinistro e poi quelli del valore destro.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringLiteral<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parametro | Descrizione |
| --- | --- |
| T | [String](../string/) tipo letterale. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| sinistra | T\& | Letterale da concatenare alla stringa. |
| right | const String\& | [String](../string/) da concatenare. |

### ReturnValue

Stringa concatenata.

## Vedi anche

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator+(T\&, const String\&) method


[String](../string/) concatenation.

```cpp
template<typename T> std::enable_if<IsStringPointer<T, char_t>::value, String>::type System::operator+(T &left, const String &right)
```


| Parametro | Descrizione |
| --- | --- |
| T | Tipo di puntatore [String](../string/). |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| left | T\& | [String](../string/) puntatore da concatenare alla stringa. |
| right | const String\& | [String](../string/) da concatenare. |

### ReturnValue

Stringa concatenata.

## Vedi anche

* Class [String](../string/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
