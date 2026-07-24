---
title: "System::Net::Sockets::TcpClient クラス"
linktitle: "TcpClient"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::TcpClient クラス。TCP ネットワークサービスのクライアントを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、関数への引数としてそのポインタを使用してください。"
type: docs
weight: 500
url: /ja/cpp/system.net.sockets/tcpclient/
---
## TcpClient class


TCP ネットワークサービスのクライアントを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数への引数としてそのポインタを使用してください。

```cpp
class TcpClient : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 非同期の接続操作を開始します。 |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 非同期の接続操作を開始します。 |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 非同期の接続操作を開始します。 |
| [Close](./close/)() | 接続を閉じ、現在のインスタンスを破棄します。 |
| [Connect](./connect/)(String, int32_t) | 指定されたリモートホストへの接続を確立します。 |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | 指定されたリモートホストへの接続を確立します。 |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | 指定されたリモートホストへの接続を確立します。 |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | 指定されたリモートホストへの接続を確立します。 |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | 指定された非同期接続操作が完了するまで待機します。 |
| [get_Available](./get_available/)() | 受信され、読み取り可能なバイト数を返します。 |
| [get_Client](./get_client/)() | RTTI 情報。 |
| [get_Connected](./get_connected/)() | ソケットがリモート ホストに接続されているかどうかを示す値を返します。 |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | 現在のインスタンスがポートを使用できるクライアントを 1 つだけ許可するかどうかを示す値を取得します。 |
| [get_LingerState](./get_lingerstate/)() | ソケットが保留中のデータをすべて送信しようとしてクローズを遅延させるかどうかを示す値を取得します。 |
| [get_NoDelay](./get_nodelay/)() | 現在のインスタンスが Nagle アルゴリズムを使用しているかどうかを示す値を取得します。 |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | データ受信に使用されるバッファのサイズを取得します。 |
| [get_ReceiveTimeout](./get_receivetimeout/)() | データ受信がタイムアウトするまでの時間を示す値を取得します。 |
| [get_SendBufferSize](./get_sendbuffersize/)() | データ送信に使用されるバッファのサイズを取得します。 |
| [get_SendTimeout](./get_sendtimeout/)() | データ送信がタイムアウトするまでの時間を示す値を取得します。 |
| [GetStream](./getstream/)() | 送受信に使用されるストリームを返します。 |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | ソケットを設定します。 |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | 現在のインスタンスがポートを使用できるクライアントを 1 つだけ許可するかどうかを示す値を設定します。 |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | ソケットが保留中のデータをすべて送信しようとしてクローズを遅延させるかどうかを示す値を設定します。 |
| [set_NoDelay](./set_nodelay/)(bool) | 現在のインスタンスが Nagle アルゴリズムを使用しているかどうかを示す値を設定します。 |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | データ受信に使用されるバッファのサイズを設定します。 |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | データ受信がタイムアウトするまでの時間を示す値を設定します。 |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | データ送信に使用されるバッファのサイズを設定します。 |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | データ送信がタイムアウトするまでの時間を示す値を設定します。 |
| [TcpClient](./tcpclient/)(System::SharedPtr\<IPEndPoint\>) | 新しいインスタンスを構築します。 |
| [TcpClient](./tcpclient/)() | 新しいインスタンスを構築します。 |
| [TcpClient](./tcpclient/)(AddressFamily) | 新しいインスタンスを構築します。 |
| [TcpClient](./tcpclient/)(String, int32_t) | 新しいインスタンスを構築します。 |
| virtual [~TcpClient](./~tcpclient/)() | 現在のインスタンスを破棄します。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
