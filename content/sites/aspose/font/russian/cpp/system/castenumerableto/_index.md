---
title: "System::CastEnumerableTo метод"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Font для C++"
description: "System::CastEnumerableTo метод. Выполняет явное приведение элементов указанного перечисляемого объекта к другому типу в C++."
type: docs
weight: 15600
url: /ru/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


Выполняет явное приведение элементов указанного перечисляемого объекта к другому типу.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Параметр | Описание |
| --- | --- |
| To | Тип, к которому статически приводятся элементы перечисляемого объекта |
| From | Тип перечисляемого объекта |

| Параметр | Тип | Описание |
| --- | --- | --- |
| enumerable | const From\& | Перечисляемый объект, содержащий элементы для приведения |

### ReturnValue

Указатель на новую коллекцию, содержащую элементы типа **To**, эквивалентные элементам **enumerable**.

## См. также

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::CastEnumerableTo(const From\&) method


Выполняет явное приведение элементов указанного перечисляемого объекта к другому типу.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Параметр | Описание |
| --- | --- |
| To | Тип, к которому статически приводятся элементы перечисляемого объекта |
| From | Тип перечисляемого объекта |

| Параметр | Тип | Описание |
| --- | --- | --- |
| enumerable | const From\& | является наследником объекта Enumerable с определённым методом get_Count и содержащим элементы для приведения |

### ReturnValue

Указатель на новую коллекцию, содержащую элементы типа **To**, эквивалентные элементам **enumerable**.

## См. также

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
