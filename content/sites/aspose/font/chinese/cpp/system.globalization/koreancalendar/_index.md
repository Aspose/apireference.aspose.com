---
title: "System::Globalization::KoreanCalendar 类"
linktitle: "KoreanCalendar"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::KoreanCalendar 类。韩历。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1700
url: /zh/cpp/system.globalization/koreancalendar/
---
## KoreanCalendar class


韩历。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class KoreanCalendar : public System::Globalization::Calendar
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | RTTI 信息。 |
| [get_AlgorithmType](./get_algorithmtype/)() const override | 获取算法类型。 |
| [get_Eras](./get_eras/)() const override | 获取日历中存在的时代列表。 |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | 日历支持的最大时间点。 |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | 日历支持的最小时间点。 |
| [GetDayOfMonth](./getdayofmonth/)(DateTime) const override | 获取指定时间点的月份中的天。 |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | 获取指定时间点的星期几。 |
| [GetDayOfYear](./getdayofyear/)(DateTime) const override | 获取指定时间点的年中天。 |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | 获取特定月份的天数。 |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | 获取特定月份的天数。 |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | 获取特定年份的天数。 |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | 获取特定年份的天数。 |
| [GetEra](./getera/)(DateTime) const override | 获取指定时间点的时代。 |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | 获取指定年份的闰月。 |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | 获取指定年份的闰月。 |
| [GetMonth](./getmonth/)(DateTime) const override | 获取指定时间点的月份。 |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | 获取指定年份的月份数。 |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | RTTI 信息。 |
| [GetYear](./getyear/)(DateTime) const override | 获取指定时间点的年份。 |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | 检查该天是否为闰日。 |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 检查该天是否为闰日。 |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | 检查该月是否为闰月。 |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | 检查该月是否为闰月。 |
| [IsLeapYear](./isleapyear/)(int, int) const override | 检查该年是否为闰年。 |
| virtual [IsLeapYear](./isleapyear/)(int) const | 检查该年是否为闰年。 |
| [KoreanCalendar](./koreancalendar/)() | 构造函数。 |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | 从组件构造 [DateTime](../../system/datetime/) 对象。 |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | 从组件构造 [DateTime](../../system/datetime/) 对象。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [KoreanEra](./koreanera/) | 当前韩历纪元。 |
## 另见

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
