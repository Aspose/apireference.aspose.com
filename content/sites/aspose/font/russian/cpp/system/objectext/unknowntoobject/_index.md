---
title: "Метод System::ObjectExt::UnknownToObject"
linktitle: "UnknownToObject"
second_title: "Aspose.Font для C++"
description: "Метод System::ObjectExt::UnknownToObject. Преобразует объект неизвестного типа в Object, обрабатывая как типы умных указателей, так и типы значений в C++."
type: docs
weight: 1900
url: /ru/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


Преобразует объект неизвестного типа в [Object](../../object/), обрабатывая как типы умных указателей, так и типы значений.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Тип для преобразования в [Object](../../object/). |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) для преобразования. |

### ReturnValue

Умный указатель на [Object](../../object/), являющийся либо преобразованным указателем, либо упакованным значением.

## См. также

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::UnknownToObject(T) method


Преобразует объект неизвестного типа в [Object](../../object/), обрабатывая как типы умных указателей, так и типы значений.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| Параметр | Описание |
| --- | --- |
| T | Тип для преобразования в [Object](../../object/). |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | T | [Object](../../object/) для преобразования. |

### ReturnValue

Умный указатель на [Object](../../object/), являющийся либо преобразованным указателем, либо упакованным значением.

## См. также

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
