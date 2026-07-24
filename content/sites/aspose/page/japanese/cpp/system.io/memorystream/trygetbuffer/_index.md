---
title: "System::IO::MemoryStream::TryGetBuffer メソッド"
linktitle: "TryGetBuffer"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::MemoryStream::TryGetBuffer メソッド。C++ でこのストリームが作成された符号なしバイトの配列を返します。"
type: docs
weight: 1800
url: /ja/cpp/system.io/memorystream/trygetbuffer/
---
## MemoryStream::TryGetBuffer method


このストリームが作成された符号なしバイトの配列を返します。

```cpp
bool System::IO::MemoryStream::TryGetBuffer(ArraySegment<uint8_t> &buffer)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バッファ | ArraySegment\<uint8_t\>\& | バイト配列 - out パラメーター。このメソッドが true を返す場合、ストリームが作成されたバイト配列セグメントが返されます；false を返す場合、このパラメーターはデフォルトに設定されます。 |

### ReturnValue

変換が成功した場合は true。

## 参照

* Class [ArraySegment](../../../system/arraysegment/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
