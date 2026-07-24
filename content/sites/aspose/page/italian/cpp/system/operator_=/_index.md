---
title: "System::operator<= metodo"
linktitle: "operatore<="
second_title: "Aspose.Page per C++"
description: "System::operator<= metodo. Determina se il valore specificato è minore o uguale al valore rappresentato dall'oggetto Nullable specificato applicando operator<=() a questi valori in C++."
type: docs
weight: 31900
url: /it/cpp/system/operator_=/
---
## System::operator<=(const T1\&, const Nullable\<T2\>\&) method


Determina se il valore specificato è minore o uguale al valore rappresentato dall'oggetto [Nullable](../nullable/) specificato applicando [operator<=()](./) a questi valori.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator<=(const T1 &some, const Nullable<T2> &other)
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo del primo valore comparato |
| T2 | Il tipo sottostante dell'oggetto [Nullable](../nullable/) che rappresenta il secondo valore comparato |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| alcuni | const T1\& | Un riferimento costante al valore che deve essere usato come primo comparando |
| other | const Nullable\<T2\>\& | Un riferimento costante all'oggetto [Nullable](../nullable/) il cui valore rappresentato deve essere usato come secondo comparando |

### ReturnValue

Vero se il primo comparando è minore o uguale al secondo comparando, altrimenti - falso

## Vedi anche

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator<=(std::nullptr_t, const DateTimeOffset &)
```

## Vedi anche

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, const Nullable\<T\>\&) method


Restituisce sempre false.

```cpp
template<typename T> bool System::operator<=(std::nullptr_t, const Nullable<T> &)
```

## Vedi anche

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, DateTime) method




```cpp
bool System::operator<=(std::nullptr_t, DateTime)
```

## Vedi anche

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator<=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator<=(std::nullptr_t, TimeSpan)
```

## Vedi anche

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
---
title: System::operator>= metodo
linktitle: operator>=
second_title: Aspose.Page per C++
description: 'System::operator>= metodo. Determina se il valore specificato è maggiore o uguale al valore rappresentato dall'oggetto Nullable specificato applicando operator>=() a questi valori in C++.'
type: docs
weight: 34600
url: /cpp/system/operator_=/
---
## System::operator>=(const T1\&, const Nullable\<T2\>\&) method


Determina se il valore specificato è maggiore o uguale al valore rappresentato dall'oggetto [Nullable](../nullable/) specificato applicando [operator>=()](./) a questi valori.

```cpp
template<typename T1,typename T2> std::enable_if<!IsNullable<T1>::value, bool>::type System::operator>=(const T1 &some, const Nullable<T2> &other)
```


| Parametro | Descrizione |
| --- | --- |
| T1 | Il tipo del primo valore comparato |
| T2 | Il tipo sottostante dell'oggetto [Nullable](../nullable/) che rappresenta il secondo valore comparato |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| alcuni | const T1\& | Un riferimento costante al valore che deve essere usato come primo comparando |
| other | const Nullable\<T2\>\& | Un riferimento costante all'oggetto [Nullable](../nullable/) il cui valore rappresentato deve essere usato come secondo comparando |

### ReturnValue

Vero se il primo comparando è maggiore o uguale al secondo comparando, altrimenti - falso

## Vedi anche

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, const DateTimeOffset\&) method




```cpp
bool System::operator>=(std::nullptr_t, const DateTimeOffset &)
```

## Vedi anche

* Class [DateTimeOffset](../datetimeoffset/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, const Nullable\<T\>\&) method


Restituisce sempre false.

```cpp
template<typename T> bool System::operator>=(std::nullptr_t, const Nullable<T> &)
```

## Vedi anche

* Class [Nullable](../nullable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, DateTime) method




```cpp
bool System::operator>=(std::nullptr_t, DateTime)
```

## Vedi anche

* Class [DateTime](../datetime/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::operator>=(std::nullptr_t, TimeSpan) method




```cpp
bool System::operator>=(std::nullptr_t, TimeSpan)
```

## Vedi anche

* Class [TimeSpan](../timespan/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
