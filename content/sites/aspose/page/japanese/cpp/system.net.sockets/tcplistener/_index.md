---
title: "System::Net::Sockets::TcpListener クラス"
linktitle: "TcpListener"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::TcpListener クラス。TCP ネットワークサービスのリスナーを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。"
type: docs
weight: 600
url: /ja/cpp/system.net.sockets/tcplistener/
---
## TcpListener class


TCP ネットワークサービスのリスナーを表します。このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class TcpListener : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AcceptSocket](./acceptsocket/)() | 保留中の接続要求を受け入れ、データの送受信に使用されるソケットを返します。 |
| [AcceptTcpClient](./accepttcpclient/)() | 保留中の接続要求を受け入れ、送受信に使用される TcpClient クラスのインスタンスを返します。 |
| [AllowNatTraversal](./allownattraversal/)(bool) | NAT トラバーサルを有効または無効にします。 |
| [BeginAcceptSocket](./beginacceptsocket/)(AsyncCallback, System::SharedPtr\<Object\>) | 非同期の accept 操作を開始します。 |
| [BeginAcceptTcpClient](./beginaccepttcpclient/)(AsyncCallback, System::SharedPtr\<Object\>) | 非同期の accept 操作を開始します。 |
| static [Create](./create/)(int32_t) | 指定されたポート番号を使用して新しいインスタンスを作成します。 |
| [EndAcceptSocket](./endacceptsocket/)(System::SharedPtr\<IAsyncResult\>) | 指定された非同期 accept 操作が完了するまで待機します。 |
| [EndAcceptTcpClient](./endaccepttcpclient/)(System::SharedPtr\<IAsyncResult\>) | 指定された非同期 accept 操作が完了するまで待機します。 |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | 現在のインスタンスがポートを使用できるクライアントを 1 つだけ許可するかどうかを示す値を取得します。 |
| [get_LocalEndpoint](./get_localendpoint/)() | 基になるエンドポイントを返します。 |
| [get_Server](./get_server/)() | RTTI 情報。 |
| [Pending](./pending/)() | 保留中の接続要求があるかどうかを示す値を返します。 |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | 現在のインスタンスがポートを使用できるクライアントを 1 つだけ許可するかどうかを示す値を設定します。 |
| [Start](./start/)() | 着信接続のリッスンを開始します。 |
| [Start](./start/)(int32_t) | 着信接続のリッスンを開始します。 |
| [Stop](./stop/)() | 着信接続のリッスンを停止します。 |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPEndPoint\>) | 新しいインスタンスを構築します。 |
| [TcpListener](./tcplistener/)(System::SharedPtr\<IPAddress\>, int32_t) | 新しいインスタンスを構築します。 |
| [TcpListener](./tcplistener/)(int32_t) | 新しいインスタンスを構築します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
