---
title: "System::Web::Services::Protocols::SoapHeaderAttribute クラス"
linktitle: "SoapHeaderAttribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::Services::Protocols::SoapHeaderAttribute クラス。XML Web サービスメソッドまたは XML Web サービスクライアントが処理できる SOAP ヘッダーを指定します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上で、または operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 700
url: /ja/cpp/system.web.services.protocols/soapheaderattribute/
---
## SoapHeaderAttribute class


XML [Web](../../system.web/) サービスメソッドまたは XML [Web](../../system.web/) サービスクライアントが処理できる SOAP ヘッダーを指定します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上で、または operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class SoapHeaderAttribute : public System::Attribute
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Direction](./get_direction/)() | RTTI 情報。 |
| [get_MemberName](./get_membername/)() | SOAP ヘッダーの内容を受け取るために使用される XML SOAP サービスのメンバ変数名を取得します。 |
| [get_Required](./get_required/)() | 受信側の XML [Web](../../system.web/) サービスまたは XML [Web](../../system.web/) サービスクライアントが SOAP ヘッダーを理解し処理しなければならないかどうかを示す値を取得します。 |
| [set_Direction](./set_direction/)(SoapHeaderDirection) | SOAP ヘッダーの方向を設定します。 |
| [set_MemberName](./set_membername/)(String) | SOAP ヘッダーの内容を受け取るために使用される XML SOAP サービスのメンバ変数名を設定します。 |
| [set_Required](./set_required/)(bool) | 受信側の XML [Web](../../system.web/) サービスまたは XML [Web](../../system.web/) サービスクライアントが SOAP ヘッダーを理解し処理しなければならないかどうかを示す値を設定します。 |
| [SoapHeaderAttribute](./soapheaderattribute/)(String) | 新しいインスタンスを構築します。 |
## 参照

* Class [Attribute](../../system/attribute/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
