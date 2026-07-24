---
title: "فئة System::EnumValues"
linktitle: "EnumValues"
second_title: "Aspose.Page لـ C++"
description: "فئة System::EnumValues. توفر معلومات وصفية حول ثوابت التعداد لنوع enum **E** في C++."
type: docs
weight: 2300
url: /ar/cpp/system/enumvalues/
---
## EnumValues class


يقدم معلومات ميتا حول ثوابت التعداد لنوع التعداد **E**.

```cpp
template<typename E,class Guard>class EnumValues : public System::EnumValuesBase
```


| Parameter | الوصف |
| --- | --- |
| E | نوع التعداد |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [EnumValues](./enumvalues/)() | ينشئ مثالًا. |
| [GetNames](./getnames/)() const override | يعيد مصفوفة تحتوي على جميع أسماء التعداد **E**. |
| static [GetNames](../enumvaluesbase/getnames/)(const TypeInfo\&) | يسترجع مصفوفة بأسماء الثوابت في تعداد محدد. |
| [GetUnderlyingType](./getunderlyingtype/)() const override | يعيد النوع الأساسي للتعداد المحدد. |
| static [GetUnderlyingType](../enumvaluesbase/getunderlyingtype/)(const TypeInfo\&) | يعيد النوع الأساسي للتعداد المحدد. |
| [GetValueOf](./getvalueof/)(const String\&, bool) const override | يعيد القيمة المعبأة للثابت enum بالاسم المحدد. |
| [GetValueOf](./getvalueof/)(long) const override | يعيد القيمة المعبأة للثابت enum مع القيمة المحددة. |
| [GetValues](./getvalues/)() const override | يعيد مصفوفة تحتوي على جميع قيم التعداد **E**. |
| static [GetValues](../enumvaluesbase/getvalues/)(const TypeInfo\&) | يعيد مصفوفة تحتوي على جميع قيم نوع التعداد المحدد. |
| static [Parse](../enumvaluesbase/parse/)(const TypeInfo\&, const String\&, bool) | يعيد كائنًا يمثل قيمة ثابت التعداد لنوع التعداد المحدد مع الاسم المحدد. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, uint64_t) | يحوّل القيمة المحددة للعدد الصحيح غير الموقّع 64-بت إلى عضو في التعداد. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | يحوّل الكائن المحدد الذي يحتوي على قيمة عددية إلى عضو في التعداد. |
| virtual [~EnumValues](./~enumvalues/)() | المدمر. |

## انظر أيضًا

* Class [EnumValuesBase](../enumvaluesbase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
