---
title: "System::IO::FileStream::ReadAsync method"
linktitle: "ReadAsync"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::FileStream::ReadAsync メソッド。C++ で現在のストリームからバイト列を非同期に読み取り、読み取ったバイト数だけストリーム内の位置を進め、キャンセル要求を監視します。"
type: docs
weight: 1400
url: /ja/cpp/system.io/filestream/readasync/
---
## FileStream::ReadAsync method


現在のストリームからバイトのシーケンスを非同期的に読み取り、読み取ったバイト数だけストリーム内の位置を進め、キャンセル要求を監視します。

```cpp
RTaskPtr<int32_t> System::IO::FileStream::ReadAsync(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count, const Threading::CancellationToken &cancellationToken) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | const ArrayPtr\<uint8_t\>\& | 読み取ったバイトを書き込むためのバイト配列。 |
| offset | int32_t | **buffer** 内で書き込みを開始する 0 ベースの位置。 |
| count | int32_t | 読み取るバイト数です。 |
| cancellationToken | const Threading::CancellationToken\& | キャンセル要求を監視するトークン。 |

### ReturnValue

非同期読み取り操作を表すタスク。TResult パラメーターの値にはバッファに読み込まれたバイト総数が含まれます。利用可能なバイト数が要求された数未満の場合、結果の値は要求されたバイト数未満になることがあり、ストリームの末尾に達した場合は 0（ゼロ）になることがあります。

## 参照

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
