---
title: "System::IO::Stream::EndRead メソッド"
linktitle: "EndRead"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Stream::EndRead メソッド。指定された非同期読み取り操作が完了するまで C++ で待機します。"
type: docs
weight: 600
url: /ja/cpp/system.io/stream/endread/
---
## Stream::EndRead method


指定された非同期読み取り操作が完了するまで待機します。

```cpp
virtual int System::IO::Stream::EndRead(System::SharedPtr<System::IAsyncResult> asyncResult)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<System::IAsyncResult\> | 非同期読み取り操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクト |

### ReturnValue

**asyncResult** が表す読み取り操作中に読み取られたバイト数

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
