---
title: "System::Net::Sockets::SocketError enum"
linktitle: "SocketError"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::SocketError 列挙体。C++ におけるソケットエラータイプを列挙します。"
type: docs
weight: 1300
url: /ja/cpp/system.net.sockets/socketerror/
---
## SocketError enum


ソケットエラータイプを列挙します。

```cpp
enum class SocketError
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| Success | 0 | ソケット操作が正常に完了しました。 |
| SocketError | -1 | 特定されていないソケットエラーが発生しました。 |
| Interrupted | 10004 | ブロッキングソケット呼び出しがキャンセルされました。 |
| AccessDenied | 10013 | ソケットへのアクセスが拒否されました。 |
| Fault | 10014 | 無効なポインタアドレスが検出されました。 |
| InvalidArgument | 10022 | 無効な引数が提供されました。 |
| TooManyOpenSockets | 10024 | 基礎となるソケットプロバイダーで開かれているソケットが多すぎます。 |
| WouldBlock | 10035 | ノンブロッキングソケットでは操作をすぐに完了できません。 |
| InProgress | 10036 | ブロッキング操作が進行中です。 |
| AlreadyInProgress | 10037 | ノンブロッキングソケットですでに実行中の操作があります。 |
| NotSocket | 10038 | ソケットでないものに対してソケット操作を呼び出そうとしました。 |
| DestinationAddressRequired | 10039 | ソケット操作で必須のアドレスが省略されています。 |
| MessageSize | 10040 | データグラムが長すぎます。 |
| ProtocolType | 10041 | このソケットはプロトコルタイプをサポートしていません。 |
| ProtocolOption | 10042 | 不明、無効、またはサポートされていないオプションまたはレベルが使用されています。 |
| ProtocolNotSupported | 10043 | プロトコルが実装されていないか、設定されていません。 |
| SocketNotSupported | 10044 | アドレスファミリが指定されたソケットをサポートしていません。 |
| OperationNotSupported | 10045 | プロトコル ファミリはアドレス ファミリをサポートしていません。 |
| ProtocolFamilyNotSupported | 10046 | プロトコル ファミリが実装されていないか、設定されていません。 |
| AddressFamilyNotSupported | 10047 | 指定されたアドレス ファミリはサポートされていません。 |
| AddressAlreadyInUse | 10048 | アドレスは一度しか使用できません。 |
| AddressNotAvailable | 10049 | 選択された IP アドレスはこのコンテキストでは有効ではありません。 |
| NetworkDown | 10050 | ネットワークは利用できません。 |
| NetworkUnreachable | 10051 | リモート ホストへのルートが存在しません。 |
| NetworkReset | 10052 | アプリケーションが、すでにタイムアウトした接続に対して 'Keep-Alive' を設定しようとしました。 |
| ConnectionAborted | 10053 | 接続が中止されました。 |
| ConnectionReset | 10054 | 接続がリモート ピアによってリセットされました。 |
| NoBufferSpaceAvailable | 10055 | ソケット操作に利用できる空きバッファ領域がありません。 |
| IsConnected | 10056 | ソケットはすでに接続されています。 |
| NotConnected | 10057 | アプリケーションがデータの送受信を試みましたが、ソケットが接続されていません。 |
| Shutdown | 10058 | ソケットがすでに閉じられているため、データの送受信要求は禁止されています。 |
| TimedOut | 10060 | 接続試行がタイムアウトしたか、接続されたホストが応答しませんでした。 |
| ConnectionRefused | 10061 | リモート ホストが接続を積極的に拒否しています。 |
| HostDown | 10064 | リモートホストがダウンしているため、操作が失敗しました。 |
| HostUnreachable | 10065 | 指定されたホストへのネットワークルートが存在しません。 |
| ProcessLimit | 10067 | 基礎となるソケットプロバイダーを使用しているプロセスが多すぎます。 |
| SystemNotReady | 10091 | ネットワークサブシステムが利用できません。 |
| VersionNotSupported | 10092 | 基礎となるソケットプロバイダーのバージョンが範囲外です。 |
| NotInitialized | 10093 | 基礎となるソケットプロバイダーが初期化されていません。 |
| Disconnecting | 10101 | 正常なシャットダウンが進行中です。 |
| TypeNotFound | 10109 | 指定されたクラスが見つかりません。 |
| HostNotFound | 11001 | 指定されたホストが不明です。 |
| TryAgain | 11002 | ホストの名前を解決できません。 |
| NoRecovery | 11003 | エラーは回復できないか、要求されたデータベースが見つかりません。 |
| NoData | 11004 | 要求された名前または IP アドレスがネームサーバーに見つかりません。 |

## 参照

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
