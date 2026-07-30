---
title: "System::TimeSpan class"
linktitle: "TimeSpan"
second_title: "Aspose.Font 适用于 C++"
description: "System::TimeSpan class. 表示时间间隔。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 6100
url: /zh/cpp/system/timespan/
---
## TimeSpan class


表示时间间隔。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../smartptr/) 类来管理此类型的对象。

```cpp
class TimeSpan
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(TimeSpan) const | 返回一个新的 [TimeSpan](./) 类实例，表示当前对象和指定对象所表示的时间间隔之和。 |
| static [Compare](./compare/)(TimeSpan, TimeSpan) | 比较两个 [TimeSpan](./) 对象。 |
| [CompareTo](./compareto/)(TimeSpan) const | 比较当前对象和指定对象。 |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | 比较当前对象和指定对象。 |
| [Duration](./duration/)() const | 返回一个新的 [TimeSpan](./) 对象实例，其值为当前对象的绝对值。 |
| [Equals](./equals/)(TimeSpan) const | 确定当前对象表示的时间间隔是否等于指定对象表示的时间间隔。 |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | 确定当前对象表示的时间间隔是否等于指定对象表示的时间间隔。 |
| static [Equals](./equals/)(TimeSpan, TimeSpan) | 如果指定对象表示相同的时间间隔，则返回 true；否则返回 false。 |
| static [FromDays](./fromdays/)(double) | 返回一个表示指定间隔的新 [TimeSpan](./) 对象。 |
| static [FromHours](./fromhours/)(double) | 返回一个表示指定间隔的新 [TimeSpan](./) 对象。 |
| static [FromMilliseconds](./frommilliseconds/)(double) | 返回一个表示指定间隔的新 [TimeSpan](./) 对象。 |
| static [FromMinutes](./fromminutes/)(double) | 返回一个表示指定间隔的新 [TimeSpan](./) 对象。 |
| static [FromSeconds](./fromseconds/)(double) | 返回一个表示指定间隔的新 [TimeSpan](./) 对象。 |
| static [FromTicks](./fromticks/)(int64_t) | 返回一个表示指定间隔的新 [TimeSpan](./) 对象。 |
| [get_Days](./get_days/)() const | 返回当前 [TimeSpan](./) 对象表示的时间间隔的天数部分。 |
| [get_Hours](./get_hours/)() const | 返回当前 [TimeSpan](./) 对象表示的时间间隔的小时部分。 |
| [get_Milliseconds](./get_milliseconds/)() const | 返回当前 [TimeSpan](./) 对象表示的时间间隔的毫秒部分。 |
| [get_Minutes](./get_minutes/)() const | 返回当前 [TimeSpan](./) 对象表示的时间间隔的分钟部分。 |
| [get_Seconds](./get_seconds/)() const | 返回当前 [TimeSpan](./) 对象表示的时间间隔的秒数部分。 |
| [get_Ticks](./get_ticks/)() const | 返回构成当前 [TimeSpan](./) 对象表示的时间间隔的 100 纳秒间隔的数量。 |
| [get_TotalDays](./get_totaldays/)() const | 返回当前 [TimeSpan](./) 对象以完整和小数天数表示的值。 |
| [get_TotalHours](./get_totalhours/)() const | 返回当前 [TimeSpan](./) 对象以完整和小数小时表示的值。 |
| [get_TotalMilliseconds](./get_totalmilliseconds/)() const | 返回当前 [TimeSpan](./) 对象以完整和小数毫秒表示的值。 |
| [get_TotalMinutes](./get_totalminutes/)() const | 返回当前 [TimeSpan](./) 对象以完整和小数分钟表示的值。 |
| [get_TotalSeconds](./get_totalseconds/)() const | 返回当前 [TimeSpan](./) 对象以完整和小数秒数表示的值。 |
| [GetHashCode](./gethashcode/)() const | 返回当前对象的哈希码。 |
| [IsNull](./isnull/)() const |  |
| [Negate](./negate/)() const | 返回一个新的 [TimeSpan](./) 对象实例，表示当前 [TimeSpan](./) 对象的取反值。 |
| [operator!=](./operator!=/)(TimeSpan) const | 确定当前对象表示的时间间隔是否不等于指定对象表示的时间间隔。 |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | 返回一个新的 [TimeSpan](./) 类实例，表示当前对象和指定对象所表示的时间间隔之和。 |
| [operator+](./operator+/)() const | 返回自身。 |
| [operator+=](./operator+=/)(TimeSpan) | 将当前对象的时间间隔赋值为当前对象和指定对象表示的时间间隔之和。 |
| [operator-](./operator-/)(TimeSpan) const | 返回一个新的 [TimeSpan](./) 类实例，表示从当前对象表示的时间间隔中减去指定对象表示的时间间隔后的结果。 |
| [operator-](./operator-/)() const | 返回一个新的 [TimeSpan](./) 对象实例，表示当前 [TimeSpan](./) 对象的取反值。 |
| [operator-=](./operator-=/)(TimeSpan) | 将当前对象的时间间隔赋值为从当前对象表示的时间间隔中减去指定对象表示的时间间隔后的结果。 |
| [operator/](./operator//)(double) const |  |
| [operator/](./operator//)(TimeSpan) const |  |
| [operator/=](./operator/=/)(double) |  |
| [operator<](./operator_/)(TimeSpan) const | 确定当前对象表示的时间间隔是否短于指定对象表示的时间间隔。 |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(TimeSpan) const | 确定当前对象表示的时间间隔是否短于或等于指定对象表示的时间间隔。 |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const TimeSpan\&) | 将指定的 [TimeSpan](./) 对象表示的时间间隔设置为当前的 [TimeSpan](./) 对象。 |
| [operator==](./operator==/)(TimeSpan) const | 确定当前对象表示的时间间隔是否等于指定对象表示的时间间隔。 |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(TimeSpan) const | 确定当前对象表示的时间间隔是否长于指定对象表示的时间间隔。 |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(TimeSpan) const | 确定当前对象表示的时间间隔是否长于或等于指定对象表示的时间间隔。 |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | 将字符串转换为等效的 [TimeSpan](./) 对象。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | 使用指定的格式提供程序将字符串转换为等效的 [TimeSpan](./) 对象。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | 使用指定的格式、格式提供程序和样式将字符串转换为等效的 [TimeSpan](./) 对象。 |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | 使用指定的格式、格式提供程序和样式将字符串转换为等效的 [TimeSpan](./) 对象。 |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| [Subtract](./subtract/)(TimeSpan) const | 返回一个新的 [TimeSpan](./) 类实例，表示从当前对象表示的时间间隔中减去指定对象表示的时间间隔后的结果。 |
| [TimeSpan](./timespan/)() | 构造一个表示零时间间隔的 [TimeSpan](./) 对象。 |
| explicit [TimeSpan](./timespan/)(int64_t) | 构造一个表示指定时间间隔的 [TimeSpan](./) 类的实例。 |
| [TimeSpan](./timespan/)(int, int, int) | 构造一个表示时间间隔的 [TimeSpan](./) 类的实例，该时间间隔等于指定的小时、分钟和秒数之和。 |
| [TimeSpan](./timespan/)(int, int, int, int, int) | 构造一个表示时间间隔的 [TimeSpan](./) 类的实例，该时间间隔等于指定的小时、分钟、秒和毫秒之和。 |
| [TimeSpan](./timespan/)(const TimeSpan\&) | 构造一个表示时间间隔的 [TimeSpan](./) 对象，该时间间隔等于指定的 [TimeSpan](./) 对象所表示的时间间隔。 |
| [ToString](./tostring/)() const | 返回当前对象所表示的时间间隔的字符串表示形式。 |
| [ToString](./tostring/)(const String\&) const | 使用指定的格式将当前对象的值转换为等效的字符串表示形式。 |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | 使用指定的格式和格式提供程序将当前对象的值转换为等效的字符串表示形式。 |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| static [TryParse](./tryparse/)(const String\&, TimeSpan\&) | 将字符串转换为等效的 [TimeSpan](./) 对象并返回转换结果。 |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | 使用指定的格式提供程序将字符串转换为等效的 [TimeSpan](./) 对象并返回转换结果。 |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | 使用指定的格式和格式提供程序将字符串转换为等效的 [TimeSpan](./) 对象，并返回转换结果。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | 使用指定的格式、格式提供程序和样式将字符串转换为等效的 [TimeSpan](./) 对象，并返回转换结果。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | 使用指定的格式、格式提供程序和样式将字符串转换为等效的 [TimeSpan](./) 对象，并返回转换结果。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | 使用指定的格式和格式提供程序将字符串转换为等效的 [TimeSpan](./) 对象，并返回转换结果。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [Type](./type/)() | 返回一个表示 [TimeSpan](./) 结构的 [TypeInfo](../typeinfo/) 对象。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [MaxValue](./maxvalue/) | 表示最长可能间隔的 [TimeSpan](./) 对象。 |
| static [MinValue](./minvalue/) | /// 表示最短可能间隔的 [TimeSpan](./) 对象。 |
| static constexpr [TicksPerDay](./ticksperday/) | 一天（24 小时）中 100 纳秒间隔的数量。 |
| static constexpr [TicksPerHour](./ticksperhour/) | 每小时的 100 纳秒间隔数。 |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | 每毫秒的 100 纳秒间隔数。 |
| static constexpr [TicksPerMinute](./ticksperminute/) | 每分钟的 100 纳秒间隔数。 |
| static constexpr [TicksPerSecond](./tickspersecond/) | 每秒的 100 纳秒间隔数。 |
| static [Zero](./zero/) | 表示零间隔的 [TimeSpan](./) 对象。 |
## 备注



```cpp
#include "system/datetime.h"
#include "system/timespan.h"
#include <iostream>

int main()
{
  const auto date1 = System::DateTime(2021, 01, 01);
  const auto date2 = System::DateTime(2021, 10, 30);

  const auto interval = date2 - date1;

  std::cout << "Number of ticks: " << interval.get_Ticks() << std::endl;
  std::cout << "Number of milliseconds: " << interval.get_Milliseconds() << std::endl;
  std::cout << "Total number of milliseconds: " << interval.get_TotalMilliseconds() << std::endl;
  std::cout << "Number of minutes: " << interval.get_Minutes() << std::endl;
  std::cout << "Total number of minutes: " << interval.get_TotalMinutes() << std::endl;
  std::cout << "Number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Total number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Number of days: " << interval.get_Days() << std::endl;
  std::cout << "Total number of days: " << interval.get_TotalDays() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Number of ticks: 260928000000000
Number of milliseconds: 0
Total number of milliseconds: 2.60928e+10
Number of minutes: 0
Total number of minutes: 434880
Number of hours: 0
Total number of hours: 0
Number of days: 302
Total number of days: 302
*/
```

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
