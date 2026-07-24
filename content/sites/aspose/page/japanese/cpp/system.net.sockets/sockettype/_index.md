---
title: "System::Net::Sockets::SocketType 列挙型"
linktitle: "SocketType"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::SocketType 列挙型。C++ におけるソケットタイプを列挙します。"
type: docs
weight: 1800
url: /ja/cpp/system.net.sockets/sockettype/
---
## SocketType enum


ソケットタイプを列挙します。

```cpp
enum class SocketType
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| Stream | 1 | データの重複や境界の保持なしで、信頼性があり、双方向で、接続指向のバイトストリームをサポートするタイプ。 |
| Dgram | 2 | 固定された最大長の、接続レスで信頼性の低いメッセージであるデータグラムをサポートするタイプ。 |
| Raw | 3 | 基礎となるトランスポートプロトコルへのアクセスをサポートするタイプ。 |
| Rdm | 4 | 接続レスでメッセージ指向、信頼性のある配信を行い、データ内のメッセージ境界を保持するタイプ。 |
| Seqpacket | 5 | ネットワーク上で順序付けられたバイトストリームの接続指向かつ信頼性のある双方向転送を提供するタイプ。 |
| 不明 | n/a | 不明なタイプです。 |

## 参照

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
