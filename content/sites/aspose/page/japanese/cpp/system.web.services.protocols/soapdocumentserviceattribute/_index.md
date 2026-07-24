---
title: "System::Web::Services::Protocols::SoapDocumentServiceAttribute クラス"
linktitle: "SoapDocumentServiceAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::Services::Protocols::SoapDocumentServiceAttribute クラス。SOAP リクエストとレスポンスのデフォルト形式を設定します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 500
url: /ja/cpp/system.web.services.protocols/soapdocumentserviceattribute/
---
## SoapDocumentServiceAttribute class


SOAP リクエストとレスポンスのデフォルト形式を設定します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップしてください。

```cpp
class SoapDocumentServiceAttribute : public System::Attribute
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_ParameterStyle](./get_parameterstyle/)() | RTTI 情報。 |
| [get_RoutingStyle](./get_routingstyle/)() | SOAP メッセージがサービスにルーティングされる方法を示す値を取得します。 |
| [get_Use](./get_use/)() | パラメータのフォーマットを取得します。 |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | 'Body'要素の下に単一のXML要素としてパラメータがカプセル化されているかどうかを示す値を設定します。 |
| [set_RoutingStyle](./set_routingstyle/)(SoapServiceRoutingStyle) | SOAP メッセージがサービスにルーティングされる方法を示す値を設定します。 |
| [set_Use](./set_use/)(Description::SoapBindingUse) | パラメータのフォーマットを設定します。 |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)() | 新しいインスタンスを構築します。 |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse) | 新しいインスタンスを構築します。 |
| [SoapDocumentServiceAttribute](./soapdocumentserviceattribute/)(Description::SoapBindingUse, SoapParameterStyle) | 新しいインスタンスを構築します。 |
## 参照

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
