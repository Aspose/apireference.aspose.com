---
title: "فئة System::Collections::Generic::IEqualityComparer"
linktitle: "IEqualityComparer"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::IEqualityComparer. واجهة توفر وسيلة لمقارنة كائنين للتساوي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2400
url: /ar/cpp/system.collections.generic/iequalitycomparer/
---
## IEqualityComparer class


واجهة توفر وسيلة لمقارنة كائنين للتساوي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename T>class IEqualityComparer : public virtual System::Object
```


| معامل | الوصف |
| --- | --- |
| T | النوع الجاري مقارنته. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Equals](./equals/)(T, T) const | معلومات RTTI. |
| virtual [GetHashCode](./gethashcode/)(T) const | يحصل على قيمة التجزئة لكائن ما. |

## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
