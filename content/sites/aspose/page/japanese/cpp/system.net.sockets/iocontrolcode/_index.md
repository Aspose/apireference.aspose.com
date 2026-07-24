---
title: "System::Net::Sockets::IOControlCode 列挙体"
linktitle: "IOControlCode"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::IOControlCode 列挙体。C++ で IO コントロールコードを列挙します。"
type: docs
weight: 900
url: /ja/cpp/system.net.sockets/iocontrolcode/
---
## IOControlCode enum


[IO](../../system.io/) コントロールコードを列挙します。

```cpp
enum class IOControlCode : int64_t
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| AsyncIO | -2147195267 | ソケットの非同期 I/O モードを有効または無効にします。 |
| NonBlockingIO | -2147195266 | ソケットをノンブロッキングとしてマークします。 |
| DataToRead | 1074030207 | 読み取り可能なバイト数を返します。 |
| OobDataRead | 1074033415 | 受信待ちのアウト・オブ・バンドデータに関する情報を返します。 |
| AssociateHandle | -2013265919 | このソケットを、指定されたコンパニオンインターフェイスのハンドルに関連付けます。 |
| EnableCircularQueuing | 671088642 | 受信メッセージキューが満杯のとき、最も古いキューイングされたデータグラムを受信したものと置き換えます。 |
| Flush | 671088644 | このソケットに関連付けられた送信キューの現在の内容を破棄します。 |
| GetBroadcastAddress | 1207959557 | 現在のソケットのアドレスファミリのブロードキャストアドレスを含む SOCKADDR 構造体を返します。 |
| GetExtensionFunctionPointer | -939524090 | 関連付けられたサービスプロバイダーがサポートする、指定された拡張機能へのポインタを取得します。 |
| GetQos | -939524089 | ソケットに関連付けられた QOS 構造体を取得します。 |
| GetGroupQos | -939524088 | ソケット グループの QOS 属性を返します。 |
| MultipointLoopback | -2013265911 | ローカル コンピュータ上のアプリケーション（必ずしも同じソケットではない）がマルチキャスト セッションで送信したデータが、ループバック インターフェイス上のマルチキャスト 宛先グループに参加しているソケットで受信されるかどうかを制御します。 |
| MulticastScope | -2013265910 | ルーターがマルチキャスト パケットを転送できる回数（TTL またはホップ数としても知られる）を制御します。 |
| SetQos | -2013265909 | ソケットの QOS 属性を設定します。 |
| SetGroupQos | -2013265908 | ソケット グループの QOS 属性を設定します。 |
| TranslateHandle | -939524083 | コンパニオン インターフェイスのコンテキストで有効なソケットのハンドルを返します。 |
| RoutingInterfaceQuery | -939524076 | 指定されたリモート アドレスに接続するために使用できるインターフェイス アドレスを返します。 |
| RoutingInterfaceChange | -2013265899 | リモート エンドポイントにアクセスするために使用されるローカル インターフェイスが変更されたときに通知を受け取ることを有効にします。 |
| AddressListQuery | 1207959574 | ソケットがバインドできるローカルインターフェイスのリストを返します。 |
| AddressListChange | 671088663 | ソケットのプロトコルファミリのローカルインターフェイスリストが変更されたときに通知を受け取ることを有効にします。 |
| QueryTargetPnpHandle | 1207959576 | 基礎となるプロバイダーの SOCKET ハンドルを取得します。 |
| NamespaceChange | -2013265895 | 名前空間クエリが無効になるときにソケットが通知を受け取るかどうかを制御します。 |
| AddressListSort | -939524071 | 接続を確立するために利用可能な最適なアドレスを決定するため、IPv6 と IPv4 の宛先アドレスのリストをソートします。 |
| ReceiveAll | -1744830463 | ネットワーク上のすべての IPv4 パケットの受信を有効にします。 |
| ReceiveAllMulticast | -1744830462 | ネットワーク上のすべてのマルチキャスト IPv4 パケットの受信を有効にします。 |
| ReceiveAllIgmpMulticast | -1744830461 | ネットワーク上のすべての IGMP パケットの受信を有効にします。 |
| KeepAliveValues | -1744830460 | TCP キープアライブ パケットの送信と、その送信間隔を制御します。 |
| AbsorbRouterAlert | -1744830459 | この値は Winsock 2 の 'SIO_ABSORB_RTRALERT' 定数と等価です。 |
| UnicastInterface | -1744830458 | 送信ユニキャストパケットに使用されるインターフェイスを設定します。 |
| LimitBroadcasts | -1744830457 | この値は Winsock 2 の 'SIO_LIMIT_BROADCASTS' 定数と等価です。 |
| BindToInterface | -1744830456 | ソケットを指定されたインターフェイスインデックスにバインドします。 |
| MulticastInterface | -1744830455 | 送信マルチキャストパケットに使用されるインターフェイスを設定します。 |
| AddMulticastGroupOnInterface | -1744830454 | インデックスで識別されるインターフェイスを使用してマルチキャスト グループに参加します。 |
| DeleteMulticastGroupFromInterface | -1744830453 | ソケットをマルチキャスト グループから削除します。 |

## 参照

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
