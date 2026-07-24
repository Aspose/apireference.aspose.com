---
title: "System::Web::Services::Protocols::SoapHttpClientProtocol クラス"
linktitle: "SoapHttpClientProtocol"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::Services::Protocols::SoapHttpClientProtocol クラス。SOAP を使用する場合、クライアントプロキシサービスはこのクラスを継承しなければなりません。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上で、または operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 900
url: /ja/cpp/system.web.services.protocols/soaphttpclientprotocol/
---
## SoapHttpClientProtocol class


SOAP を使用する場合、クライアントプロキシサービスはこのクラスを継承しなければなりません。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上で、または operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class SoapHttpClientProtocol : public System::Web::Services::Protocols::HttpWebClientProtocol
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Discover](./discover/)() | 現在のインスタンスを XML [Web](../../system.web/) サービスにバインドします。 |
| [get_SoapVersion](./get_soapversion/)() | SOAP バージョンを取得します。 |
| [InitializeSerializers](./initializeserializers/)(const System::TypeInfo\&, System::SharedPtr\<System::Xml::Serialization::XmlSerializerImplementation\>, String) | 内部フィールドを初期化します。 |
| [set_SoapVersion](./set_soapversion/)(SoapProtocolVersion) | SOAP バージョンを設定します。 |
| [SoapHttpClientProtocol](./soaphttpclientprotocol/)() | 新しいインスタンスを構築します。 |
## 参照

* Class [HttpWebClientProtocol](../httpwebclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
