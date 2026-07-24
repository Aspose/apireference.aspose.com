---
title: "System::Web::Services::Protocols::SoapDocumentMethodAttribute クラス"
linktitle: "SoapDocumentMethodAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::Services::Protocols::SoapDocumentMethodAttribute クラス。このクラスは、メソッドから渡されるまたは返されるすべての SOAP メッセージが Document 形式を使用することを指定します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 400
url: /ja/cpp/system.web.services.protocols/soapdocumentmethodattribute/
---
## SoapDocumentMethodAttribute class


メソッドから渡されるまたは返されるすべての SOAP メッセージが Document 形式を使用することを指定します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class SoapDocumentMethodAttribute : public System::Attribute
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Action](./get_action/)() | RTTI 情報。 |
| [get_Binding](./get_binding/)() | XML Web サービスメソッドが操作を実装するバインディングを取得します。 |
| [get_OneWay](./get_oneway/)() | クライアントがサーバーのメソッド処理完了を待たないかどうかを示す値を取得します。 |
| [get_ParameterStyle](./get_parameterstyle/)() | パラメータが 'Body' 要素の下にある単一の XML 要素にカプセル化されているかどうかを示す値を取得します。 |
| [get_RequestElementName](./get_requestelementname/)() | サービス記述で操作として定義されている SOAP リクエストに関連付けられた XML 要素の名前を取得します。 |
| [get_RequestNamespace](./get_requestnamespace/)() | SOAPリクエストに関連付けられた名前空間を取得します。 |
| [get_ResponseElementName](./get_responseelementname/)() | SOAPレスポンスに関連付けられたXML要素の名前を取得します。 |
| [get_ResponseNamespace](./get_responsenamespace/)() | SOAPレスポンスに関連付けられた名前空間を取得します。 |
| [get_Use](./get_use/)() | メッセージのエンコーディング方式を決定する値を取得します。 |
| [set_Action](./set_action/)(String) | 'SOAPAction'属性の値を設定します。 |
| [set_Binding](./set_binding/)(String) | XML Webサービスメソッドが操作を実装するバインディングを設定します。 |
| [set_OneWay](./set_oneway/)(bool) | クライアントがサーバーのメソッド処理完了を待たないかどうかを示す値を設定します。 |
| [set_ParameterStyle](./set_parameterstyle/)(SoapParameterStyle) | 'Body'要素の下に単一のXML要素としてパラメータがカプセル化されているかどうかを示す値を設定します。 |
| [set_RequestElementName](./set_requestelementname/)(String) | サービス記述で操作として定義されている、SOAPリクエストに関連付けられたXML要素の名前を設定します。 |
| [set_RequestNamespace](./set_requestnamespace/)(String) | SOAPリクエストに関連付けられた名前空間を設定します。 |
| [set_ResponseElementName](./set_responseelementname/)(String) | SOAPレスポンスに関連付けられたXML要素の名前を設定します。 |
| [set_ResponseNamespace](./set_responsenamespace/)(String) | SOAPレスポンスに関連付けられた名前空間を設定します。 |
| [set_Use](./set_use/)(Description::SoapBindingUse) | メッセージのエンコーディング方式を決定する値を設定します。 |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)() | 新しいインスタンスを構築します。 |
| [SoapDocumentMethodAttribute](./soapdocumentmethodattribute/)(String) | 新しいインスタンスを構築します。 |
## 参照

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
