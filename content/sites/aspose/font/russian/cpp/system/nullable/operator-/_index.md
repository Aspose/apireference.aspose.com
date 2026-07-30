---
title: "System::Nullable::operator- method"
linktitle: "operator-"
second_title: "Aspose.Font для C++"
description: "System::Nullable::operator- method. Вычитает nullable‑значения в C++."
type: docs
weight: 1400
url: /ru/cpp/system/nullable/operator-/
---
## Nullable::operator-(const Nullable\<T1\>\&) const method


Вычитает nullable значения.

```cpp
template<typename T1> System::Nullable<decltype(get_Value() - other.get_Value())> System::Nullable<T>::operator-(const Nullable<T1> &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Тип правого операнда. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| другой | const Nullable\<T1\>\& | значение для вычитания. |

### ReturnValue

Результат вычитания.

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-(const T1\&) const method


Вычитает nullable и non-nullable значения.

```cpp
template<typename T1,typename> Nullable<decltype(get_Value() - other)> System::Nullable<T>::operator-(const T1 &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Тип правого операнда. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| другой | const T1\& | значение для вычитания. |

### ReturnValue

Результат вычитания.

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-(T1) const method


Вычитает nullable и null‑указанные значения.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-(T1) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Тип правого операнда, должен быть nullptr_t. |

### ReturnValue

Пустой объект [Nullable](../).

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
