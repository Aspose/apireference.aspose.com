---
title: "System::Globalization::TaiwanLunisolarCalendar 类"
linktitle: "TaiwanLunisolarCalendar"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::TaiwanLunisolarCalendar 类。台湾阴历。未实现。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2600
url: /zh/cpp/system.globalization/taiwanlunisolarcalendar/
---
## TaiwanLunisolarCalendar class


台湾阴历。未实现。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class TaiwanLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | RTTI 信息。 |
| [get_Eras](./get_eras/)() const override | 获取日历中存在的时代列表。 |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | 日历支持的最大时间点。 |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | 日历支持的最小时间点。 |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | 获取特定月份的天数。 |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | 获取特定月份的天数。 |
| [GetEra](./getera/)(DateTime) const override | 获取指定时间点的时代。 |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | 获取指定年份的闰月。 |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | 获取指定年份的闰月。 |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | 获取指定年份的月份数。 |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | RTTI 信息。 |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | 检查该天是否为闰日。 |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 检查该天是否为闰日。 |
| [IsLeapYear](./isleapyear/)(int, int) const override | 检查该年是否为闰年。 |
| virtual [IsLeapYear](./isleapyear/)(int) const | 检查该年是否为闰年。 |
| [TaiwanLunisolarCalendar](./taiwanlunisolarcalendar/)() | 构造函数。 |
## 另见

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
