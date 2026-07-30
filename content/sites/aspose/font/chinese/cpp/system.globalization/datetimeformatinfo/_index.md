---
title: "System::Globalization::DateTimeFormatInfo 类"
linktitle: "DateTimeFormatInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::DateTimeFormatInfo 类。日期和时间格式化参数的集合。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 600
url: /zh/cpp/system.globalization/datetimeformatinfo/
---
## DateTimeFormatInfo class


日期和时间格式化参数的集合。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class DateTimeFormatInfo : public virtual System::Object,
                           public System::IFormatProvider,
                           public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | 克隆格式信息。 |
| [DateTimeFormatInfo](./datetimeformatinfo/)() | 默认构造函数，构造不变的格式信息。 |
| [get_AbbreviatedDayNames](./get_abbreviateddaynames/)() const | 获取缩写的星期名称。 |
| [get_AbbreviatedMonthGenitiveNames](./get_abbreviatedmonthgenitivenames/)() const | 获取属格形式的缩写月份名称。 |
| [get_AbbreviatedMonthNames](./get_abbreviatedmonthnames/)() const | 获取缩写的月份名称。 |
| [get_AMDesignator](./get_amdesignator/)() const | 获取上午标识符。 |
| [get_Calendar](./get_calendar/)() const | 获取与格式化程序关联的日历。 |
| [get_CalendarWeekRule](./get_calendarweekrule/)() const | 获取与格式化程序关联的日历周规则。 |
| static [get_CurrentInfo](./get_currentinfo/)() | 获取当前线程的日期和时间格式化程序。 |
| [get_DateSeparator](./get_dateseparator/)() const | 获取日期分隔符。 |
| [get_DayNames](./get_daynames/)() const | 获取星期名称。 |
| [get_FirstDayOfWeek](./get_firstdayofweek/)() const | 获取一周的第一天。 |
| [get_FullDateTimePattern](./get_fulldatetimepattern/)() const | 获取完整的日期和时间模式。 |
| static [get_InvariantInfo](./get_invariantinfo/)() | 获取不变的日期和时间格式化程序。 |
| [get_IsReadOnly](./get_isreadonly/)() const | 检查格式化程序是否为只读。 |
| [get_LongDatePattern](./get_longdatepattern/)() const | 获取长日期模式。 |
| [get_LongTimePattern](./get_longtimepattern/)() const | 获取长时间模式。 |
| [get_MonthDayPattern](./get_monthdaypattern/)() const | 获取月份日模式。 |
| [get_MonthGenitiveNames](./get_monthgenitivenames/)() const | 获取月份的所有格形式名称。 |
| [get_MonthNames](./get_monthnames/)() const | 获取月份名称。 |
| [get_NativeCalendarName](./get_nativecalendarname/)() const | 如果可用，获取本地日历名称。 |
| [get_PMDesignator](./get_pmdesignator/)() const | 获取下午标识符。 |
| [get_RFC1123Pattern](./get_rfc1123pattern/)() const | 获取 RFC1123 模式。 |
| [get_ShortDatePattern](./get_shortdatepattern/)() const | 获取短日期模式。 |
| [get_ShortestDayNames](./get_shortestdaynames/)() const | 获取最短的星期名称。 |
| [get_ShortTimePattern](./get_shorttimepattern/)() const | 获取短时间模式。 |
| [get_SortableDateTimePattern](./get_sortabledatetimepattern/)() const | 获取可排序的日期和时间模式。 |
| [get_TimeSeparator](./get_timeseparator/)() const | 获取时间分隔符。 |
| [get_UniversalSortableDateTimePattern](./get_universalsortabledatetimepattern/)() const | 获取通用可排序的日期和时间模式。 |
| [get_YearMonthPattern](./get_yearmonthpattern/)() const | 获取年份和月份模式。 |
| [GetAbbreviatedDayName](./getabbreviateddayname/)(DayOfWeek) const | 获取星期的缩写名称。 |
| [GetAbbreviatedEraName](./getabbreviatederaname/)(int) const | 获取纪元的缩写名称。 |
| [GetAbbreviatedMonthName](./getabbreviatedmonthname/)(int) const | 获取月份的缩写名称。 |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)() const | 获取日期和时间值可以格式化的所有模式。 |
| [GetAllDateTimePatterns](./getalldatetimepatterns/)(char16_t) const | 使用指定的格式字符串获取日期和时间值可以格式化的所有模式。 |
| [GetDayName](./getdayname/)(DayOfWeek) const | 获取星期名称。 |
| [GetEra](./getera/)(const String\&) const | 按名称获取纪元。 |
| [GetEraName](./geteraname/)(int) const | 获取纪元名称。 |
| [GetFormat](./getformat/)(const TypeInfo\&) override | 获取特定类型的格式化程序。 |
| static [GetInstance](./getinstance/)(const IFormatProviderPtr\&) | 获取与格式提供程序关联的格式化程序。 |
| [GetLeapYearMonthName](./getleapyearmonthname/)(int) const | 获取闰月名称。 |
| [GetMonthGenitiveName](./getmonthgenitivename/)(int) const | 获取月份的所有格形式名称。 |
| [GetMonthName](./getmonthname/)(int) const | 获取月份名称。 |
| [GetShortestDayName](./getshortestdayname/)(DayOfWeek) const | 获取指定星期几的最短名称。 |
| [operator=](./operator=/)(const DateTimeFormatInfo\&) |  |
| static [ReadOnly](./readonly/)(const DateTimeFormatInfoPtr\&) | 获取格式化程序的只读版本。 |
| [set_AbbreviatedDayNames](./set_abbreviateddaynames/)(const ArrayPtr\<String\>\&) | 设置缩写的星期名称。 |
| [set_AbbreviatedMonthGenitiveNames](./set_abbreviatedmonthgenitivenames/)(const ArrayPtr\<String\>\&) | 设置属格形式的缩写月份名称。 |
| [set_AbbreviatedMonthNames](./set_abbreviatedmonthnames/)(const ArrayPtr\<String\>\&) | 设置缩写的月份名称。 |
| [set_AMDesignator](./set_amdesignator/)(const String\&) | 设置上午标识。 |
| [set_Calendar](./set_calendar/)(const SharedPtr\<Calendar\>\&) | 设置与格式化程序关联的日历。 |
| [set_CalendarWeekRule](./set_calendarweekrule/)(CalendarWeekRule) | 设置与格式化程序关联的日历周规则。 |
| [set_DateSeparator](./set_dateseparator/)(const String\&) | 设置日期分隔符。 |
| [set_DayNames](./set_daynames/)(const ArrayPtr\<String\>\&) | 设置星期名称。 |
| [set_FirstDayOfWeek](./set_firstdayofweek/)(DayOfWeek) | 设置一周的第一天。 |
| [set_FullDateTimePattern](./set_fulldatetimepattern/)(const String\&) | 设置完整的日期和时间模式。 |
| [set_LongDatePattern](./set_longdatepattern/)(const String\&) | 设置长日期模式。 |
| [set_LongTimePattern](./set_longtimepattern/)(const String\&) | 设置长时间模式。 |
| [set_MonthDayPattern](./set_monthdaypattern/)(const String\&) | 设置月份日期模式。 |
| [set_MonthGenitiveNames](./set_monthgenitivenames/)(const ArrayPtr\<String\>\&) | 设置属格形式的月份名称。 |
| [set_MonthNames](./set_monthnames/)(const ArrayPtr\<String\>\&) | 设置月份名称。 |
| [set_PMDesignator](./set_pmdesignator/)(const String\&) | 设置下午标识。 |
| [set_ShortDatePattern](./set_shortdatepattern/)(const String\&) | 设置短日期模式。 |
| [set_ShortestDayNames](./set_shortestdaynames/)(const ArrayPtr\<String\>\&) | 设置可能的最短星期名称。 |
| [set_ShortTimePattern](./set_shorttimepattern/)(const String\&) | 设置短时间模式。 |
| [set_TimeSeparator](./set_timeseparator/)(const String\&) | 设置时间分隔符。 |
| [set_YearMonthPattern](./set_yearmonthpattern/)(const String\&) | 设置年月模式。 |
| [SetAllDateTimePatterns](./setalldatetimepatterns/)(const ArrayPtr\<String\>\&, char16_t) | 为指定格式设置模式。 |
## 另见

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
