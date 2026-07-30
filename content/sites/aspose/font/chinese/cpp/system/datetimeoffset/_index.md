---
title: "System::DateTimeOffset 类"
linktitle: "DateTimeOffset"
second_title: "Aspose.Font 适用于 C++"
description: "System::DateTimeOffset 类。包含相对于协调世界时的日期和时间。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 1700
url: /zh/cpp/system/datetimeoffset/
---
## DateTimeOffset class


包含相对于协调世界时的日期和时间。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class DateTimeOffset
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(TimeSpan) const | 向 [DateTimeOffset](./) 对象添加指定的时间间隔。 |
| [AddDays](./adddays/)(double) const | 向 [DateTimeOffset](./) 对象添加指定天数。 |
| [AddHours](./addhours/)(double) const | 向 [DateTimeOffset](./) 对象添加指定小时数。 |
| [AddMilliseconds](./addmilliseconds/)(double) const | 向 [DateTimeOffset](./) 对象添加指定毫秒数。 |
| [AddMinutes](./addminutes/)(double) const | 向 [DateTimeOffset](./) 对象添加指定分钟数。 |
| [AddMonths](./addmonths/)(int) const | 向 [DateTimeOffset](./) 对象添加指定月数。 |
| [AddSeconds](./addseconds/)(double) const | 向 [DateTimeOffset](./) 对象添加指定秒数。 |
| [AddTicks](./addticks/)(int64_t) const | 向 [DateTimeOffset](./) 对象添加指定数量的刻度。 |
| [AddYears](./addyears/)(int) const | 向 [DateTimeOffset](./) 对象添加指定数量的年。 |
| static [Compare](./compare/)(const DateTimeOffset\&, const DateTimeOffset\&) | 比较两个 [DateTimeOffset](./) 对象。 |
| [CompareTo](./compareto/)(const DateTimeOffset\&) const | 比较两个 [DateTimeOffset](./) 对象。 |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | 比较两个 [DateTimeOffset](./) 对象。 |
| [DateTimeOffset](./datetimeoffset/)() | 默认构造函数。 |
| [DateTimeOffset](./datetimeoffset/)(DateTime) | 构造函数。 |
| [DateTimeOffset](./datetimeoffset/)(int64_t, TimeSpan) | 构造函数。 |
| [DateTimeOffset](./datetimeoffset/)(DateTime, TimeSpan) | 构造函数。 |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, TimeSpan) | 构造函数。 |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, TimeSpan) | 构造函数。 |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) | 构造函数。 |
| static [Equals](./equals/)(const DateTimeOffset\&, const DateTimeOffset\&) | 检查两个 [DateTimeOffset](./) 对象是否表示相同的时间点。 |
| [Equals](./equals/)(const DateTimeOffset\&) const | 检查两个 [DateTimeOffset](./) 对象是否表示相同的时间点。 |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | 检查两个 [DateTimeOffset](./) 对象是否表示相同的时间点。 |
| [EqualsExact](./equalsexact/)(const DateTimeOffset\&) const | 检查两个 [DateTimeOffset](./) 对象是否表示相同的时间点并具有相同的偏移量。 |
| [EqualsExact](./equalsexact/)(const SharedPtr\<Object\>\&) const | 检查两个 [DateTimeOffset](./) 对象是否表示相同的时间点并具有相同的偏移量。 |
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) 文件时间转换为带本地时间偏移的日期和时间。 |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) 将 Unix 时间转换为 [DateTimeOffset](./) 对象。 |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) 将 Unix 时间转换为 [DateTimeOffset](./) 对象。 |
| [get_Date](./get_date/)() const | 获取当前对象的日期部分。 |
| [get_DateTime](./get_datetime/)() const | 获取 [DateTime](../datetime/) 值。 |
| [get_Day](./get_day/)() const | 获取当前对象的月份天数。 |
| [get_DayOfWeek](./get_dayofweek/)() const | 获取当前对象的星期几。 |
| [get_DayOfYear](./get_dayofyear/)() const | 获取当前对象的年内天数。 |
| [get_Hour](./get_hour/)() const | 获取当前对象的小时部分。 |
| [get_LocalDateTime](./get_localdatetime/)() const | 获取表示本地日期和时间的 [DateTime](../datetime/) 值。 |
| [get_Millisecond](./get_millisecond/)() const | 获取当前对象的毫秒部分。 |
| [get_Minute](./get_minute/)() const | 获取当前对象的分钟部分。 |
| [get_Month](./get_month/)() const | 获取当前对象的月份部分。 |
| static [get_Now](./get_now/)() | 获取 [DateTimeOffset](./)，其日期和时间设置为当前本地时间，且偏移量设置为本地时间的偏移量。 |
| [get_Offset](./get_offset/)() const | 获取相对于 UTC 的偏移量。 |
| [get_Second](./get_second/)() const | 获取当前对象的秒数部分。 |
| [get_Ticks](./get_ticks/)() const | 获取当前对象的刻度数。 |
| [get_TimeOfDay](./get_timeofday/)() const | 获取当前对象的当天时间。 |
| [get_UtcDateTime](./get_utcdatetime/)() const | 获取表示 UTC 日期和时间的 [DateTime](../datetime/) 值。 |
| static [get_UtcNow](./get_utcnow/)() | 获取 [DateTimeOffset](./)，其日期和时间设置为当前 UTC 时间，且偏移量为 [TimeSpan::Zero](../timespan/zero/)。 |
| [get_UtcTicks](./get_utcticks/)() const | 获取当前对象在 UTC 时间中的刻度数。 |
| [get_Year](./get_year/)() const | 获取当前对象的年份组件。 |
| [GetHashCode](./gethashcode/)() const | 获取当前 [DateTimeOffset](./) 对象的哈希码。 |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | 确定当前对象和指定的 [DateTimeOffset](./) 对象是否表示不同的日期和时间值。 |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | 返回一个新的 [DateTimeOffset](./) 类实例，表示当前对象表示的值与指定时间跨度之和的日期和时间值。 |
| [operator-](./operator-/)(TimeSpan) const | 返回一个新的 [DateTimeOffset](./) 类实例，表示从当前对象表示的值减去指定时间跨度后的日期和时间值。 |
| [operator-](./operator-/)(const DateTimeOffset\&) const | 返回一个 [TimeSpan](../timespan/) 类的实例，表示当前对象和指定对象所表示的日期时间值之间的时间间隔。 |
| [operator<](./operator_/)(const DateTimeOffset\&) const | 确定当前对象表示的日期时间值是否早于指定的 [DateTimeOffset](./) 对象所表示的值。 |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(const DateTimeOffset\&) const | 确定当前对象表示的日期时间值是否早于或等于指定的 [DateTimeOffset](./) 对象所表示的值。 |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator==](./operator==/)(const DateTimeOffset\&) const | 确定当前对象和指定的 [DateTimeOffset](./) 对象是否表示相同的日期和时间值。 |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(const DateTimeOffset\&) const | 确定当前对象表示的日期时间值是否晚于指定的 [DateTimeOffset](./) 对象所表示的值。 |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(const DateTimeOffset\&) const | 确定当前对象表示的日期时间值是否晚于或等于指定的 [DateTimeOffset](./) 对象所表示的值。 |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | 将指定的字符串转换为等价的 [DateTimeOffset](./)。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 使用指定的格式提供程序和格式化样式，将指定的字符串转换为 [DateTimeOffset](./) 对象。 |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 使用指定的格式、格式提供程序和格式化样式，将指定的字符串转换为 [DateTimeOffset](./) 对象。 |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | 使用指定的格式集合、格式提供程序和格式化样式，将指定的字符串转换为 [DateTimeOffset](./) 对象。 |
| [Subtract](./subtract/)(TimeSpan) const | 从当前对象中减去指定的时间间隔。 |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | 从当前对象中减去指定的 [DateTimeOffset](./) 值。 |
| [ToFileTime](./tofiletime/)() const | 将当前对象转换为 [Windows](../../system.windows/) 文件时间。 |
| [ToLocalTime](./tolocaltime/)() const | 将当前对象转换为表示本地时间的对象。 |
| [ToOffset](./tooffset/)(TimeSpan) const | 使用指定的偏移量替换当前对象的偏移量。 |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | 使用指定的格式和格式提供程序，将当前对象转换为字符串。 |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | 使用指定的格式提供程序，将当前对象转换为字符串。 |
| [ToString](./tostring/)(const String\&) const | 使用指定的格式，将当前对象转换为字符串。 |
| [ToString](./tostring/)() const | 将当前对象转换为字符串。 |
| [ToUniversalTime](./touniversaltime/)() const | 将当前对象转换为表示 UTC 时间的对象，. |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | 获取自 Unix 纪元开始以来经过的毫秒数。 |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | 获取自 Unix 纪元开始以来经过的秒数。 |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | 尝试将指定的字符串转换为 [DateTimeOffset](./) 对象。 |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | 尝试使用指定的格式提供程序和格式化样式将指定的字符串转换为 [DateTimeOffset](./) 对象。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | 尝试使用指定的格式集合、格式提供程序和格式化样式将指定的字符串转换为 [DateTimeOffset](./) 对象。 |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | 尝试使用指定的格式、格式提供程序和格式化样式将指定的字符串转换为 [DateTimeOffset](./) 对象。 |
| static [Type](./type/)() | 返回一个表示 [TimeSpan](../timespan/) 结构的 [TypeInfo](../typeinfo/) 对象。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | 获取以刻度为单位的最大偏移量。 |
| static [MaxValue](./maxvalue/) | 获取最大的 [DateTimeOffset](./) 值。 |
| static constexpr [MinOffset](./minoffset/) | 获取以刻度为单位的最小偏移量。 |
| static [MinValue](./minvalue/) | 获取最早的 [DateTimeOffset](./) 值。 |
| static [UnixEpoch](./unixepoch/) | 获取 Unix 纪元的起始时间。 |
## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
