---
title: "System::Threading::WaitHandle::WaitOne メソッド"
linktitle: "WaitOne"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::WaitHandle::WaitOne メソッド。C++ でハンドルがシグナルになるまで無制限に待機します。"
type: docs
weight: 600
url: /ja/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


ハンドルが発火するのを無制限の期間待ちます。

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

タイムアウトが発生しないため、常に true を返します。

## 参照

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int) method


ハンドルが発火するのを待ちます。

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) 待機時間（ミリ秒）。-1 は無限待機、0 はチェックしてすぐ戻る、正の値はタイムアウトです。 |

### ReturnValue

ハンドルがシグナルになった場合は true、タイムアウトした場合は false。

## 参照

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


ハンドルが発火するのを待ちます。

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) 待機時間（ミリ秒）。-1 は無限待機、0 はチェックしてすぐ戻る、正の値はタイムアウトです。 |
| exitContext | bool | true の場合、待機する前にハンドルのロックを解除すべきです。 |

### ReturnValue

ハンドルがシグナルになった場合は true、タイムアウトした場合は false。

## 参照

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


ハンドルが発火するのを待ちます。

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| timeout | TimeSpan | 待機するミリ秒数を表す [System::TimeSpan](../../../system/timespan/)、または無期限待機（-1 ミリ秒）を表す [System::TimeSpan](../../../system/timespan/)。 |

### ReturnValue

ハンドルがシグナルになった場合は true、タイムアウトした場合は false。

## 参照

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
