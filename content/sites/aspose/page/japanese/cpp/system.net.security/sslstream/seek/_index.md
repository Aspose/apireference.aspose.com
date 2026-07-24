---
title: "System::Net::Security::SslStream::Seek メソッド"
linktitle: "Seek"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Security::SslStream::Seek メソッド。現在のオブジェクトが表すストリームの位置を C++ で設定します。"
type: docs
weight: 3300
url: /ja/cpp/system.net.security/sslstream/seek/
---
## SslStream::Seek method


現在のオブジェクトが表すストリームの位置を設定します。

```cpp
int64_t System::Net::Security::SslStream::Seek(int64_t offset, IO::SeekOrigin origin) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| offset | int64_t | **origin** で指定された位置を基準としたバイトオフセットです。 |
| origin | IO::SeekOrigin | オフセットが計算される基準位置と方向を指定します。 |

### ReturnValue

ストリームの新しい位置です。

## 参照

* Enum [SeekOrigin](../../../system.io/seekorigin/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
