---
title: "فئة System::EnumValues"
linktitle: "EnumValues"
second_title: "Aspose.Font لـ C++"
description: "فئة System::EnumValues. توفر معلومات وصفية حول ثوابت التعداد لنوع enum E في C++."
type: docs
weight: 2300
url: /ar/cpp/system/enumvalues/
---
## EnumValues class


يوفر معلومات ميتا حول ثوابت التعداد لنوع التعداد **E**.

```cpp
template<typename E,class Guard>class EnumValues : public System::EnumValuesBase
```


| معامل | الوصف |
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
| [GetValueOf](./getvalueof/)(long) const override | يعيد القيمة المعبأة للثابت enum بالقيمة المحددة. |
| [GetValues](./getvalues/)() const override | يعيد مصفوفة تحتوي على جميع قيم التعداد **E**. |
| static [GetValues](../enumvaluesbase/getvalues/)(const TypeInfo\&) | يعيد مصفوفة تحتوي على جميع قيم نوع التعداد المحدد. |
| static [Parse](../enumvaluesbase/parse/)(const TypeInfo\&, const String\&, bool) | إرجاع كائن يمثل قيمة ثابت تعداد من النوع المحدد بالاسم المحدد. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, uint64_t) | تحويل القيمة المحددة من عدد صحيح غير موقع 64‑بت إلى عنصر تعداد. |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | تحويل الكائن المحدد الذي يحمل قيمة عددية إلى عنصر تعداد. |
| virtual [~EnumValues](./~enumvalues/)() | المدمر. |

## انظر أيضًا

* Class [EnumValuesBase](../enumvaluesbase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
