---
title: "System::Globalization::Calendar class"
linktitle: "Calendar"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::Calendar 类。日历定义了日期的处理、计算、格式化等方式。仅在非只读对象上启用设置操作。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 100
url: /zh/cpp/system.globalization/calendar/
---
## Calendar class


[Calendar](./) which defines how the dates are handled, calculated, formatted, etc. Setter operations are only enabled on non-read-only objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Calendar : public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [AddDays](./adddays/)(DateTime, int) const | 向时间点添加天数。 |
| virtual [AddHours](./addhours/)(DateTime, int) const | 向时间点添加小时。 |
| virtual [AddMilliseconds](./addmilliseconds/)(DateTime, double) const | 向时间点添加毫秒。 |
| virtual [AddMinutes](./addminutes/)(DateTime, int) const | 向时间点添加分钟。 |
| virtual [AddMonths](./addmonths/)(DateTime, int) const | 向时间点添加月份。 |
| virtual [AddSeconds](./addseconds/)(DateTime, int) const | 向时间点添加秒数。 |
| virtual [AddWeeks](./addweeks/)(DateTime, int) const | 向时间点添加周数。 |
| virtual [AddYears](./addyears/)(DateTime, int) const | 向时间点添加年份。 |
| [Calendar](./calendar/)(const Calendar\&) | RTTI 信息。 |
| virtual [get_AlgorithmType](./get_algorithmtype/)() const | 获取算法类型。 |
| [get_CurrentEra](./get_currentera/)() const | 获取当前纪元的索引。 |
| [get_CurrentEraValue](./get_currenteravalue/)() const | 获取当前纪元的值。 |
| virtual [get_Eras](./get_eras/)() const | 获取日历中存在的时代列表。 |
| virtual [get_ID](./get_id/)() const | 获取日历标识符。 |
| [get_IsReadOnly](./get_isreadonly/)() const | 检查日历是否为只读。 |
| virtual [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const | 日历支持的最大时间点。 |
| virtual [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const | 日历支持的最小时间点。 |
| virtual [get_TwoDigitYearMax](./get_twodigityearmax/)() const | 获取可以用两位数字表示的最后一年。 |
| virtual [GetDayOfMonth](./getdayofmonth/)(DateTime) const | 获取指定时间点的月份中的天。 |
| virtual [GetDayOfWeek](./getdayofweek/)(DateTime) const | 获取指定时间点的星期几。 |
| virtual [GetDayOfYear](./getdayofyear/)(DateTime) const | 获取指定时间点的年中天。 |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | 获取特定月份的天数。 |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const | 获取特定月份的天数。 |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | 获取特定年份的天数。 |
| virtual [GetDaysInYear](./getdaysinyear/)(int, int) const | 获取特定年份的天数。 |
| virtual [GetEra](./getera/)(DateTime) const | 获取指定时间点的时代。 |
| virtual [GetHour](./gethour/)(DateTime) const | 获取指定时间点的小时。 |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | 获取指定年份的闰月。 |
| virtual [GetLeapMonth](./getleapmonth/)(int, int) const | 获取指定年份的闰月。 |
| virtual [GetMilliseconds](./getmilliseconds/)(DateTime) const | 获取指定时间点的毫秒。 |
| virtual [GetMinute](./getminute/)(DateTime) const | 获取指定时间点的分钟。 |
| virtual [GetMonth](./getmonth/)(DateTime) const | 获取指定时间点的月份。 |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | 获取指定年份的月份数。 |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int, int) const | 获取指定年份的月份数。 |
| virtual [GetSecond](./getsecond/)(DateTime) const | 获取指定时间点的秒数。 |
| virtual [GetWeekOfYear](./getweekofyear/)(DateTime, CalendarWeekRule, DayOfWeek) const | 获取指定时间点的年度周数。 |
| virtual [GetYear](./getyear/)(DateTime) const | 获取指定时间点的年份。 |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 检查该天是否为闰日。 |
| virtual [IsLeapDay](./isleapday/)(int, int, int, int) const | 检查该天是否为闰日。 |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | 检查该月是否为闰月。 |
| virtual [IsLeapMonth](./isleapmonth/)(int, int, int) const | 检查该月是否为闰月。 |
| virtual [IsLeapYear](./isleapyear/)(int) const | 检查该年是否为闰年。 |
| virtual [IsLeapYear](./isleapyear/)(int, int) const | 检查该年是否为闰年。 |
| [IsValidDay](./isvalidday/)(int, int, int, int) const | 检查年份、月份、日期和纪元的值。 |
| [operator=](./operator=/)(const Calendar\&) |  |
| static [ReadOnly](./readonly/)(const CalendarPtr\&) | 获取日历的只读版本。 |
| virtual [set_TwoDigitYearMax](./set_twodigityearmax/)(int) | 设置可以用两位数字表示的最后一年。 |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | 从组件构造 [DateTime](../../system/datetime/) 对象。 |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const | 从组件构造 [DateTime](../../system/datetime/) 对象。 |
| virtual [ToFourDigitYear](./tofourdigityear/)(int) const | 使用 TwoDigitYearMax 属性将年份转换为四位数年份。 |
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
