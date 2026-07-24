---
title: "System::Threading::Mutex::WaitOne メソッド"
linktitle: "WaitOne"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Mutex::WaitOne メソッド。ミューテックスをロックします。必要に応じて C++ で無制限の待機を行います。"
type: docs
weight: 500
url: /ja/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


ミューテックスをロックします。必要に応じて無制限に待機します。

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

ミューテックスがロックされるまで戻らないため、常に true を返します。

## 参照

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(int) method


ミューテックスをロックします。必要に応じて待機します。

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| millisecondsTimeout | int | ミリ秒単位の待機タイムアウト。 |

### ReturnValue

ミューテックスがロックされた場合は true、タイムアウトを超えた場合は false を返します。

## 参照

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


ミューテックスをロックします。必要に応じて待機します。

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| timeout | TimeSpan | 待機するミリ秒数を表す [System::TimeSpan](../../../system/timespan/)、または無期限待機（-1 ミリ秒）を表す [System::TimeSpan](../../../system/timespan/)。 |

### ReturnValue

ミューテックスがロックされた場合は true、タイムアウトを超えた場合は false を返します。

## 参照

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
