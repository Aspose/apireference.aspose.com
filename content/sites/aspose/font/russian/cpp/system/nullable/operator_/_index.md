---
title: "System::Nullable::operator< method"
linktitle: "operator<"
second_title: "Aspose.Font для C++"
description: "System::Nullable::operator< method. Определяет, меньше ли значение, представленное текущим объектом, чем значение, представленное указанным объектом Nullable, путем применения operator<() к этим значениям в C++."
type: docs
weight: 1600
url: /ru/cpp/system/nullable/operator_/
---
## Nullable::operator<(const Nullable\<T1\>\&) const method


Определяет, меньше ли значение, представленное текущим объектом, чем значение, представленное указанным объектом [Nullable](../), путем применения [operator<()](./) к этим значениям.

```cpp
template<typename T1> bool System::Nullable<T>::operator<(const Nullable<T1> &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Базовый тип объекта [Nullable](../) для сравнения |

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Константная ссылка на объект [Nullable](../) для сравнения |

### ReturnValue

True, если значение, представленное текущим объектом, меньше значения, представленное указанным объектом [Nullable](../), иначе - false

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<(const T1\&) const method


Определяет, меньше ли значение, представленное текущим объектом, чем указанное значение, путем применения [operator<()](./) к этим значениям.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator<(const T1 &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Тип значения для сравнения |

| Параметр | Тип | Описание |
| --- | --- | --- |
| другой | const T1\& | Константная ссылка на значение для сравнения |

### ReturnValue

True, если значение, представленное текущим объектом, меньше указанного значения, иначе - false

## См. также

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator<(std::nullptr_t) const method


Всегда возвращает false.

```cpp
bool System::Nullable<T>::operator<(std::nullptr_t) const
```

## См. также

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
---
title: System::Nullable::operator> метод
linktitle: operator>
второй_заголовок: Aspose.Font для C++
description: 'System::Nullable::operator> метод. Определяет, больше ли значение, представленное текущим объектом, чем значение, представленное указанным объектом Nullable, путем применения operator>() к этим значениям в C++.'
тип: docs
weight: 2000
url: /cpp/system/nullable/operator_/
---
## Nullable::operator>(const Nullable\<T1\>\&) const method


Определяет, больше ли значение, представленное текущим объектом, чем значение, представленное указанным объектом [Nullable](../), путем применения [operator>()](./) к этим значениям.

```cpp
template<typename T1> bool System::Nullable<T>::operator>(const Nullable<T1> &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Базовый тип объекта [Nullable](../) для сравнения |

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Константная ссылка на объект [Nullable](../) для сравнения |

### ReturnValue

True, если значение, представленное текущим объектом, больше значения, представленного указанным объектом [Nullable](../), иначе — false

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>(const T1\&) const method


Определяет, больше ли значение, представленное текущим объектом, чем указанное значение, путем применения [operator>()](./) к этим значениям.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, bool>::type System::Nullable<T>::operator>(const T1 &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Тип значения для сравнения |

| Параметр | Тип | Описание |
| --- | --- | --- |
| другой | const T1\& | Константная ссылка на значение для сравнения |

### ReturnValue

True, если значение, представленное текущим объектом, больше указанного значения, иначе — false

## См. также

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator>(std::nullptr_t) const method


Всегда возвращает false.

```cpp
bool System::Nullable<T>::operator>(std::nullptr_t) const
```

## См. также

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
