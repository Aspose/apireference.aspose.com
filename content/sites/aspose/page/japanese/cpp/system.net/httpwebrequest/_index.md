---
title: "System::Net::HttpWebRequest クラス"
linktitle: "HttpWebRequest"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::HttpWebRequest クラス。HTTP Web リクエストを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生する可能性があります。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 2000
url: /ja/cpp/system.net/httpwebrequest/
---
## HttpWebRequest class


HTTP Web リクエストを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生する可能性があります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class HttpWebRequest : public System::Net::WebRequest
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Abort](./abort/)() override | 現在のリクエストを中止します。 |
| virtual [AddRange](./addrange/)(int32_t) | 現在のリクエストに 'Range' ヘッダーを追加します。 |
| virtual [AddRange](./addrange/)(System::String, int32_t, int32_t) | 現在のリクエストに 'Range' ヘッダーを追加します。 |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | リソースにデータを書き込むためのストリームを取得する非同期操作を開始します。 |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | リソースに対する非同期リクエストを開始します。 |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | 指定されたストリーム取得の非同期操作が完了するまで待機します。 |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | 指定されたリソースへの非同期リクエストが完了するまで待機します。 |
| [get_Accept](./get_accept/)() | 'Accept' HTTP ヘッダーの値を取得します。 |
| virtual [get_AllowAutoRedirect](./get_allowautoredirect/)() | リクエストがリダイレクトを追従すべきかを示す値を取得します。 |
| virtual [get_AllowReadStreamBuffering](./get_allowreadstreambuffering/)() | リソースから受信したデータをバッファリングすべきかを示す値を取得します。 |
| virtual [get_AllowWriteStreamBuffering](./get_allowwritestreambuffering/)() | データ送信時にバッファリングが有効かどうかを示す値を取得します。 |
| virtual [get_ClientCertificates](./get_clientcertificates/)() | 現在のリクエストに関連付けられた証明書のコレクションを取得します。 |
| [get_ConnectionGroupName](./get_connectiongroupname/)() override | 接続グループの名前を取得します。 |
| [get_ContentLength](./get_contentlength/)() override | 送信するリクエストデータのバイト数を取得します。 |
| [get_ContentType](./get_contenttype/)() override | リクエストの MIME タイプを取得します。 |
| [get_ContinueTimeout](./get_continuetimeout/)() | 100-Continue ステータスコードが受信されるまで待機するタイムアウトを取得します。 |
| virtual [get_CookieContainer](./get_cookiecontainer/)() | 現在の Web リクエストに関連付けられたクッキー コンテナを取得します。 |
| [get_Credentials](./get_credentials/)() override | 現在のリクエストに関連付けられた認証情報を取得します。 |
| virtual [get_HaveResponse](./get_haveresponse/)() | レスポンスが受信されたかどうかを示す値を返します。 |
| [get_Headers](./get_headers/)() override | HTTP ヘッダーのコレクションを取得します。 |
| virtual [get_KeepAlive](./get_keepalive/)() | 現在のリクエストが 'Keep-Alive' ヘッダーを含むべきかを示す値を取得します。 |
| virtual [get_MaximumAutomaticRedirections](./get_maximumautomaticredirections/)() | 許可される最大リダイレクト数を取得します。 |
| [get_Method](./get_method/)() override | HTTP メソッドを取得します。 |
| [get_PreAuthenticate](./get_preauthenticate/)() override | リクエストが事前認証されるべきかを示す値を取得します。 |
| [get_Proxy](./get_proxy/)() override | HTTP プロキシを取得します。 |
| virtual [get_Referer](./get_referer/)() | 'Referer' ヘッダーの値を取得します。 |
| [get_RequestUri](./get_requesturi/)() override | リクエスト URI を返します。 |
| virtual [get_SendChunked](./get_sendchunked/)() | データをセグメントで送信する必要があるかどうかを示す値を取得します。 |
| [get_ServicePoint](./get_servicepoint/)() | リソースへのネットワーク接続を表すサービスポイントを返します。 |
| virtual [get_SupportsCookieContainer](./get_supportscookiecontainer/)() | 現在のリクエストがクッキー コンテナを使用できるかどうかを示す値を返します。 |
| [get_Timeout](./get_timeout/)() override | リクエストがタイムアウトになるまでの時間（ミリ秒）を取得します。 |
| [get_UseDefaultCredentials](./get_usedefaultcredentials/)() override | ‘Credential’ プロパティが ‘DefaultCredentials’ プロパティと等しいかどうかを示す値を取得します。 |
| virtual [get_UserAgent](./get_useragent/)() | ‘User-Agent’ ヘッダーの値を取得します。 |
| [GetRequestStream](./getrequeststream/)() override | リソースへデータを書き込むためのストリームを返します。 |
| [GetResponse](./getresponse/)() override | 現在の Web リクエストに関連付けられた Web 応答を返します。 |
| [HttpWebRequest](./httpwebrequest/)(System::SharedPtr\<Uri\>) | 新しいインスタンスを構築します。 |
| [set_Accept](./set_accept/)(String) | ‘Accept’ HTTP ヘッダーの値を設定します。 |
| virtual [set_AllowAutoRedirect](./set_allowautoredirect/)(bool) | リクエストがリダイレクトに従うかどうかを示す値を設定します。 |
| virtual [set_AllowReadStreamBuffering](./set_allowreadstreambuffering/)(bool) | リソースから受信したデータをバッファリングする必要があるかどうかを示す値を設定します。 |
| virtual [set_AllowWriteStreamBuffering](./set_allowwritestreambuffering/)(bool) | データ送信時にバッファリングが有効かどうかを示す値を設定します。 |
| virtual [set_ClientCertificates](./set_clientcertificates/)(System::SharedPtr\<System::Security::Cryptography::X509Certificates::X509CertificateCollection\>) | 現在のリクエストに関連付けられた証明書のコレクションを設定します。 |
| [set_ConnectionGroupName](./set_connectiongroupname/)(System::String) override | 接続グループの名前を設定します。 |
| [set_ContentLength](./set_contentlength/)(int64_t) override | 送信するリクエストデータのバイト数を設定します。 |
| [set_ContentType](./set_contenttype/)(String) override | リクエストの MIME タイプを設定します。 |
| [set_ContinueTimeout](./set_continuetimeout/)(int32_t) | 100-Continue ステータスコードが受信されるまで待機するタイムアウトを設定します。 |
| virtual [set_CookieContainer](./set_cookiecontainer/)(System::SharedPtr\<System::Net::CookieContainer\>) | 現在の Web リクエストに関連付けられたクッキー コンテナを設定します。 |
| [set_Credentials](./set_credentials/)(System::SharedPtr\<ICredentials\>) override | 現在のリクエストに関連付けられた認証情報を設定します。 |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | HTTP ヘッダーのコレクションを設定します。 |
| virtual [set_KeepAlive](./set_keepalive/)(bool) | 現在のリクエストが ‘Keep-Alive’ ヘッダーを含む必要があるかどうかを示す値を設定します。 |
| virtual [set_MaximumAutomaticRedirections](./set_maximumautomaticredirections/)(int) | 許可されるリダイレクトの最大数を設定します。 |
| [set_Method](./set_method/)(String) override | HTTP メソッドを設定します。 |
| [set_PreAuthenticate](./set_preauthenticate/)(bool) override | リクエストが事前認証される必要があるかどうかを示す値を設定します。 |
| [set_ProtocolVersion](./set_protocolversion/)(System::Version) | RTTI 情報。 |
| [set_Proxy](./set_proxy/)(System::SharedPtr\<IWebProxy\>) override | HTTP プロキシを設定します。 |
| virtual [set_Referer](./set_referer/)(System::String) | 'Referer' ヘッダーの値を設定します。 |
| virtual [set_SendChunked](./set_sendchunked/)(bool) | データをセグメントで送信する必要があるかどうかを示す値を設定します。 |
| [set_Timeout](./set_timeout/)(int) override | リクエストがタイムアウトするまでの時間（ミリ秒）を設定します。 |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) override | 'Credential' プロパティが 'DefaultCredentials' プロパティと等しいかどうかを示す値を設定します。 |
| virtual [set_UserAgent](./set_useragent/)(System::String) | 'User-Agent' ヘッダーの値を設定します。 |
## 参照

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
