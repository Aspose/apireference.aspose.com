---
title: "System::ObjectExt::ObjectToUnknown طريقة"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Font لـ C++"
description: "System::ObjectExt::ObjectToUnknown طريقة. يحول Object إلى نوع غير معروف، مع معالجة كل من نوع المؤشر الذكي وحالات القيمة المغلفة في C++."
type: docs
weight: 1300
url: /ar/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


يحوّل [Object](../../object/) إلى نوع غير معروف، مع معالجة كل من نوع المؤشر الذكي وحالات القيمة المغلفة.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الذي يُحوَّل إليه [Object](../../object/). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) للتحويل. |

### ReturnValue

إما قيمة غير مغلفة أو مؤشر محوَّل.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


يحوّل [Object](../../object/) إلى نوع غير معروف، مع معالجة كل من نوع المؤشر الذكي وحالات القيمة المغلفة.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| معامل | الوصف |
| --- | --- |
| T | النوع الذي يُحوَّل إليه [Object](../../object/). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) للتحويل. |

### ReturnValue

إما قيمة غير مغلفة أو مؤشر محوَّل.

## انظر أيضًا

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
