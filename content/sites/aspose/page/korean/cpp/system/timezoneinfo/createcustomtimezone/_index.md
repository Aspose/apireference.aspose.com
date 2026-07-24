---
title: "System::TimeZoneInfo::CreateCustomTimeZone 메서드"
linktitle: "CreateCustomTimeZone"
second_title: "C++용 Aspose.Page"
description: "System::TimeZoneInfo::CreateCustomTimeZone 메서드. C++에서 사용자 정의 시간대를 생성합니다."
type: docs
weight: 700
url: /ko/cpp/system/timezoneinfo/createcustomtimezone/
---
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&) method


사용자 정의 시간대를 생성합니다.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| id | const String\& | 시간대 식별자. |
| base_utc_offset | TimeSpan | 현재 시간대의 표준 시간과 UTC 시간 사이의 시간 간격. |
| display_name | const String\& | 표시 이름. |
| standard_display_name | const String\& | 표준 시간 이름. |

### ReturnValue

새 시간대.

## 또 보기

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) method


사용자 정의 시간대를 생성합니다.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| id | const String\& | 시간대 식별자. |
| base_utc_offset | TimeSpan | 현재 시간대의 표준 시간과 UTC 시간 사이의 시간 간격. |
| display_name | const String\& | 표시 이름. |
| standard_display_name | const String\& | 표준 시간 이름. |
| daylight_display_name | const String\& | 일광 절약 시간 이름. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | 조정 규칙의 [Array](../../array/). |

### ReturnValue

새 시간대.

## 또 보기

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) method


사용자 정의 시간대를 생성합니다.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules, bool disable_daylight_saving_time)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| id | const String\& | 시간대 식별자. |
| base_utc_offset | TimeSpan | 현재 시간대의 표준 시간과 UTC 시간 사이의 시간 간격. |
| display_name | const String\& | 표시 이름. |
| standard_display_name | const String\& | 표준 시간 이름. |
| daylight_display_name | const String\& | 일광 절약 시간 이름. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | 조정 규칙의 [Array](../../array/). |
| disable_daylight_saving_time | bool | True는 adjustment_rules에 존재하는 모든 일광 절약 시간 정보를 버립니다. |

### ReturnValue

새 시간대.

## 또 보기

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
