---
title: "System::Net::Sockets::NetworkStream::EndRead メソッド"
linktitle: "EndRead"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::NetworkStream::EndRead メソッド。指定された非同期読み取り操作が完了するまで待機します（C++）。"
type: docs
weight: 600
url: /ja/cpp/system.net.sockets/networkstream/endread/
---
## NetworkStream::EndRead method


指定された非同期読み取り操作が完了するまで待機します。

```cpp
int32_t System::Net::Sockets::NetworkStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 非同期読み取り操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクト |

### ReturnValue

**asyncResult** が表す読み取り操作中に読み取られたバイト数

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
