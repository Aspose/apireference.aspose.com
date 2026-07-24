---
title: "System::Net::WebProxy クラス"
linktitle: "WebProxy"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::WebProxy クラス。http Web プロキシサーバーを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 3700
url: /ja/cpp/system.net/webproxy/
---
## WebProxy class


http Web プロキシサーバーを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class WebProxy : public System::Net::IWebProxy
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Address](./get_address/)() | 現在のプロキシサーバーのアドレスを取得します。 |
| [get_BypassList](./get_bypasslist/)() | プロキシサーバーを使用しないアドレスのリストを取得します。 |
| [get_BypassProxyOnLocal](./get_bypassproxyonlocal/)() | ローカルアドレスに対してプロキシサーバーを使用すべきかどうかを示す値を取得します。 |
| virtual [get_Credentials](./get_credentials/)() | 認証のためにプロキシサーバーへ送信されるクレデンシャルを取得します。 |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | リクエストにデフォルトのクレデンシャルを送信すべきかどうかを示す値を取得します。 |
| static [GetDefaultProxy](./getdefaultproxy/)() | Internet Explorer の非動的設定を使用するプロキシを返します。 |
| virtual [GetProxy](./getproxy/)(System::SharedPtr\<Uri\>) | Web リクエストのプロキシ対象 URI を返します。 |
| virtual [IsBypassed](./isbypassed/)(System::SharedPtr\<Uri\>) | 指定された URI に対してプロキシサーバーが使用されていないかを確認します。 |
| [set_Address](./set_address/)(System::SharedPtr\<Uri\>) | 現在のプロキシサーバーのアドレスを設定します。 |
| [set_BypassList](./set_bypasslist/)(System::ArrayPtr\<String\>) | プロキシサーバーを使用しないアドレスのリストを設定します。 |
| [set_BypassProxyOnLocal](./set_bypassproxyonlocal/)(bool) | ローカルアドレスに対してプロキシサーバーを使用すべきかを示す値を設定します。 |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | 認証のためにプロキシサーバーへ送信される資格情報を設定します。 |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | リクエストにデフォルトの資格情報を送信すべきかを示す値を設定します。 |
| [WebProxy](./webproxy/)() | 新しいインスタンスを構築します。 |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>) | 新しいインスタンスを構築します。 |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool) | 新しいインスタンスを構築します。 |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>) | 新しいインスタンスを構築します。 |
| [WebProxy](./webproxy/)(System::SharedPtr\<Uri\>, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | 新しいインスタンスを構築します。 |
| [WebProxy](./webproxy/)(String, int32_t) | 新しいインスタンスを構築します。 |
| [WebProxy](./webproxy/)(String) | 新しいインスタンスを構築します。 |
| [WebProxy](./webproxy/)(String, bool) | 新しいインスタンスを構築します。 |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>) | 新しいインスタンスを構築します。 |
| [WebProxy](./webproxy/)(String, bool, System::ArrayPtr\<String\>, System::SharedPtr\<ICredentials\>) | 新しいインスタンスを構築します。 |
## 参照

* Class [IWebProxy](../iwebproxy/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
