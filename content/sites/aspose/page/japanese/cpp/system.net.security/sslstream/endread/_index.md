---
title: "System::Net::Security::SslStream::EndRead メソッド"
linktitle: "EndRead"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Security::SslStream::EndRead メソッド。指定された非同期読み取り操作が完了するまで C++ で待機します。"
type: docs
weight: 700
url: /ja/cpp/system.net.security/sslstream/endread/
---
## SslStream::EndRead method


指定された非同期読み取り操作が完了するまで待機します。

```cpp
int32_t System::Net::Security::SslStream::EndRead(System::SharedPtr<IAsyncResult> asyncResult) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 非同期読み取り操作を表す [IAsyncResult](../../../system/iasyncresult/) オブジェクト |

### ReturnValue

**asyncResult** が表す読み取り操作中に読み取られたバイト数

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
