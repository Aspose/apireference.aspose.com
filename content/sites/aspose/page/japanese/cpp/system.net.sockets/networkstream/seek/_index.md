---
title: "System::Net::Sockets::NetworkStream::Seek メソッド"
linktitle: "Seek"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::NetworkStream::Seek メソッド。C++ で現在のオブジェクトが表すストリームの位置を設定します。"
type: docs
weight: 2000
url: /ja/cpp/system.net.sockets/networkstream/seek/
---
## NetworkStream::Seek method


現在のオブジェクトが表すストリームの位置を設定します。

```cpp
int64_t System::Net::Sockets::NetworkStream::Seek(int64_t offset, IO::SeekOrigin origin) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| offset | int64_t | **origin** で指定された位置を基準としたバイトオフセットです。 |
| origin | IO::SeekOrigin | オフセットが計算される基準位置と方向を指定します。 |

### ReturnValue

ストリームの新しい位置です。

## 参照

* Enum [SeekOrigin](../../../system.io/seekorigin/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
