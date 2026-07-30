---
title: "System::DateTime 类"
linktitle: "DateTime"
second_title: "Aspose.Font 适用于 C++"
description: "System::DateTime 类。表示时间连续体上的特定日期和时间值。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 1600
url: /zh/cpp/system/datetime/
---
## DateTime class


表示时间连续体上的特定日期和时间值。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../smartptr/) 类来管理此类型的对象。

```cpp
class DateTime
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(TimeSpan) const | 返回一个新的 [DateTime](./) 类实例，表示将指定的时间跨度添加到当前对象所表示的日期和时间值后得到的日期和时间值。 |
| [AddDays](./adddays/)(double) const | 返回一个新的 [DateTime](./) 类实例，表示当前对象所表示的值与指定天数之和的日期和时间值。 |
| [AddHours](./addhours/)(double) const | 返回一个新的 [DateTime](./) 类实例，表示当前对象所表示的值与指定小时数之和的日期和时间值。 |
| [AddMilliseconds](./addmilliseconds/)(double) const | 返回一个新的 [DateTime](./) 类实例，表示当前对象所表示的值与指定毫秒数之和的日期和时间值。 |
| [AddMinutes](./addminutes/)(double) const | 返回一个新的 [DateTime](./) 类实例，表示当前对象所表示的值与指定分钟数之和的日期和时间值。 |
| [AddMonths](./addmonths/)(int) const | 返回一个新的 [DateTime](./) 类实例，表示当前对象所表示的值与指定月数之和的日期和时间值。 |
| [AddSeconds](./addseconds/)(double) const | 返回一个新的 [DateTime](./) 类实例，表示当前对象所表示的值与指定秒数之和的日期和时间值。 |
| [AddTicks](./addticks/)(int64_t) const | 返回一个新的 [DateTime](./) 类实例，表示当前对象所表示的值与指定的 100 纳秒间隔之和的日期和时间值。 |
| [AddYears](./addyears/)(int) const | 返回一个新的 [DateTime](./) 类实例，表示在当前对象所表示的日期和时间值的年份组件增加指定数量后的日期和时间值。 |
| static [Compare](./compare/)(DateTime, DateTime) | 比较由指定的 [DateTime](./) 类实例表示的两个值，并返回指示这些值在时间线上的相对位置的值。 |
| [CompareTo](./compareto/)(DateTime) const | 比较当前对象与指定的 [DateTime](./) 类实例所表示的两个日期时间值，并返回指示这些值在时间线上的相对位置的值。 |
| [DateTime](./datetime/)() | 构造一个实例，表示等于 MinValue 的最小可能的日期和时间值。 |
| [DateTime](./datetime/)(int, int, int) | 构造一个实例，该实例表示指定为特定年份、月份和日期的日期时间值。 |
| [DateTime](./datetime/)(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | 构造一个实例，该实例表示在指定日历中指定为特定年份、月份和日期的日期时间值。 |
| [DateTime](./datetime/)(int, int, int, int, int, int) | 构造一个实例，该实例表示指定为特定年份、月份、日期、小时、分钟和秒的日期时间值。 |
| [DateTime](./datetime/)(int, int, int, int, int, int, DateTimeKind) | 构造一个实例，该实例表示指定为特定年份、月份、日期、小时、分钟和秒的日期时间值。 |
| [DateTime](./datetime/)(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | 构造一个实例，该实例表示在指定日历中指定为特定年份、月份、日期、小时、分钟和秒的日期时间值。 |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, DateTimeKind) | 构造一个实例，该实例表示指定为特定年份、月份、日期、小时、分钟、秒和毫秒的日期时间值。 |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) | 构造一个实例，该实例表示在指定日历中指定为特定年份、月份、日期、小时、分钟、秒和毫秒的日期时间值。 |
| [DateTime](./datetime/)(int64_t, DateTimeKind) | 构造一个实例，该实例表示以滴答数指定的日期时间值。 |
| [DateTime](./datetime/)(int64_t, DateTimeKind, bool) | 构造一个实例，该实例表示以滴答数指定的日期时间值。供内部使用。 |
| [DateTime](./datetime/)(const DateTime\&) | 复制构造一个实例。 |
| static [DaysInMonth](./daysinmonth/)(int, int) | 返回指定年份中指定月份的天数。 |
| static [Equals](./equals/)(DateTime, DateTime) | 确定指定的 [DateTime](./) 类实例是否表示相同的日期时间值。 |
| [Equals](./equals/)(DateTime) const | 确定指定的 [DateTime](./) 类实例是否表示与当前对象相同的日期时间值。 |
| static [FromBinary](./frombinary/)(int64_t) | 从指定的无符号 64 位整数反序列化日期时间值，并将新的 [DateTime](./) 类实例设置为该值。 |
| static [FromFileTime](./fromfiletime/)(int64_t) | 将指定的文件时间转换为表示本地时间相同日期时间值的 [DateTime](./) 类实例。 |
| static [FromFileTimeUtc](./fromfiletimeutc/)(int64_t) | 将指定的文件时间转换为表示 UTC 时间相同日期时间值的 [DateTime](./) 类实例。 |
| static [FromOADate](./fromoadate/)(double) | 返回一个表示等同于指定 OLE Automation 日期的日期时间值的 [DateTime](./) 类实例。 |
| static [FromUnixTime](./fromunixtime/)(time_t) | 将指定的 Unix 时间值转换为 [DateTime](./) 类实例。供内部使用。 |
| [get_Date](./get_date/)() const | 返回一个新的 [DateTime](./) 类实例，该实例表示当前对象所表示的日期时间的日期部分，并将时间部分的每个组件设为 0。 |
| [get_Day](./get_day/)() const | 返回当前对象所表示的月份中日期的序号。 |
| [get_DayOfWeek](./get_dayofweek/)() const | 返回一个表示当前对象所表示的星期几的值。 |
| [get_DayOfYear](./get_dayofyear/)() const | 返回当前对象所表示的年份中日期的序号。 |
| [get_Hour](./get_hour/)() const | 返回当前对象所表示的日期时间值的小时组件。 |
| [get_Kind](./get_kind/)() const | 返回一个值，表示当前对象所表示的日期时间是本地时间、UTC 时间还是两者都不是。 |
| [get_Millisecond](./get_millisecond/)() const | 返回当前对象所表示的日期时间值的毫秒组件。 |
| [get_Minute](./get_minute/)() const | 返回当前对象所表示的日期时间值的分钟组件。 |
| [get_Month](./get_month/)() const | 返回当前对象所表示的年份中月份的序数。 |
| static [get_Now](./get_now/)() | 返回一个表示本地时间的 [DateTime](./) 类实例。 |
| [get_Second](./get_second/)() const | 返回当前对象所表示的日期时间值的秒组件。 |
| [get_Ticks](./get_ticks/)() const | 返回自公元 0001 年 1 月 1 日 0:00:00 UTC（格里历）起至当前对象所表示的日期时间之间经过的 100 纳秒间隔数。 |
| [get_TimeOfDay](./get_timeofday/)() const | 返回表示从当前对象所表示的当天起始时刻到该对象所表示的日期时间之间的时间间隔的值。 |
| static [get_Today](./get_today/)() | 返回一个 [DateTime](./) 类实例，该实例表示当前日期，且时间部分的各组件均设为 0。 |
| static [get_UtcNow](./get_utcnow/)() | 返回一个表示当前 UTC 时间的 [DateTime](./) 类实例。 |
| [get_Year](./get_year/)() const | 返回当前对象所表示的年份。 |
| [GetDateComponents](./getdatecomponents/)(int\&, int\&, int\&) const | 获取日期部分。仅供内部使用。 |
| [GetDateTimeFormats](./getdatetimeformats/)() const | 返回字符串数组，其中每个元素是使用标准日期时间格式说明符之一格式化当前对象后的字符串表示。 |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t) const | 返回字符串数组，其中每个元素是使用指定的标准日期时间格式说明符格式化当前对象后的字符串表示。 |
| [GetDateTimeFormats](./getdatetimeformats/)(const SharedPtr\<IFormatProvider\>\&) const | 返回字符串数组，其中每个元素是使用标准日期时间格式说明符之一和指定的格式提供程序格式化当前对象后的字符串表示。 |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t, const SharedPtr\<IFormatProvider\>\&) const | 返回字符串数组，其中每个元素是使用指定的标准日期时间格式说明符和格式提供程序格式化当前对象后的字符串表示。 |
| [GetHashCode](./gethashcode/)() const | 返回当前对象的哈希码。 |
| [IsDaylightSavingTime](./isdaylightsavingtime/)() const | 确定当前对象所表示的日期时间值是否位于当前时区的夏令时范围内。 |
| static [IsLeapYear](./isleapyear/)(int) | 确定指定的年份是否为闰年。 |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(DateTime) const | 确定当前对象与指定的 [DateTime](./) 对象是否表示不同的日期时间值。 |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | 返回一个新的 [DateTime](./) 类实例，该实例表示当前对象的值与指定时间跨度之和的日期时间值。 |
| [operator+=](./operator+=/)(TimeSpan) | 将当前对象设置为当前对象的值与指定时间跨度之和的日期时间值。 |
| [operator-](./operator-/)(TimeSpan) const | 返回一个新的 [DateTime](./) 类实例，表示从当前对象的值中减去指定时间跨度后的日期时间值。 |
| [operator-](./operator-/)(DateTime) const | 返回一个 [TimeSpan](../timespan/) 类的实例，表示当前对象和指定对象所表示的日期时间值之间的时间间隔。 |
| [operator-=](./operator-=/)(TimeSpan) | 将当前对象设置为从当前对象的日期时间值中减去指定时间跨度后的结果。 |
| [operator<](./operator_/)(DateTime) const | 确定当前对象表示的日期时间值是否早于指定的 [DateTime](./) 对象所表示的值。 |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(DateTime) const | 确定当前对象表示的日期时间值是否早于或等于指定的 [DateTime](./) 对象所表示的值。 |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const DateTime\&) | 将指定的 [DateTime](./) 实例所表示的值赋给当前对象。 |
| [operator==](./operator==/)(DateTime) const | 确定当前对象与指定的 [DateTime](./) 对象是否表示相同的日期时间值。 |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(DateTime) const | 确定当前对象表示的日期时间值是否晚于指定的 [DateTime](./) 对象所表示的值。 |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(DateTime) const | 确定当前对象表示的日期和时间值是否晚于或等于指定的 [DateTime](./) 对象所表示的值。 |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | 将指定的日期和时间值的字符串表示转换为等效的 [DateTime](./) 对象。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 使用特定于文化的格式信息，将指定的日期和时间值的字符串表示转换为等效的 [DateTime](./) 对象。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 使用指定的格式和特定于文化的格式信息，将指定的日期和时间值的字符串表示转换为等效的 [DateTime](./) 对象。字符串表示的格式必须完全匹配指定的格式。如果转换失败，将抛出异常。 |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 使用指定的格式集合、特定于文化的格式信息和样式，将指定的日期和时间值的字符串表示转换为等效的 [DateTime](./) 对象。字符串表示的格式必须完全匹配一个或多个指定的格式。如果转换失败，将抛出异常。 |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [SpecifyKind](./specifykind/)(DateTime, DateTimeKind) | 构造一个新的 [DateTime](./) 对象，该对象表示与指定的 [DateTime](./) 对象相同的刻度数，并根据参数 **kind** 指定为本地时间、UTC 时间或两者皆非。 |
| [Subtract](./subtract/)(TimeSpan) const | 返回一个新的 [DateTime](./) 类实例，表示从当前对象的值中减去指定时间跨度后的日期时间值。 |
| [Subtract](./subtract/)(DateTime) const | 返回一个 [TimeSpan](../timespan/) 类的实例，表示当前对象和指定对象所表示的日期时间值之间的时间间隔。 |
| [ToBinary](./tobinary/)() const | 序列化当前对象。 |
| [ToFileTime](./tofiletime/)() const | 返回一个值，表示当前对象所表示的日期时间值的文件时间（File time）。 |
| [ToFileTimeUtc](./tofiletimeutc/)() const | 将当前对象所表示的日期时间值转换为 UTC 文件时间（File time UTC）。 |
| [ToLocalTime](./tolocaltime/)() const | 返回一个新的 [DateTime](./) 类实例，表示当前对象所表示的日期时间值的本地时间。 |
| [ToLongDateString](./tolongdatestring/)() const | 返回一个字符串，包含当前对象的长日期字符串表示。 |
| [ToLongTimeString](./tolongtimestring/)() const | 返回一个字符串，包含当前对象的长时间字符串表示。 |
| [ToOADate](./tooadate/)() const | 返回当前对象所表示的日期时间值，作为 OLE Automation 日期。 |
| [ToShortDateString](./toshortdatestring/)() const | 返回一个字符串，包含当前对象的短日期字符串表示。 |
| [ToShortTimeString](./toshorttimestring/)() const | 返回一个字符串，包含当前对象的短时间字符串表示。 |
| [ToString](./tostring/)() const | 返回当前对象所表示的日期时间值的字符串表示，使用当前文化定义的格式约定。 |
| [ToString](./tostring/)(const String\&) const | 返回当前对象所表示的日期时间值的字符串表示，使用指定的格式以及当前文化定义的格式约定。 |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | 返回当前对象所表示的日期时间值的字符串表示，使用指定的格式信息。 |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | 返回当前对象所表示的日期时间值的字符串表示，使用指定的格式信息。 |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToUniversalTime](./touniversaltime/)() const | 返回一个新的 [DateTime](./) 类实例，表示当前对象所表示的日期时间值的 UTC 时间。 |
| [ToUnixTime](./tounixtime/)() const | 返回一个值，表示当前对象所表示的日期时间值的 Unix 时间。仅供内部使用。 |
| static [TryParse](./tryparse/)(const String\&, DateTime\&) | 将指定的日期和时间值的字符串表示转换为等效的 [DateTime](./) 对象。 |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | 使用指定的特定于文化的格式信息和样式，将指定的日期和时间值的字符串表示转换为等效的 [DateTime](./) 对象。 |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | 使用指定的格式、特定于文化的格式信息和样式，将指定的日期和时间值的字符串表示转换为等效的 [DateTime](./) 对象。字符串表示的格式必须完全匹配指定的格式。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | 使用指定的格式集合、特定于文化的格式信息和样式，将指定的日期和时间值的字符串表示转换为等效的 [DateTime](./) 对象。字符串表示的格式必须完全匹配一个或多个指定的格式。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [Type](./type/)() | 返回一个 [TypeInfo](../typeinfo/) 对象，其中包含关于此类的信息。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [MaxTicks](./maxticks/) | 在最小可能值和最大可能值的 [DateTime](./) 值之间的时间间隔中，100 纳秒的计数。 |
| static [MaxValue](./maxvalue/) | 表示最大可能日期和时间值的 [DateTime](./) 类实例。 |
| static constexpr [MinTicks](./minticks/) | [DateTime](./) 类实例能够表示的最小刻度数。 |
| static [MinValue](./minvalue/) | 表示最小可能日期和时间值的 [DateTime](./) 类实例。 |
| static constexpr [TicksPerDay](./ticksperday/) | 一天中的刻度数。 |
| static constexpr [TicksPerHour](./ticksperhour/) | 一小时中的刻度数。 |
| static constexpr [TicksPerMicrosecond](./tickspermicrosecond/) | 一微秒中的刻度数。 |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | 一毫秒中的刻度数。 |
| static constexpr [TicksPerMinute](./ticksperminute/) | 一分钟中的刻度数。 |
| static constexpr [TicksPerSecond](./tickspersecond/) | 一秒中的刻度数。 |
| static [UnixEpoch](./unixepoch/) | 表示 Unix 纪元起始时间 (1970.01.01 00:00:00) 的 [DateTime](./) 类实例。 |
## 备注



```cpp
#include "system/console.h"
#include "system/date_time.h"

int main()
{
  using namespace System;

  // 创建 'DateTime' 类实例。
  DateTime dateTime{1990, 10, 30};

  // 以多种格式打印该实例。
  Console::WriteLine(dateTime.ToShortDateString());
  Console::WriteLine(dateTime.ToShortTimeString());
  Console::WriteLine(dateTime.ToString());

  return 0;
}
/*
This code example produces the following output:
30.10.1990
0:00
30.10.1990 0:00:00
*/
```

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
