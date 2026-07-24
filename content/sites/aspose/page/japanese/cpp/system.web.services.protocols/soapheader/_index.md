---
title: "System::Web::Services::Protocols::SoapHeader class"
linktitle: "SoapHeader"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::Services::Protocols::SoapHeader class. SOAP ヘッダーの内容を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 600
url: /ja/cpp/system.web.services.protocols/soapheader/
---
## SoapHeader class


SOAP ヘッダーの内容を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class SoapHeader : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Actor](./get_actor/)() | SOAP バージョン 1.1 が使用されている場合の SOAP ヘッダー受信者の URI を取得します。 |
| [get_DidUnderstand](./get_didunderstand/)() | SOAP ヘッダーが正しく処理されたかどうかを示す値を取得します。 |
| [get_EncodedMustUnderstand](./get_encodedmustunderstand/)() | SOAP バージョン 1.1 が使用されている場合の 'mustUnderstand' 属性の値を取得します。 |
| [get_EncodedMustUnderstand12](./get_encodedmustunderstand12/)() | SOAP バージョン 1.2 が使用されている場合の 'mustUnderstand' 属性の値を取得します。 |
| [get_EncodedRelay](./get_encodedrelay/)() | 'relay' 属性値の文字列表現を取得します。 |
| [get_MustUnderstand](./get_mustunderstand/)() | SOAP ヘッダーを理解すべきかどうかを示す値を取得します。 |
| [get_Relay](./get_relay/)() | 'relay' 属性の値を取得します。 |
| [get_Role](./get_role/)() | SOAP バージョン 1.2 が使用されている場合の SOAP ヘッダー受信者の URI を取得します。 |
| [set_Actor](./set_actor/)(String) | SOAP バージョン 1.1 が使用されている場合の SOAP ヘッダー受信者の URI を設定します。 |
| [set_DidUnderstand](./set_didunderstand/)(bool) | SOAP ヘッダーが正しく処理されたかどうかを示す値を設定します。 |
| [set_EncodedMustUnderstand](./set_encodedmustunderstand/)(String) | SOAP バージョン 1.1 が使用されている場合の 'mustUnderstand' 属性の値を設定します。 |
| [set_EncodedMustUnderstand12](./set_encodedmustunderstand12/)(String) | SOAP バージョン 1.2 が使用されている場合の 'mustUnderstand' 属性の値を設定します。 |
| [set_EncodedRelay](./set_encodedrelay/)(String) | 'relay' 属性値の文字列表現を設定します。 |
| [set_MustUnderstand](./set_mustunderstand/)(bool) | SOAP ヘッダーを理解すべきかどうかを示す値を設定します。 |
| [set_Relay](./set_relay/)(bool) | 'relay' 属性の値を設定します。 |
| [set_Role](./set_role/)(String) | SOAP バージョン 1.2 が使用されている場合の SOAP ヘッダー受信者の URI を設定します。 |
| [SoapHeader](./soapheader/)(System::SharedPtr\<Xml::XmlElement\>) | 新しいインスタンスを構築します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
