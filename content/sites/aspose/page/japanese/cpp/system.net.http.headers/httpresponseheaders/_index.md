---
title: "System::Net::Http::Headers::HttpResponseHeaders クラス"
linktitle: "HttpResponseHeaders"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::HttpResponseHeaders クラス。''Response'' ヘッダーのコレクションを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数として渡す際にはそのポインタを使用してください。"
type: docs
weight: 1100
url: /ja/cpp/system.net.http.headers/httpresponseheaders/
---
## HttpResponseHeaders class


'Response' ヘッダーのコレクションを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数として渡す際にはそのポインタを使用してください。

```cpp
class HttpResponseHeaders : public System::Net::Http::Headers::HttpHeaders
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | 指定された HttpHeaders-class インスタンスを現在のものと連結します。 |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | 既知のヘッダーを指定されたコレクションに追加します。 |
| [get_AcceptRanges](./get_acceptranges/)() | RTTI 情報。 |
| [get_Age](./get_age/)() | 'Age' ヘッダーの値を取得します。 |
| [get_CacheControl](./get_cachecontrol/)() | 'Cache-Control' ヘッダーの値を取得します。 |
| [get_Connection](./get_connection/)() | 'Connection' ヘッダーの値を返します。 |
| [get_ConnectionClose](./get_connectionclose/)() | 'Connection' ヘッダーの値に 'Close' が含まれているかどうかを示す値を取得します。 |
| [get_Date](./get_date/)() | 'Date' ヘッダーの値を取得します。 |
| [get_ETag](./get_etag/)() | 'ETag' ヘッダーの値を取得します。 |
| [get_Location](./get_location/)() | 'Location' ヘッダーの値を取得します。 |
| [get_Pragma](./get_pragma/)() | 'Pragma' ヘッダーの値を返します。 |
| [get_ProxyAuthenticate](./get_proxyauthenticate/)() | 'Proxy-Authenticate' ヘッダーの値を返します。 |
| [get_RetryAfter](./get_retryafter/)() | 'Retry-After' ヘッダーの値を取得します。 |
| [get_Server](./get_server/)() | 'Server' ヘッダーの値を返します。 |
| [get_Trailer](./get_trailer/)() | 'Trailer' ヘッダーの値を返します。 |
| [get_TransferEncoding](./get_transferencoding/)() | 'Transfer-Encoding' ヘッダーの値を返します。 |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | 'Transfer-Encoding' ヘッダーの値に 'Chunked' が含まれているかを示す値を取得します。 |
| [get_Upgrade](./get_upgrade/)() | 'Upgrade' ヘッダーの値を返します。 |
| [get_Vary](./get_vary/)() | 'Vary' ヘッダーの値を返します。 |
| [get_Via](./get_via/)() | 'Via' ヘッダーの値を返します。 |
| [get_Warning](./get_warning/)() | 'Warning' ヘッダーの値を返します。 |
| [get_WwwAuthenticate](./get_wwwauthenticate/)() | 'WWW-Authenticate' ヘッダーの値を返します。 |
| [HttpResponseHeaders](./httpresponseheaders/)() | 新しいインスタンスを構築します。 |
| [set_Age](./set_age/)(Nullable\<TimeSpan\>) | 'Age' ヘッダーの値を設定します。 |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | 'Cache-Control' ヘッダーの値を設定します。 |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | 'Connection' ヘッダーの値に 'Close' が含まれているかを示す値を設定します。 |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | 'Date' ヘッダーの値を設定します。 |
| [set_ETag](./set_etag/)(System::SharedPtr\<EntityTagHeaderValue\>) | 'ETag' ヘッダーの値を設定します。 |
| [set_Location](./set_location/)(System::SharedPtr\<Uri\>) | 'Location' ヘッダーの値を設定します。 |
| [set_RetryAfter](./set_retryafter/)(System::SharedPtr\<RetryConditionHeaderValue\>) | 'Retry-After' ヘッダーの値を設定します。 |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | 'Transfer-Encoding' ヘッダーの値に 'Chunked' が含まれているかを示す値を設定します。 |
## 参照

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
