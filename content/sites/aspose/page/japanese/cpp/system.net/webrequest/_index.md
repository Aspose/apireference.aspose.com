---
title: "System::Net::WebRequest クラス"
linktitle: "WebRequest"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::WebRequest クラス。Web リクエストを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 3800
url: /ja/cpp/system.net/webrequest/
---
## WebRequest class


Web リクエストを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class WebRequest : public virtual System::Object
```

## Nested classes

* Class [HttpRequestCreator](./httprequestcreator/)
* Class [WebRequestPrefixElement](./webrequestprefixelement/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Abort](./abort/)() | 現在のリクエストを中止します。 |
| virtual [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) | リソースにデータを書き込むためのストリームを取得する非同期操作を開始します。 |
| virtual [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) | リソースに対する非同期リクエストを開始します。 |
| static [Create](./create/)(String) | 指定された URI を使用して、[WebRequest](./) クラスの新しいインスタンスを作成します。 |
| static [Create](./create/)(System::SharedPtr\<Uri\>) | 指定された URI を使用して、[WebRequest](./) クラスの新しいインスタンスを作成します。 |
| static [CreateDefault](./createdefault/)(System::SharedPtr\<Uri\>) | 指定された URI スキーム用に、[WebRequest](./) の派生クラスを作成します。 |
| static [CreateHttp](./createhttp/)(String) | 指定された URI を使用して、[WebRequest](./) クラスの新しいインスタンスを作成します。 |
| static [CreateHttp](./createhttp/)(System::SharedPtr\<Uri\>) | 指定された URI を使用して、[WebRequest](./) クラスの新しいインスタンスを作成します。 |
| virtual [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) | 指定されたストリーム取得の非同期操作が完了するまで待機します。 |
| virtual [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) | 指定されたリソースへの非同期リクエストが完了するまで待機します。 |
| virtual [get_CachePolicy](./get_cachepolicy/)() | キャッシュポリシーを取得します。 |
| virtual [get_ConnectionGroupName](./get_connectiongroupname/)() | 接続グループの名前を取得します。 |
| virtual [get_ContentLength](./get_contentlength/)() | 送信するリクエストデータのバイト数を取得します。 |
| virtual [get_ContentType](./get_contenttype/)() | リクエストの MIME タイプを取得します。 |
| virtual [get_Credentials](./get_credentials/)() | 現在のリクエストに関連付けられた認証情報を取得します。 |
| static [get_DefaultWebProxy](./get_defaultwebproxy/)() | グローバル HTTP プロキシを取得します。 |
| virtual [get_Headers](./get_headers/)() | HTTP ヘッダーのコレクションを取得します。 |
| virtual [get_Method](./get_method/)() | HTTP メソッドを取得します。 |
| virtual [get_PreAuthenticate](./get_preauthenticate/)() | リクエストが事前認証されるべきかを示す値を取得します。 |
| static [get_PrefixList](./get_prefixlist/)() | プレフィックスリストを取得します。 |
| virtual [get_Proxy](./get_proxy/)() | HTTP プロキシを取得します。 |
| virtual [get_RequestUri](./get_requesturi/)() | リクエスト URI を返します。 |
| virtual [get_Timeout](./get_timeout/)() | リクエストがタイムアウトになるまでの時間（ミリ秒）を取得します。 |
| virtual [get_UseDefaultCredentials](./get_usedefaultcredentials/)() | ‘Credential’ プロパティが ‘DefaultCredentials’ プロパティと等しいかどうかを示す値を取得します。 |
| virtual [GetRequestStream](./getrequeststream/)() | リソースへデータを書き込むためのストリームを返します。 |
| virtual [GetResponse](./getresponse/)() | 現在の Web リクエストに関連付けられた Web 応答を返します。 |
| static [RegisterPrefix](./registerprefix/)(String, System::SharedPtr\<IWebRequestCreate\>) | 指定された URI 用に、[WebRequest](./) の派生クラスを登録します。 |
| virtual [set_CachePolicy](./set_cachepolicy/)(System::SharedPtr\<System::Net::Cache::RequestCachePolicy\>) | キャッシュポリシーを設定します。 |
| virtual [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) | 接続グループの名前を設定します。 |
| virtual [set_ContentLength](./set_contentlength/)(int64_t) | 送信するリクエストデータのバイト数を設定します。 |
| virtual [set_ContentType](./set_contenttype/)(String) | リクエストの MIME タイプを設定します。 |
| virtual [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) | 現在のリクエストに関連付けられた認証情報を設定します。 |
| static [set_DefaultWebProxy](./set_defaultwebproxy/)(System::SharedPtr\<IWebProxy\>) | グローバル HTTP プロキシを設定します。 |
| virtual [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) | HTTP ヘッダーのコレクションを設定します。 |
| virtual [set_Method](./set_method/)(String) | HTTP メソッドを設定します。 |
| virtual [set_PreAuthenticate](./set_preauthenticate/)(bool) | リクエストが事前認証される必要があるかどうかを示す値を設定します。 |
| static [set_PrefixList](./set_prefixlist/)(System::SharedPtr\<Collections::Generic::List\<System::SharedPtr\<WebRequest::WebRequestPrefixElement\>\>\>) | プレフィックスリストを設定します。 |
| virtual [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) | HTTP プロキシを設定します。 |
| virtual [set_Timeout](./set_timeout/)(int32_t) | リクエストがタイムアウトするまでの時間（ミリ秒）を設定します。 |
| virtual [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | 'Credential' プロパティが 'DefaultCredentials' プロパティと等しいかどうかを示す値を設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
