---
title: "فئة System::Globalization::DateTimeFormatInfo"
linktitle: "DateTimeFormatInfo"
second_title: "Aspose.Font لـ C++"
description: "System::Globalization::DateTimeFormatInfo class. مجموعة من معلمات تنسيق التاريخ والوقت. يجب تخصيص كائنات هذه الفئة باستخدام الدالة System::MakeObject() فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 600
url: /ar/cpp/system.globalization/datetimeformatinfo/
---
## DateTimeFormatInfo class


مجموعة من معلمات تنسيق التاريخ والوقت. يجب تخصيص كائنات هذه الفئة باستخدام الدالة [System::MakeObject()](../../system/makeobject/) فقط. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاءً وقت التشغيل أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DateTimeFormatInfo : public virtual System::Object,
                           public System::IFormatProvider,
                           public System::ICloneable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | ينسخ معلومات التنسيق. |
| [DateTimeFormatInfo](./datetimeformatinfo/)() | المنشئ الافتراضي، يُنشئ معلومات تنسيق ثابتة. |
| [get_AbbreviatedDayNames](./get_abbreviateddaynames/)() const | يحصل على أسماء الأيام المختصرة. |
| [get_AbbreviatedMonthGenitiveNames](./get_abbreviatedmonthgenitivenames/)() const | يحصل على أسماء الشهور المختصرة في صيغة المضاف. |
| [get_AbbreviatedMonthNames](./get_abbreviatedmonthnames/)() const | يحصل على أسماء الشهور المختصرة. |
| [get_AMDesignator](./get_amdesignator/)() const | يحصل على مُحدِّد الصباح (AM). |
| [get_Calendar](./get_calendar/)() const | يحصل على التقويم المرتبط بالمُنسّق. |
| [get_CalendarWeekRule](./get_calendarweekrule/)() const | يحصل على قاعدة أسبوع التقويم المرتبطة بالمُنسّق. |
| static [get_CurrentInfo](./get_currentinfo/)() | يحصل على مُنسّق التاريخ والوقت الخاص بالخيط الحالي. |
| [get_DateSeparator](./get_dateseparator/)() const | يحصل على فاصل التاريخ. |
| [get_DayNames](./get_daynames/)() const | يحصل على أسماء الأيام. |
| [get_FirstDayOfWeek](./get_firstdayofweek/)() const | يحصل على أول يوم في الأسبوع. |
| [get_FullDateTimePattern](./get_fulldatetimepattern/)() const | يحصل على نمط التاريخ والوقت الكامل. |
| static [get_InvariantInfo](./get_invariantinfo/)() | يحصل على مُنسّق التاريخ والوقت الثابت. |
| [get_IsReadOnly](./get_isreadonly/)() const | يتحقق مما إذا كان المُنسّق للقراءة فقط. |
| [get_LongDatePattern](./get_longdatepattern/)() const | يحصل على نمط التاريخ الطويل. |
| [get_LongTimePattern](./get_longtimepattern/)() const | يحصل على نمط الوقت الطويل. |
| [get_MonthDayPattern](./get_monthdaypattern/)() const | يحصل على نمط يوم الشهر. |
| [get_MonthGenitiveNames](./get_monthgenitivenames/)() const | يحصل على أسماء الشهور في صيغة المجرور. |
| [get_MonthNames](./get_monthnames/)() const | يحصل على أسماء الشهور. |
| [get_NativeCalendarName](./get_nativecalendarname/)() const | يحصل على اسم التقويم الأصلي إذا كان متاحًا. |
| [get_PMDesignator](./get_pmdesignator/)() const | يحصل على محدد ما بعد الظهر. |
| [get_RFC1123Pattern](./get_rfc1123pattern/)() const | يحصل على نمط RFC1123. |
| [get_ShortDatePattern](./get_shortdatepattern/)() const | يحصل على نمط التاريخ القصير. |
| [get_ShortestDayNames](./get_shortestdaynames/)() const | يحصل على أقصر أسماء الأيام الممكنة. |
| [get_ShortTimePattern](./get_shorttimepattern/)() const | يحصل على نمط الوقت القصير. |
| [get_SortableDateTimePattern](./get_sortabledatetimepattern/)() const | يحصل على نمط التاريخ والوقت القابل للفرز. |
| [get_TimeSeparator](./get_timeseparator/)() const | يحصل على فاصل الوقت. |
| [get_UniversalSortableDateTimePattern](./get_universalsortabledatetimepattern/)() const | يحصل على نمط التاريخ والوقت القابل للفرز عالميًا. |
| [get_YearMonthPattern](./get_yearmonthpattern/)() const | يحصل على نمط السنة والشهر. |
| [GetAbbreviatedDayName](./getabbreviateddayname/)(DayOfWeek) const | يحصل على اسم اليوم المختصر. |
| [GetAbbreviatedEraName](./getabbreviatederaname/)(int) const | يحصل على اسم العصر المختصر. |
| [GetAbbreviatedMonthName](./getabbreviatedmonthname/)(int) const | يحصل على اسم الشهر المختصر. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)() const | يحصل على جميع الأنماط التي يمكن تنسيق قيم التاريخ والوقت بها. |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)(char16_t) const | يحصل على جميع الأنماط التي يمكن تنسيق قيم التاريخ والوقت بها باستخدام سلسلة التنسيق المحددة. |
| [GetDayName](./getdayname/)(DayOfWeek) const | يحصل على اسم اليوم الأسبوعي. |
| [GetEra](./getera/)(const String\&) const | يحصل على العصر بالاسم. |
| [GetEraName](./geteraname/)(int) const | يحصل على اسم العصر. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | يحصل على المنسق من النوع المحدد. |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | يحصل على المنسق المرتبط بمزود التنسيق. |
| [GetLeapYearMonthName](./getleapyearmonthname/)(int) const | يحصل على اسم شهر السنة الكبيسة. |
| [GetMonthGenitiveName](./getmonthgenitivename/)(int) const | يحصل على اسم شهر المجرور. |
| [GetMonthName](./getmonthname/)(int) const | يسترجع اسم الشهر. |
| [GetShortestDayName](./getshortestdayname/)(DayOfWeek) const | يسترجع أقصر اسم لليوم المحدد من الأسبوع. |
| [operator=](./operator=/)(const DateTimeFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(const DateTimeFormatInfoPtr\&) | يحصل على نسخة للقراءة فقط من المنسق. |
| [set_AbbreviatedDayNames](./set_abbreviateddaynames/)(const ArrayPtr\<String\>\&) | يضبط أسماء الأيام المختصرة. |
| [set_AbbreviatedMonthGenitiveNames](./set_abbreviatedmonthgenitivenames/)(const ArrayPtr\<String\>\&) | يضبط أسماء الأشهر المختصرة بصيغة المجرور. |
| [set_AbbreviatedMonthNames](./set_abbreviatedmonthnames/)(const ArrayPtr\<String\>\&) | يضبط أسماء الأشهر المختصرة. |
| [set_AMDesignator](./set_amdesignator/)(const String\&) | يضبط رمز الصباح (AM). |
| [set_Calendar](./set_calendar/)(const SharedPtr\<Calendar\>\&) | يضبط التقويم المرتبط بالمنسق. |
| [set_CalendarWeekRule](./set_calendarweekrule/)(CalendarWeekRule) | يضبط قاعدة أسبوع التقويم المرتبطة بالمنسق. |
| [set_DateSeparator](./set_dateseparator/)(const String\&) | يضبط فاصل التاريخ. |
| [set_DayNames](./set_daynames/)(const ArrayPtr\<String\>\&) | يضبط أسماء الأيام. |
| [set_FirstDayOfWeek](./set_firstdayofweek/)(DayOfWeek) | يضبط أول يوم في الأسبوع. |
| [set_FullDateTimePattern](./set_fulldatetimepattern/)(const String\&) | يضبط نمط التاريخ والوقت الكامل. |
| [set_LongDatePattern](./set_longdatepattern/)(const String\&) | يضبط نمط التاريخ الطويل. |
| [set_LongTimePattern](./set_longtimepattern/)(const String\&) | يضبط نمط الوقت الطويل. |
| [set_MonthDayPattern](./set_monthdaypattern/)(const String\&) | يضبط نمط يوم الشهر. |
| [set_MonthGenitiveNames](./set_monthgenitivenames/)(const ArrayPtr\<String\>\&) | يضبط أسماء الأشهر بصيغة المجرور. |
| [set_MonthNames](./set_monthnames/)(const ArrayPtr\<String\>\&) | يضبط أسماء الأشهر. |
| [set_PMDesignator](./set_pmdesignator/)(const String\&) | يضبط رمز المساء (PM). |
| [set_ShortDatePattern](./set_shortdatepattern/)(const String\&) | يضبط نمط التاريخ القصير. |
| [set_ShortestDayNames](./set_shortestdaynames/)(const ArrayPtr\<String\>\&) | يضبط أقصر أسماء الأيام الممكنة. |
| [set_ShortTimePattern](./set_shorttimepattern/)(const String\&) | يضبط نمط الوقت القصير. |
| [set_TimeSeparator](./set_timeseparator/)(const String\&) | يضبط فاصل الوقت. |
| [set_YearMonthPattern](./set_yearmonthpattern/)(const String\&) | يضبط نمط السنة والشهر. |
| [SetAllDateTimePatterns](./setalldatetimepatterns/)(const ArrayPtr\<String\>\&, char16_t) | يضبط الأنماط للتنسيق المحدد. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
