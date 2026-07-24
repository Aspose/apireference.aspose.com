---
title: "System::Nullable::operator+ methode"
linktitle: "operator+"
second_title: "Aspose.Page voor C++"
description: "System::Nullable::operator+ methode. Somt nullable‑waarden op in C++."
type: docs
weight: 1200
url: /nl/cpp/system/nullable/operator+/
---
## Nullable::operator+(const Nullable\<T1\>\&) const method


Somt nullable waarden op.

```cpp
template<typename T1> System::Nullable<decltype(get_Value()+other.get_Value())> System::Nullable<T>::operator+(const Nullable<T1> &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Type van de rechter operand. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anders | const Nullable\<T1\>\& | waarde om toe te voegen. |

### ReturnValue

Somresultaat.

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+(const T1\&) const method


Somt nullable en niet-nullable waarden op.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value()+other)> System::Nullable<T>::operator+(const T1 &other) const
```


| Parameter | Beschrijving |
| --- | --- |
| T1 | Type van de rechter operand. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| anders | const T1\& | waarde om toe te voegen. |

### ReturnValue

Somresultaat.

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+(std::nullptr_t) const method


Retourneert een standaard geconstrueerde instantie van de Nullable<T>-klasse.

```cpp
Nullable<T> System::Nullable<T>::operator+(std::nullptr_t) const
```

## Zie ook

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
