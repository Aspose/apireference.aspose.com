---
title: "System::Nullable::operator+= method"
linktitle: "operator+="
second_title: "Aspose.Font для C++"
description: "System::Nullable::operator+= method. Применяет operator+=() к значению, представленному текущим объектом, используя значение, представленное указанным объектом Nullable, в качестве аргумента справа в C++."
type: docs
weight: 1300
url: /ru/cpp/system/nullable/operator+=/
---
## Nullable::operator+=(const Nullable\<T1\>\&) method


Применяет [operator+=()](./) к значению, представленному текущим объектом, используя значение, представленное указанным объектом [Nullable](../) в качестве аргумента справа.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator+=(const Nullable<T1> &other)
```


| Параметр | Описание |
| --- | --- |
| T1 | Базовый тип объекта [Nullable](../), значение которого используется в качестве аргумента справа для [operator+=()](./) |

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | Константная ссылка на объект [Nullable](../), значение которого используется в качестве аргумента справа для [operator+=()](./), применяемого к значению, представленному текущим объектом. |

### ReturnValue

Ссылка на себя

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+=(const T1\&) method


Применяет [operator+=()](./) к значению, представленному текущим объектом, используя указанное значение в качестве аргумента справа.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator+=(const T1 &other)
```


| Параметр | Описание |
| --- | --- |
| T1 | Тип значения, используемого в качестве правого аргумента для [operator+=()](./) |

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | const T1\& | Константная ссылка на значение, которое используется в качестве правого аргумента для [operator+=()](./), применяемого к значению, представленному текущим объектом. |

### ReturnValue

Ссылка на себя

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator+=(std::nullptr_t) method


Сбрасывает текущий объект, чтобы он представлял null‑значение.

```cpp
Nullable<T> System::Nullable<T>::operator+=(std::nullptr_t)
```


### ReturnValue

Копия самого объекта

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
