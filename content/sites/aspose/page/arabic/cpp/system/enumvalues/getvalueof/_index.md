---
title: "طريقة System::EnumValues::GetValueOf"
linktitle: "GetValueOf"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::EnumValues::GetValueOf. تُرجع القيمة المعبأة للثابت التعدادي بالاسم المحدد في C++."
type: docs
weight: 500
url: /ar/cpp/system/enumvalues/getvalueof/
---
## EnumValues::GetValueOf(const String\&, bool) const method


يعيد القيمة المعبأة للثابت enum بالاسم المحدد.

```cpp
virtual SharedPtr<Object> System::EnumValues<E, Guard>::GetValueOf(const String &str, bool ignoreCase) const override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | اسم الثابت التعدادي |
| ignoreCase | bool | يحدد ما إذا كان يجب تجاهل حالة الأحرف عند تفسير اسم ثابت التعداد |

### ReturnValue

قيمة مُغلفة لثابت التعداد الذي يُحدَّد اسمه في **str**.

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [String](../../string/)
* Class [EnumValues](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## EnumValues::GetValueOf(long) const method


يعيد القيمة المعبأة للثابت enum مع القيمة المحددة.

```cpp
virtual SharedPtr<Object> System::EnumValues<E, Guard>::GetValueOf(long val) const override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| val | long | قيمة ثابت التعداد |

### ReturnValue

قيمة مُغلفة لثابت التعداد الذي يُحدَّد قيمته في **str**.

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [EnumValues](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
