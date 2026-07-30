---
title: "System::DateTimeOffset فئة"
linktitle: "DateTimeOffset"
second_title: "Aspose.Font لـ C++"
description: "System::DateTimeOffset فئة. تحتوي على التاريخ والوقت بالنسبة إلى التوقيت العالمي المنسق. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت تشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1700
url: /ar/cpp/system/datetimeoffset/
---
## DateTimeOffset class


يحتوي على التاريخ والوقت بالنسبة إلى التوقيت العالمي المنسق. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت تشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DateTimeOffset
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(TimeSpan) const | يضيف فترة زمنية محددة إلى كائن [DateTimeOffset](./). |
| [AddDays](./adddays/)(double) const | يضيف عددًا محددًا من الأيام إلى كائن [DateTimeOffset](./). |
| [AddHours](./addhours/)(double) const | يضيف عددًا محددًا من الساعات إلى كائن [DateTimeOffset](./). |
| [AddMilliseconds](./addmilliseconds/)(double) const | يضيف عددًا محددًا من المللي ثانية إلى كائن [DateTimeOffset](./). |
| [AddMinutes](./addminutes/)(double) const | يضيف عددًا محددًا من الدقائق إلى كائن [DateTimeOffset](./). |
| [AddMonths](./addmonths/)(int) const | يضيف عددًا محددًا من الشهور إلى كائن [DateTimeOffset](./). |
| [AddSeconds](./addseconds/)(double) const | يضيف عددًا محددًا من الثواني إلى كائن [DateTimeOffset](./). |
| [AddTicks](./addticks/)(int64_t) const | يضيف عددًا محددًا من نقاط الزمن إلى كائن [DateTimeOffset](./). |
| [AddYears](./addyears/)(int) const | يضيف عددًا محددًا من السنوات إلى كائن [DateTimeOffset](./). |
| static [Compare](./compare/)(const DateTimeOffset\&, const DateTimeOffset\&) | يقارن بين كائنين من نوع [DateTimeOffset](./). |
| [CompareTo](./compareto/)(const DateTimeOffset\&) const | يقارن بين كائنين من نوع [DateTimeOffset](./). |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | يقارن بين كائنين من نوع [DateTimeOffset](./). |
| [DateTimeOffset](./datetimeoffset/)() | منشئ افتراضي. |
| [DateTimeOffset](./datetimeoffset/)(DateTime) | المُنشئ. |
| [DateTimeOffset](./datetimeoffset/)(int64_t, TimeSpan) | المُنشئ. |
| [DateTimeOffset](./datetimeoffset/)(DateTime, TimeSpan) | المُنشئ. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, TimeSpan) | المُنشئ. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, TimeSpan) | المُنشئ. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) | المُنشئ. |
| static [Equals](./equals/)(const DateTimeOffset\&, const DateTimeOffset\&) | يتحقق مما إذا كان كائنان من نوع [DateTimeOffset](./) يمثلان نفس نقطة الزمن. |
| [Equals](./equals/)(const DateTimeOffset\&) const | يتحقق مما إذا كان كائنان من نوع [DateTimeOffset](./) يمثلان نفس نقطة الزمن. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | يتحقق مما إذا كان كائنان من نوع [DateTimeOffset](./) يمثلان نفس نقطة الزمن. |
| [EqualsExact](./equalsexact/)(const DateTimeOffset\&) const | يتحقق مما إذا كان كائنان من نوع [DateTimeOffset](./) يمثلان نفس نقطة الزمن ولهما نفس الإزاحة. |
| [EqualsExact](./equalsexact/)(const SharedPtr\<Object\>\&) const | يتحقق مما إذا كان كائنان من نوع [DateTimeOffset](./) يمثلان نفس نقطة الزمن ولهما نفس الإزاحة. |
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) وقت ملف إلى تاريخ ووقت مع إزاحة الوقت المحلي. |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) وقت يونكس إلى كائن [DateTimeOffset](./). |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) وقت يونكس إلى كائن [DateTimeOffset](./). |
| [get_Date](./get_date/)() const | يحصل على مكوّن التاريخ للكائن الحالي. |
| [get_DateTime](./get_datetime/)() const | يحصل على قيمة [DateTime](../datetime/). |
| [get_Day](./get_day/)() const | يحصل على يوم الشهر للكائن الحالي. |
| [get_DayOfWeek](./get_dayofweek/)() const | يحصل على يوم الأسبوع للكائن الحالي. |
| [get_DayOfYear](./get_dayofyear/)() const | يحصل على يوم السنة للكائن الحالي. |
| [get_Hour](./get_hour/)() const | يحصل على مكوّن الساعة للكائن الحالي. |
| [get_LocalDateTime](./get_localdatetime/)() const | يحصل على قيمة [DateTime](../datetime/) التي تمثل التاريخ والوقت المحلي. |
| [get_Millisecond](./get_millisecond/)() const | يحصل على مكوّن الميللي ثانية للكائن الحالي. |
| [get_Minute](./get_minute/)() const | يحصل على مكوّن الدقيقة للكائن الحالي. |
| [get_Month](./get_month/)() const | يحصل على مكوّن الشهر للكائن الحالي. |
| static [get_Now](./get_now/)() | يحصل على [DateTimeOffset](./) الذي تم تعيين تاريخ ووقته إلى الوقت المحلي الحالي وإزاحته إلى إزاحة الوقت المحلي. |
| [get_Offset](./get_offset/)() const | يحصل على الإزاحة من توقيت UTC. |
| [get_Second](./get_second/)() const | يحصل على مكوّن الثواني للكائن الحالي. |
| [get_Ticks](./get_ticks/)() const | يحصل على عدد النقاط الزمنية للكائن الحالي. |
| [get_TimeOfDay](./get_timeofday/)() const | يحصل على وقت اليوم للكائن الحالي. |
| [get_UtcDateTime](./get_utcdatetime/)() const | يحصل على قيمة [DateTime](../datetime/) التي تمثل تاريخ ووقت UTC. |
| static [get_UtcNow](./get_utcnow/)() | يحصل على [DateTimeOffset](./) الذي تم تعيين تاريخ ووقته إلى توقيت UTC الحالي وإزاحته هي [TimeSpan::Zero](../timespan/zero/). |
| [get_UtcTicks](./get_utcticks/)() const | يحصل على عدد الـticks للكائن الحالي بتوقيت UTC. |
| [get_Year](./get_year/)() const | يحصل على مكوّن السنة للكائن الحالي. |
| [GetHashCode](./gethashcode/)() const | يحصل على رمز التجزئة (hash code) للكائن [DateTimeOffset](./) الحالي. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | يحدد ما إذا كان الكائن الحالي والكائن [DateTimeOffset](./) المحدد يمثلان قيم تاريخ ووقت متميزة. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | يعيد مثيلاً جديداً من الفئة [DateTimeOffset](./) التي تمثل قيمة التاريخ والوقت الناتجة عن جمع القيمة التي يمثلها الكائن الحالي والفترة الزمنية المحددة. |
| [operator-](./operator-/)(TimeSpan) const | يعيد مثيلاً جديداً من الفئة [DateTimeOffset](./) التي تمثل قيمة التاريخ والوقت الناتجة عن طرح الفترة الزمنية المحددة من القيمة التي يمثلها الكائن الحالي. |
| [operator-](./operator-/)(const DateTimeOffset\&) const | يعيد مثيلاً من الفئة [TimeSpan](../timespan/) التي تمثل الفاصل الزمني بين قيم التاريخ والوقت التي يمثلها الكائنان الحالي والمحدد. |
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
| static [Parse](./parse/)(const String\&) | يحوّل السلسلة المحددة إلى ما يعادلها من نوع [DateTimeOffset](./). |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | يحوّل السلسلة المحددة إلى كائن [DateTimeOffset](./) باستخدام موفر الصيغة المحدد ونمط التنسيق. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | يحوّل السلسلة المحددة إلى كائن [DateTimeOffset](./) باستخدام الصيغة المحددة، موفر الصيغة، ونمط التنسيق. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | يحوّل السلسلة المحددة إلى كائن [DateTimeOffset](./) باستخدام الصيغ المحددة، موفر الصيغة، ونمط التنسيق. |
| [Subtract](./subtract/)(TimeSpan) const | يطرح فترة زمنية محددة من الكائن الحالي. |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | يطرح قيمة [DateTimeOffset](./) محددة من الكائن الحالي. |
| [ToFileTime](./tofiletime/)() const | يحوّل الكائن الحالي إلى وقت ملف [Windows](../../system.windows/). |
| [ToLocalTime](./tolocaltime/)() const | يحوّل الكائن الحالي إلى كائن يمثل الوقت المحلي. |
| [ToOffset](./tooffset/)(TimeSpan) const | يستبدل إزاحة الكائن الحالي بالإزاحة المحددة. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | يحوّل الكائن الحالي إلى سلسلة باستخدام الصيغة المحددة وموفر الصيغة. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | يحوّل الكائن الحالي إلى سلسلة باستخدام موفر الصيغة المحدد. |
| [ToString](./tostring/)(const String\&) const | يحوّل الكائن الحالي إلى سلسلة باستخدام الصيغة المحددة. |
| [ToString](./tostring/)() const | يحوّل الكائن الحالي إلى سلسلة. |
| [ToUniversalTime](./touniversaltime/)() const | تحول الكائن الحالي إلى كائن يمثل الوقت بتوقيت UTC،. |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | يحصل على المللي ثانية المنقضية منذ بداية حقبة يونكس. |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | يحصل على الثواني المنقضية منذ بداية حقبة يونكس. |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | يحاول تحويل السلسلة المحددة إلى كائن [DateTimeOffset](./). |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | يحاول تحويل السلسلة المحددة إلى كائن [DateTimeOffset](./) باستخدام موفر الصيغة المحدد ونمط التنسيق. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | يحاول تحويل السلسلة المحددة إلى كائن [DateTimeOffset](./) باستخدام الصيغ المحددة، موفر الصيغة ونمط التنسيق. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | يحاول تحويل السلسلة المحددة إلى كائن [DateTimeOffset](./) باستخدام الصيغة المحددة، موفر الصيغة ونمط التنسيق. |
| static [Type](./type/)() | يرجع كائن [TypeInfo](../typeinfo/) يمثل بنية [TimeSpan](../timespan/). |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | يحصل على الحد الأقصى للإزاحة بالتيكات. |
| static [MaxValue](./maxvalue/) | يحصل على أكبر قيمة لـ [DateTimeOffset](./). |
| static constexpr [MinOffset](./minoffset/) | يحصل على الحد الأدنى للإزاحة بالتيكات. |
| static [MinValue](./minvalue/) | يحصل على أقدم قيمة لـ [DateTimeOffset](./). |
| static [UnixEpoch](./unixepoch/) | يحصل على بداية حقبة يونكس. |
## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
