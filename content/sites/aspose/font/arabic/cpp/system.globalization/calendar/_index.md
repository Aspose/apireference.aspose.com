---
title: "فئة System::Globalization::Calendar"
linktitle: "Calendar"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Globalization::Calendar. تقويم يحدد كيفية معالجة التواريخ وحسابها وتنسيقها، إلخ. عمليات الضبط مفعلة فقط على الكائنات غير القابلة للقراءة فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال في التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.globalization/calendar/
---
## Calendar class


[Calendar](./) which defines how the dates are handled, calculated, formatted, etc. Setter operations are only enabled on non-read-only objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Calendar : public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [AddDays](./adddays/)(DateTime, int) const | يضيف أيامًا إلى نقطة الزمن. |
| virtual [AddHours](./addhours/)(DateTime, int) const | يضيف ساعات إلى نقطة الزمن. |
| virtual [AddMilliseconds](./addmilliseconds/)(DateTime, double) const | يضيف ميليثوانٍ إلى نقطة الزمن. |
| virtual [AddMinutes](./addminutes/)(DateTime, int) const | يضيف دقائق إلى نقطة الزمن. |
| virtual [AddMonths](./addmonths/)(DateTime, int) const | يضيف شهورًا إلى نقطة الزمن. |
| virtual [AddSeconds](./addseconds/)(DateTime, int) const | يضيف ثوانٍ إلى نقطة الزمن. |
| virtual [AddWeeks](./addweeks/)(DateTime, int) const | يضيف أسابيع إلى نقطة الزمن. |
| virtual [AddYears](./addyears/)(DateTime, int) const | يضيف سنوات إلى نقطة الزمن. |
| [Calendar](./calendar/)(const Calendar\&) | معلومات RTTI. |
| virtual [get_AlgorithmType](./get_algorithmtype/)() const | يحصل على نوع الخوارزمية. |
| [get_CurrentEra](./get_currentera/)() const | يحصل على فهرس العصر الحالي. |
| [get_CurrentEraValue](./get_currenteravalue/)() const | يحصل على قيمة العصر الحالي. |
| virtual [get_Eras](./get_eras/)() const | يحصل على قائمة العصور الموجودة في التقويم. |
| virtual [get_ID](./get_id/)() const | يحصل على معرف التقويم. |
| [get_IsReadOnly](./get_isreadonly/)() const | يتحقق مما إذا كان التقويم للقراءة فقط. |
| virtual [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const | النقطة الزمنية القصوى التي يدعمها التقويم. |
| virtual [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const | النقطة الزمنية الدنيا التي يدعمها التقويم. |
| virtual [get_TwoDigitYearMax](./get_twodigityearmax/)() const | يحصل على آخر سنة يمكن تمثيلها برقم مكوّن من رقمين. |
| virtual [GetDayOfMonth](./getdayofmonth/)(DateTime) const | يحصل على يوم الشهر للنقطة الزمنية المحددة. |
| virtual [GetDayOfWeek](./getdayofweek/)(DateTime) const | يحصل على يوم الأسبوع للنقطة الزمنية المحددة. |
| virtual [GetDayOfYear](./getdayofyear/)(DateTime) const | يحصل على يوم السنة للنقطة الزمنية المحددة. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | يحصل على عدد الأيام في شهر محدد. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const | يحصل على عدد الأيام في شهر محدد. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | يحصل على عدد الأيام في سنة محددة. |
| virtual [GetDaysInYear](./getdaysinyear/)(int, int) const | يحصل على عدد الأيام في سنة محددة. |
| virtual [GetEra](./getera/)(DateTime) const | يحصل على العصر للنقطة الزمنية المحددة. |
| virtual [GetHour](./gethour/)(DateTime) const | يحصل على الساعات للنقطة الزمنية المحددة. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | يحصل على الشهر الكبيس للسنة المحددة. |
| virtual [GetLeapMonth](./getleapmonth/)(int, int) const | يحصل على الشهر الكبيس للسنة المحددة. |
| virtual [GetMilliseconds](./getmilliseconds/)(DateTime) const | يحصل على الميليثواني للنقطة الزمنية المحددة. |
| virtual [GetMinute](./getminute/)(DateTime) const | يحصل على الدقائق للنقطة الزمنية المحددة. |
| virtual [GetMonth](./getmonth/)(DateTime) const | يحصل على الشهر للنقطة الزمنية المحددة. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | يحصل على عدد الأشهر في السنة المحددة. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int, int) const | يحصل على عدد الأشهر في السنة المحددة. |
| virtual [GetSecond](./getsecond/)(DateTime) const | يحصل على الثواني للنقطة الزمنية المحددة. |
| virtual [GetWeekOfYear](./getweekofyear/)(DateTime, CalendarWeekRule, DayOfWeek) const | يحصل على أسبوع السنة للنقطة الزمنية المحددة. |
| virtual [GetYear](./getyear/)(DateTime) const | يحصل على السنة للنقطة الزمنية المحددة. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | يتحقق مما إذا كان اليوم كبيسًا. |
| virtual [IsLeapDay](./isleapday/)(int, int, int, int) const | يتحقق مما إذا كان اليوم كبيسًا. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | يتحقق مما إذا كان الشهر كبيسًا. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int, int) const | يتحقق مما إذا كان الشهر كبيسًا. |
| virtual [IsLeapYear](./isleapyear/)(int) const | يتحقق مما إذا كانت السنة كبيسة. |
| virtual [IsLeapYear](./isleapyear/)(int, int) const | يتحقق مما إذا كانت السنة كبيسة. |
| [IsValidDay](./isvalidday/)(int, int, int, int) const | يتحقق من قيم السنة والشهر واليوم والعصر. |
| [operator=](./operator=/)(const Calendar\&) |  |
| static [ReadOnly](./readonly/)(const CalendarPtr\&) | يحصل على نسخة التقويم للقراءة فقط. |
| virtual [set_TwoDigitYearMax](./set_twodigityearmax/)(int) | يضبط آخر سنة يمكن تمثيلها برقم مكوّن من رقمين. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | ينشئ كائن [DateTime](../../system/datetime/) من المكونات. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const | ينشئ كائن [DateTime](../../system/datetime/) من المكونات. |
| virtual [ToFourDigitYear](./tofourdigityear/)(int) const | يحوّل السنة إلى سنة مكوّنة من 4 أرقام باستخدام خاصية TwoDigitYearMax. |
## انظر أيضًا

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
