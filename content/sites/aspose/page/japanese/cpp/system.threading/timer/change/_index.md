---
title: "System::Threading::Timer::Change メソッド"
linktitle: "変更"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Timer::Change メソッド。C++ でタイマーを再スケジュールまたはキャンセルします。"
type: docs
weight: 200
url: /ja/cpp/system.threading/timer/change/
---
## Timer::Change(int64_t, int64_t) method


タイマーを再スケジュールまたはキャンセルします。

```cpp
bool System::Threading::Timer::Change(int64_t dueTime, int64_t period)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| dueTime | int64_t | [Timeout](../../timeout/) 次のコールバック関数呼び出しまでの時間（ミリ秒）。負の値は、スケジュールされていてもタイマーをキャンセルします。 |
| period | int64_t | [Timeout](../../timeout/) 連続するコールバック関数呼び出し間の時間（ミリ秒）。0 以下の値は、タイマーが一度だけ実行されることを意味します。 |

## 参照

* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Change(System::TimeSpan, System::TimeSpan) method


タイマーを再スケジュールまたはキャンセルします。

```cpp
bool System::Threading::Timer::Change(System::TimeSpan dueTime, System::TimeSpan period)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) 次のコールバック関数呼び出しまでの時間；負の値は、スケジュールされていてもタイマーをキャンセルします。 |
| period | System::TimeSpan | [Timeout](../../timeout/) 連続するコールバック関数呼び出し間の時間；0 以下の値は、タイマーが一度だけ実行されることを意味します。 |

## 参照

* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
