---
title: "System::TimeZoneInfo 类"
linktitle: "TimeZoneInfo"
second_title: "Aspose.Font 适用于 C++"
description: "System::TimeZoneInfo 类。表示描述特定时区的信息。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 6300
url: /zh/cpp/system/timezoneinfo/
---
## TimeZoneInfo class


表示描述特定时区的信息。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class TimeZoneInfo : public System::IEquatable<TimeZoneInfoPtr>
```

## Nested classes

* Class [AdjustmentRule](./adjustmentrule/)
* Class [TransitionTime](./transitiontime/)
## 方法

| 方法 | 描述 |
| --- | --- |
| static [ClearCachedData](./clearcacheddata/)() | 清除缓存的时区数据。 |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) 将时间从一个时区转换到另一个时区。 |
| static [ConvertTime](./converttime/)(const DateTimeOffset\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) 将时间转换为指定时区的时间。 |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&) | [Convert](../convert/) 将时间转换为指定时区的时间。 |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&) | [Convert](../convert/) 将时间转换为指定时区的时间。 |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(const DateTimeOffset\&, const String\&) | [Convert](../convert/) 将时间转换为指定时区的时间。 |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&, const String\&) | [Convert](../convert/) 将时间转换为指定时区的时间。 |
| static [ConvertTimeFromUtc](./converttimefromutc/)(DateTime, const TimeZoneInfoPtr\&) | 将 UTC 时间转换为指定时区的时间。 |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime, const TimeZoneInfoPtr\&) | 将时间转换为 UTC 时间。 |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime) | 将时间转换为 UTC 时间。 |
| static [ConvertTimeToUtcNoThrow](./converttimetoutcnothrow/)(DateTime) | 将时间转换为 UTC 时间。供内部使用。 |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) | 创建自定义时区。 |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) | 创建自定义时区。 |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&) | 创建自定义时区。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(TimeZoneInfoPtr) override | 确定当前对象和指定对象是否相等。 |
| static [FindSystemTimeZoneById](./findsystemtimezonebyid/)(const String\&) | 获取具有指定标识符的时区。 |
| [get_BaseUtcOffset](./get_baseutcoffset/)() const | 返回一个 [TimeSpan](../timespan/) 实例，表示当前时区标准时间与 UTC 时间之间的时间间隔。 |
| [get_DaylightName](./get_daylightname/)() const | 获取当前时区夏令时的名称。 |
| [get_DisplayName](./get_displayname/)() const | 获取当前时区的名称。 |
| [get_Id](./get_id/)() const | 返回当前对象所表示的时区标识符。 |
| static [get_Local](./get_local/)() | 返回一个表示本地时区的 [TimeZoneInfo](./) 实例。 |
| [get_StandardName](./get_standardname/)() const | 获取当前时区标准时间的名称。 |
| [get_SupportsDaylightSavingTime](./get_supportsdaylightsavingtime/)() const | 获取指示时区是否具有夏令时规则的标志。 |
| static [get_Utc](./get_utc/)() | 返回一个表示 UTC 时区的 [TimeZoneInfo](./) 实例。 |
| [GetAdjustmentRules](./getadjustmentrules/)() const | 返回一个数组，其中包含表示适用于当前 [TimeZoneInfo](./) 对象的调整规则的 [AdjustmentRule](./adjustmentrule/) 对象。 |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(DateTime) const | 获取指定日期时间可以映射到的 UTC 日期和时间。 |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(const DateTimeOffset\&) const | 获取指定日期时间可以映射到的 UTC 日期和时间。 |
| [GetHashCode](./gethashcode/)() const override | 相当于 C# 的 [Object.GetHashCode()](../object/gethashcode/) 方法。支持对自定义对象进行哈希。 |
| static [GetSystemTimeZones](./getsystemtimezones/)() | 获取本地系统上所有可用时区的已排序集合。 |
| [GetUtcOffset](./getutcoffset/)(DateTime) const | 计算指定日期和时间在此时区与 UTC 时区之间的时间差。 |
| [GetUtcOffset](./getutcoffset/)(const DateTimeOffset\&) const | 计算指定日期和时间在此时区与 UTC 时区之间的时间差。 |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&) | 内部辅助函数，返回指定时区中 UTC 日期时间的 UTC 偏移量。仅供内部使用。 |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&, bool\&, bool\&) | 内部辅助函数，返回指定时区中 UTC 日期时间的 UTC 偏移量。仅供内部使用。 |
| [GetUtcOffsetNoThrow](./getutcoffsetnothrow/)(DateTime) const | 计算指定日期和时间在此时区与 UTC 时区之间的时间差。仅供内部使用。 |
| [HasSameRules](./hassamerules/)(const TimeZoneInfoPtr\&) const | 检查当前时区和另一个时区是否具有相同的调整规则。 |
| [IsAmbiguousTime](./isambiguoustime/)(DateTime) const | 检查指定的日期和时间是否模糊，且可能映射到多个 UTC 时间。 |
| [IsAmbiguousTime](./isambiguoustime/)(const DateTimeOffset\&) const | 检查指定的日期和时间是否模糊，且可能映射到多个 UTC 时间。 |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) const | 检查指定的日期和时间是否位于夏令时范围内。 |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(const DateTimeOffset\&) const | 检查指定的日期和时间是否位于夏令时范围内。 |
| [IsDaylightSavingTimeNoThrow](./isdaylightsavingtimenothrow/)(DateTime) const | 检查指定的日期和时间是否位于夏令时范围内。 |
| [IsInvalidTime](./isinvalidtime/)(DateTime) const | 检查指定的日期和时间是否无效。 |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../object/tostring/) 方法的类似实现。支持将自定义对象转换为字符串。 |
| static [TransitionTimeToDateTime](./transitiontimetodatetime/)(int32_t, const TransitionTime\&) | 辅助函数，将年份和 [TransitionTime](./transitiontime/) 转换为 [DateTime](../datetime/)。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [AdjustmentRulePtr](./adjustmentruleptr/) | [AdjustmentRule](./adjustmentrule/) 类实例的共享指针别名。 |
## 另见

* Class [IEquatable](../iequatable/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
