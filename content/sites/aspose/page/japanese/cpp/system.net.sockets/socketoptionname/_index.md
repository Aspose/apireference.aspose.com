---
title: "System::Net::Sockets::SocketOptionName enum"
linktitle: "SocketOptionName"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::SocketOptionName enum. C++ の Socket クラス用のソケットオプション名を定義します。"
type: docs
weight: 1600
url: /ja/cpp/system.net.sockets/socketoptionname/
---
## SocketOptionName enum


[Socket](../socket/) クラス用のソケットオプション名を定義します。

```cpp
enum class SocketOptionName
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| Debug | 1 | デバッグ情報を記録します。 |
| AcceptConnection | 2 | ソケットが受信接続を待ち受けているかどうかを示します。 |
| ReuseAddress | 4 | ソケットが既に使用中のアドレスにバインドできるかどうかを示します。 |
| KeepAlive | 8 | ソケット接続に対して 'Keep-Alive' パケットを有効にします。 |
| DontRoute | 16 | パケットがインターフェースのアドレスに直接送信されるかどうかを示します。 |
| Broadcast | 32 | ソケットがブロードキャストメッセージを送信できるかどうかを示します。 |
| UseLoopback | 64 | 可能な限りハードウェアをバイパスします。 |
| Linger | 128 | システムはデータを送信できるまで、クローズの試みでプロセスをブロックします。 |
| OutOfBandInline | 256 | 通常のデータストリームでアウトオブバンドデータを受信します。 |
| DontLinger | n/a | ソケットが遅延せずに閉じられるかどうかを示します。 |
| ExclusiveAddressUse | n/a | ソケットはバインドされたアドレスを排他的に使用します。 |
| SendBuffer | 4097 | 送信バッファサイズを指定します。 |
| ReceiveBuffer | 4098 | 受信バッファサイズを指定します。 |
| SendLowWater | 4099 | 送信操作の最小データ量を指定します。 |
| ReceiveLowWater | 4100 | 受信操作の最小データ量を指定します。 |
| SendTimeout | 4101 | 同期送信操作のタイムアウトを指定します。 |
| ReceiveTimeout | 4102 | 同期受信操作のタイムアウトを指定します。 |
| エラー | 4103 | エラー状態を返し、クリアします。 |
| 型 | 4104 | ソケットのタイプを返します。 |
| ReuseUnicastPort | 12295 | システムがアウトバウンド接続のためにエフェメラルポートの割り当てを遅延させるかどうかを示します。 |
| MaxConnections | 2147483647 | このオプションはサポートされていません。リッスン時の最大キュー長を指定するために使用されました。 |
| IPOptions | 1 | 送信データグラムに挿入する必要がある IP オプションを指定します。 |
| HeaderIncluded | 2 | ヘッダーは送信データグラムに含まれます。 |
| TypeOfService | 3 | サービスフィールドの IP ヘッダータイプを変更します。 |
| IpTimeToLive | 4 | IP の TTL（Time To Live）です。 |
| MulticastInterface | 9 | 送信マルチキャストパケットのインターフェイスを設定します。 |
| MulticastTimeToLive | 10 | IP マルチキャストの TTL（Time To Live）です。 |
| MulticastLoopback | 11 | IP マルチキャストのループバックです。 |
| AddMembership | 12 | IP グループのメンバーシップを追加します。 |
| DropMembership | 13 | IP グループのメンバーシップを削除します。 |
| DontFragment | 14 | IP データグラムをフラグメントしません。 |
| AddSourceMembership | 15 | IP グループ/ソースに参加します。 |
| DropSourceMembership | 16 | IP グループ/ソースを削除します。 |
| BlockSource | 17 | IP グループ/ソースをブロックします。 |
| UnblockSource | 18 | IP グループ/ソースのブロックを解除します。 |
| PacketInformation | 19 | IPv4 のパケット情報を受信します。 |
| HopLimit | 21 | パケットの HOP カウントを含む整数を返します。 |
| IPProtectionLevel | 23 | IPv6 ソケットを指定されたスコープに制限できるようにします。 |
| IPv6Only | 27 | このソケットは IPv6 パケットの送受信のみに制限されています。 |
| NoDelay | 1 | 送信パケットの結合のために Nagle アルゴリズムを無効にします。 |
| BsdUrgent | 2 | RFC-1222 で定義されている緊急データを使用します。 |
| Expedited | 2 | RFC-1222 で定義されている高速データを使用します。 |
| NoChecksum | 1 | チェックサムをゼロに設定した状態で UDP データグラムを送信します。 |
| ChecksumCoverage | 20 | UDP のチェックサムカバレッジを設定または取得します。 |
| UpdateAcceptContext | 28683 | リスニングソケットと同じプロパティを持つクライアントソケットを更新します。 |
| UpdateConnectContext | 28688 | リスニングソケットと同じプロパティを持つクライアントソケットを更新します。 |

## 参照

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
