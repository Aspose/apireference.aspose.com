---
title: "طريقة System::ObjectExt::ObjectToUnknown"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::ObjectExt::ObjectToUnknown. يحول Object إلى نوع غير معروف، مع معالجة كل من نوع المؤشر الذكي وحالات القيمة المعبأة في C++."
type: docs
weight: 1200
url: /ar/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


يحول [Object](../../object/) إلى نوع غير معروف، مع معالجة كل من نوع المؤشر الذكي وحالات القيمة المعبأة.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | الوصف |
| --- | --- |
| T | النوع الذي سيتم تحويل [Object](../../object/) إليه. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) للتحويل. |

### ReturnValue

إما قيمة غير مفكوكة أو مؤشر محوَّل.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


يحول [Object](../../object/) إلى نوع غير معروف، مع معالجة كل من نوع المؤشر الذكي وحالات القيمة المعبأة.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | الوصف |
| --- | --- |
| T | النوع الذي سيتم تحويل [Object](../../object/) إليه. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) للتحويل. |

### ReturnValue

إما قيمة غير مفكوكة أو مؤشر محوَّل.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
