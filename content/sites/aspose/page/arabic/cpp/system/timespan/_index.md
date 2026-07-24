---
title: "الفئة System::TimeSpan"
linktitle: "TimeSpan"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::TimeSpan. تمثل فترة زمنية. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا الفئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 6100
url: /ar/cpp/system/timespan/
---
## TimeSpan class


تمثل فترة زمنية. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبدًا الفئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
class TimeSpan
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(TimeSpan) const | يعيد نسخة جديدة من الفئة [TimeSpan](./) التي تمثل فترة زمنية هي مجموع الفترات الزمنية التي تمثلها الكائنات الحالية والمحددة. |
| static [Compare](./compare/)(TimeSpan, TimeSpan) | يقارن كائنين من نوع [TimeSpan](./). |
| [CompareTo](./compareto/)(TimeSpan) const | يقارن الكائن الحالي بالكائن المحدد. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | يقارن الكائن الحالي بالكائن المحدد. |
| [Duration](./duration/)() const | يعيد نسخة جديدة من كائن [TimeSpan](./) تكون قيمتها القيمة المطلقة للكائن الحالي. |
| [Equals](./equals/)(TimeSpan) const | يحدد ما إذا كان الفاصل الزمني الممثّل بواسطة الكائن الحالي يساوي الفاصل الزمني الممثّل بواسطة الكائن المحدد. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | يحدد ما إذا كان الفاصل الزمني الممثّل بواسطة الكائن الحالي يساوي الفاصل الزمني الممثّل بواسطة الكائن المحدد. |
| static [Equals](./equals/)(TimeSpan, TimeSpan) | يعيد true إذا كان الكائنان المحددان يمثلان نفس الفاصل الزمني، وإلا - false. |
| static [FromDays](./fromdays/)(double) | يعيد كائن [TimeSpan](./) جديد يمثل الفاصل المحدد. |
| static [FromHours](./fromhours/)(double) | يعيد كائن [TimeSpan](./) جديد يمثل الفاصل المحدد. |
| static [FromMilliseconds](./frommilliseconds/)(double) | يعيد كائن [TimeSpan](./) جديد يمثل الفاصل المحدد. |
| static [FromMinutes](./fromminutes/)(double) | يعيد كائن [TimeSpan](./) جديد يمثل الفاصل المحدد. |
| static [FromSeconds](./fromseconds/)(double) | يعيد كائن [TimeSpan](./) جديد يمثل الفاصل المحدد. |
| static [FromTicks](./fromticks/)(int64_t) | يعيد كائن [TimeSpan](./) جديد يمثل الفاصل المحدد. |
| [get_Days](./get_days/)() const | يعيد مكوّن الأيام للفاصل الزمني الممثّل بواسطة كائن [TimeSpan](./) الحالي. |
| [get_Hours](./get_hours/)() const | يعيد مكوّن الساعات للفاصل الزمني الممثّل بواسطة كائن [TimeSpan](./) الحالي. |
| [get_Milliseconds](./get_milliseconds/)() const | يعيد مكوّن الملليثانية للفاصل الزمني الممثّل بواسطة كائن [TimeSpan](./) الحالي. |
| [get_Minutes](./get_minutes/)() const | يعيد مكوّن الدقائق للفاصل الزمني الممثّل بواسطة كائن [TimeSpan](./) الحالي. |
| [get_Seconds](./get_seconds/)() const | يعيد مكوّن الثواني للفاصل الزمني الممثّل بواسطة كائن [TimeSpan](./) الحالي. |
| [get_Ticks](./get_ticks/)() const | يعيد عدد فواصل 100 نانوثانية التي تشكّل الفاصل الزمني الممثّل بواسطة كائن [TimeSpan](./) الحالي. |
| [get_TotalDays](./get_totaldays/)() const | يعيد قيمة كائن [TimeSpan](./) الحالي معبرًا عنها بأيام كاملة وكسرية. |
| [get_TotalHours](./get_totalhours/)() const | يعيد قيمة كائن [TimeSpan](./) الحالي معبرًا عنها بساعات كاملة وكسرية. |
| [get_TotalMilliseconds](./get_totalmilliseconds/)() const | يعيد قيمة كائن [TimeSpan](./) الحالي معبرًا عنها بملليثوانٍ كاملة وكسرية. |
| [get_TotalMinutes](./get_totalminutes/)() const | يعيد قيمة كائن [TimeSpan](./) الحالي معبرًا عنها بدقائق كاملة وكسرية. |
| [get_TotalSeconds](./get_totalseconds/)() const | يعيد قيمة كائن [TimeSpan](./) الحالي معبرًا عنها بثوانٍ كاملة وكسرية. |
| [GetHashCode](./gethashcode/)() const | يعيد رمز تجزئة للكائن الحالي. |
| [IsNull](./isnull/)() const |  |
| [Negate](./negate/)() const | يعيد نسخة جديدة من كائن [TimeSpan](./) يمثل القيمة السالبة التي يمثلها كائن [TimeSpan](./) الحالي. |
| [operator!=](./operator!=/)(TimeSpan) const | يحدد ما إذا كان الفاصل الزمني الممثّل بواسطة الكائن الحالي غير مساوي للفاصل الزمني الممثّل بواسطة الكائن المحدد. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | يعيد نسخة جديدة من الفئة [TimeSpan](./) التي تمثل فترة زمنية هي مجموع الفترات الزمنية التي تمثلها الكائنات الحالية والمحددة. |
| [operator+](./operator+/)() const | يعيد نفسه. |
| [operator+=](./operator+=/)(TimeSpan) | يعيّن للكائن الحالي الفاصل الزمني الذي هو مجموع الفاصل الزمني الممثّل بواسطة الكائنين الحالي والمحدد. |
| [operator-](./operator-/)(TimeSpan) const | يعيد نسخة جديدة من فئة [TimeSpan](./) تمثّل فاصلًا زمنيًا هو نتيجة طرح الفاصل الزمني الممثّل بواسطة الكائن المحدد من الفاصل الزمني الممثّل بواسطة الكائن الحالي. |
| [operator-](./operator-/)() const | يعيد نسخة جديدة من كائن [TimeSpan](./) يمثل القيمة السالبة التي يمثلها كائن [TimeSpan](./) الحالي. |
| [operator-=](./operator-=/)(TimeSpan) | يعيّن للكائن الحالي الفاصل الزمني الذي هو نتيجة طرح الفاصل الزمني الممثّل بواسطة الكائن المحدد من الفاصل الزمني الممثّل بواسطة الكائن الحالي. |
| [operator/](./operator//)(double) const |  |
| [operator/](./operator//)(TimeSpan) const |  |
| [operator/=](./operator/=/)(double) |  |
| [operator<](./operator_/)(TimeSpan) const | يحدد ما إذا كان الفاصل الزمني الممثّل بواسطة الكائن الحالي أقصر من الفاصل الزمني الممثّل بواسطة الكائن المحدد. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(TimeSpan) const | يحدد ما إذا كان الفاصل الزمني الممثّل بواسطة الكائن الحالي أقصر من أو يساوي الفاصل الزمني الممثّل بواسطة الكائن المحدد. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const TimeSpan\&) | يضبط الفاصل الزمني الممثّل بواسطة كائن [TimeSpan](./) المحدد إلى كائن [TimeSpan](./) الحالي. |
| [operator==](./operator==/)(TimeSpan) const | يحدد ما إذا كان الفاصل الزمني الممثّل بواسطة الكائن الحالي يساوي الفاصل الزمني الممثّل بواسطة الكائن المحدد. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(TimeSpan) const | يحدد ما إذا كان الفاصل الزمني الممثّل بواسطة الكائن الحالي أطول من الفاصل الزمني الممثّل بواسطة الكائن المحدد. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(TimeSpan) const | يحدد ما إذا كانت فترة الوقت التي يمثلها الكائن الحالي أطول من أو مساوية لفترة الوقت التي يمثلها الكائن المحدد. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | يقوم بتحويل السلسلة إلى كائن [TimeSpan](./) مكافئ. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | يقوم بتحويل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام موفر التنسيق المحدد. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | يقوم بتحويل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام الصيغ المحددة، موفر التنسيق والأنماط. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | يقوم بتحويل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام التنسيق المحدد، موفر التنسيق والأنماط. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| [Subtract](./subtract/)(TimeSpan) const | يعيد نسخة جديدة من فئة [TimeSpan](./) تمثّل فاصلًا زمنيًا هو نتيجة طرح الفاصل الزمني الممثّل بواسطة الكائن المحدد من الفاصل الزمني الممثّل بواسطة الكائن الحالي. |
| [TimeSpan](./timespan/)() | ينشئ كائن [TimeSpan](./) يمثل فترة زمنية صفرية. |
| explicit [TimeSpan](./timespan/)(int64_t) | ينشئ مثيلاً من فئة [TimeSpan](./) يمثل الفترة الزمنية المحددة. |
| [TimeSpan](./timespan/)(int, int, int) | ينشئ مثيلاً من فئة [TimeSpan](./) يمثل فترة زمنية تساوي مجموع عدد الساعات والدقائق والثواني المحددة. |
| [TimeSpan](./timespan/)(int, int, int, int, int) | ينشئ مثيلاً من فئة [TimeSpan](./) يمثل فترة زمنية تساوي مجموع عدد الساعات والدقائق والثواني والمللي ثانية المحددة. |
| [TimeSpan](./timespan/)(const TimeSpan\&) | ينشئ كائن [TimeSpan](./) يمثل فترة زمنية مساوية للفترة الزمنية التي يمثلها كائن [TimeSpan](./) المحدد. |
| [ToString](./tostring/)() const | يعيد تمثيل السلسلة للفترة الزمنية التي يمثلها الكائن الحالي. |
| [ToString](./tostring/)(const String\&) const | يقوم بتحويل قيمة الكائن الحالي إلى تمثيل سلسلة مكافئ، باستخدام التنسيق المحدد. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | يقوم بتحويل قيمة الكائن الحالي إلى تمثيل سلسلة مكافئ، باستخدام التنسيق المحدد وموفر التنسيق. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| static [TryParse](./tryparse/)(const String\&, TimeSpan\&) | يقوم بتحويل السلسلة إلى كائن [TimeSpan](./) مكافئ ويعيد نتيجة التحويل. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | يقوم بتحويل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام موفر التنسيق المحدد ويعيد نتيجة التحويل. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | يقوم بتحويل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام الصيغ المحددة وموفر التنسيق، ويعيد نتيجة التحويل. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | يقوم بتحويل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام التنسيق المحدد، موفر التنسيق والأنماط، ويعيد نتيجة التحويل. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | يقوم بتحويل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام الصيغ المحددة، موفر التنسيق والأنماط، ويعيد نتيجة التحويل. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | يقوم بتحويل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام التنسيق المحدد وموفر التنسيق، ويعيد نتيجة التحويل. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [Type](./type/)() | يعيد كائن [TypeInfo](../typeinfo/) يمثل بنية [TimeSpan](./). |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [MaxValue](./maxvalue/) | كائن [TimeSpan](./) الذي يمثل أطول فترة ممكنة. |
| static [MinValue](./minvalue/) | /// كائن [TimeSpan](./) الذي يمثل أقصر فترة ممكنة. |
| static constexpr [TicksPerDay](./ticksperday/) | عدد فترات 100 نانوثانية في اليوم (فترة 24 ساعة). |
| static constexpr [TicksPerHour](./ticksperhour/) | عدد فترات 100 نانوثانية في الساعة. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | عدد فترات 100 نانوثانية في المللي ثانية. |
| static constexpr [TicksPerMinute](./ticksperminute/) | عدد فواصل 100 نانوثانية في الدقيقة. |
| static constexpr [TicksPerSecond](./tickspersecond/) | عدد فواصل 100 نانوثانية في الثانية. |
| static [Zero](./zero/) | الكائن [TimeSpan](./) الذي يمثل الفاصل الصفري. |
## ملاحظات



```cpp
#include "system/datetime.h"
#include "system/timespan.h"
#include <iostream>

int main()
{
  const auto date1 = System::DateTime(2021, 01, 01);
  const auto date2 = System::DateTime(2021, 10, 30);

  const auto interval = date2 - date1;

  std::cout << "Number of ticks: " << interval.get_Ticks() << std::endl;
  std::cout << "Number of milliseconds: " << interval.get_Milliseconds() << std::endl;
  std::cout << "Total number of milliseconds: " << interval.get_TotalMilliseconds() << std::endl;
  std::cout << "Number of minutes: " << interval.get_Minutes() << std::endl;
  std::cout << "Total number of minutes: " << interval.get_TotalMinutes() << std::endl;
  std::cout << "Number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Total number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Number of days: " << interval.get_Days() << std::endl;
  std::cout << "Total number of days: " << interval.get_TotalDays() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Number of ticks: 260928000000000
Number of milliseconds: 0
Total number of milliseconds: 2.60928e+10
Number of minutes: 0
Total number of minutes: 434880
Number of hours: 0
Total number of hours: 0
Number of days: 302
Total number of days: 302
*/
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
