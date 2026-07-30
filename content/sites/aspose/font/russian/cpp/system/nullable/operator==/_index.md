---
title: "System::Nullable::operator== метод"
linktitle: "operator=="
second_title: "Aspose.Font для C++"
description: "System::Nullable::operator== метод. Определяет, равно ли значение, представленное текущим объектом, значению, представленному указанным объектом Nullable, в C++."
type: docs
weight: 1900
url: /ru/cpp/system/nullable/operator==/
---
## Nullable::operator==(const Nullable\<T1\>\&) const method


Определяет, равно ли значение, представленное текущим объектом, значению, представленному указанным объектом [Nullable](../).

```cpp
template<typename T1> bool System::Nullable<T>::operator==(const Nullable<T1> &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Базовый тип объекта [Nullable](../) для сравнения |

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Константная ссылка на объект [Nullable](../) для сравнения |

### ReturnValue

True, если значение, представленное текущим объектом, равно значению, представленному указанным объектом [Nullable](../), иначе — false

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator==(const T1\&) const method


Определяет, равно ли значение, представленное текущим объектом, указанному значению.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator==(const T1 &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Тип значения для сравнения |

| Параметр | Тип | Описание |
| --- | --- | --- |
| другой | const T1\& | Константная ссылка на значение для сравнения |

### ReturnValue

True, если значение, представленное текущим объектом, равно указанному значению, иначе — false

## См. также

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator==(std::nullptr_t) const method


Определяет, является ли значение, представленное текущим объектом, null.

```cpp
bool System::Nullable<T>::operator==(std::nullptr_t) const
```


### ReturnValue

True, если значение, представленное текущим объектом, равно null, иначе — false

## См. также

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
