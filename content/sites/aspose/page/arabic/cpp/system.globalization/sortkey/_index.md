---
title: "System::Globalization::SortKey فئة"
linktitle: "SortKey"
second_title: "Aspose.Page لـ C++"
description: "System::Globalization::SortKey فئة. تحويل سلسلة إلى مفتاح الفرز الخاص بها. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2200
url: /ar/cpp/system.globalization/sortkey/
---
## SortKey class


تحويل سلسلة إلى مفتاح الفرز الخاص بها. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SortKey : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Compare](./compare/)(const SortKeyPtr\&, const SortKeyPtr\&) | يقارن مفتاحي فرز. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | يتحقق مما إذا كان الكائن المحدد يساوي كائن [SortKey](./) الحالي. |
| virtual [get_KeyData](./get_keydata/)() | يحصل على مصفوفة بايت تمثل الكائن الحالي. |
| virtual [get_OriginalString](./get_originalstring/)() | يحصل على السلسلة الأصلية المستخدمة لإنشاء هذا الكائن. |
| [GetHashCode](./gethashcode/)() const override | يحصل على قيمة التجزئة لكائن [SortKey](./) الحالي. |
| [operator=](./operator=/)(const SortKey\&) |  |
| [SortKey](./sortkey/)(const SortKey\&) |  |
| [ToString](./tostring/)() const override | يحول الكائن الحالي إلى تمثيله النصي. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
