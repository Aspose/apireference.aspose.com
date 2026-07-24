---
title: "Метод System::CastEnumerableTo"
linktitle: "CastEnumerableTo"
second_title: "Aspose.Page для C++"
description: "Метод System::CastEnumerableTo. Выполняет явное приведение элементов указанного перечислимого объекта к другому типу в C++."
type: docs
weight: 15500
url: /ru/cpp/system/castenumerableto/
---
## System::CastEnumerableTo(const From\&) method


Выполняет явное приведение элементов указанного перечислимого объекта к другому типу.

```cpp
template<class To,class From> std::enable_if<!System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Параметр | Описание |
| --- | --- |
| К | Тип, к которому статически приводятся элементы перечислимого объекта |
| From | Тип перечислимого объекта |

| Параметр | Тип | Описание |
| --- | --- | --- |
| перечислимый | const From\& | Enumerable объект, содержащий элементы для приведения |

### ReturnValue

Указатель на новую коллекцию, содержащую элементы типа **To**, эквивалентные элементам **enumerable**

## См. также

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::CastEnumerableTo(const From\&) method


Выполняет явное приведение элементов указанного перечислимого объекта к другому типу.

```cpp
template<class To,class From> std::enable_if<System::detail::has_method_get_Count<From>::value, Collections::Generic::ListPtr<To>>::type System::CastEnumerableTo(const From &enumerable)
```


| Параметр | Описание |
| --- | --- |
| К | Тип, к которому статически приводятся элементы перечислимого объекта |
| From | Тип перечислимого объекта |

| Параметр | Тип | Описание |
| --- | --- | --- |
| перечислимый | const From\& | является наследником объекта Enumerable с определённым методом get_Count и содержащим элементы для приведения |

### ReturnValue

Указатель на новую коллекцию, содержащую элементы типа **To**, эквивалентные элементам **enumerable**

## См. также

* Class [ListPtr](../../system.collections.generic/listptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
