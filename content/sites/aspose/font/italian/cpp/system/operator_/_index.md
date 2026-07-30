---
title: "metodo System::operator*"
linktitle: "operator*"
second_title: "Aspose.Font per C++"
description: "metodo System::operator*. Restituisce una nuova istanza della classe Decimal che rappresenta un valore risultato della moltiplicazione del valore specificato e del valore rappresentato dall'oggetto Decimal specificato in C++."
type: docs
weight: 27500
url: /it/cpp/system/operator_/
---
## System::operator* method


Restituisce una nuova istanza della classe [Decimal](../decimal/) che rappresenta un valore risultato della moltiplicazione del valore specificato e del valore rappresentato dall'oggetto [Decimal](../decimal/) specificato.

```cpp
template<typename T,typename _> Decimal System::operator*(const T &x, const Decimal &d)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| x | const T\& | Il primo moltiplicatore |
| d | const Decimal\& | L'oggetto [Decimal](../decimal/) che rappresenta il secondo moltiplicatore |

### ReturnValue

Una nuova istanza della classe [Decimal](../decimal/) che rappresenta un valore risultato della moltiplicazione di **x** e del valore rappresentato da **d**.

## Vedi anche

* Class [Decimal](../decimal/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
---
titolo: metodo System::operator<
titolo collegamento: operator<
second_title: Aspose.Font for C++
description: 'System::operator< method. Determina se il valore specificato è minore del valore rappresentato dall'oggetto Nullable specificato applicando operator<() a questi valori in C++.'
type: docs
peso: 28700
url: /cpp/system/operator_/
---
## System::operator<(const T1\&, const Nullable\<T2\>\&) method


Determina se il valore specificato è minore del valore rappresentato dall'oggetto [Nullable](../nullable/) specificato applicando [operator<()](./) a questi valori.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<(const T1 &some, const Nullable<T2> &other)
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo del valore del primo comparando |
| T2 | Il tipo sottostante dell'oggetto [Nullable](../nullable/) che rappresenta il valore del secondo comparando |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| alcuni | const T1\& | Un riferimento costante al valore che deve essere usato come primo comparando |
| other | const Nullable\<T2\>\& | Un riferimento costante all'oggetto [Nullable](../nullable/) il cui valore rappresentato deve essere usato come secondo comparando |

### ReturnValue

Vero se il primo comparando è minore del secondo comparando, altrimenti - falso

## Vedi anche

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<(std::nullptr_t, const DateTimeOffset &)
```

## Vedi anche

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<(std::nullptr_t, const Nullable\<T\>\&) method


Restituisce sempre false.

```cpp
template<typename T> bool System::operator<(std::nullptr_t, const Nullable<T> &)
```

## Vedi anche

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<(std::nullptr_t, DateTime) method




```cpp
bool System::operator<(std::nullptr_t, DateTime)
```

## Vedi anche

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator<(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<(std::nullptr_t, TimeSpan)
```

## Vedi anche

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
---
titolo: System::operator> method
titoloLink: operator>
second_title: Aspose.Font for C++
description: 'System::operator> method. Determina se il valore specificato è maggiore del valore rappresentato dall'oggetto Nullable specificato applicando operator>() a questi valori in C++.'
type: docs
peso: 34200
url: /cpp/system/operator_/
---
## System::operator>(const T1\&, const Nullable\<T2\>\&) method


Determina se il valore specificato è maggiore del valore rappresentato dall'oggetto [Nullable](../nullable/) specificato applicando [operator>()](./) a questi valori.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>(const T1 &some, const Nullable<T2> &other)
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo del valore del primo comparando |
| T2 | Il tipo sottostante dell'oggetto [Nullable](../nullable/) che rappresenta il valore del secondo comparando |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| alcuni | const T1\& | Un riferimento costante al valore che deve essere usato come primo comparando |
| other | const Nullable\<T2\>\& | Un riferimento costante all'oggetto [Nullable](../nullable/) il cui valore rappresentato deve essere usato come secondo comparando |

### ReturnValue

Vero se il primo comparando è maggiore del secondo comparando, altrimenti - falso

## Vedi anche

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>(std::nullptr_t, const DateTimeOffset &)
```

## Vedi anche

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>(std::nullptr_t, const Nullable\<T\>\&) method


Restituisce sempre false.

```cpp
template<typename T> bool System::operator>(std::nullptr_t, const Nullable<T> &)
```

## Vedi anche

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>(std::nullptr_t, DateTime) method




```cpp
bool System::operator>(std::nullptr_t, DateTime)
```

## Vedi anche

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::operator>(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>(std::nullptr_t, TimeSpan)
```

## Vedi anche

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
