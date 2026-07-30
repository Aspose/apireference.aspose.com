---
title: "Метод System::ObjectExt::Coalesce"
linktitle: "Coalesce"
second_title: "Aspose.Font для C++"
description: "Метод System::ObjectExt::Coalesce. Реализация перевода оператора ''??'' для nullable‑типов в C++."
type: docs
weight: 500
url: /ru/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


Реализация трансляции оператора '??' для nullable типов.

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| Параметр | Описание |
| --- | --- |
| T0 | Тип значения LHS. |
| T1 | Тип лямбда-выражения, инкапсулирующего RHS. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | System::Nullable\<T0\> | Значение LHS. |
| функция | T1 | Выражение RHS. |

### ReturnValue

Если значение LHS не равно null, возвращает LHS, иначе вычисляет выражение RHS и возвращает результат.

## См. также

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


Реализация трансляции оператора '??' для не-nullable типов.

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| Параметр | Описание |
| --- | --- |
| T0 | Тип значения LHS. |
| T1 | Тип лямбда-выражения, инкапсулирующего RHS. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | T0 | Значение LHS. |
| функция | T1 | Выражение RHS. |

### ReturnValue

Если значение LHS не равно null, возвращает LHS, иначе вычисляет выражение RHS и возвращает результат.

## См. также

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
