---
title: "System::Net::Http::HttpClientHandler クラス"
linktitle: "HttpClientHandler"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::HttpClientHandler クラス。HttpClient クラスで使用されるデフォルトのメッセージハンドラを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうするとランタイムエラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 300
url: /ja/cpp/system.net.http/httpclienthandler/
---
## HttpClientHandler class


[HttpClient](../httpclient/) クラスで使用されるデフォルトのメッセージハンドラを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうするとランタイムエラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class HttpClientHandler : public System::Net::Http::HttpMessageHandler
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Dispose](./dispose/)() override | 何もしません。 |
| [get_CookieContainer](./get_cookiecontainer/)() | サーバークッキーを保存するために使用されるクッキーコンテナを取得します。 |
| [get_Credentials](./get_credentials/)() | 認証情報を取得します。 |
| [HttpClientHandler](./httpclienthandler/)() | RTTI 情報。 |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) override | RTTI 情報。 |
| [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | サーバークッキーを保存するために使用されるクッキーコンテナを設定します。 |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | 認証情報を設定します。 |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | プロキシ情報を設定します。 |
| [set_Timeout](./set_timeout/)(int32_t) | リクエストがタイムアウトになるまでの時間（ミリ秒）を取得します。 |
| [set_UseCookies](./set_usecookies/)(bool) | 現在のインスタンスがサーバークッキーを保存するためにクッキーコンテナを使用するか、リクエスト送信時にサーバークッキーを使用するかを示す値を設定します。 |
| [set_UseProxy](./set_useproxy/)(bool) | 現在のインスタンスがリクエスト送信時にプロキシを使用するかどうかを示す値を設定します。 |
## 参照

* Class [HttpMessageHandler](../httpmessagehandler/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
