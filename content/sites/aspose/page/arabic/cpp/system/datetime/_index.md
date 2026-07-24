---
title: "فئة System::DateTime"
linktitle: "DateTime"
second_title: "Aspose.Page لـ C++"
description: "فئة System::DateTime. تمثّل قيمة تاريخ ووقت محددة على استمرارية الزمن. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة System::SmartPtr لإدارة كائنات هذا النوع في C++."
type: docs
weight: 1600
url: /ar/cpp/system/datetime/
---
## DateTime class


تمثّل قيمة تاريخ ووقت محددة على استمرارية الزمن. يجب تخصيص هذا النوع على المكدس وتمريره إلى الدوال بالقيمة أو بالمرجع. لا تستخدم أبداً فئة [System::SmartPtr](../smartptr/) لإدارة كائنات هذا النوع.

```cpp
class DateTime
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(TimeSpan) const | يرجع نسخة جديدة من فئة [DateTime](./) تمثّل قيمة تاريخ ووقت ناتجة عن إضافة الفاصل الزمني المحدد إلى قيمة التاريخ والوقت التي يمثلها الكائن الحالي. |
| [AddDays](./adddays/)(double) const | يرجع نسخة جديدة من فئة [DateTime](./) تمثّل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والعدد المحدد من الأيام. |
| [AddHours](./addhours/)(double) const | يرجع نسخة جديدة من فئة [DateTime](./) تمثّل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والعدد المحدد من الساعات. |
| [AddMilliseconds](./addmilliseconds/)(double) const | يرجع نسخة جديدة من فئة [DateTime](./) تمثّل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والعدد المحدد من المللي ثانية. |
| [AddMinutes](./addminutes/)(double) const | يرجع نسخة جديدة من فئة [DateTime](./) تمثّل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والعدد المحدد من الدقائق. |
| [AddMonths](./addmonths/)(int) const | يرجع نسخة جديدة من فئة [DateTime](./) تمثّل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والعدد المحدد من الشهور. |
| [AddSeconds](./addseconds/)(double) const | يرجع نسخة جديدة من فئة [DateTime](./) تمثّل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والعدد المحدد من الثواني. |
| [AddTicks](./addticks/)(int64_t) const | يرجع نسخة جديدة من فئة [DateTime](./) تمثّل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والعدد المحدد من فواصل 100 نانوثانية. |
| [AddYears](./addyears/)(int) const | يرجع نسخة جديدة من فئة [DateTime](./) تمثّل قيمة التاريخ والوقت التي تساوي القيمة التي يمثلها الكائن الحالي مع زيادة جزء السنة بالعدد المحدد. |
| static [Compare](./compare/)(DateTime, DateTime) | يقارن قيمتين تم تمثيلهما بواسطة النسخ المحددة من فئة [DateTime](./) ويعيد القيمة التي تشير إلى المواقع النسبية للقيم على خط الزمن. |
| [CompareTo](./compareto/)(DateTime) const | يقارن قيمتي تاريخ ووقت تم تمثيلهما بواسطة الكائن الحالي والنسخة المحددة من فئة [DateTime](./) ويعيد القيمة التي تشير إلى المواقع النسبية للقيم على خط الزمن. |
| [DateTime](./datetime/)() | ينشئ نسخة تمثّل أصغر قيمة تاريخ ووقت ممكنة تساوي MinValue. |
| [DateTime](./datetime/)(int, int, int) | ينشئ نسخة تمثّل قيمة تاريخ ووقت محددة كسنة وشهر ويوم معينين. |
| [DateTime](./datetime/)(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | ينشئ نسخة تمثّل قيمة تاريخ ووقت محددة كسنة وشهر ويوم معينين في التقويم المحدد. |
| [DateTime](./datetime/)(int, int, int, int, int, int) | ينشئ كائنًا يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية معينة. |
| [DateTime](./datetime/)(int, int, int, int, int, int, DateTimeKind) | ينشئ كائنًا يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية معينة. |
| [DateTime](./datetime/)(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | ينشئ كائنًا يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية معينة في التقويم المحدد. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, DateTimeKind) | ينشئ كائنًا يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية وملي ثانية معينة. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) | ينشئ كائنًا يمثل قيمة تاريخ ووقت محددة بسنة وشهر ويوم وساعة ودقيقة وثانية وملي ثانية معينة في التقويم المحدد. |
| [DateTime](./datetime/)(int64_t, DateTimeKind) | أنشئ كائنًا يمثل قيمة تاريخ ووقت محددة كعدد من النبضات. |
| [DateTime](./datetime/)(int64_t, DateTimeKind, bool) | أنشئ كائنًا يمثل قيمة تاريخ ووقت محددة كعدد من النبضات. للاستخدام الداخلي. |
| [DateTime](./datetime/)(const DateTime\&) | ينسخ كائنًا عند الإنشاء. |
| static [DaysInMonth](./daysinmonth/)(int, int) | يعيد عدد الأيام في الشهر المحدد من السنة المحددة. |
| static [Equals](./equals/)(DateTime, DateTime) | يحدد ما إذا كانت الكائنات المحددة من الفئة [DateTime](./) تمثل نفس قيمة التاريخ والوقت. |
| [Equals](./equals/)(DateTime) const | يحدد ما إذا كان الكائن المحدد من الفئة [DateTime](./) يمثل نفس قيمة التاريخ والوقت كما في الكائن الحالي. |
| static [FromBinary](./frombinary/)(int64_t) | يفك تسلسل قيمة التاريخ والوقت من عدد صحيح غير موقع 64-بت المحدد ويضبط الكائن الجديد من الفئة [DateTime](./) على تلك القيمة. |
| static [FromFileTime](./fromfiletime/)(int64_t) | يحوّل وقت الملف المحدد إلى كائن من الفئة [DateTime](./) يمثل نفس قيمة التاريخ والوقت كوقت محلي. |
| static [FromFileTimeUtc](./fromfiletimeutc/)(int64_t) | يحوّل وقت الملف المحدد إلى كائن من الفئة [DateTime](./) يمثل نفس قيمة التاريخ والوقت كوقت UTC. |
| static [FromOADate](./fromoadate/)(double) | يعيد كائنًا من الفئة [DateTime](./) يمثل قيمة التاريخ والوقت المكافئة لتاريخ OLE Automation المحدد. |
| static [FromUnixTime](./fromunixtime/)(time_t) | يحوّل قيمة وقت Unix المحددة إلى كائن من الفئة [DateTime](./). للاستخدام الداخلي. |
| [get_Date](./get_date/)() const | يعيد كائنًا جديدًا من الفئة [DateTime](./) يمثل جزء التاريخ من التاريخ والوقت الممثلين في الكائن الحالي مع ضبط جميع مكونات جزء الوقت إلى 0. |
| [get_Day](./get_day/)() const | يعيد الرقم الترتيبي لليوم في الشهر الممثل في الكائن الحالي. |
| [get_DayOfWeek](./get_dayofweek/)() const | يعيد قيمة تمثل يوم الأسبوع الممثل في الكائن الحالي. |
| [get_DayOfYear](./get_dayofyear/)() const | يعيد الرقم الترتيبي لليوم في السنة الممثلة في الكائن الحالي. |
| [get_Hour](./get_hour/)() const | يعيد مكوّن الساعة من قيمة التاريخ والوقت الممثلة في الكائن الحالي. |
| [get_Kind](./get_kind/)() const | يعيد القيمة التي تمثل ما إذا كان التاريخ والوقت الممثلان في الكائن الحالي تاريخًا ووقتًا محليًا أو UTC أو لا شيء منهما. |
| [get_Millisecond](./get_millisecond/)() const | يعيد مكوّن الملي ثانية من قيمة التاريخ والوقت الممثلة في الكائن الحالي. |
| [get_Minute](./get_minute/)() const | يعيد مكوّن الدقيقة من قيمة التاريخ والوقت الممثلة في الكائن الحالي. |
| [get_Month](./get_month/)() const | يعيد الرقم الترتيبي للشهر في السنة الممثلة في الكائن الحالي. |
| static [get_Now](./get_now/)() | يعيد كائنًا من الفئة [DateTime](./) يمثل الوقت الحالي كوقت محلي. |
| [get_Second](./get_second/)() const | يعيد المكوّن الثانوي لقيمة التاريخ والوقت الممثلة بواسطة الكائن الحالي. |
| [get_Ticks](./get_ticks/)() const | يعيد عدد الفواصل الزمنية التي تبلغ 100 نانوثانية منذ 0:00:00 بتوقيت UTC، 1 يناير 0001، في التقويم الميلادي حتى التاريخ والوقت الممثلة بواسطة الكائن الحالي. |
| [get_TimeOfDay](./get_timeofday/)() const | يعيد القيمة التي تمثل الفاصل الزمني من بداية اليوم الممثلة بواسطة الكائن الحالي حتى قيمة التاريخ والوقت الممثلة بواسطة الكائن الحالي. |
| static [get_Today](./get_today/)() | يعيد نسخة من فئة [DateTime](./) تمثّل التاريخ الحالي مع ضبط كل مكوّن من جزء الوقت للقيمة الممثلة بواسطة الكائن إلى 0. |
| static [get_UtcNow](./get_utcnow/)() | يعيد نسخة من فئة [DateTime](./) تمثّل الوقت الحالي بتوقيت UTC. |
| [get_Year](./get_year/)() const | يعيد السنة الممثلة بواسطة الكائن الحالي. |
| [GetDateComponents](./getdatecomponents/)(int\&, int\&, int\&) const | يحصل على أجزاء التاريخ. للاستخدام الداخلي. |
| [GetDateTimeFormats](./getdatetimeformats/)() const | يعيد مصفوفة من السلاسل حيث كل عنصر هو تمثيل نصي للكائن الحالي مُنسّق بأحد محددات تنسيق التاريخ والوقت القياسية. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t) const | يعيد مصفوفة من السلاسل حيث كل عنصر هو تمثيل نصي للكائن الحالي مُنسّق بمحدد تنسيق التاريخ والوقت القياسي المحدد. |
| [GetDateTimeFormats](./getdatetimeformats/)(const SharedPtr\<IFormatProvider\>\&) const | يعيد مصفوفة من السلاسل حيث كل عنصر هو تمثيل نصي للكائن الحالي مُنسّق بأحد محددات تنسيق التاريخ والوقت القياسية ومزود التنسيق المحدد. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t, const SharedPtr\<IFormatProvider\>\&) const | يعيد مصفوفة من السلاسل حيث كل عنصر هو تمثيل نصي للكائن الحالي مُنسّق بمحدد تنسيق التاريخ والوقت القياسي المحدد ومزود التنسيق. |
| [GetHashCode](./gethashcode/)() const | يعيد رمز تجزئة للكائن الحالي. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)() const | يحدد ما إذا كانت قيمة التاريخ والوقت الممثلة بواسطة الكائن الحالي تقع ضمن نطاق التوقيت الصيفي للمنطقة الزمنية الحالية. |
| static [IsLeapYear](./isleapyear/)(int) | يحدد ما إذا كان العام المحدد سنة كبيسة. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(DateTime) const | يحدد ما إذا كان الكائن الحالي والكائن [DateTime](./) المحدد يمثلان قيم تاريخ ووقت متميزة. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | يعيد نسخة جديدة من فئة [DateTime](./) تمثّل قيمة التاريخ والوقت التي هي مجموع القيمة الممثلة بواسطة الكائن الحالي والفترة الزمنية المحددة. |
| [operator+=](./operator+=/)(TimeSpan) | يضبط الكائن الحالي على قيمة التاريخ والوقت التي هي مجموع القيمة الممثلة بواسطة الكائن الحالي والفترة الزمنية المحددة. |
| [operator-](./operator-/)(TimeSpan) const | يعيد نسخة جديدة من فئة [DateTime](./) تمثّل قيمة التاريخ والوقت التي هي نتيجة طرح الفترة الزمنية المحددة من القيمة الممثلة بواسطة الكائن الحالي. |
| [operator-](./operator-/)(DateTime) const | يرجع نسخة من فئة [TimeSpan](../timespan/) تمثل الفاصل الزمني بين قيم التاريخ والوقت التي يمثلها الكائنان الحالي والمحدد. |
| [operator-=](./operator-=/)(TimeSpan) | يضبط الكائن الحالي على قيمة التاريخ والوقت التي هي نتيجة طرح الفترة الزمنية المحددة من قيمة التاريخ والوقت الممثلة بواسطة الكائن الحالي. |
| [operator<](./operator_/)(DateTime) const | يحدد ما إذا كان الكائن الحالي يمثل قيمة التاريخ والوقت التي هي أسبق من القيمة الممثلة بواسطة الكائن [DateTime](./) المحدد. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(DateTime) const | يحدد ما إذا كان الكائن الحالي يمثل قيمة التاريخ والوقت التي هي أسبق أو مساوية للقيمة الممثلة بواسطة الكائن [DateTime](./) المحدد. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const DateTime\&) | يعين القيمة الممثلة بواسطة النسخة [DateTime](./) المحددة إلى الكائن الحالي. |
| [operator==](./operator==/)(DateTime) const | يحدد ما إذا كان الكائن الحالي والكائن [DateTime](./) المحدد يمثلان نفس قيمة التاريخ والوقت. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(DateTime) const | يحدد ما إذا كان الكائن الحالي يمثل قيمة التاريخ والوقت التي هي لاحقة للقيمة الممثلة بواسطة الكائن [DateTime](./) المحدد. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(DateTime) const | يحدد ما إذا كان الكائن الحالي يمثل قيمة التاريخ والوقت التي هي لاحقة أو مساوية للقيمة الممثلة بواسطة الكائن [DateTime](./) المحدد. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | يحوّل التمثيل النصي المحدد لقيمة التاريخ والوقت إلى كائن [DateTime](./) المكافئ. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | يقوم بتحويل تمثيل السلسلة المحدد لقيمة تاريخ ووقت إلى كائن [DateTime](./) المكافئ باستخدام معلومات تنسيق مخصصة للثقافة. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | يقوم بتحويل تمثيل السلسلة المحدد لقيمة تاريخ ووقت إلى كائن [DateTime](./) المكافئ باستخدام التنسيق المحدد ومعلومات تنسيق مخصصة للثقافة. يجب أن يتطابق تنسيق تمثيل السلسلة مع التنسيق المحدد تمامًا. يطرح استثناءً إذا فشل التحويل. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | يقوم بتحويل تمثيل السلسلة المحدد لقيمة تاريخ ووقت إلى كائن [DateTime](./) المكافئ باستخدام التنسيقات المحددة، ومعلومات تنسيق مخصصة للثقافة، والنمط. يجب أن يتطابق تنسيق تمثيل السلسلة مع أحد أو جميع التنسيقات المحددة تمامًا. يطرح استثناءً إذا فشل التحويل. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [SpecifyKind](./specifykind/)(DateTime, DateTimeKind) | ينشئ كائنًا جديدًا من نوع [DateTime](./) يمثل نفس عدد الـ ticks كما في كائن [DateTime](./) المحدد ويمثل الوقت المحلي أو وقت UTC أو لا شيء حسب ما يحدده الوسيط **kind**. |
| [Subtract](./subtract/)(TimeSpan) const | يعيد نسخة جديدة من فئة [DateTime](./) تمثّل قيمة التاريخ والوقت التي هي نتيجة طرح الفترة الزمنية المحددة من القيمة الممثلة بواسطة الكائن الحالي. |
| [Subtract](./subtract/)(DateTime) const | يعيد نسخة من فئة [TimeSpan](../timespan/) تمثل الفاصل الزمني بين قيم التاريخ والوقت التي تمثلها الكائنات الحالية والمحددة. |
| [ToBinary](./tobinary/)() const | يسلسل الكائن الحالي. |
| [ToFileTime](./tofiletime/)() const | يعيد قيمة تمثل قيمة التاريخ والوقت التي يمثلها الكائن الحالي كوقت ملف. |
| [ToFileTimeUtc](./tofiletimeutc/)() const | يقوم بتحويل قيمة التاريخ والوقت التي يمثلها الكائن الحالي إلى وقت ملف بتوقيت UTC. |
| [ToLocalTime](./tolocaltime/)() const | يعيد نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي يمثلها الكائن الحالي كوقت محلي. |
| [ToLongDateString](./tolongdatestring/)() const | يعيد سلسلة نصية تحتوي على تمثيل تاريخ طويل للكائن الحالي. |
| [ToLongTimeString](./tolongtimestring/)() const | يعيد سلسلة نصية تحتوي على تمثيل وقت طويل للكائن الحالي. |
| [ToOADate](./tooadate/)() const | يعيد قيمة التاريخ والوقت التي يمثلها الكائن الحالي كـ OLE Automation Date. |
| [ToShortDateString](./toshortdatestring/)() const | يعيد سلسلة نصية تحتوي على تمثيل تاريخ قصير للكائن الحالي. |
| [ToShortTimeString](./toshorttimestring/)() const | يعيد سلسلة نصية تحتوي على تمثيل وقت قصير للكائن الحالي. |
| [ToString](./tostring/)() const | يعيد تمثيل السلسلة لقيمة التاريخ والوقت التي يمثلها الكائن الحالي باستخدام قواعد التنسيق المعرفة من قبل الثقافة الحالية. |
| [ToString](./tostring/)(const String\&) const | يعيد تمثيلًا نصيًا لقيمة التاريخ والوقت التي يمثلها الكائن الحالي باستخدام التنسيق المحدد وقواعد التنسيق المعرفة من قبل الثقافة الحالية. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | يعيد تمثيلًا نصيًا لقيمة التاريخ والوقت التي يمثلها الكائن الحالي باستخدام معلومات التنسيق المحددة. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | يعيد تمثيلًا نصيًا لقيمة التاريخ والوقت التي يمثلها الكائن الحالي باستخدام معلومات التنسيق المحددة. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToUniversalTime](./touniversaltime/)() const | يعيد نسخة جديدة من فئة [DateTime](./) تمثل قيمة التاريخ والوقت التي يمثلها الكائن الحالي كوقت UTC. |
| [ToUnixTime](./tounixtime/)() const | يعيد قيمة تمثل قيمة التاريخ والوقت التي يمثلها الكائن الحالي كوقت Unix. للاستخدام الداخلي. |
| static [TryParse](./tryparse/)(const String\&, DateTime\&) | يحوّل التمثيل النصي المحدد لقيمة التاريخ والوقت إلى كائن [DateTime](./) المكافئ. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | يقوم بتحويل تمثيل السلسلة المحدد لقيمة تاريخ ووقت إلى كائن [DateTime](./) المكافئ باستخدام معلومات تنسيق مخصصة للثقافة المحددة والنمط. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | يقوم بتحويل تمثيل السلسلة المحدد لقيمة تاريخ ووقت إلى كائن [DateTime](./) المكافئ باستخدام التنسيق المحدد، ومعلومات تنسيق مخصصة للثقافة، والنمط. يجب أن يتطابق تنسيق تمثيل السلسلة مع التنسيق المحدد تمامًا. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | يقوم بتحويل تمثيل السلسلة المحدد لقيمة تاريخ ووقت إلى كائن [DateTime](./) المكافئ باستخدام التنسيقات المحددة، ومعلومات تنسيق مخصصة للثقافة، والنمط. يجب أن يتطابق تنسيق تمثيل السلسلة مع أحد أو جميع التنسيقات المحددة تمامًا. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [Type](./type/)() | يعيد كائنًا من نوع [TypeInfo](../typeinfo/) يحتوي على معلومات حول هذه الفئة. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [MaxTicks](./maxticks/) | عدد الوحدات التي تبلغ 100 نانوثانية في الفاصل الزمني بين أصغر قيمة ممكنة وأكبر قيمة ممكنة لـ [DateTime](./). |
| static [MaxValue](./maxvalue/) | نسخة من فئة [DateTime](./) تمثل أقصى قيمة ممكنة للتاريخ والوقت. |
| static constexpr [MinTicks](./minticks/) | العدد الأدنى من الـ ticks التي يمكن لكائن من فئة [DateTime](./) تمثيلها. |
| static [MinValue](./minvalue/) | كائن من فئة [DateTime](./) يمثل أصغر قيمة ممكنة للتاريخ والوقت. |
| static constexpr [TicksPerDay](./ticksperday/) | عدد الـ ticks في اليوم. |
| static constexpr [TicksPerHour](./ticksperhour/) | عدد الـ ticks في الساعة. |
| static constexpr [TicksPerMicrosecond](./tickspermicrosecond/) | عدد الـ ticks في الميكروثانية. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | عدد الـ ticks في الميليثانية. |
| static constexpr [TicksPerMinute](./ticksperminute/) | عدد الـ ticks في الدقيقة. |
| static constexpr [TicksPerSecond](./tickspersecond/) | عدد الـ ticks في الثانية. |
| static [UnixEpoch](./unixepoch/) | كائن من فئة [DateTime](./) يمثل بداية حقبة يونكس (1970.01.01 00:00:00). |
## ملاحظات



```cpp
#include "system/console.h"
#include "system/date_time.h"

int main()
{
  using namespace System;

  // إنشاء كائن فئة 'DateTime'.
  DateTime dateTime{1990, 10, 30};

  // طباعة الكائن بعدة صيغ.
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
* Library [Aspose.Page for C++](../../)
