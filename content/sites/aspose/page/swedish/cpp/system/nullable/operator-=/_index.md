---
title: "System::Nullable::operator-= metod"
linktitle: "operator-="
second_title: "Aspose.Page för C++"
description: "System::Nullable::operator-= metod. Tillämpar operator-=() på värdet som representeras av det aktuella objektet med värdet som representeras av det specificerade Nullable-objektet som ett högersidigt argument i C++."
type: docs
weight: 1500
url: /sv/cpp/system/nullable/operator-=/
---
## Nullable::operator-=(const Nullable\<T1\>\&) method


Tillämpar [operator-=()](./) på värdet som representeras av det aktuella objektet med värdet som representeras av det specificerade [Nullable](../) objektet som ett högersidigt argument.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator-=(const Nullable<T1> &other)
```


| Parameter | Beskrivning |
| --- | --- |
| T1 | Den underliggande typen av ett [Nullable](../) objekt vars värde som representeras används som ett högersidigt argument för [operator-=()](./) |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | En konstant referens till [Nullable](../) objekt vars värde som representeras används som ett högersidigt argument för [operator-=()](./) som tillämpas på värdet som representeras av det aktuella objektet. |

### ReturnValue

En referens till sig själv

## Se även

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-=(const T1\&) method


Tillämpar [operator-=()](./) på värdet som representeras av det aktuella objektet med det specificerade värdet som ett högersidigt argument.

```cpp
template<typename T1,typename> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator-=(const T1 &other)
```


| Parameter | Beskrivning |
| --- | --- |
| T1 | Typen av värdet som används som ett högersidigt värde för [operator-=()](./) |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| other | const T1\& | En konstant referens till värdet som används som ett högersidigt värde för [operator-=()](./) som tillämpas på värdet som representeras av det aktuella objektet. |

### ReturnValue

En referens till sig själv

## Se även

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator-=(T1) method


Returnerar en instans av [Nullable](../) klassen som representerar ett null‑värde.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-=(T1)
```

## Se även

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
