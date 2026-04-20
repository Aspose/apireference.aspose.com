---
title: "فئة System::DateTime"
linktitle: "DateTime"
second_title: "Aspose.Font لـ C++"
description: "فئة System::DateTime. تمثل قيمة تاريخ ووقت محددة على استمرارية الزمن. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 1600
url: /ar/cpp/system/datetime/
---
## DateTime class


تمثل قيمة تاريخ ووقت محددة على استمرارية الزمن. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
class DateTime
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(TimeSpan) const | إرجاع نسخة جديدة من فئة [DateTime](./) تمثل قيمة تاريخ ووقت ناتجة عن إضافة الفاصل الزمني المحدد إلى قيمة التاريخ والوقت التي يمثلها الكائن الحالي. |
| [AddDays](./adddays/)(double) const | إرجاع نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والعدد المحدد من الأيام. |
| [AddHours](./addhours/)(double) const | إرجاع نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والعدد المحدد من الساعات. |
| [AddMilliseconds](./addmilliseconds/)(double) const | إرجاع نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والعدد المحدد من الملليثواني. |
| [AddMinutes](./addminutes/)(double) const | إرجاع نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والعدد المحدد من الدقائق. |
| [AddMonths](./addmonths/)(int) const | إرجاع نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والعدد المحدد من الشهور. |
| [AddSeconds](./addseconds/)(double) const | إرجاع نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والعدد المحدد من الثواني. |
| [AddTicks](./addticks/)(int64_t) const | إرجاع نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والعدد المحدد من فواصل 100 نانوثانية. |
| [AddYears](./addyears/)(int) const | إرجاع نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي تساوي تلك التي يمثلها الكائن الحالي مع زيادة مكوّن السنة بالعدد المحدد. |
| static [Compare](./compare/)(DateTime, DateTime) | يقارن قيمتين تم تمثيلهما بواسطة النسختين المحددتين من فئة [DateTime](./) ويعيد القيمة التي تشير إلى المواضع النسبية للقيم على خط الزمن. |
| [CompareTo](./compareto/)(DateTime) const | يقارن قيمتي تاريخ ووقت تم تمثيلهما بواسطة الكائن الحالي والنسخة المحددة من فئة [DateTime](./) ويعيد القيمة التي تشير إلى المواضع النسبية للقيم على خط الزمن. |
| [DateTime](./datetime/)() | ينشئ نسخة تمثل أصغر قيمة تاريخ ووقت ممكنة مساوية لـ MinValue. |
| [DateTime](./datetime/)(int, int, int) | ينشئ مثيلاً يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم معينين. |
| [DateTime](./datetime/)(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | ينشئ مثيلاً يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم معينين في التقويم المحدد. |
| [DateTime](./datetime/)(int, int, int, int, int, int) | ينشئ مثيلاً يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية معينة. |
| [DateTime](./datetime/)(int, int, int, int, int, int, DateTimeKind) | ينشئ مثيلاً يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية معينة. |
| [DateTime](./datetime/)(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | ينشئ مثيلاً يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية معينة في التقويم المحدد. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, DateTimeKind) | ينشئ مثيلاً يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية وملي ثانية معينة. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) | ينشئ مثيلاً يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية وملي ثانية معينة في التقويم المحدد. |
| [DateTime](./datetime/)(int64_t, DateTimeKind) | أنشئ مثيلاً يمثل قيمة تاريخ ووقت محددة كعدد من النبضات. |
| [DateTime](./datetime/)(int64_t, DateTimeKind, bool) | أنشئ مثيلاً يمثل قيمة تاريخ ووقت محددة كعدد من النبضات. للاستخدام الداخلي. |
| [DateTime](./datetime/)(const DateTime\&) | ينشئ نسخة من مثيل. |
| static [DaysInMonth](./daysinmonth/)(int, int) | يعيد عدد الأيام في الشهر المحدد من السنة المحددة. |
| static [Equals](./equals/)(DateTime, DateTime) | يحدد ما إذا كانت المثيلات المحددة من الفئة [DateTime](./) تمثل نفس قيمة التاريخ والوقت. |
| [Equals](./equals/)(DateTime) const | يحدد ما إذا كانت المثيلة المحددة من الفئة [DateTime](./) تمثل نفس قيمة التاريخ والوقت مثل الكائن الحالي. |
| static [FromBinary](./frombinary/)(int64_t) | يفك تسلسل قيمة التاريخ والوقت من العدد غير الموقّع 64‑بت المحدد ويعيّن المثيل الجديد من الفئة [DateTime](./) إلى تلك القيمة. |
| static [FromFileTime](./fromfiletime/)(int64_t) | يحوّل وقت الملف المحدد إلى مثيل من الفئة [DateTime](./) يمثل نفس قيمة التاريخ والوقت كوقت محلي. |
| static [FromFileTimeUtc](./fromfiletimeutc/)(int64_t) | يحوّل وقت الملف المحدد إلى مثيل من الفئة [DateTime](./) يمثل نفس قيمة التاريخ والوقت كوقت UTC. |
| static [FromOADate](./fromoadate/)(double) | يعيد مثيلاً من الفئة [DateTime](./) يمثل قيمة التاريخ والوقت المكافئة لتاريخ OLE Automation المحدد. |
| static [FromUnixTime](./fromunixtime/)(time_t) | يحوّل قيمة وقت Unix المحددة إلى مثيل من الفئة [DateTime](./). للاستخدام الداخلي. |
| [get_Date](./get_date/)() const | يعيد مثيلاً جديداً من الفئة [DateTime](./) يمثل جزء التاريخ من التاريخ والوقت الممثلين بواسطة الكائن الحالي مع ضبط كل مكوّن من جزء الوقت إلى 0. |
| [get_Day](./get_day/)() const | يعيد الرقم الترتيبي لليوم في الشهر الممثل بواسطة الكائن الحالي. |
| [get_DayOfWeek](./get_dayofweek/)() const | يعيد قيمة تمثل يوم الأسبوع الممثل بواسطة الكائن الحالي. |
| [get_DayOfYear](./get_dayofyear/)() const | يعيد الرقم الترتيبي لليوم في السنة الممثلة بواسطة الكائن الحالي. |
| [get_Hour](./get_hour/)() const | يعيد مكوّن الساعة من قيمة التاريخ والوقت الممثلة بواسطة الكائن الحالي. |
| [get_Kind](./get_kind/)() const | يعيد القيمة التي تمثل ما إذا كان التاريخ والوقت الممثلان بواسطة الكائن الحالي تاريخًا ووقتًا محليًا أو UTC أو لا شيء منهما. |
| [get_Millisecond](./get_millisecond/)() const | يعيد مكوّن الملي ثانية من قيمة التاريخ والوقت الممثلة بواسطة الكائن الحالي. |
| [get_Minute](./get_minute/)() const | يعيد مكوّن الدقيقة من قيمة التاريخ والوقت الممثلة بواسطة الكائن الحالي. |
| [get_Month](./get_month/)() const | يعيد الرقم الترتيبي للشهر في السنة التي يمثلها الكائن الحالي. |
| static [get_Now](./get_now/)() | يعيد نسخة من فئة [DateTime](./) تمثل الوقت الحالي كوقت محلي. |
| [get_Second](./get_second/)() const | يعيد مكوّن الثواني لقيمة التاريخ والوقت التي يمثلها الكائن الحالي. |
| [get_Ticks](./get_ticks/)() const | يعيد عدد الفواصل الزمنية التي تبلغ 100 نانوثانية منذ 0:00:00 بتوقيت UTC، 1 يناير 0001، في التقويم الميلادي حتى التاريخ والوقت الذي يمثله الكائن الحالي. |
| [get_TimeOfDay](./get_timeofday/)() const | يعيد القيمة التي تمثل الفاصل الزمني من بداية اليوم الذي يمثله الكائن الحالي حتى قيمة التاريخ والوقت التي يمثلها الكائن الحالي. |
| static [get_Today](./get_today/)() | يعيد نسخة من فئة [DateTime](./) تمثل التاريخ الحالي مع ضبط كل مكوّن من جزء الوقت للقيمة التي يمثلها الكائن إلى 0. |
| static [get_UtcNow](./get_utcnow/)() | يعيد نسخة من فئة [DateTime](./) تمثل الوقت الحالي بتوقيت UTC. |
| [get_Year](./get_year/)() const | يعيد السنة التي يمثلها الكائن الحالي. |
| [GetDateComponents](./getdatecomponents/)(int\&, int\&, int\&) const | يحصل على أجزاء التاريخ. للاستخدام الداخلي. |
| [GetDateTimeFormats](./getdatetimeformats/)() const | يعيد مصفوفة من السلاسل حيث يكون كل عنصر هو تمثيل نصي للكائن الحالي مُنسّق بأحد محددات تنسيق التاريخ والوقت القياسية. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t) const | يعيد مصفوفة من السلاسل حيث يكون كل عنصر هو تمثيل نصي للكائن الحالي مُنسّق بالمحدد القياسي المحدد لتنسيق التاريخ والوقت. |
| [GetDateTimeFormats](./getdatetimeformats/)(const SharedPtr\<IFormatProvider\>\&) const | يعيد مصفوفة من السلاسل حيث يكون كل عنصر هو تمثيل نصي للكائن الحالي مُنسّق بأحد محددات تنسيق التاريخ والوقت القياسية ومزود التنسيق المحدد. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t, const SharedPtr\<IFormatProvider\>\&) const | يعيد مصفوفة من السلاسل حيث يكون كل عنصر هو تمثيل نصي للكائن الحالي مُنسّق بالمحدد القياسي المحدد لتنسيق التاريخ والوقت ومزود التنسيق. |
| [GetHashCode](./gethashcode/)() const | يعيد رمز تجزئة للكائن الحالي. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)() const | يحدد ما إذا كانت قيمة التاريخ والوقت التي يمثلها الكائن الحالي تقع ضمن نطاق التوقيت الصيفي للمنطقة الزمنية الحالية. |
| static [IsLeapYear](./isleapyear/)(int) | يحدد ما إذا كانت السنة المحددة سنة كبيسة. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(DateTime) const | يحدد ما إذا كان الكائن الحالي والكائن [DateTime](./) المحدد يمثلان قيم تاريخ ووقت مختلفة. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | يعيد نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والفترة الزمنية المحددة. |
| [operator+=](./operator+=/)(TimeSpan) | يضبط الكائن الحالي على قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والفترة الزمنية المحددة. |
| [operator-](./operator-/)(TimeSpan) const | يعيد نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي هي نتيجة طرح الفترة الزمنية المحددة من القيمة التي يمثلها الكائن الحالي. |
| [operator-](./operator-/)(DateTime) const | يعيد مثيلاً من الفئة [TimeSpan](../timespan/) التي تمثل الفاصل الزمني بين قيم التاريخ والوقت التي يمثلها الكائنان الحالي والمحدد. |
| [operator-=](./operator-=/)(TimeSpan) | يضبط الكائن الحالي على قيمة التاريخ والوقت التي هي نتيجة طرح الفترة الزمنية المحددة من قيمة التاريخ والوقت التي يمثلها الكائن الحالي. |
| [operator<](./operator_/)(DateTime) const | يحدد ما إذا كان الكائن الحالي يمثل قيمة التاريخ والوقت التي هي أسبق من القيمة التي يمثلها الكائن [DateTime](./) المحدد. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(DateTime) const | يحدد ما إذا كان الكائن الحالي يمثل قيمة التاريخ والوقت التي هي أسبق أو مساوية للقيمة التي يمثلها الكائن [DateTime](./) المحدد. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const DateTime\&) | يعين القيمة التي يمثلها الكائن [DateTime](./) المحدد إلى الكائن الحالي. |
| [operator==](./operator==/)(DateTime) const | يحدد ما إذا كان الكائن الحالي والكائن [DateTime](./) المحدد يمثلان نفس قيمة التاريخ والوقت. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(DateTime) const | يحدد ما إذا كان الكائن الحالي يمثل قيمة التاريخ والوقت التي هي لاحقة للقيمة التي يمثلها الكائن [DateTime](./) المحدد. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(DateTime) const | يحدد ما إذا كان الكائن الحالي يمثل قيمة التاريخ والوقت التي تكون لاحقة أو مساوية للقيمة التي يمثلها كائن [DateTime](./) المحدد. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | يحوّل تمثيل السلسلة المحدد لقيمة التاريخ والوقت إلى كائن [DateTime](./) المكافئ. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | يحوّل تمثيل السلسلة المحدد لقيمة التاريخ والوقت إلى كائن [DateTime](./) المكافئ باستخدام معلومات تنسيق خاصة بالثقافة. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | يحوّل تمثيل السلسلة المحدد لقيمة التاريخ والوقت إلى كائن [DateTime](./) المكافئ باستخدام التنسيق المحدد ومعلومات تنسيق خاصة بالثقافة. يجب أن يتطابق تنسيق تمثيل السلسلة مع التنسيق المحدد تمامًا. يُطلق استثناءً إذا فشل التحويل. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | يحوّل تمثيل السلسلة المحدد لقيمة التاريخ والوقت إلى كائن [DateTime](./) المكافئ باستخدام التنسيقات المحددة ومعلومات تنسيق خاصة بالثقافة والنمط. يجب أن يتطابق تنسيق تمثيل السلسلة مع أحد أو أكثر من التنسيقات المحددة تمامًا. يُطلق استثناءً إذا فشل التحويل. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [SpecifyKind](./specifykind/)(DateTime, DateTimeKind) | ينشئ كائنًا جديدًا من نوع [DateTime](./) يمثل نفس عدد الـ ticks كما في كائن [DateTime](./) المحدد ويمثل الوقت المحلي أو وقت UTC أو لا شيء حسب ما يحدده الوسيط **kind**. |
| [Subtract](./subtract/)(TimeSpan) const | يعيد نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي هي نتيجة طرح الفترة الزمنية المحددة من القيمة التي يمثلها الكائن الحالي. |
| [Subtract](./subtract/)(DateTime) const | يرجع نسخة من فئة [TimeSpan](../timespan/) تمثل الفاصل الزمني بين قيم التاريخ والوقت التي يمثلها الكائن الحالي والكائن المحدد. |
| [ToBinary](./tobinary/)() const | يسلسل الكائن الحالي. |
| [ToFileTime](./tofiletime/)() const | يرجع قيمة تمثل قيمة التاريخ والوقت التي يمثلها الكائن الحالي كوقت ملف. |
| [ToFileTimeUtc](./tofiletimeutc/)() const | يحوّل قيمة التاريخ والوقت التي يمثلها الكائن الحالي إلى وقت ملف UTC. |
| [ToLocalTime](./tolocaltime/)() const | يرجع نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي يمثلها الكائن الحالي كوقت محلي. |
| [ToLongDateString](./tolongdatestring/)() const | يرجع سلسلة تحتوي على تمثيل تاريخ طويل للكائن الحالي. |
| [ToLongTimeString](./tolongtimestring/)() const | يرجع سلسلة تحتوي على تمثيل وقت طويل للكائن الحالي. |
| [ToOADate](./tooadate/)() const | يرجع قيمة التاريخ والوقت التي يمثلها الكائن الحالي كـ OLE Automation Date. |
| [ToShortDateString](./toshortdatestring/)() const | يرجع سلسلة تحتوي على تمثيل تاريخ قصير للكائن الحالي. |
| [ToShortTimeString](./toshorttimestring/)() const | يرجع سلسلة تحتوي على تمثيل وقت قصير للكائن الحالي. |
| [ToString](./tostring/)() const | يرجع تمثيل السلسلة لقيمة التاريخ والوقت التي يمثلها الكائن الحالي باستخدام قواعد التنسيق المحددة من قبل الثقافة الحالية. |
| [ToString](./tostring/)(const String\&) const | يرجع تمثيلًا نصيًا لقيمة التاريخ والوقت التي يمثلها الكائن الحالي باستخدام التنسيق المحدد وقواعد التنسيق المحددة من قبل الثقافة الحالية. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | يرجع تمثيلًا نصيًا لقيمة التاريخ والوقت التي يمثلها الكائن الحالي باستخدام معلومات التنسيق المحددة. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | يرجع تمثيلًا نصيًا لقيمة التاريخ والوقت التي يمثلها الكائن الحالي باستخدام معلومات التنسيق المحددة. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToUniversalTime](./touniversaltime/)() const | يرجع نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي يمثلها الكائن الحالي كوقت UTC. |
| [ToUnixTime](./tounixtime/)() const | يرجع قيمة تمثل قيمة التاريخ والوقت التي يمثلها الكائن الحالي كوقت Unix. للاستخدام الداخلي. |
| static [TryParse](./tryparse/)(const String\&, DateTime\&) | يحوّل تمثيل السلسلة المحدد لقيمة التاريخ والوقت إلى كائن [DateTime](./) المكافئ. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | يحوّل تمثيل السلسلة المحدد لقيمة التاريخ والوقت إلى كائن [DateTime](./) المكافئ باستخدام معلومات تنسيق خاصة بالثقافة المحددة والنمط. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | يحوّل تمثيل السلسلة المحدد لقيمة التاريخ والوقت إلى كائن [DateTime](./) المكافئ باستخدام التنسيق المحدد ومعلومات تنسيق خاصة بالثقافة والنمط. يجب أن يتطابق تنسيق تمثيل السلسلة مع التنسيق المحدد تمامًا. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | يحوّل تمثيل السلسلة المحدد لقيمة التاريخ والوقت إلى كائن [DateTime](./) المكافئ باستخدام التنسيقات المحددة ومعلومات تنسيق خاصة بالثقافة والنمط. يجب أن يتطابق تنسيق تمثيل السلسلة مع أحد أو أكثر من التنسيقات المحددة تمامًا. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [Type](./type/)() | يرجع كائنًا من نوع [TypeInfo](../typeinfo/) يحتوي على معلومات حول هذه الفئة. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [MaxTicks](./maxticks/) | عدد الـ 100 نانوثانية في الفاصل الزمني بين القيمة الدنيا الممكنة والقيمة العليا الممكنة لـ [DateTime](./). |
| static [MaxValue](./maxvalue/) | مثال من فئة [DateTime](./) يمثل القيمة العليا الممكنة للتاريخ والوقت. |
| static constexpr [MinTicks](./minticks/) | الحد الأدنى لعدد الـ ticks التي يمكن أن يمثلها مثال من فئة [DateTime](./). |
| static [MinValue](./minvalue/) | مثال من فئة [DateTime](./) يمثل القيمة الدنيا الممكنة للتاريخ والوقت. |
| static constexpr [TicksPerDay](./ticksperday/) | عدد الـ ticks في اليوم. |
| static constexpr [TicksPerHour](./ticksperhour/) | عدد الـ ticks في الساعة. |
| static constexpr [TicksPerMicrosecond](./tickspermicrosecond/) | عدد الـ ticks في الميكروثانية. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | عدد الـ ticks في المليثانية. |
| static constexpr [TicksPerMinute](./ticksperminute/) | عدد الـ ticks في الدقيقة. |
| static constexpr [TicksPerSecond](./tickspersecond/) | عدد الـ ticks في الثانية. |
| static [UnixEpoch](./unixepoch/) | مثال من فئة [DateTime](./) يمثل بداية حقبة يونكس (1970.01.01 00:00:00). |
## ملاحظات



```cpp
#include "system/console.h"
#include "system/date_time.h"

int main()
{
  using namespace System;

  // إنشاء مثال فئة 'DateTime'.
  DateTime dateTime{1990, 10, 30};

  // طباعة المثال بأشكال متعددة.
  Console::WriteLine(dateTime.ToShortDateString());
  Console::WriteLine(dateTime.ToShortTimeString());
  Console::WriteLine(dateTime.ToString());

  return 0;
}
/*
This code example produces the following output:
30.10.1990
0:00
30.10.1990 0:00:00
*/
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
