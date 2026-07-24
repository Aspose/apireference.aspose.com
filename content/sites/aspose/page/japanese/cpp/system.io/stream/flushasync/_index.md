---
title: "System::IO::Stream::FlushAsync メソッド"
linktitle: "FlushAsync"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Stream::FlushAsync メソッド。C++でこのストリームのすべてのバッファを非同期的にクリアし、バッファリングされたデータを基盤デバイスに書き込み、キャンセル要求を監視します。"
type: docs
weight: 900
url: /ja/cpp/system.io/stream/flushasync/
---
## Stream::FlushAsync() method


このストリームのすべてのバッファを非同期的にクリアし、バッファされたデータを基になるデバイスに書き込み、キャンセル要求を監視します。

```cpp
TaskPtr System::IO::Stream::FlushAsync()
```


### ReturnValue

非同期フラッシュ操作を表すタスク。

## 参照

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::FlushAsync(const Threading::CancellationToken\&) method


このストリームのすべてのバッファを非同期的にクリアし、バッファされたデータを基になるデバイスに書き込み、キャンセル要求を監視します。

```cpp
virtual TaskPtr System::IO::Stream::FlushAsync(const Threading::CancellationToken &cancellationToken)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | キャンセル要求を監視するトークン。 |

### ReturnValue

非同期フラッシュ操作を表すタスク。

## 参照

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
