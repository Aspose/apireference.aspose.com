---
title: "System::ICustomFormatter::Format طريقة"
linktitle: "تنسيق"
second_title: "Aspose.Page لـ C++"
description: "System::ICustomFormatter::Format طريقة. يُعيد تمثيلًا نصيًا لقيمة ممثلة بواسطة الكائن الحالي باستخدام التنسيق المحدد في C++."
type: docs
weight: 100
url: /ar/cpp/system/icustomformatter/format/
---
## ICustomFormatter::Format method


يرجع تمثيلًا نصيًا لقيمة ممثلة بواسطة الكائن الحالي باستخدام التنسيق المحدد.

```cpp
virtual System::String System::ICustomFormatter::Format(System::String format, System::SharedPtr<System::Object> arg, System::SharedPtr<System::IFormatProvider> formatProvider)=0
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| تنسيق | System::String | تنسيق السلسلة |
| arg | System::SharedPtr\<System::Object\> | الكائن المراد تنسيقه |
| formatProvider | System::SharedPtr\<System::IFormatProvider\> | الكائن الذي يوفر معلومات التنسيق |

### ReturnValue

تمثيل السلسلة النصية للـ **arg** مُنسّق وفقًا للتنسيق المحدد بواسطة **format** و **formatProvider**

## انظر أيضًا

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [Object](../../object/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [ICustomFormatter](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
