---
title: "System::Net::DnsEndPoint クラス"
linktitle: "DnsEndPoint"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::DnsEndPoint クラス。アプリケーションがサービスに接続するために使用する情報を含みます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてそのポインタを使用してください。"
type: docs
weight: 800
url: /ja/cpp/system.net/dnsendpoint/
---
## DnsEndPoint class


アプリケーションがサービスに接続するために使用する情報を含みます。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として使用してください。

```cpp
class DnsEndPoint : public System::Net::EndPoint
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t) | 新しいインスタンスを構築します。 |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t, System::Net::Sockets::AddressFamily) | 新しいインスタンスを構築します。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_AddressFamily](./get_addressfamily/)() override | RTTI 情報。 |
| [get_Host](./get_host/)() | RTTI 情報。 |
| [get_Port](./get_port/)() | ポート番号を返します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
## 参照

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
