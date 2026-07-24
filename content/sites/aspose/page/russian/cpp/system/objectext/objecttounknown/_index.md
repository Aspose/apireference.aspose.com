---
title: "System::ObjectExt::ObjectToUnknown метод"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Page для C++"
description: "System::ObjectExt::ObjectToUnknown метод. Преобразует Object в неизвестный тип, обрабатывая как тип умного указателя, так и ситуации с bpxed-значением в C++."
type: docs
weight: 1200
url: /ru/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Преобразует [Object](../../object/) в неизвестный тип, обрабатывая как тип умного указателя, так и ситуации с bpxed-значением.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Параметр | Описание |
| --- | --- |
| T | Тип, в который нужно преобразовать [Object](../../object/). |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) для преобразования. |

### ReturnValue

Либо распакованное значение, либо преобразованный указатель.

## См. также

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Преобразует [Object](../../object/) в неизвестный тип, обрабатывая как тип умного указателя, так и ситуации с упакованным значением.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Параметр | Описание |
| --- | --- |
| T | Тип, в который нужно преобразовать [Object](../../object/). |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) для преобразования. |

### ReturnValue

Либо распакованное значение, либо преобразованный указатель.

## См. также

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
