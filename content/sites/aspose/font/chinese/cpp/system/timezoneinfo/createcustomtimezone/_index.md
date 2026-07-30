---
title: "System::TimeZoneInfo::CreateCustomTimeZone 方法"
linktitle: "CreateCustomTimeZone"
second_title: "Aspose.Font 适用于 C++"
description: "System::TimeZoneInfo::CreateCustomTimeZone 方法。创建一个自定义时区（C++）。"
type: docs
weight: 700
url: /zh/cpp/system/timezoneinfo/createcustomtimezone/
---
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&) method


创建自定义时区。

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 标识符 | const String\& | 时区标识符。 |
| base_utc_offset | TimeSpan | 当前时区标准时间与 UTC 时间之间的时间间隔。 |
| display_name | const String\& | 显示名称。 |
| standard_display_name | const String\& | 标准时间名称。 |

### ReturnValue

新时区。

## 另见

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) method


创建自定义时区。

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 标识符 | const String\& | 时区标识符。 |
| base_utc_offset | TimeSpan | 当前时区标准时间与 UTC 时间之间的时间间隔。 |
| display_name | const String\& | 显示名称。 |
| standard_display_name | const String\& | 标准时间名称。 |
| daylight_display_name | const String\& | 夏令时名称。 |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) 调整规则的数组。 |

### ReturnValue

新时区。

## 另见

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) method


创建自定义时区。

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules, bool disable_daylight_saving_time)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 标识符 | const String\& | 时区标识符。 |
| base_utc_offset | TimeSpan | 当前时区标准时间与 UTC 时间之间的时间间隔。 |
| display_name | const String\& | 显示名称。 |
| standard_display_name | const String\& | 标准时间名称。 |
| daylight_display_name | const String\& | 夏令时名称。 |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) 调整规则的数组。 |
| disable_daylight_saving_time | bool | True 以丢弃 adjustment_rules 中存在的任何夏令时信息。 |

### ReturnValue

新时区。

## 另见

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
