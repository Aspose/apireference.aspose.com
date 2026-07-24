---
title: "System::Web::Services::Protocols::WebClientProtocol クラス"
linktitle: "WebClientProtocol"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::Services::Protocols::WebClientProtocol クラス。この基底クラスは ASP.NET を使用して作成されたすべての XML Web サービス クライアント プロキシで使用されます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 1100
url: /ja/cpp/system.web.services.protocols/webclientprotocol/
---
## WebClientProtocol class


この基底クラスは ASP.NET を使用して作成されたすべての XML [Web](../../system.web/) サービス クライアント プロキシで使用されます。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップしてください。

```cpp
class WebClientProtocol : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Abort](./abort/)() | リクエストをキャンセルします。 |
| [get_ConnectionGroupName](./get_connectiongroupname/)() | 接続グループの名前を取得します。 |
| [get_Credentials](./get_credentials/)() | 認証情報を取得します。 |
| [get_PreAuthenticate](./get_preauthenticate/)() | 事前認証が有効かどうかを示す値を取得します。 |
| [get_RequestEncoding](./get_requestencoding/)() | クライアントのリクエスト作成に使用されるエンコーディングを取得します。 |
| [get_Timeout](./get_timeout/)() | リクエストがタイムアウトするまでの待機時間を取得します。 |
| [get_Uri](./get_uri/)() | XML [Web](../../system.web/) サービスの URI を取得します。 |
| [get_Url](./get_url/)() | XML [Web](../../system.web/) サービスの URL を取得します。 |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | ‘Credential’ プロパティが ‘DefaultCredentials’ プロパティと等しいかどうかを示す値を取得します。 |
| [set_ConnectionGroupName](./set_connectiongroupname/)(String) | 接続グループの名前を設定します。 |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<Net::ICredentials\>) | 認証情報を設定します。 |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) | 事前認証が有効かどうかを示す値を設定します。 |
| [set_RequestEncoding](./set_requestencoding/)(System::SharedPtr\<Text::Encoding\>) | クライアントのリクエストを作成する際に使用されるエンコーディングを設定します。 |
| [set_Timeout](./set_timeout/)(int32_t) | リクエストがタイムアウトするまでの待機時間を設定します。 |
| [set_Uri](./set_uri/)(System::SharedPtr\<Uri\>) | XML [Web](../../system.web/) サービスの URI を設定します。 |
| [set_Url](./set_url/)(String) | XML [Web](../../system.web/) サービスの URL を設定します。 |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | 'Credential' プロパティが 'DefaultCredentials' プロパティと等しいかどうかを示す値を設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
