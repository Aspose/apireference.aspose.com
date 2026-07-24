---
title: "System::Web::Services::Protocols::HttpWebClientProtocol クラス"
linktitle: "HttpWebClientProtocol"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::Services::Protocols::HttpWebClientProtocol クラス。この基底クラスは HTTP を使用するすべての XML Web サービス クライアント プロキシで使用されます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.web.services.protocols/httpwebclientprotocol/
---
## HttpWebClientProtocol class


この基底クラスは HTTP を使用するすべての XML [Web](../../system.web/) サービス クライアント プロキシで使用されます。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡してください。

```cpp
class HttpWebClientProtocol : public System::Web::Services::Protocols::WebClientProtocol
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [CheckForCookies](./checkforcookies/)(System::SharedPtr\<Net::HttpWebResponse\>) | 指定されたリクエストからクッキーを内部のクッキー コンテナに追加します。 |
| [get_AllowAutoRedirect](./get_allowautoredirect/)() | クライアントがサーバーのリダイレクトに従うかどうかを示す値を取得します。 |
| [get_ClientCertificates](./get_clientcertificates/)() | クライアント証明書のコレクションを返します。 |
| [get_CookieContainer](./get_cookiecontainer/)() | クッキーを保存するために使用されるコンテナを取得します。 |
| [get_EnableDecompression](./get_enabledecompression/)() | 圧縮解除が有効かどうかを示す値を取得します。 |
| [get_Proxy](./get_proxy/)() | プロキシ情報を取得します。 |
| [get_UnsafeAuthenticatedConnectionSharing](./get_unsafeauthenticatedconnectionsharing/)() | クライアントが NTLM 認証を使用する際に接続共有が有効かどうかを示す値を取得します。 |
| [get_UserAgent](./get_useragent/)() | ‘User-Agent’ ヘッダーの値を取得します。 |
| [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | クライアントがサーバーのリダイレクトに従うかどうかを示す値を設定します。 |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | クッキーを保存するために使用されるコンテナを設定します。 |
| [set_EnableDecompression](./set_enabledecompression/)(bool) | 圧縮解除が有効かどうかを示す値を設定します。 |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<Net::IWebProxy\>) | プロキシ情報を設定します。 |
| [set_UnsafeAuthenticatedConnectionSharing](./set_unsafeauthenticatedconnectionsharing/)(bool) | クライアントが NTLM 認証を使用する際に接続共有が有効かどうかを示す値を設定します。 |
| [set_UserAgent](./set_useragent/)(String) | 'User-Agent' ヘッダーの値を設定します。 |
| [UnregisterMapping](./unregistermapping/)(System::SharedPtr\<Object\>) |  |
## 参照

* Class [WebClientProtocol](../webclientprotocol/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
