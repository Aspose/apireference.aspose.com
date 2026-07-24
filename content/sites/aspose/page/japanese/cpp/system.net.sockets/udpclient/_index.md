---
title: "System::Net::Sockets::UdpClient クラス"
linktitle: "UdpClient"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::UdpClient クラス。User Datagram Protocol（UDP）ネットワークサービスを提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 700
url: /ja/cpp/system.net.sockets/udpclient/
---
## UdpClient class


User Datagram Protocol（UDP）ネットワークサービスを提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこのタイプのインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。

```cpp
class UdpClient : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Close](./close/)() | UDP 接続を閉じます。 |
| [Connect](./connect/)(String, int32_t) | 指定されたホストの指定ポートへの接続を確立します。 |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | 指定されたアドレスと指定ポートのホストとの接続を確立します。 |
| [Connect](./connect/)(System::SharedPtr\<IPEndPoint\>) | リモートエンドポイントへの接続を確立します。 |
| [Dispose](./dispose/)() override | [UdpClient](./) が使用する管理リソースと非管理リソースを解放します。 |
| [get_Client](./get_client/)() | RTTI 情報。 |
| [Receive](./receive/)(System::SharedPtr\<IPEndPoint\>\&) | サーバーから送信されたデータグラムを返します。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) | リモートエンドポイントのホストへ UDP データグラムを送信します。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) | 指定されたリモートホストの指定ポートへ UDP データグラムを送信します。 |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t) | リモートホストへ UDP データグラムを送信します。 |
| [set_Client](./set_client/)(System::SharedPtr\<Socket\>) | 基礎となるネットワークソケットを提供するために使用されます。 |
| [UdpClient](./udpclient/)() | [UdpClient](./) クラスの新しいインスタンスを初期化します。 |
| [UdpClient](./udpclient/)(AddressFamily) | [UdpClient](./) クラスの新しいインスタンスを初期化します。 |
| [UdpClient](./udpclient/)(int32_t) | [UdpClient](./) クラスの新しいインスタンスを初期化します。 |
| [UdpClient](./udpclient/)(int32_t, AddressFamily) | [UdpClient](./) クラスの新しいインスタンスを初期化します。 |
| [UdpClient](./udpclient/)(System::SharedPtr\<IPEndPoint\>) | [UdpClient](./) クラスの新しいインスタンスを初期化します。パラメーター local EP は、UDP 接続をバインドするローカルエンドポイントです。 |
| [UdpClient](./udpclient/)(String, int32_t) | [UdpClient](./) クラスの新しいインスタンスを作成し、指定されたポートの指定されたリモートホストに接続します。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
