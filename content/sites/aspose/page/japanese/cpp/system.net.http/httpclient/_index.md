---
title: "System::Net::Http::HttpClient クラス"
linktitle: "HttpClient"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::HttpClient クラス。HTTP クライアントの基底クラスで、リクエストの送信とレスポンスの受信を行います。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。"
type: docs
weight: 200
url: /ja/cpp/system.net.http/httpclient/
---
## HttpClient class


リクエストの送信とレスポンスの受信を行う HTTP クライアントの基底クラスを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class HttpClient : public System::Net::Http::HttpMessageInvoker
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CancelPendingRequests](./cancelpendingrequests/)() | すべての保留中のリクエストをキャンセルします。 |
| [get_BaseAddress](./get_baseaddress/)() | リクエストの送信に使用されるリソースのベースアドレスを取得します。 |
| [get_DefaultRequestHeaders](./get_defaultrequestheaders/)() | RTTI 情報。 |
| [get_MaxResponseContentBufferSize](./get_maxresponsecontentbuffersize/)() | レスポンス コンテンツの最大バイト数を取得します。 |
| [get_Timeout](./get_timeout/)() | リクエストがタイムアウトするまでの待機時間を取得します。 |
| [HttpClient](./httpclient/)() | 新しいインスタンスを構築します。 |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>) | 新しいインスタンスを構築します。 |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>, bool) | 新しいインスタンスを構築します。 |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>, HttpCompletionOption) | 指定された HTTP リクエストを送信します。 |
| [set_BaseAddress](./set_baseaddress/)(System::SharedPtr\<Uri\>) | リクエスト送信に使用されるリソースのベースアドレスを設定します。 |
| [set_MaxResponseContentBufferSize](./set_maxresponsecontentbuffersize/)(int64_t) | レスポンスコンテンツの最大バイト数を設定します。 |
| [set_Timeout](./set_timeout/)(TimeSpan) | リクエストがタイムアウトするまでの待機時間を設定します。 |
## 参照

* Class [HttpMessageInvoker](../httpmessageinvoker/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
