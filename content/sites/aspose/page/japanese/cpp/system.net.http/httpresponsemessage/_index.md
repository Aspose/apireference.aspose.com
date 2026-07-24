---
title: "System::Net::Http::HttpResponseMessage クラス"
linktitle: "HttpResponseMessage"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::HttpResponseMessage クラス。HTTP 応答メッセージを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 900
url: /ja/cpp/system.net.http/httpresponsemessage/
---
## HttpResponseMessage class


HTTP 応答メッセージを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡すようにしてください。

```cpp
class HttpResponseMessage : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Dispose](./dispose/)() override | 現在のインスタンスを破棄します。このメソッドは HTTP 応答のコンテンツも破棄します。 |
| [EnsureSuccessStatusCode](./ensuresuccessstatuscode/)() | ステータスコードをチェックします。ステータスコードが 2xx でない場合、[HttpRequestException](../httprequestexception/) がスローされます。 |
| [get_Content](./get_content/)() const | HTTP 応答のコンテンツを取得します。 |
| [get_Headers](./get_headers/)() const | HTTP コンテンツヘッダーを返します。 |
| [get_IsSuccessStatusCode](./get_issuccessstatuscode/)() const | ステータスコードがクライアントから要求された操作が受信され、理解され、受け入れられたことを示すかどうかをチェックします。 |
| [get_ReasonPhrase](./get_reasonphrase/)() const | ステータスコードと共にサーバーから送信される Reason-Phrase を取得します。 |
| [get_RequestMessage](./get_requestmessage/)() const | HTTP リクエストメッセージを取得します。 |
| [get_StatusCode](./get_statuscode/)() const | HTTP ステータスコードを取得します。 |
| [get_Version](./get_version/)() const | RTTI 情報。 |
| [HttpResponseMessage](./httpresponsemessage/)() | 新しいインスタンスを構築します。 |
| [HttpResponseMessage](./httpresponsemessage/)(HttpStatusCode) | 新しいインスタンスを構築します。 |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | HTTP 応答のコンテンツを設定します。 |
| [set_ReasonPhrase](./set_reasonphrase/)(String) | ステータスコードと共にサーバーから送信される Reason-Phrase を設定します。 |
| [set_RequestMessage](./set_requestmessage/)(System::SharedPtr\<HttpRequestMessage\>) | HTTP リクエストメッセージを設定します。 |
| [set_StatusCode](./set_statuscode/)(HttpStatusCode) | HTTP ステータスコードを設定します。 |
| [set_Version](./set_version/)(System::Version) | HTTPバージョンを設定します。 |
| [ToString](./tostring/)() const override | [System::Object::ToString](../../system/object/tostring/). |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
