---
title: "فئة System::Globalization::IdnMapping"
linktitle: "IdnMapping"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Globalization::IdnMapping. تُستخدم IdnMapping لتحويل الأسماء إلى Punycode. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
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
| [Equals](./equals/)(SharedPtr\<Object\>) override | يقارن كائنين من [IdnMapping](./). |
| [get_AllowUnassigned](./get_allowunassigned/)() const | يحصل على العلم الذي يشير إلى ما إذا كانت نقاط الشيفرة غير المعينة تُستخدم في العمليات. |
| [get_UseStd3AsciiRules](./get_usestd3asciirules/)() const | يحصل على العلم الذي يشير إلى ما إذا كانت اتفاقيات التسمية القياسية تُستخدم في العمليات. |
| [GetAscii](./getascii/)(const String\&) const | [Convert](../../system/convert/) اسم النطاق Unicode إلى ما يعادله في ASCII. |
| [GetAscii](./getascii/)(const String\&, int) const | [Convert](../../system/convert/) اسم النطاق Unicode إلى ما يعادله في ASCII. |
| [GetAscii](./getascii/)(const String\&, int, int) const | [Convert](../../system/convert/) اسم النطاق Unicode إلى ما يعادله في ASCII. |
| [GetHashCode](./gethashcode/)() const override | يحصل على قيمة التجزئة لكائن [IdnMapping](./) الحالي. |
| [GetUnicode](./getunicode/)(const String\&) const | [Convert](../../system/convert/) اسم النطاق ASCII إلى ما يعادله في Unicode. |
| [GetUnicode](./getunicode/)(const String\&, int) const | [Convert](../../system/convert/) اسم النطاق ASCII إلى ما يعادله في Unicode. |
| [GetUnicode](./getunicode/)(const String\&, int, int) const | [Convert](../../system/convert/) اسم النطاق ASCII إلى ما يعادله في Unicode. |
| [IdnMapping](./idnmapping/)() | معلومات RTTI. |
| [IdnMapping](./idnmapping/)(const IdnMapping\&) |  |
| [operator=](./operator=/)(const IdnMapping\&) |  |
| [set_AllowUnassigned](./set_allowunassigned/)(bool) | يضبط العلامة التي تشير إلى ما إذا تم استخدام نقاط الشيفرة غير المعينة في العمليات. |
| [set_UseStd3AsciiRules](./set_usestd3asciirules/)(bool) | يضبط العلامة التي تشير إلى ما إذا تم استخدام تسميات قياسية في العمليات. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
