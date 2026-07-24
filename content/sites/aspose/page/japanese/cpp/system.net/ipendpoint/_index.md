---
title: "System::Net::IPEndPoint class"
linktitle: "IPEndPoint"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::IPEndPoint クラス。IP アドレスとポートを含むネットワーク エンドポイントを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 2500
url: /ja/cpp/system.net/ipendpoint/
---
## IPEndPoint class


IP アドレスとポートを含むネットワーク エンドポイントを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡す際に使用してください。

```cpp
class IPEndPoint : public System::Net::EndPoint
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Create](./create/)(System::SharedPtr\<SocketAddress\>) override | 指定されたソケット アドレスを使用して [EndPoint](../endpoint/) クラスの新しいインスタンスを作成します。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_Address](./get_address/)() | エンドポイント アドレスを取得します。 |
| [get_AddressFamily](./get_addressfamily/)() override | RTTI 情報。 |
| [get_Port](./get_port/)() | ポート番号を取得します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| [GetImpl](./getimpl/)() const override | 実装へのポインタを返します。 |
| [IPEndPoint](./ipendpoint/)(int64_t, int32_t) | 新しいインスタンスを構築します。 |
| [IPEndPoint](./ipendpoint/)(System::SharedPtr\<IPAddress\>, int32_t) | 新しいインスタンスを構築します。 |
| [set_Address](./set_address/)(System::SharedPtr\<IPAddress\>) | エンドポイント アドレスを設定します。 |
| [set_Port](./set_port/)(int32_t) | ポート番号を設定します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Any](./any/) | 任意の IPv4 アドレスと任意のポートに対するエンドポイントです。 |
| static [AnyPort](./anyport/) | 任意のポートが使用可能かどうかを示す値です。 |
| static [IPv6Any](./ipv6any/) | 任意の IPv6 アドレスと任意のポートに対するエンドポイントです。 |
| static [MaxPort](./maxport/) | 最大ポート番号です。 |
| static [MinPort](./minport/) | RTTI 情報。 |
## 参照

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
