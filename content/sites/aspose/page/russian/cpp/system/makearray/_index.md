---
title: "Метод System::MakeArray"
linktitle: "MakeArray"
second_title: "Aspose.Page для C++"
description: "Метод System::MakeArray. Фабричная функция, создающая новый объект Array, передавая указанные аргументы его конструктору в C++."
type: docs
weight: 24000
url: /ru/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


Фабричная функция, создающая новый объект [Array](../array/), передавая указанные аргументы его конструктору.

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| Параметр | Описание |
| --- | --- |
| T | Тип элементов объекта [Array](../array/), создаваемого функцией |

| Параметр | Тип | Описание |
| --- | --- | --- |
| args | Args\&&... | Аргументы, передаваемые конструктору объекта [Array](../array/), который создаётся |

### ReturnValue

Умный указатель, указывающий на созданный объект [Array](../array/)

## См. также

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


Фабричная функция, создающая новый объект [Array](../array/), передавая указанные аргументы его конструктору.

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| Параметр | Описание |
| --- | --- |
| T | Тип элементов объекта [Array](../array/), создаваемого функцией |
| Integral | Тип размера массива. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| size | Integral | Размер создаваемого массива. |
| args | Args\&&... | Аргументы, передаваемые конструктору объекта [Array](../array/), который создаётся |

### ReturnValue

Умный указатель, указывающий на созданный объект [Array](../array/)

## См. также

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


Фабричная функция, создающая новый объект [Array](../array/), заполняет его элементами из указанного списка инициализации и возвращает умный указатель, указывающий на объект [Array](../array/).

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| Параметр | Описание |
| --- | --- |
| T | Тип элементов объекта [Array](../array/), создаваемого функцией |

| Параметр | Тип | Описание |
| --- | --- | --- |
| init | std::initializer_list\<T\> | Список инициализации, содержащий элементы для заполнения массива |

### ReturnValue

Умный указатель, указывающий на созданный объект [Array](../array/)

## См. также

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
