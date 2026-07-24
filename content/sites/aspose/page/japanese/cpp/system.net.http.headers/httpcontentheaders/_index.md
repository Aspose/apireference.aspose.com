---
title: "System::Net::Http::Headers::HttpContentHeaders class"
linktitle: "HttpContentHeaders"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::HttpContentHeaders クラス。''Content'' ヘッダーのコレクションを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 600
url: /ja/cpp/system.net.http.headers/httpcontentheaders/
---
## HttpContentHeaders class


'Content' ヘッダーのコレクションを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class HttpContentHeaders : public System::Net::Http::Headers::HttpHeaders
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | 既知のヘッダーを指定されたコレクションに追加します。 |
| [get_Allow](./get_allow/)() | RTTI 情報。 |
| [get_ContentDisposition](./get_contentdisposition/)() | 'Content-Disposition' ヘッダーの値を取得します。 |
| [get_ContentEncoding](./get_contentencoding/)() | 'Content-Encoding' ヘッダーの値を取得します。 |
| [get_ContentLanguage](./get_contentlanguage/)() | 'Content-Language' ヘッダーの値を取得します。 |
| [get_ContentLength](./get_contentlength/)() | 'Content-Length' ヘッダーの値を取得します。 |
| [get_ContentLocation](./get_contentlocation/)() | 'Content-Location' ヘッダーの値を取得します。 |
| [get_ContentMD5](./get_contentmd5/)() | 'Content-MD5' ヘッダーの値を取得します。 |
| [get_ContentRange](./get_contentrange/)() | 'Content-Range' ヘッダーの値を取得します。 |
| [get_ContentType](./get_contenttype/)() | 'Content-Type' ヘッダーの値を取得します。 |
| [get_Expires](./get_expires/)() | 'Expires' ヘッダーの値を取得します。 |
| [get_LastModified](./get_lastmodified/)() | 'Last-Modified' ヘッダーの値を取得します。 |
| [HttpContentHeaders](./httpcontentheaders/)(HeaderFunc\<Nullable\<int64_t\>\>) | 新しいインスタンスを構築します。 |
| [set_ContentDisposition](./set_contentdisposition/)(System::SharedPtr\<ContentDispositionHeaderValue\>) | 'Content-Disposition' ヘッダーの値を設定します。 |
| [set_ContentLength](./set_contentlength/)(Nullable\<int64_t\>) | 'Content-Length' ヘッダーの値を設定します。 |
| [set_ContentLocation](./set_contentlocation/)(System::SharedPtr\<Uri\>) | 'Content-Location' ヘッダーの値を設定します。 |
| [set_ContentMD5](./set_contentmd5/)(System::ArrayPtr\<uint8_t\>) | 'Content-MD5' ヘッダーの値を設定します。 |
| [set_ContentRange](./set_contentrange/)(System::SharedPtr\<ContentRangeHeaderValue\>) | 'Content-Range' ヘッダーの値を設定します。 |
| [set_ContentType](./set_contenttype/)(System::SharedPtr\<MediaTypeHeaderValue\>) | 'Content-Type' ヘッダーの値を設定します。 |
| [set_Expires](./set_expires/)(Nullable\<DateTimeOffset\>) | 'Expires' ヘッダーの値を設定します。 |
| [set_LastModified](./set_lastmodified/)(Nullable\<DateTimeOffset\>) | 'Last-Modified' ヘッダーの値を設定します。 |
## 参照

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
