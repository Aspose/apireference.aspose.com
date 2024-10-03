---
title: System::Nullable::operator+ method
linktitle: operator+
second_title: Aspose.Page for C++
description: 'System::Nullable::operator+ method. Returns a default constructed instance of Nullable<T> class in C++.'
type: docs
weight: 1600
url: /cpp/system/nullable/operator+/
---
## Nullable::operator+(std::nullptr_t) const method


Returns a default constructed instance of Nullable<T> class.

```cpp
Nullable<T> System::Nullable<T>::operator+(std::nullptr_t) const
```

## See Also

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+(const T1\&) const method


Sums nullable and non-nullable values.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value()+other)> System::Nullable<T>::operator+(const T1 &other) const
```


| Parameter | Description |
| --- | --- |
| T1 | Right operand type. |

| Parameter | Type | Description |
| --- | --- | --- |
| other | const T1\& | value to add. |

### ReturnValue

Summing result.

## See Also

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Nullable::operator+(const Nullable\<T1\>\&) const method


Sums nullable values.

```cpp
template<typename T1> System::Nullable<decltype(get_Value()+other.get_Value())> System::Nullable<T>::operator+(const Nullable<T1> &other) const
```


| Parameter | Description |
| --- | --- |
| T1 | Right operand type. |

| Parameter | Type | Description |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | value to add. |

### ReturnValue

Summing result.

## See Also

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
