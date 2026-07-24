---
title: "System::Net::Http::Headers::HttpRequestHeaders クラス"
linktitle: "HttpRequestHeaders"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::HttpRequestHeaders クラス。''Request'' ヘッダーのコレクションを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 1000
url: /ja/cpp/system.net.http.headers/httprequestheaders/
---
## HttpRequestHeaders class


'Request' ヘッダーのコレクションを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class HttpRequestHeaders : public System::Net::Http::Headers::HttpHeaders
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddHeaders](./addheaders/)(System::SharedPtr\<HttpHeaders\>) override | 指定された HttpHeaders-class インスタンスを現在のものと連結します。 |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | 既知のヘッダーを指定されたコレクションに追加します。 |
| [get_Accept](./get_accept/)() | RTTI 情報。 |
| [get_AcceptCharset](./get_acceptcharset/)() | 'Accept-Charset' ヘッダーの値を返します。 |
| [get_AcceptEncoding](./get_acceptencoding/)() | 'Accept-Encoding' ヘッダーの値を返します。 |
| [get_AcceptLanguage](./get_acceptlanguage/)() | 'Accept-Language' ヘッダーの値を返します。 |
| [get_Authorization](./get_authorization/)() | 'Authorization' ヘッダーの値を取得します。 |
| [get_CacheControl](./get_cachecontrol/)() | 'Cache-Control' ヘッダーの値を取得します。 |
| [get_Connection](./get_connection/)() | 'Connection' ヘッダーの値を返します。 |
| [get_ConnectionClose](./get_connectionclose/)() | 'Connection' ヘッダーの値に 'Close' が含まれているかどうかを示す値を取得します。 |
| [get_Date](./get_date/)() | 'Date' ヘッダーの値を取得します。 |
| [get_Expect](./get_expect/)() | 'Expect' ヘッダーの値を返します。 |
| [get_ExpectContinue](./get_expectcontinue/)() | 'Expect' ヘッダーの値に 'Continue' が含まれているかどうかを示す値を取得します。 |
| [get_From](./get_from/)() | 'From' ヘッダーの値を取得します。 |
| [get_Host](./get_host/)() | 'Host' ヘッダーの値を取得します。 |
| [get_IfMatch](./get_ifmatch/)() | 'If-Match' ヘッダーの値を返します。 |
| [get_IfModifiedSince](./get_ifmodifiedsince/)() | 'If-Modified-Since' ヘッダーの値を取得します。 |
| [get_IfNoneMatch](./get_ifnonematch/)() | 'If-None-Match' ヘッダーの値を返します。 |
| [get_IfRange](./get_ifrange/)() | 'If-Range' ヘッダーの値を取得します。 |
| [get_IfUnmodifiedSince](./get_ifunmodifiedsince/)() | 'If-Unmodified-Since' ヘッダーの値を取得します。 |
| [get_MaxForwards](./get_maxforwards/)() | 'Max-Forwards' ヘッダーの値を取得します。 |
| [get_Pragma](./get_pragma/)() | 'Pragma' ヘッダーの値を返します。 |
| [get_ProxyAuthorization](./get_proxyauthorization/)() | 'Proxy-Authorization' ヘッダーの値を取得します。 |
| [get_Range](./get_range/)() | 'Range' ヘッダーの値を取得します。 |
| [get_Referrer](./get_referrer/)() | 'Referer' ヘッダーの値を取得します。 |
| [get_TE](./get_te/)() | 'TE' ヘッダーの値を返します。 |
| [get_Trailer](./get_trailer/)() | 'Trailer' ヘッダーの値を返します。 |
| [get_TransferEncoding](./get_transferencoding/)() | 'Transfer-Encoding' ヘッダーの値を返します。 |
| [get_TransferEncodingChunked](./get_transferencodingchunked/)() | 'Transfer-Encoding' ヘッダーの値に 'Chunked' が含まれているかを示す値を取得します。 |
| [get_Upgrade](./get_upgrade/)() | 'Upgrade' ヘッダーの値を返します。 |
| [get_UserAgent](./get_useragent/)() | 'User-Agent' ヘッダーの値を返します。 |
| [get_Via](./get_via/)() | 'Via' ヘッダーの値を返します。 |
| [get_Warning](./get_warning/)() | 'Warning' ヘッダーの値を返します。 |
| [HttpRequestHeaders](./httprequestheaders/)() | 新しいインスタンスを構築します。 |
| [set_Authorization](./set_authorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | 'Authorization' ヘッダーの値を設定します。 |
| [set_CacheControl](./set_cachecontrol/)(System::SharedPtr\<CacheControlHeaderValue\>) | 'Cache-Control' ヘッダーの値を設定します。 |
| [set_ConnectionClose](./set_connectionclose/)(Nullable\<bool\>) | 'Connection' ヘッダーの値に 'Close' が含まれているかを示す値を設定します。 |
| [set_Date](./set_date/)(Nullable\<DateTimeOffset\>) | 'Date' ヘッダーの値を設定します。 |
| [set_ExpectContinue](./set_expectcontinue/)(Nullable\<bool\>) | 'Expect' ヘッダーの値に 'Continue' が含まれているかを示す値を設定します。 |
| [set_From](./set_from/)(String) | 'From' ヘッダーの値を設定します。 |
| [set_Host](./set_host/)(String) | 'Host' ヘッダーの値を設定します。 |
| [set_IfModifiedSince](./set_ifmodifiedsince/)(Nullable\<DateTimeOffset\>) | 'If-Modified-Since' ヘッダーの値を設定します。 |
| [set_IfRange](./set_ifrange/)(System::SharedPtr\<RangeConditionHeaderValue\>) | 'If-Range' ヘッダーの値を設定します。 |
| [set_IfUnmodifiedSince](./set_ifunmodifiedsince/)(Nullable\<DateTimeOffset\>) | 'If-Unmodified-Since' ヘッダーの値を設定します。 |
| [set_MaxForwards](./set_maxforwards/)(Nullable\<int32_t\>) | 'Max-Forwards' ヘッダーの値を設定します。 |
| [set_ProxyAuthorization](./set_proxyauthorization/)(System::SharedPtr\<AuthenticationHeaderValue\>) | 'Proxy-Authorization' ヘッダーの値を設定します。 |
| [set_Range](./set_range/)(System::SharedPtr\<RangeHeaderValue\>) | 'Range' ヘッダーの値を設定します。 |
| [set_Referrer](./set_referrer/)(System::SharedPtr\<Uri\>) | 'Referer' ヘッダーの値を設定します。 |
| [set_TransferEncodingChunked](./set_transferencodingchunked/)(Nullable\<bool\>) | 'Transfer-Encoding' ヘッダーの値に 'Chunked' が含まれているかを示す値を設定します。 |
## 参照

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
