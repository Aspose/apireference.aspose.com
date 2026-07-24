---
title: "System::IO::FileStream::FlushAsync メソッド"
linktitle: "FlushAsync"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::FileStream::FlushAsync メソッド。非同期でこのストリームのすべてのバッファをクリアし、バッファされたデータを基底デバイスに書き込み、C++ でキャンセル要求を監視します。"
type: docs
weight: 500
url: /ja/cpp/system.io/filestream/flushasync/
---
## FileStream::FlushAsync method


このストリームのすべてのバッファを非同期的にクリアし、バッファされたデータを基になるデバイスに書き込み、キャンセル要求を監視します。

```cpp
TaskPtr System::IO::FileStream::FlushAsync(const Threading::CancellationToken &cancellationToken) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| cancellationToken | const Threading::CancellationToken\& | キャンセル要求を監視するトークン。 |

### ReturnValue

非同期フラッシュ操作を表すタスク。

## 参照

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
