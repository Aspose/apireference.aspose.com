---
title: "System::Web::Services::Protocols::SoapClientMessage クラス"
linktitle: "SoapClientMessage"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::Services::Protocols::SoapClientMessage クラス。送信された SOAP リクエストまたは受信した SOAP レスポンスのデータを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 300
url: /ja/cpp/system.web.services.protocols/soapclientmessage/
---
## SoapClientMessage class


送信された SOAP リクエストまたは受信した SOAP レスポンスのデータを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class SoapClientMessage : public System::Web::Services::Protocols::SoapMessage
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Action](./get_action/)() override | 'SOAPAction' 属性の値を返します。 |
| [get_Client](./get_client/)() | クライアント プロキシ クラスのインスタンスを返します。 |
| virtual [get_OneWay](./get_oneway/)() | クライアントがサーバーのメソッド処理完了を待たないかどうかを示す値を返します。 |
| [get_SoapVersion](./get_soapversion/)() override | 使用されている SOAP バージョンを返します。 |
| [get_Url](./get_url/)() override | XML [Web](../../system.web/) サービスの URL を返します。 |
| [SoapClientMessage](./soapclientmessage/)(System::SharedPtr\<SoapHttpClientProtocol\>, System::SharedPtr\<SoapMethodStubInfo\>, String, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | 新しいインスタンスを構築します。 |
## 参照

* Class [SoapMessage](../soapmessage/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
