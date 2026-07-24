---
title: "System::Net::Sockets::SocketFlags 列挙体"
linktitle: "SocketFlags"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::SocketFlags 列挙体。C++ におけるソケットメッセージの定数値を提供します。"
type: docs
weight: 1400
url: /ja/cpp/system.net.sockets/socketflags/
---
## SocketFlags enum


ソケットメッセージの定数値を提供します。

```cpp
enum class SocketFlags
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| None | 0 | この呼び出しではフラグは使用されていません。 |
| OutOfBand | 1 | アウトオブバンドデータが処理されています。 |
| Peek | 2 | 受信メッセージを覗き見る。 |
| DontRoute | 4 | ルーティングテーブルを使用せずにメッセージを送信します。 |
| Truncated | 256 | メッセージが指定されたバッファに収まるには大きすぎます。メッセージは切り詰められました。 |
| ControlDataTruncated | 512 | 制御データが 64 KB を超えており、内部バッファに収まりません。データは切り詰められました。 |
| Broadcast | 1024 | ブロードキャストパケットです。 |
| Multicast | 2048 | マルチキャストパケットです。 |
| Partial | 32768 | メッセージが部分的に送受信されました。 |

## 参照

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
