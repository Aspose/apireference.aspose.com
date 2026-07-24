---
title: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule メソッド"
linktitle: "CreateAdjustmentRule"
second_title: "C++ 用 Aspose.Page"
description: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule メソッド。指定されたパラメーターで記述された時間調整規則を表す AdjustmentRule クラスのインスタンスを C++ で構築します。"
type: docs
weight: 1000
url: /ja/cpp/system/timezoneinfo/adjustmentrule/createadjustmentrule/
---
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) method


指定されたパラメーターで記述された時間調整規則を表す [AdjustmentRule](../) クラスのインスタンスを構築します。

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| date_start | DateTime | 調整規則が有効になる日時。 |
| date_end | DateTime | 調整規則が無効になる日時。 |
| daylight_delta | TimeSpan | タイムゾーンの夏時間を形成するために必要な時間量。 |
| daylight_transition_start | const TransitionTime\& | 夏時間から標準時間への遷移に関する情報。 |
| daylight_transition_end | const TransitionTime\& | 標準時間から夏時間への遷移に関する情報。 |

### ReturnValue

記述されたタイムゾーン調整規則を表す [AdjustmentRule](../) クラスのインスタンス。

## 参照

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) method


指定されたパラメーターで記述された時間調整規則を表す [AdjustmentRule](../) クラスのインスタンスを構築します。

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end, TimeSpan base_utc_offset_delta, bool no_daylight_transitions)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| date_start | DateTime | 調整規則が有効になる日時。 |
| date_end | DateTime | 調整規則が無効になる日時。 |
| daylight_delta | TimeSpan | タイムゾーンの夏時間を形成するために必要な時間量。 |
| daylight_transition_start | const TransitionTime\& | 夏時間から標準時間への遷移に関する情報。 |
| daylight_transition_end | const TransitionTime\& | 標準時間から夏時間への遷移に関する情報。 |
| base_utc_offset_delta | TimeSpan | デフォルトの UTC オフセットからの差分。 |
| no_daylight_transitions | bool | 調整規則が夏時間への移行を想定しているかどうかを指定します。 |

### ReturnValue

記述されたタイムゾーン調整規則を表す [AdjustmentRule](../) クラスのインスタンス。

## 参照

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
