---
title: "System::Nullable::operator+ method"
linktitle: "operator+"
second_title: "Aspose.Font для C++"
description: "System::Nullable::operator+ method. Суммирует nullable‑значения в C++."
type: docs
weight: 1200
url: /ru/cpp/system/nullable/operator+/
---
## Nullable::operator+(const Nullable\<T1\>\&) const method


Складывает nullable значения.

```cpp
template<typename T1> System::Nullable<decltype(get_Value()+other.get_Value())> System::Nullable<T>::operator+(const Nullable<T1> &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Тип правого операнда. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| другой | const Nullable\<T1\>\& | значение для добавления. |

### ReturnValue

Результат суммирования.

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+(const T1\&) const method


Складывает nullable и non-nullable значения.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value()+other)> System::Nullable<T>::operator+(const T1 &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Тип правого операнда. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| другой | const T1\& | значение для добавления. |

### ReturnValue

Результат суммирования.

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+(std::nullptr_t) const method


Возвращает экземпляр класса Nullable<T>, созданный по умолчанию.

```cpp
Nullable<T> System::Nullable<T>::operator+(std::nullptr_t) const
```

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
