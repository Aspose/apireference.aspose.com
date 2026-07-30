---
title: "System::Get метод"
linktitle: "Get"
second_title: "Aspose.Font для C++"
description: "System::Get метод. Функция для получения N‑го элемента кортежа. Перегрузка для базового объекта в C++."
type: docs
weight: 20800
url: /ru/cpp/system/get/
---
## System::Get(const SharedPtr\<Object\>\&) method


Функция для получения N‑го элемента кортежа. Перегрузка для базового объекта.

```cpp
template<std::size_t> auto System::Get(const SharedPtr<Object> &object)
```


| Параметр | Описание |
| --- | --- |
| N | индекс элемента. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| объект | const SharedPtr\<Object\>\& | объект для инспекции. |

### ReturnValue

значение N‑го элемента кортежа, приведённое к типу object.

## См. также

* Typedef [SharedPtr](../sharedptr/)
* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const SharedPtr\<T\>\&) method


Функция для получения N‑го элемента кортежа. Перегрузка для shared pointers.

```cpp
template<std::size_t,typename T> auto System::Get(const SharedPtr<T> &pointer)
```


| Параметр | Описание |
| --- | --- |
| N | индекс элемента. |
| T | тип проверяемого объекта. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| объект | const SharedPtr\<T\>\& | объект для инспекции. |

### ReturnValue

значение N‑го элемента кортежа.

## См. также

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const T\&) method


Функция для получения N‑го элемента кортежа. Перегрузка для объектов с методом Deconstruct.

```cpp
template<std::size_t,typename T> auto System::Get(const T &object)
```


| Параметр | Описание |
| --- | --- |
| N | индекс элемента. |
| T | тип проверяемого объекта. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| объект | const T\& | объект для инспекции. |

### ReturnValue

значение N‑го элемента кортежа.

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::Get(const ValueTuple\<Args...\>\&) method


Получает N‑й элемент кортежа значений.

```cpp
template<std::size_t,typename...> auto System::Get(const ValueTuple<Args...> &tuple)
```


| Параметр | Описание |
| --- | --- |
| N | индекс элемента. |
| Аргументы | элементы кортежа. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| кортеж | const ValueTuple\<Args...\>\& | кортеж, из которого получить элемент. |

### ReturnValue

значение N‑го элемента кортежа.

## См. также

* Class [ValueTuple](../valuetuple/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
