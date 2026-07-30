---
title: "System::Nullable::operator= метод"
linktitle: "operator="
second_title: "Aspose.Font для C++"
description: "System::Nullable::operator= метод. Заменяет текущее представляемое значение объекта указанным значением в C++."
type: docs
weight: 1800
url: /ru/cpp/system/nullable/operator=/
---
## Nullable::operator=(const Nullable\<T1\>\&) method


Заменяет текущее представленное объектом значение указанным.

```cpp
template<typename T1> Nullable<T> & System::Nullable<T>::operator=(const Nullable<T1> &x)
```


| Параметр | Описание |
| --- | --- |
| Эта | тип нового значения, которое будет представлено текущим объектом |

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | const Nullable\<T1\>\& | Новое значение, которое будет представлено текущим объектом |

### ReturnValue

Ссылка на себя

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator=(const T1\&) method


Заменяет текущее представленное объектом значение указанным.

```cpp
template<typename T1> std::enable_if<!IsNullable<T1>::value &&!std::is_null_pointer<T1>::value, Nullable<T> &>::type System::Nullable<T>::operator=(const T1 &x)
```


| Параметр | Описание |
| --- | --- |
| Эта | тип нового значения, которое будет представлено текущим объектом |

| Параметр | Тип | Описание |
| --- | --- | --- |
| x | const T1\& | Новое значение, которое будет представлено текущим объектом |

### ReturnValue

Ссылка на себя

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator=(std::nullptr_t) method


Присваивает null текущему объекту.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator=(std::nullptr_t)
```


### ReturnValue

Объект [Nullable](../), представляющий null‑значение.

## См. также

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
