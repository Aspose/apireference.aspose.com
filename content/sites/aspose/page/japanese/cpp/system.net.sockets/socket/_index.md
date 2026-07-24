---
title: "System::Net::Sockets::Socket class"
linktitle: "Socket"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::Socket class. Socket クラスは C++ で Berkeley ソケットインターフェイスを実装しています。"
type: docs
weight: 400
url: /ja/cpp/system.net.sockets/socket/
---
## Socket class


この [Socket](./) クラスは Berkeley ソケットインターフェイスを実装しています。

```cpp
class Socket : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Accept](./accept/)() | 新しく作成された接続のために新しいソケットを作成します。 |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) | 非同期の接続操作を開始します。 |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 非同期の接続操作を開始します。 |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 非同期の接続操作を開始します。 |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 非同期の接続操作を開始します。 |
| [BeginReceive](./beginreceive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | 非同期書き込み操作を開始します。 |
| [BeginSend](./beginsend/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | 非同期の送信操作を開始します。 |
| [Bind](./bind/)(System::SharedPtr\<EndPoint\>) | ソケットを指定されたローカルエンドポイントにバインドします。 |
| [Close](./close/)() | ソケット接続を閉じます。 |
| [Close](./close/)(int) | キューに入れたデータを送信できるように、指定されたタイムアウトでソケット接続を閉じます。 |
| [Connect](./connect/)(System::SharedPtr\<EndPoint\>) | 指定されたリモートエンドポイントへの接続を確立します。 |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | 指定されたリモートエンドポイントへの接続を確立します。 |
| [Connect](./connect/)(String, int32_t) | 指定されたリモートエンドポイントへの接続を確立します。 |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | 指定されたリモートエンドポイントへの接続を確立します。 |
| [Dispose](./dispose/)() override | 何もしません。 |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | 指定された非同期接続操作が完了するまで待機します。 |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>) | 指定された非同期受信操作が完了するまで待機します。 |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | 指定された非同期受信操作が完了するまで待機します。 |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>) | 指定された非同期送信操作が完了するまで待機します。 |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | 指定された非同期送信操作が完了するまで待機します。 |
| [get_AddressFamily](./get_addressfamily/)() | アドレス ファミリを返します。 |
| [get_Available](./get_available/)() | ネットワークから受信され、読み取り可能なバイト数を取得します。 |
| [get_Blocking](./get_blocking/)() | ソケットがブロッキング モードかどうかを示す値を取得します。 |
| [get_Connected](./get_connected/)() | ソケットがリモート ホストに接続されているかどうかを示す値を返します。 |
| [get_DontFragment](./get_dontfragment/)() | ソケットが IP データグラムのフラグメントを許可するかどうかを示す値を取得します。 |
| [get_DualMode](./get_dualmode/)() | ソケットがデュアルモードかどうかを示す値を取得します。 |
| [get_EnableBroadcast](./get_enablebroadcast/)() | ソケットがブロードキャスト パケットを許可するかどうかを示す値を取得します。 |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | ソケットをポートにバインドできるプロセスが1つだけかどうかを示す値を取得します。 |
| [get_IsBound](./get_isbound/)() | ソケットが特定のローカル ポートにバインドされているかどうかを示す値を返します。 |
| [get_LingerState](./get_lingerstate/)() | ソケットが保留中のデータをすべて送信しようとしてクローズを遅延させるかどうかを示す値を取得します。 |
| [get_LocalEndPoint](./get_localendpoint/)() | ローカル エンドポイントを返します。 |
| [get_MulticastLoopback](./get_multicastloopback/)() | ソケットが送信マルチキャスト パケットを受信するかどうかを示す値を取得します。 |
| [get_NoDelay](./get_nodelay/)() | ソケットが Nagle アルゴリズムを使用しているかどうかを示す値を取得します。 |
| static [get_OSSupportsIPv4](./get_ossupportsipv4/)() | オペレーティング システムとネットワーク アダプタが IPv4 をサポートしているかどうかを示す値を返します。 |
| static [get_OSSupportsIPv6](./get_ossupportsipv6/)() | オペレーティング システムとネットワーク アダプタが IPv6 をサポートしているかどうかを示す値を返します。 |
| [get_ProtocolType](./get_protocoltype/)() | プロトコル タイプを返します。 |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | 受信バッファ サイズを取得します。 |
| [get_ReceiveTimeout](./get_receivetimeout/)() | 'Receive' 呼び出しがタイムアウトするまでの期間を取得します。 |
| [get_RemoteEndPoint](./get_remoteendpoint/)() | リモート エンドポイントを返します。 |
| [get_SendBufferSize](./get_sendbuffersize/)() | 送信バッファ サイズを取得します。 |
| [get_SendTimeout](./get_sendtimeout/)() | 'Send' 呼び出しがタイムアウトするまでの期間を取得します。 |
| [get_SocketType](./get_sockettype/)() | ソケット タイプを返します。 |
| static [get_SupportsIPv4](./get_supportsipv4/)() | RTTI 情報。 |
| [get_Ttl](./get_ttl/)() | TTL 値を取得します。 |
| [GetImpl](./getimpl/)() const | 実装へのポインタを返します。 |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName) | 指定されたオプション名に対応する値を返します。 |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | 指定されたオプション名に対応する値を取得します。 |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | 指定されたオプション名に対応する値を返します。 |
| [IOControl](./iocontrol/)(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | ソケットの低レベル動作モードを設定します。 |
| [IOControl](./iocontrol/)(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | ソケットの低レベル動作モードを設定します。 |
| [Listen](./listen/)(int32_t) | ソケットの状態を「listen」に変更します。 |
| [Poll](./poll/)(int32_t, SelectMode) | 指定されたポーリングモードに基づいてソケットのステータスを返します。 |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | ソケットからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | ソケットからデータを受信し、指定されたバイト配列群に書き込みます。 |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | ソケットからデータを受信し、指定されたバイト配列群に書き込みます。 |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | ソケットからデータを受信し、指定されたバイト配列群に書き込みます。 |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | 指定されたエンドポイントからデータを受信し、指定されたバイト配列に書き込みます。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | 指定されたデータをソケットに送信します。 |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | 指定されたデータをソケットに送信します。 |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 指定されたデータを指定されたエンドポイントに送信します。 |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 指定されたデータを指定されたエンドポイントに送信します。 |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 指定されたデータを指定されたエンドポイントに送信します。 |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 指定されたデータを指定されたエンドポイントに送信します。 |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 指定されたデータを指定されたエンドポイントに送信します。 |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 指定されたデータを指定されたエンドポイントに送信します。 |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | 指定されたデータを指定されたエンドポイントに送信します。 |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | 指定されたデータを指定されたエンドポイントに送信します。 |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) | 指定されたデータを指定されたエンドポイントに送信します。 |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) | 指定されたデータを指定されたエンドポイントに送信します。 |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) | 指定されたデータを指定されたエンドポイントに送信します。 |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) | 指定されたデータを指定されたエンドポイントに送信します。 |
| [set_Blocking](./set_blocking/)(bool) | ソケットがブロッキングモードかどうかを示す値を設定します。 |
| [set_ConnectionTimeout](./set_connectiontimeout/)(int32_t) | 接続タイムアウトを設定します。 |
| [set_DontFragment](./set_dontfragment/)(bool) | ソケットが IP データグラムのフラグメンテーションを許可するかどうかを示す値を設定します。 |
| [set_DualMode](./set_dualmode/)(bool) | ソケットがデュアルモードかどうかを示す値を設定します。 |
| [set_EnableBroadcast](./set_enablebroadcast/)(bool) | ソケットがブロードキャストパケットを許可するかどうかを示す値を設定します。 |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | ソケットをポートにバインドできるプロセスを 1 つに制限するかどうかを示す値を設定します。 |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | ソケットが保留中のデータをすべて送信しようとしてクローズを遅延させるかどうかを示す値を設定します。 |
| [set_MulticastLoopback](./set_multicastloopback/)(bool) | ソケットが送信マルチキャストパケットを受信するかどうかを示す値を設定します。 |
| [set_NoDelay](./set_nodelay/)(bool) | ソケットが Nagle アルゴリズムを使用しているかどうかを示す値を設定します。 |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | 受信バッファサイズを設定します。 |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | 「Receive」呼び出しがタイムアウトするまでの期間を設定します。 |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | 送信バッファサイズを設定します。 |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | 「Send」呼び出しがタイムアウトするまでの期間を設定します。 |
| [set_Ttl](./set_ttl/)(int16_t) | TTL 値を設定します。 |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | 指定されたソケットオプションを指定された値に設定します。 |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | 指定されたソケットオプションを指定された値に設定します。 |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, bool) | 指定されたソケットオプションを指定された値に設定します。 |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::SharedPtr\<Object\>) | 指定されたソケットオプションを指定された値に設定します。 |
| [Shutdown](./shutdown/)(SocketShutdown) | ソケットの送受信操作を無効にします。 |
| [Socket](./socket/)(System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | 新しいインスタンスを構築します。 |
| [Socket](./socket/)(System::Net::Sockets::AddressFamily, System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | 新しいインスタンスを構築します。 |
| virtual [~Socket](./~socket/)() | 現在のインスタンスを破棄します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ImplPtr](./implptr/) | ソケットの実装です。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
