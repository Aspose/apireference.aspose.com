---
title: "System::Globalization::UmAlQuraCalendar 类"
linktitle: "UmAlQuraCalendar"
second_title: "Aspose.Font 适用于 C++"
description: "System::Globalization::UmAlQuraCalendar 类。Um Al Qura 日历。未实现。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 3000
url: /zh/cpp/system.globalization/umalquracalendar/
---
## UmAlQuraCalendar class


Um Al Qura 日历。未实现。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class UmAlQuraCalendar : public System::Globalization::Calendar
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Clone](./clone/)() override | RTTI 信息。 |
| [get_AlgorithmType](./get_algorithmtype/)() const override | 获取算法类型。 |
| [get_Eras](./get_eras/)() const override | 获取日历中存在的时代列表。 |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | 日历支持的最大时间点。 |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | 日历支持的最小时间点。 |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | 获取指定时间点的星期几。 |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | 获取指定年份的闰月。 |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | RTTI 信息。 |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | 检查该天是否为闰日。 |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | 检查该天是否为闰日。 |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | 检查该月是否为闰月。 |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | 检查该月是否为闰月。 |
| [IsLeapYear](./isleapyear/)(int, int) const override | 检查该年是否为闰年。 |
| virtual [IsLeapYear](./isleapyear/)(int) const | 检查该年是否为闰年。 |
| [set_TwoDigitYearMax](./set_twodigityearmax/)(int) override | 设置可以用两位数字表示的最后一年。 |
| [UmAlQuraCalendar](./umalquracalendar/)() | 构造函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [UmAlQuraEra](./umalquraera/) | 当前 UmAlQura 纪元。 |
## 另见

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Font for C++](../../)
