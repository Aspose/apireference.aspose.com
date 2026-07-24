---
title: "System::DateTimeOffset class"
linktitle: "DateTimeOffset"
second_title: "Aspose.Page لـ C++"
description: "System::DateTimeOffset class. يحتوي على التاريخ والوقت بالنسبة إلى التوقيت العالمي المنسق. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1700
url: /ar/cpp/system/datetimeoffset/
---
## DateTimeOffset class


يحتوي على التاريخ والوقت بالنسبة إلى التوقيت العالمي المنسق. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DateTimeOffset
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(TimeSpan) const | يضيف فاصلًا زمنيًا محددًا إلى كائن [DateTimeOffset](./). |
| [AddDays](./adddays/)(double) const | يضيف عددًا محددًا من الأيام إلى كائن [DateTimeOffset](./). |
| [AddHours](./addhours/)(double) const | يضيف عددًا محددًا من الساعات إلى كائن [DateTimeOffset](./). |
| [AddMilliseconds](./addmilliseconds/)(double) const | يضيف عددًا محددًا من الملليثواني إلى كائن [DateTimeOffset](./). |
| [AddMinutes](./addminutes/)(double) const | يضيف عددًا محددًا من الدقائق إلى كائن [DateTimeOffset](./). |
| [AddMonths](./addmonths/)(int) const | يضيف عددًا محددًا من الشهور إلى كائن [DateTimeOffset](./). |
| [AddSeconds](./addseconds/)(double) const | يضيف عددًا محددًا من الثواني إلى كائن [DateTimeOffset](./). |
| [AddTicks](./addticks/)(int64_t) const | يضيف عددًا محددًا من ticks إلى كائن [DateTimeOffset](./). |
| [AddYears](./addyears/)(int) const | يضيف عددًا محددًا من السنوات إلى كائن [DateTimeOffset](./). |
| static [Compare](./compare/)(const DateTimeOffset\&, const DateTimeOffset\&) | يقارن كائنين من نوع [DateTimeOffset](./). |
| [CompareTo](./compareto/)(const DateTimeOffset\&) const | يقارن كائنين من نوع [DateTimeOffset](./). |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | يقارن كائنين من نوع [DateTimeOffset](./). |
| [DateTimeOffset](./datetimeoffset/)() | منشئ افتراضي. |
| [DateTimeOffset](./datetimeoffset/)(DateTime) | منشئ. |
| [DateTimeOffset](./datetimeoffset/)(int64_t, TimeSpan) | منشئ. |
| [DateTimeOffset](./datetimeoffset/)(DateTime, TimeSpan) | منشئ. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, TimeSpan) | منشئ. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, TimeSpan) | منشئ. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) | منشئ. |
| static [Equals](./equals/)(const DateTimeOffset\&, const DateTimeOffset\&) | يتحقق مما إذا كان كائنان من نوع [DateTimeOffset](./) يمثلان نفس نقطة الزمن. |
| [Equals](./equals/)(const DateTimeOffset\&) const | يتحقق مما إذا كان كائنان من نوع [DateTimeOffset](./) يمثلان نفس نقطة الزمن. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | يتحقق مما إذا كان كائنان من نوع [DateTimeOffset](./) يمثلان نفس نقطة الزمن. |
| [EqualsExact](./equalsexact/)(const DateTimeOffset\&) const | يتحقق مما إذا كان كائنان من نوع [DateTimeOffset](./) يمثلان نفس نقطة الزمن ولديهما نفس الإزاحة. |
| [EqualsExact](./equalsexact/)(const SharedPtr\<Object\>\&) const | يتحقق مما إذا كان كائنان من نوع [DateTimeOffset](./) يمثلان نفس نقطة الزمن ولديهما نفس الإزاحة. |
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) وقت الملف إلى تاريخ ووقت مع إزاحة الوقت المحلي. |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) وقت يونيكس إلى كائن [DateTimeOffset](./). |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) وقت يونيكس إلى كائن [DateTimeOffset](./). |
| [get_Date](./get_date/)() const | يحصل على مكوّن التاريخ للكيان الحالي. |
| [get_DateTime](./get_datetime/)() const | يحصل على قيمة [DateTime](../datetime/). |
| [get_Day](./get_day/)() const | يحصل على يوم الشهر للكيان الحالي. |
| [get_DayOfWeek](./get_dayofweek/)() const | يحصل على يوم الأسبوع للكيان الحالي. |
| [get_DayOfYear](./get_dayofyear/)() const | يحصل على يوم السنة للكيان الحالي. |
| [get_Hour](./get_hour/)() const | يحصل على مكوّن الساعة للكيان الحالي. |
| [get_LocalDateTime](./get_localdatetime/)() const | يحصل على قيمة [DateTime](../datetime/) التي تمثل التاريخ والوقت المحلي. |
| [get_Millisecond](./get_millisecond/)() const | يحصل على مكوّن الميللي ثانية للكيان الحالي. |
| [get_Minute](./get_minute/)() const | يحصل على مكوّن الدقيقة للكيان الحالي. |
| [get_Month](./get_month/)() const | يحصل على مكوّن الشهر للكيان الحالي. |
| static [get_Now](./get_now/)() | يحصل على [DateTimeOffset](./) الذي تم تعيين تاريخ ووقت له إلى الوقت المحلي الحالي وتم تعيين إزاحته إلى إزاحة الوقت المحلي. |
| [get_Offset](./get_offset/)() const | يحصل على الإزاحة من توقيت UTC. |
| [get_Second](./get_second/)() const | يحصل على مكوّن الثانية للكيان الحالي. |
| [get_Ticks](./get_ticks/)() const | يحصل على عدد النقرات للكيان الحالي. |
| [get_TimeOfDay](./get_timeofday/)() const | يحصل على وقت اليوم للكيان الحالي. |
| [get_UtcDateTime](./get_utcdatetime/)() const | يحصل على قيمة [DateTime](../datetime/) التي تمثل تاريخ ووقت UTC. |
| static [get_UtcNow](./get_utcnow/)() | يحصل على [DateTimeOffset](./) الذي تم تعيين تاريخ ووقت له إلى توقيت UTC الحالي وإزاحته هي [TimeSpan::Zero](../timespan/zero/). |
| [get_UtcTicks](./get_utcticks/)() const | يحصل على عدد النقرات للكيان الحالي بتوقيت UTC. |
| [get_Year](./get_year/)() const | يحصل على مكوّن السنة للكيان الحالي. |
| [GetHashCode](./gethashcode/)() const | يحصل على رمز التجزئة للكائن [DateTimeOffset](./) الحالي. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | يحدد ما إذا كان الكائن الحالي والكائن [DateTimeOffset](./) المحدد يمثلان قيم تاريخ ووقت متميزة. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | يرجع نسخة جديدة من فئة [DateTimeOffset](./) تمثل قيمة التاريخ والوقت التي هي مجموع القيمة التي يمثلها الكائن الحالي والفاصل الزمني المحدد. |
| [operator-](./operator-/)(TimeSpan) const | يرجع نسخة جديدة من فئة [DateTimeOffset](./) تمثل قيمة التاريخ والوقت التي هي نتيجة طرح الفاصل الزمني المحدد من القيمة التي يمثلها الكائن الحالي. |
| [operator-](./operator-/)(const DateTimeOffset\&) const | يرجع نسخة من فئة [TimeSpan](../timespan/) تمثل الفاصل الزمني بين قيم التاريخ والوقت التي يمثلها الكائنان الحالي والمحدد. |
| [operator<](./operator_/)(const DateTimeOffset\&) const | يحدد ما إذا كان الكائن الحالي يمثل قيمة التاريخ والوقت التي هي أسبق من القيمة التي يمثلها الكائن [DateTimeOffset](./) المحدد. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(const DateTimeOffset\&) const | يحدد ما إذا كان الكائن الحالي يمثل قيمة التاريخ والوقت التي هي أسبق أو مساوية للقيمة التي يمثلها الكائن [DateTimeOffset](./) المحدد. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator==](./operator==/)(const DateTimeOffset\&) const | يحدد ما إذا كان الكائن الحالي والكائن [DateTimeOffset](./) المحدد يمثلان نفس قيمة التاريخ والوقت. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(const DateTimeOffset\&) const | يحدد ما إذا كان الكائن الحالي يمثل قيمة التاريخ والوقت التي هي لاحقة للقيمة التي يمثلها الكائن [DateTimeOffset](./) المحدد. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(const DateTimeOffset\&) const | يحدد ما إذا كان الكائن الحالي يمثل قيمة التاريخ والوقت التي هي لاحقة أو مساوية للقيمة التي يمثلها الكائن [DateTimeOffset](./) المحدد. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | يحول السلسلة المحددة إلى ما يعادلها من نوع [DateTimeOffset](./). |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | يحول السلسلة المحددة إلى كائن [DateTimeOffset](./) باستخدام موفر التنسيق المحدد ونمط التنسيق. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | يحول السلسلة المحددة إلى كائن [DateTimeOffset](./) باستخدام التنسيق المحدد، موفر التنسيق ونمط التنسيق. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | يحول السلسلة المحددة إلى كائن [DateTimeOffset](./) باستخدام التنسيقات المحددة، موفر التنسيق ونمط التنسيق. |
| [Subtract](./subtract/)(TimeSpan) const | يطرح فاصلًا زمنيًا محددًا من الكائن الحالي. |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | يطرح قيمة [DateTimeOffset](./) محددة من الكائن الحالي. |
| [ToFileTime](./tofiletime/)() const | يحول الكائن الحالي إلى وقت ملف [Windows](../../system.windows/). |
| [ToLocalTime](./tolocaltime/)() const | يحول الكائن الحالي إلى كائن يمثل الوقت المحلي. |
| [ToOffset](./tooffset/)(TimeSpan) const | يستبدل إزاحة الكائن الحالي بالإزاحة المحددة. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | يحول الكائن الحالي إلى سلسلة باستخدام التنسيق المحدد وموفر التنسيق. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | يحول الكائن الحالي إلى سلسلة باستخدام موفر التنسيق المحدد. |
| [ToString](./tostring/)(const String\&) const | يحول الكائن الحالي إلى سلسلة باستخدام التنسيق المحدد. |
| [ToString](./tostring/)() const | يحول الكائن الحالي إلى سلسلة. |
| [ToUniversalTime](./touniversaltime/)() const | يحول الكائن الحالي إلى كائن يمثل الوقت بتوقيت UTC. |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | يحصل على المليثانية التي مرت منذ بداية حقبة Unix. |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | يحصل على الثواني المنقضية منذ بداية حقبة يونيكس. |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | يحاول تحويل السلسلة المحددة إلى كائن [DateTimeOffset](./). |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | يحاول تحويل السلسلة المحددة إلى كائن [DateTimeOffset](./) باستخدام موفر الصيغة المحدد ونمط التنسيق. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | يحاول تحويل السلسلة المحددة إلى كائن [DateTimeOffset](./) باستخدام الصيغ المحددة، موفر الصيغة، ونمط التنسيق. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | يحاول تحويل السلسلة المحددة إلى كائن [DateTimeOffset](./) باستخدام الصيغة المحددة، موفر الصيغة، ونمط التنسيق. |
| static [Type](./type/)() | يرجع كائن [TypeInfo](../typeinfo/) الذي يمثل بنية [TimeSpan](../timespan/). |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | يحصل على أقصى إزاحة بالتيكات. |
| static [MaxValue](./maxvalue/) | يحصل على أكبر قيمة [DateTimeOffset](./). |
| static constexpr [MinOffset](./minoffset/) | يحصل على أدنى إزاحة بالتيكات. |
| static [MinValue](./minvalue/) | يحصل على أقدم قيمة [DateTimeOffset](./). |
| static [UnixEpoch](./unixepoch/) | يحصل على بداية حقبة يونيكس. |
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
