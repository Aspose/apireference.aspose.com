---
title: "فئة System::Decimal"
linktitle: "عدد عشري"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Decimal. تمثل رقمًا عشريًا. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 1900
url: /ar/cpp/system/decimal/
---
## Decimal class


تمثل رقمًا عشريًا. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا فئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
class Decimal
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Add](./add/)(const Decimal\&, const Decimal\&) | يضيف قيمتين [Decimal](./) محددتين. |
| static [Ceiling](./ceiling/)(const Decimal\&) | يرجع أصغر قيمة صحيحة تكون أكبر من أو مساوية للقيمة المحددة. |
| static [Compare](./compare/)(const Decimal\&, const Decimal\&) | يحدد ما إذا كانت القيمة التي يمثلها الكائن [Decimal](./) الأول أصغر من أو مساوية أو أكبر من القيمة التي يمثلها الكائن [Decimal](./) الثاني. |
| [CompareTo](./compareto/)(const Decimal\&) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أصغر من أو مساوية أو أكبر من القيمة التي يمثلها الكائن المحدد. |
| [Decimal](./decimal/)() | ينشئ نسخة تمثل 0. |
| [Decimal](./decimal/)(std::int8_t) | ينشئ نسخة تمثل القيمة المحددة. |
| [Decimal](./decimal/)(std::int16_t) | ينشئ نسخة تمثل القيمة المحددة. |
| [Decimal](./decimal/)(std::int32_t) | ينشئ نسخة تمثل القيمة المحددة. |
| [Decimal](./decimal/)(std::int64_t) | ينشئ نسخة تمثل القيمة المحددة. |
| [Decimal](./decimal/)(std::uint8_t) | ينشئ نسخة تمثل القيمة المحددة. |
| [Decimal](./decimal/)(std::uint16_t) | ينشئ نسخة تمثل القيمة المحددة. |
| [Decimal](./decimal/)(std::uint32_t) | ينشئ نسخة تمثل القيمة المحددة. |
| [Decimal](./decimal/)(std::uint64_t) | ينشئ نسخة تمثل القيمة المحددة. |
| [Decimal](./decimal/)(float) | ينشئ نسخة تمثل القيمة المحددة. |
| [Decimal](./decimal/)(double) | ينشئ نسخة تمثل القيمة المحددة. |
| explicit [Decimal](./decimal/)(const std::string\&) | ينشئ نسخة تمثل قيمة تم تحديد تمثيلها النصي كنسخة من فئة std::string. |
| [Decimal](./decimal/)(int32_t, int32_t, int32_t, bool, uint8_t) | ينشئ كائنًا من [Decimal](./) من المكونات المحددة. |
| [Decimal](./decimal/)(const Decimal\&) | ينشئ نسخة من فئة [Decimal](./) تمثل نفس الرقم كما في كائن [Decimal](./) المحدد. |
| [Decimal](./decimal/)(const ArrayPtr\<int32_t\>\&) | ينشئ مثيلاً لفئة [Decimal](./) من مصفوفة أعداد صحيحة تحتوي على تمثيل ثنائي. |
| [Decimal](./decimal/)(std::nullptr_t) | دائمًا يرمي استثناء ArgumentNullException. |
| [Decimal](./decimal/)(const number_type\&) | ينشئ مثيلاً لفئة [Decimal](./) تمثل القيمة المحددة. |
| static [Divide](./divide/)(const Decimal\&, const Decimal\&) | يقسم قيمتين محددتين من نوع [Decimal](./). |
| [Equals](./equals/)(const Decimal\&) const | يحدد ما إذا كانت القيم التي يمثلها الكائن الحالي والكائن المحدد متساوية. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | يحدد ما إذا كانت القيم التي يمثلها الكائن الحالي والكائن المحدد متساوية. |
| static [Equals](./equals/)(const Decimal\&, const Decimal\&) | يحدد ما إذا كانت القيم التي يمثلها الكائنات المحددة متساوية. |
| static [Floor](./floor/)(const Decimal\&) | يعيد أكبر قيمة صحيحة تكون أصغر من أو تساوي القيمة المحددة. |
| static [FromOACurrency](./fromoacurrency/)(int64_t) | [Convert](../convert/) القيمة النقدية OLE المحددة إلى القيمة المكافئة من نوع [Decimal](./). غير مُنفَّذ. |
| static [GetBits](./getbits/)(const Decimal\&) | يحوّل الكائن [Decimal](./) المحدد إلى التمثيل الثنائي للقيمة التي يمثلها. |
| static [GetBytes](./getbytes/)(const Decimal\&, const System::ArrayPtr\<uint8_t\>\&) | [Convert](../convert/) القيمة [Decimal](./) المحددة إلى مصفوفة من البايتات. |
| [GetHashCode](./gethashcode/)() const | يعيد رمز تجزئة للكائن الحالي. |
| [GetTypeCode](./gettypecode/)() const | يحصل على رمز نوع الكائن. |
| static [Multiply](./multiply/)(const Decimal\&, const Decimal\&) | يضرب قيمتين محددتين من نوع [Decimal](./). |
| static [Negate](./negate/)(const Decimal\&) | يعيد مثيلاً جديداً لفئة [Decimal](./) يمثل قيمة ناتجة عن نفي القيمة التي يمثلها الكائن المحدد. |
| explicit [operator bool](./operatorbool/)() const | يحوّل القيمة التي يمثلها الكائن الحالي إلى قيمة منطقية. |
| explicit [operator double](./operatordouble/)() const | يحوّل القيمة التي يمثلها الكائن الحالي إلى قيمة نقطية ذات دقة مزدوجة. |
| explicit [operator float](./operatorfloat/)() const | يحوّل القيمة التي يمثلها الكائن الحالي إلى قيمة نقطية ذات دقة أحادية. |
| [operator!=](./operator!=/)(const Decimal\&) const | يحدد ما إذا كانت القيم التي يمثلها الكائن الحالي والكائن المحدد غير متساوية. |
| [operator!=](./operator!=/)(std::nullptr_t) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي مختلفة عن 0. |
| [operator%](./operator%/)(const Decimal\&) const | يعيد مثيلاً جديداً لفئة [Decimal](./) يمثل قيمة ناتجة عن عملية باقي القسمة بين القيم التي يمثلها الكائن الحالي والكائن المحدد. |
| [operator%=](./operator%=/)(const Decimal\&) | يعين للكائن الحالي قيمة جديدة تكون نتيجة عملية باقي القسمة بين القيم التي يمثلها الكائن الحالي والكائن المحدد. |
| [operator*](./operator_/)(const Decimal\&) const | يعيد مثيلاً جديداً لفئة [Decimal](./) يمثل قيمة ناتجة عن ضرب القيم التي يمثلها الكائن الحالي والكائن المحدد. |
| [operator*=](./operator_=/)(const Decimal\&) | يعين للكائن الحالي قيمة جديدة تكون نتيجة ضرب القيم التي يمثلها الكائن الحالي والكائن المحدد. |
| [operator+](./operator+/)(const Decimal\&) const | يعيد مثيلاً جديداً لفئة [Decimal](./) يمثل قيمة هي مجموع القيم التي يمثلها الكائن الحالي والكائن المحدد. |
| [operator++](./operator++/)() | يزيد القيمة التي يمثلها الكائن الحالي. |
| [operator+=](./operator+=/)(const Decimal\&) | يعين للكائن الحالي قيمة جديدة تكون مجموع القيم التي يمثلها الكائن الحالي والكائن المحدد. |
| [operator-](./operator-/)(const Decimal\&) const | يعيد مثيلاً جديداً لفئة [Decimal](./) يمثل قيمة ناتجة عن طرح القيمة التي يمثلها الكائن المحدد من القيمة التي يمثلها الكائن الحالي. |
| [operator-](./operator-/)() const | يعيد نسخة جديدة من فئة [Decimal](./) تمثل قيمة ناتجة عن نفي القيمة التي يمثلها الكائن الحالي. |
| [operator--](./operator--/)() | يقلل القيمة التي يمثلها الكائن الحالي. |
| [operator-=](./operator-=/)(const Decimal\&) | يعين للكائن الحالي قيمة جديدة هي نتيجة طرح القيمة التي يمثلها الكائن المحدد من القيمة التي يمثلها الكائن الحالي. |
| [operator/](./operator//)(const Decimal\&) const | يعيد نسخة جديدة من فئة [Decimal](./) تمثل قيمة هي نتيجة قسمة القيمة التي يمثلها الكائن الحالي على القيمة التي يمثلها الكائن المحدد. |
| [operator/=](./operator/=/)(const Decimal\&) | يعين للكائن الحالي قيمة جديدة هي نتيجة قسمة القيمة التي يمثلها الكائن الحالي على القيمة التي يمثلها الكائن المحدد. |
| [operator<](./operator_/)(const Decimal\&) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أصغر من القيمة التي يمثلها الكائن المحدد. |
| [operator<=](./operator_=/)(const Decimal\&) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أصغر من أو تساوي القيمة التي يمثلها الكائن المحدد. |
| [operator=](./operator=/)(const Decimal\&) | يعين القيمة التي يمثلها الكائن المحدد إلى الكائن الحالي. |
| [operator==](./operator==/)(const Decimal\&) const | يحدد ما إذا كانت القيم التي يمثلها الكائن الحالي والكائن المحدد متساوية. |
| [operator==](./operator==/)(std::nullptr_t) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي تساوي 0. |
| [operator>](./operator_/)(const Decimal\&) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر من القيمة التي يمثلها الكائن المحدد. |
| [operator>=](./operator_=/)(const Decimal\&) const | يحدد ما إذا كانت القيمة التي يمثلها الكائن الحالي أكبر من أو تساوي القيمة التي يمثلها الكائن المحدد. |
| static [Parse](./parse/)(const String\&) | يحوّل تمثيل السلسلة لعدد عشري إلى نسخة مكافئة من فئة [Decimal](./). |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles) | يحوّل تمثيل السلسلة لعدد عشري إلى نسخة مكافئة من فئة [Decimal](./) باستخدام النمط المحدد. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | يحوّل تمثيل السلسلة لعدد عشري إلى نسخة مكافئة من فئة [Decimal](./) باستخدام موفر التنسيق المحدد. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | يحوّل تمثيل السلسلة لعدد عشري إلى نسخة مكافئة من فئة [Decimal](./) باستخدام النمط وموفر التنسيق المحددين. |
| static [Remainder](./remainder/)(const Decimal\&, const Decimal\&) | يحسب الباقي بعد قسمة قيمتين من نوع [Decimal](./). |
| static [Round](./round/)(const Decimal\&, MidpointRounding) | يقوم بتقريب القيمة المحددة إلى أقرب عدد صحيح. يحدد معلمة سلوك الدالة إذا كانت القيمة المحددة متساوية القرب من أقرب عددين. |
| static [Round](./round/)(const Decimal\&, int, MidpointRounding) | يقرب القيمة المحددة إلى أقرب قيمة بعدد الأرقام العشرية المحدد. يحدد معلمة سلوك الدالة إذا كانت القيمة المحددة متساوية القرب من أقرب عددين. |
| static [Subtract](./subtract/)(const Decimal\&, const Decimal\&) | يطرح قيمة [Decimal](./) محددة واحدة من أخرى. |
| static [ToByte](./tobyte/)(Decimal) | يحوّل قيمة [Decimal](./) إلى قيمة عدد صحيح غير موقع 8‑بت. |
| static [ToDouble](./todouble/)(Decimal) | يحوّل قيمة [Decimal](./) إلى عدد عائم بدقة مزدوجة. |
| static [ToInt16](./toint16/)(Decimal) | يحوّل قيمة [Decimal](./) إلى قيمة عدد صحيح موقع 16‑بت. |
| static [ToInt32](./toint32/)(Decimal) | يحوّل قيمة [Decimal](./) إلى قيمة عدد صحيح موقع 32‑بت. |
| static [ToInt64](./toint64/)(Decimal) | يحوّل قيمة [Decimal](./) إلى قيمة عدد صحيح موقع 64‑بت. |
| static [ToOACurrency](./tooacurrency/)(const Decimal\&) | [Convert](../convert/) القيمة [Decimal](./) المحددة إلى قيمة عملة OLE مكافئة. غير مُنفّذ. |
| static [ToSByte](./tosbyte/)(Decimal) | يحوّل قيمة [Decimal](./) إلى قيمة عدد صحيح موقّع 8‑بت. |
| static [ToSingle](./tosingle/)(Decimal) | يحوّل قيمة [Decimal](./) إلى عدد عائم بدقة مفردة. |
| [ToStdString](./tostdstring/)() const | يعيد نسخة من std::string تحتوي على تمثيل النص للقيمة التي يمثلها الكائن. |
| [ToString](./tostring/)() const | يعيد تمثيل النص للقيمة التي يمثلها الكائن. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | يحوّل الكائن الحالي إلى نص باستخدام معلومات التنسيق الخاصة بالثقافة. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const Decimal\&, std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | يحوّل الكائن الحالي إلى تمثيله النصي باستخدام تنسيق النص المحدد ومعلومات التنسيق الخاصة بالثقافة التي يوفرها الكائن [IFormatProvider](../iformatprovider/) المحدد. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToStringInternal](./tostringinternal/)() const | يعيد تمثيل النص للقيمة التي يمثلها الكائن. للاستخدام الداخلي. |
| static [ToUInt16](./touint16/)(Decimal) | يحوّل قيمة [Decimal](./) إلى قيمة عدد صحيح غير موقّع 16‑بت. |
| static [ToUInt32](./touint32/)(Decimal) | يحوّل قيمة [Decimal](./) إلى قيمة عدد صحيح غير موقّع 32‑بت. |
| static [ToUInt64](./touint64/)(Decimal) | يحوّل قيمة [Decimal](./) إلى قيمة عدد صحيح غير موقّع 64‑بت. |
| static [Truncate](./truncate/)(const Decimal\&) | يعيد الكائن [Decimal](./) الذي يمثل قيمة يكون الجزء الصحيح منها مساويًا للجزء الصحيح للقيمة التي يمثلها الكائن [Decimal](./) المحدد، مع حذف جميع الأجزاء العشرية. |
| static [TryParse](./tryparse/)(const String\&, Decimal\&) | يحوّل السلسلة المحددة التي تحتوي على تمثيل نصي لعدد إلى القيمة المكافئة من نوع [Decimal](./). |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) | يحوّل السلسلة المحددة التي تحتوي على تمثيل نصي لعدد إلى القيمة المكافئة من نوع [Decimal](./) باستخدام معلومات التنسيق والنمط الرقمي المقدمة. |
| static [Type](./type/)() | يعيد مرجعًا إلى الكائن [TypeInfo](../typeinfo/) الذي يمثل معلومات نوع فئة [Decimal](./). |
| [~Decimal](./~decimal/)() | المدمر. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [MaxValue](./maxvalue/) | يمثل أكبر عدد يمكن تمثيله بواسطة فئة [Decimal](./). |
| static [MinusOne](./minusone/) | يمثل العدد -1. |
| static [MinValue](./minvalue/) | يمثل أصغر عدد يمكن تمثيله بواسطة فئة [Decimal](./). |
| static [One](./one/) | يمثل العدد 1. |
| static [Zero](./zero/) | يمثل العدد 0. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [number_type](./number_type/) | اسم مستعار لـ Detail::decimal_number_type. |
## ملاحظات



```cpp
#include "system/console.h"
#include "system/decimal.h"

int main()
{
  using namespace System;

  Console::WriteLine(Decimal::MinValue);
  Console::WriteLine(Decimal::MaxValue);

  auto dividend = Decimal::One;
  auto divisor = 6;
  Console::WriteLine(dividend/divisor);

  return 0;
}
/*
This code example produces the following output:
-79228162514264337593543950335
79228162514264337593543950335
0,1666666666666666666666666667
*/
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
