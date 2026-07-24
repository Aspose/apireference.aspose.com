---
title: "System::Threading::WaitHandle::WaitAll メソッド"
linktitle: "WaitAll"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::WaitHandle::WaitAll メソッド。C++ で全てのハンドルがシグナルになるのを待ちます。"
type: docs
weight: 100
url: /ja/cpp/system.threading/waithandle/waitall/
---
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


すべてのハンドルがシグナルになるまで待機します。

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | 待機対象のハンドル。 |

### ReturnValue

waitHandles の全要素がシグナルを受け取った場合は true。そうでない場合、メソッドは決して戻りません。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


RTTI 情報。

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | 待機対象のハンドル。 |
| millisecondsTimeout | int | [Timeout](../../timeout/) 待機時間（ミリ秒）。-1 は無限待機、0 はチェックしてすぐ戻る、正の値はタイムアウトです。 |

### ReturnValue

全てのハンドルがシグナルになった場合は true、タイムアウトした場合は false。
## 備考


すべてのハンドルがシグナルになるまで待機します。
## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


すべてのハンドルがシグナルになるまで待機します。

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | 待機対象のハンドル。 |
| timeout | TimeSpan | 待機するミリ秒数を表す [System::TimeSpan](../../../system/timespan/)、または無期限待機（-1 ミリ秒）を表す [System::TimeSpan](../../../system/timespan/)。 |

### ReturnValue

全てのハンドルがシグナルになった場合は true、タイムアウトした場合は false。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
