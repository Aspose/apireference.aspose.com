---
title: "طريقة System::EnumValuesBase::Parse"
linktitle: "تحليل"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::EnumValuesBase::Parse. تُرجع كائنًا يمثل قيمة ثابت تعداد من النوع المحدد مع الاسم المحدد في C++."
type: docs
weight: 400
url: /ar/cpp/system/enumvaluesbase/parse/
---
## EnumValuesBase::Parse method


يعيد كائنًا يمثل قيمة ثابت التعداد لنوع التعداد المحدد مع الاسم المحدد.

```cpp
static SharedPtr<Object> System::EnumValuesBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| type | const TypeInfo\& | كائن [TypeInfo](../../typeinfo/) الذي يمثل نوع قيمة التعداد لإرجاعها |
| str | const String\& | اسم الثابت التعدادي |
| ignoreCase | bool | يحدد ما إذا كان يجب تجاهل حالة الأحرف عند تفسير اسم ثابت التعداد |

### ReturnValue

كائن يمثل قيمة ثابت التعداد الذي اسمه محدد في **str**.

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
