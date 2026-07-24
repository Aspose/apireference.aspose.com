---
title: "System::TimeZoneInfo::CreateCustomTimeZone メソッド"
linktitle: "CreateCustomTimeZone"
second_title: "C++ 用 Aspose.Page"
description: "System::TimeZoneInfo::CreateCustomTimeZone メソッド。C++ でカスタムタイムゾーンを作成します。"
type: docs
weight: 700
url: /ja/cpp/system/timezoneinfo/createcustomtimezone/
---
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&) method


カスタムタイムゾーンを作成します。

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| id | const String\& | タイムゾーンの識別子。 |
| base_utc_offset | TimeSpan | 現在のタイムゾーンの標準時と UTC 時間との間の時間間隔。 |
| display_name | const String\& | 表示名。 |
| standard_display_name | const String\& | 標準時の名前。 |

### ReturnValue

新しいタイムゾーン。

## 参照

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) method


カスタムタイムゾーンを作成します。

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| id | const String\& | タイムゾーンの識別子。 |
| base_utc_offset | TimeSpan | 現在のタイムゾーンの標準時と UTC 時間との間の時間間隔。 |
| display_name | const String\& | 表示名。 |
| standard_display_name | const String\& | 標準時の名前。 |
| daylight_display_name | const String\& | 夏時間の名前。 |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) 調整規則の配列。 |

### ReturnValue

新しいタイムゾーン。

## 参照

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) method


カスタムタイムゾーンを作成します。

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules, bool disable_daylight_saving_time)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| id | const String\& | タイムゾーンの識別子。 |
| base_utc_offset | TimeSpan | 現在のタイムゾーンの標準時と UTC 時間との間の時間間隔。 |
| display_name | const String\& | 表示名。 |
| standard_display_name | const String\& | 標準時の名前。 |
| daylight_display_name | const String\& | 夏時間の名前。 |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) 調整規則の配列。 |
| disable_daylight_saving_time | bool | True は adjustment_rules に存在するすべての夏時間情報を破棄します。 |

### ReturnValue

新しいタイムゾーン。

## 参照

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
