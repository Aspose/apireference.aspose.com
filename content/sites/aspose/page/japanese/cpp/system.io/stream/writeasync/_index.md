---
title: "System::IO::Stream::WriteAsync メソッド"
linktitle: "WriteAsync"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Stream::WriteAsync メソッド。バイトのシーケンスを現在のストリームに非同期で書き込み、書き込まれたバイト数だけストリーム内の現在位置を進め、C++ でキャンセル要求を監視します。"
type: docs
weight: 2700
url: /ja/cpp/system.io/stream/writeasync/
---
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


現在のストリームにバイトのシーケンスを書き込み、書き込んだバイト数だけこのストリーム内の位置を進め、キャンセル要求を監視します（非同期）。

```cpp
TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | 書き込むバイトを含む配列。 |
| offset | int32_t | 書き込みサブレンジが開始する **buffer** 内の要素の 0 ベースインデックス。 |
| count | int32_t | 書き込むサブレンジ内の要素数。 |

### ReturnValue

非同期書き込み操作を表すタスク。

## 参照

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::WriteAsync(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) method


現在のストリームにバイトのシーケンスを書き込み、書き込んだバイト数だけこのストリーム内の位置を進め、キャンセル要求を監視します（非同期）。

```cpp
virtual TaskPtr System::IO::Stream::WriteAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | 書き込むバイトを含む配列。 |
| offset | int32_t | 書き込みサブレンジが開始する **buffer** 内の要素の 0 ベースインデックス。 |
| count | int32_t | 書き込むサブレンジ内の要素数。 |
| cancellationToken | const Threading::CancellationToken\& | キャンセル要求を監視するトークン。 |

### ReturnValue

非同期書き込み操作を表すタスク。

## 参照

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
