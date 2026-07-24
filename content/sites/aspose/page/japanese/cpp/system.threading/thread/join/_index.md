---
title: "System::Threading::Thread::Join メソッド"
linktitle: "Join"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Thread::Join メソッド。管理スレッドに参加します。必要に応じて C++ で無制限の待機を実行します。"
type: docs
weight: 1400
url: /ja/cpp/system.threading/thread/join/
---
## Thread::Join() method


管理対象スレッドに参加します。必要に応じて無制限の待機を行います。

```cpp
void System::Threading::Thread::Join()
```

## 参照

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(int) method


管理対象スレッドに参加します。制限付きの待機を行います。

```cpp
bool System::Threading::Thread::Join(int millisecondsTimeout)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| millisecondsTimeout | int | ミリ秒単位の待機タイムアウト。 |

### ReturnValue

スレッドが正常に参加された場合は true、タイムアウトを超えた場合は false。

## 参照

* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Thread::Join(TimeSpan) method


管理対象スレッドに参加します。制限付きの待機を行います。

```cpp
bool System::Threading::Thread::Join(TimeSpan timeout)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| timeout | TimeSpan | スレッドが終了するまで待機する時間を設定した [TimeSpan](../../../system/timespan/)。 |

### ReturnValue

スレッドが正常に参加された場合は true、タイムアウトを超えた場合は false。

## 参照

* Class [TimeSpan](../../../system/timespan/)
* Class [Thread](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
