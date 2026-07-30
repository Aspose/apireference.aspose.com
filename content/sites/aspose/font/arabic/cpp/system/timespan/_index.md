---
title: "System::TimeSpan class"
linktitle: "TimeSpan"
second_title: "Aspose.Font لـ C++"
description: "System::TimeSpan class. يمثل فترة زمنية. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً الفئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 6100
url: /ar/cpp/system/timespan/
---
## TimeSpan class


يمثل فترة زمنية. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً الفئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
class TimeSpan
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(TimeSpan) const | يرجع نسخة جديدة من الفئة [TimeSpan](./) التي تمثل فترة زمنية هي مجموع الفترات الزمنية التي تمثلها الكائنات الحالية والمحددة. |
| static [Compare](./compare/)(TimeSpan, TimeSpan) | يقارن كائنين من نوع [TimeSpan](./). |
| [CompareTo](./compareto/)(TimeSpan) const | يقارن الكائن الحالي والكائن المحدد. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | يقارن الكائن الحالي والكائن المحدد. |
| [Duration](./duration/)() const | يعيد نسخة جديدة من كائن [TimeSpan](./) تكون قيمتها القيمة المطلقة للكائن الحالي. |
| [Equals](./equals/)(TimeSpan) const | يحدد ما إذا كان الفاصل الزمني الممثل بواسطة الكائن الحالي يساوي الفاصل الزمني الممثل بواسطة الكائن المحدد. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | يحدد ما إذا كان الفاصل الزمني الممثل بواسطة الكائن الحالي يساوي الفاصل الزمني الممثل بواسطة الكائن المحدد. |
| static [Equals](./equals/)(TimeSpan, TimeSpan) | يعيد true إذا كان الكائنان المحددان يمثلان نفس الفاصل الزمني، وإلا - false. |
| static [FromDays](./fromdays/)(double) | يعيد كائنًا جديدًا من نوع [TimeSpan](./) يمثل الفاصل الزمني المحدد. |
| static [FromHours](./fromhours/)(double) | يعيد كائنًا جديدًا من نوع [TimeSpan](./) يمثل الفاصل الزمني المحدد. |
| static [FromMilliseconds](./frommilliseconds/)(double) | يعيد كائنًا جديدًا من نوع [TimeSpan](./) يمثل الفاصل الزمني المحدد. |
| static [FromMinutes](./fromminutes/)(double) | يعيد كائنًا جديدًا من نوع [TimeSpan](./) يمثل الفاصل الزمني المحدد. |
| static [FromSeconds](./fromseconds/)(double) | يعيد كائنًا جديدًا من نوع [TimeSpan](./) يمثل الفاصل الزمني المحدد. |
| static [FromTicks](./fromticks/)(int64_t) | يعيد كائنًا جديدًا من نوع [TimeSpan](./) يمثل الفاصل الزمني المحدد. |
| [get_Days](./get_days/)() const | يعيد مكوّن الأيام من الفاصل الزمني الممثل بواسطة كائن [TimeSpan](./) الحالي. |
| [get_Hours](./get_hours/)() const | يعيد مكوّن الساعات من الفاصل الزمني الممثل بواسطة كائن [TimeSpan](./) الحالي. |
| [get_Milliseconds](./get_milliseconds/)() const | يعيد مكوّن الملليثانية من الفاصل الزمني الممثل بواسطة كائن [TimeSpan](./) الحالي. |
| [get_Minutes](./get_minutes/)() const | يعيد مكوّن الدقائق من الفاصل الزمني الممثل بواسطة كائن [TimeSpan](./) الحالي. |
| [get_Seconds](./get_seconds/)() const | يعيد مكوّن الثواني من الفاصل الزمني الممثل بواسطة كائن [TimeSpan](./) الحالي. |
| [get_Ticks](./get_ticks/)() const | يعيد عدد فواصل 100 نانوثانية التي تشكل الفاصل الزمني الممثل بواسطة كائن [TimeSpan](./) الحالي. |
| [get_TotalDays](./get_totaldays/)() const | يعيد قيمة كائن [TimeSpan](./) الحالي معبرًا عنها بأيام كاملة وكسرية. |
| [get_TotalHours](./get_totalhours/)() const | يعيد قيمة كائن [TimeSpan](./) الحالي معبرًا عنها بساعات كاملة وكسرية. |
| [get_TotalMilliseconds](./get_totalmilliseconds/)() const | يعيد قيمة كائن [TimeSpan](./) الحالي معبرًا عنها بملليثوانٍ كاملة وكسرية. |
| [get_TotalMinutes](./get_totalminutes/)() const | يعيد قيمة كائن [TimeSpan](./) الحالي معبرًا عنها بدقائق كاملة وكسرية. |
| [get_TotalSeconds](./get_totalseconds/)() const | يعيد قيمة كائن [TimeSpan](./) الحالي معبرًا عنها بثوانٍ كاملة وكسرية. |
| [GetHashCode](./gethashcode/)() const | يعيد رمز تجزئة للكائن الحالي. |
| [IsNull](./isnull/)() const |  |
| [Negate](./negate/)() const | يعيد نسخة جديدة من كائن [TimeSpan](./) يمثل القيمة السالبة الممثلة بواسطة كائن [TimeSpan](./) الحالي. |
| [operator!=](./operator!=/)(TimeSpan) const | يحدد ما إذا كان الفاصل الزمني الممثل بواسطة الكائن الحالي ليس مساويًا للفاصل الزمني الممثل بواسطة الكائن المحدد. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | يرجع نسخة جديدة من الفئة [TimeSpan](./) التي تمثل فترة زمنية هي مجموع الفترات الزمنية التي تمثلها الكائنات الحالية والمحددة. |
| [operator+](./operator+/)() const | يعيد نفسه. |
| [operator+=](./operator+=/)(TimeSpan) | يُعيّن إلى الكائن الحالي الفاصل الزمني الذي هو مجموع الفاصل الزمني الممثل بواسطة الكائن الحالي والكائن المحدد. |
| [operator-](./operator-/)(TimeSpan) const | يعيد نسخة جديدة من فئة [TimeSpan](./) تمثل فاصلًا زمنيًا يكون نتيجة طرح الفاصل الزمني الممثل بواسطة الكائن المحدد من الفاصل الزمني الممثل بواسطة الكائن الحالي. |
| [operator-](./operator-/)() const | يعيد نسخة جديدة من كائن [TimeSpan](./) يمثل القيمة السالبة الممثلة بواسطة كائن [TimeSpan](./) الحالي. |
| [operator-=](./operator-=/)(TimeSpan) | يُعيّن إلى الكائن الحالي الفاصل الزمني الذي هو نتيجة طرح الفاصل الزمني الممثل بواسطة الكائن المحدد من الفاصل الزمني الممثل بواسطة الكائن الحالي. |
| [operator/](./operator//)(double) const |  |
| [operator/](./operator//)(TimeSpan) const |  |
| [operator/=](./operator/=/)(double) |  |
| [operator<](./operator_/)(TimeSpan) const | يحدد ما إذا كان الفاصل الزمني الممثل بواسطة الكائن الحالي أقصر من الفاصل الزمني الممثل بواسطة الكائن المحدد. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(TimeSpan) const | يحدد ما إذا كان الفاصل الزمني الممثل بواسطة الكائن الحالي أقصر من أو يساوي الفاصل الزمني الممثل بواسطة الكائن المحدد. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const TimeSpan\&) | يضبط الفاصل الزمني الممثل بواسطة كائن [TimeSpan](./) المحدد إلى كائن [TimeSpan](./) الحالي. |
| [operator==](./operator==/)(TimeSpan) const | يحدد ما إذا كان الفاصل الزمني الممثل بواسطة الكائن الحالي يساوي الفاصل الزمني الممثل بواسطة الكائن المحدد. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(TimeSpan) const | يحدد ما إذا كان الفاصل الزمني الممثل بواسطة الكائن الحالي أطول من الفاصل الزمني الممثل بواسطة الكائن المحدد. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(TimeSpan) const | يحدد ما إذا كان الفاصل الزمني الممثل بواسطة الكائن الحالي أطول من أو يساوي الفاصل الزمني الممثل بواسطة الكائن المحدد. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | يحوّل السلسلة إلى كائن [TimeSpan](./) مكافئ. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | يحوّل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام موفر الصيغة المحدد. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | يحوّل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام الصيغ المحددة، موفر الصيغة والأنماط. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | يحوّل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام الصيغة المحددة، موفر الصيغة والأنماط. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| [Subtract](./subtract/)(TimeSpan) const | يعيد نسخة جديدة من فئة [TimeSpan](./) تمثل فاصلًا زمنيًا يكون نتيجة طرح الفاصل الزمني الممثل بواسطة الكائن المحدد من الفاصل الزمني الممثل بواسطة الكائن الحالي. |
| [TimeSpan](./timespan/)() | ينشئ كائن [TimeSpan](./) يمثل فاصلًا زمنيًا صفريًا. |
| explicit [TimeSpan](./timespan/)(int64_t) | ينشئ مثيلًا من فئة [TimeSpan](./) يمثل الفاصل الزمني المحدد. |
| [TimeSpan](./timespan/)(int, int, int) | ينشئ مثيلًا من فئة [TimeSpan](./) يمثل الفاصل الزمني الذي يساوي مجموع عدد الساعات والدقائق والثواني المحددة. |
| [TimeSpan](./timespan/)(int, int, int, int, int) | ينشئ مثيلًا من فئة [TimeSpan](./) يمثل الفاصل الزمني الذي يساوي مجموع عدد الساعات والدقائق والثواني والميليثواني المحددة. |
| [TimeSpan](./timespan/)(const TimeSpan\&) | ينشئ كائن [TimeSpan](./) يمثل الفاصل الزمني المساوي للفاصل الزمني الممثل بواسطة كائن [TimeSpan](./) المحدد. |
| [ToString](./tostring/)() const | يعيد تمثيل السلسلة للفاصل الزمني الممثل بواسطة الكائن الحالي. |
| [ToString](./tostring/)(const String\&) const | يحوّل قيمة الكائن الحالي إلى تمثيل سلسلة مكافئ، باستخدام الصيغة المحددة. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | يحوّل قيمة الكائن الحالي إلى تمثيل سلسلة مكافئ، باستخدام الصيغة المحددة وموفر الصيغة. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| static [TryParse](./tryparse/)(const String\&, TimeSpan\&) | يحوّل السلسلة إلى كائن [TimeSpan](./) مكافئ ويعيد نتيجة التحويل. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | يحوّل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام موفر الصيغة المحدد ويعيد نتيجة التحويل. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | يحوّل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام الصيغ المحددة وموفر الصيغة، ويعيد نتيجة التحويل. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | يحوّل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام الصيغة المحددة، موفر الصيغة والأنماط، ويعيد نتيجة التحويل. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | يحوّل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام الصيغ المحددة، موفر الصيغة والأنماط، ويعيد نتيجة التحويل. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | يحوّل السلسلة إلى كائن [TimeSpan](./) مكافئ باستخدام الصيغة المحددة وموفر الصيغة، ويعيد نتيجة التحويل. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [Type](./type/)() | يعيد كائن [TypeInfo](../typeinfo/) يمثل بنية [TimeSpan](./). |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [MaxValue](./maxvalue/) | كائن [TimeSpan](./) الذي يمثل أطول فاصل زمني ممكن. |
| static [MinValue](./minvalue/) | /// كائن [TimeSpan](./) الذي يمثل أقصر فاصل زمني ممكن. |
| static constexpr [TicksPerDay](./ticksperday/) | عدد فواصل الـ 100 نانوثانية في اليوم (فاصل 24 ساعة). |
| static constexpr [TicksPerHour](./ticksperhour/) | عدد فواصل 100 نانوثانية في الساعة. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | عدد فواصل 100 نانوثانية في المللي ثانية. |
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
* Library [Aspose.Font for C++](../../)
