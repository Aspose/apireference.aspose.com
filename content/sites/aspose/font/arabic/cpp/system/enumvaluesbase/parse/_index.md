---
title: "طريقة System::EnumValuesBase::Parse"
linktitle: "تحليل"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::EnumValuesBase::Parse. تُرجِع كائنًا يمثل قيمة ثابت تعداد من نوع التعداد المحدد بالاسم المحدد في C++."
type: docs
weight: 400
url: /ar/cpp/system/enumvaluesbase/parse/
---
## EnumValuesBase::Parse method


إرجاع كائن يمثل قيمة ثابت تعداد من النوع المحدد بالاسم المحدد.

```cpp
static SharedPtr<Object> System::EnumValuesBase::Parse(const TypeInfo &type, const String &str, bool ignoreCase)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| type | const TypeInfo\& | الكائن [TypeInfo](../../typeinfo/) الذي يمثل نوع قيمة التعداد المراد إرجاعها |
| str | const String\& | اسم الثابت التعدادي |
| ignoreCase | bool | يحدد ما إذا كان يجب تجاهل حالة الأحرف عند تفسير اسم الثابت التعدادي. |

### ReturnValue

كائن يمثل قيمة ثابت التعداد الذي يُحدَّد اسمه في **str**.

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [EnumValuesBase](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
