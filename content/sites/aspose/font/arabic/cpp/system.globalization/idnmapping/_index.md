---
title: "System::Globalization::IdnMapping class"
linktitle: "IdnMapping"
second_title: "Aspose.Font لـ C++"
description: "System::Globalization::IdnMapping class. يُستخدم IdnMapping لتعيين الأسماء إلى Punycode. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1300
url: /ar/cpp/system.globalization/idnmapping/
---
## IdnMapping class


[IdnMapping](./) used to map names to Punycode. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class IdnMapping : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<Object\>) override | يقارن كائنين من نوع [IdnMapping](./). |
| [get_AllowUnassigned](./get_allowunassigned/)() const | يحصل على العلم الذي يشير إلى ما إذا كانت نقاط الشيفرة غير المعينة تُستخدم في العمليات. |
| [get_UseStd3AsciiRules](./get_usestd3asciirules/)() const | يحصل على العلم الذي يشير إلى ما إذا كانت اتفاقيات التسمية القياسية تُستخدم في العمليات. |
| [GetAscii](./getascii/)(const String\&) const | [Convert](../../system/convert/) اسم النطاق Unicode إلى ما يعادله ASCII. |
| [GetAscii](./getascii/)(const String\&, int) const | [Convert](../../system/convert/) اسم النطاق Unicode إلى ما يعادله ASCII. |
| [GetAscii](./getascii/)(const String\&, int, int) const | [Convert](../../system/convert/) اسم النطاق Unicode إلى ما يعادله ASCII. |
| [GetHashCode](./gethashcode/)() const override | يحصل على قيمة التجزئة لكائن [IdnMapping](./) الحالي. |
| [GetUnicode](./getunicode/)(const String\&) const | [Convert](../../system/convert/) اسم النطاق ASCII إلى ما يعادله Unicode. |
| [GetUnicode](./getunicode/)(const String\&, int) const | [Convert](../../system/convert/) اسم النطاق ASCII إلى ما يعادله Unicode. |
| [GetUnicode](./getunicode/)(const String\&, int, int) const | [Convert](../../system/convert/) اسم النطاق ASCII إلى ما يعادله Unicode. |
| [IdnMapping](./idnmapping/)() | معلومات RTTI. |
| [IdnMapping](./idnmapping/)(const IdnMapping\&) |  |
| [operator=](./operator=/)(const IdnMapping\&) |  |
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | يضبط العلم الذي يشير إلى ما إذا كانت نقاط الشيفرة غير المعينة تُستخدم في العمليات. |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | يضبط العلم الذي يشير إلى ما إذا كانت اتفاقيات التسمية القياسية تُستخدم في العمليات. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
