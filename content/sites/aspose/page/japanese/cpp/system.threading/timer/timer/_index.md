---
title: "System::Threading::Timer::Timer コンストラクタ"
linktitle: "Timer"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Timer::Timer コンストラクタ。C++ のコンストラクタです。"
type: docs
weight: 100
url: /ja/cpp/system.threading/timer/timer/
---
## Timer::Timer(TimerCallback) constructor


コンストラクタ。

```cpp
System::Threading::Timer::Timer(TimerCallback callback)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| コールバック | TimerCallback | タイマーによって呼び出される関数。 |

## 参照

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


コンストラクタ。

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| コールバック | TimerCallback | タイマーによって呼び出される関数。 |
| 状態 | const System::SharedPtr\<System::Object\>\& | コールバック関数の引数。 |
| dueTime | int64_t | [Timeout](../../timeout/) 最初のコールバック関数呼び出しまでの時間（ミリ秒）。負の値は作成後にタイマーをスケジュールせず、後で再スケジュール可能です。 |
| period | int64_t | [Timeout](../../timeout/) 連続するコールバック関数呼び出し間の時間（ミリ秒）。0 以下の値は、タイマーが一度だけ実行されることを意味します。 |

## 参照

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


コンストラクタ。

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| コールバック | TimerCallback | タイマーによって呼び出される関数。 |
| 状態 | const System::SharedPtr\<System::Object\>\& | コールバック関数の引数。 |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) 最初のコールバック関数呼び出しまでの時間；負の値は作成後にタイマーをスケジュールせず、後で再スケジュール可能です。 |
| period | System::TimeSpan | [Timeout](../../timeout/) 連続するコールバック関数呼び出し間の時間；0 以下の値は、タイマーが一度だけ実行されることを意味します。 |

## 参照

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
