---
title: "System::Net::Http::HttpRequestMessage class"
linktitle: "HttpRequestMessage"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::HttpRequestMessage クラス。HTTP リクエストメッセージを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 800
url: /ja/cpp/system.net.http/httprequestmessage/
---
## HttpRequestMessage class


HTTP リクエストメッセージを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class HttpRequestMessage : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Dispose](./dispose/)() override | 現在のインスタンスを破棄します。このメソッドは HTTP リクエストのコンテンツも破棄します。 |
| [get_Content](./get_content/)() | HTTP リクエストのコンテンツを取得します。 |
| [get_Headers](./get_headers/)() | HTTP コンテンツヘッダーを返します。 |
| [get_Method](./get_method/)() | HTTPリクエストメソッドを取得します。 |
| [get_Properties](./get_properties/)() | HTTPリクエストプロパティのコレクションを返します。 |
| [get_RequestUri](./get_requesturi/)() | 要求されたリソースのURIを取得します。 |
| [get_Version](./get_version/)() | RTTI 情報。 |
| [HttpRequestMessage](./httprequestmessage/)() | 新しいインスタンスを構築します。 |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, System::SharedPtr\<Uri\>) | 新しいインスタンスを構築します。 |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, String) | 新しいインスタンスを構築します。 |
| [MarkAsSent](./markassent/)() | 現在のリクエストを送信済みとしてマークします。 |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | HTTPリクエストのコンテンツを設定します。 |
| [set_Method](./set_method/)(System::SharedPtr\<HttpMethod\>) | HTTPリクエストメソッドを設定します。 |
| [set_RequestUri](./set_requesturi/)(System::SharedPtr\<Uri\>) | 要求されたリソースのURIを設定します。 |
| [set_Version](./set_version/)(System::Version) | HTTPバージョンを設定します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
