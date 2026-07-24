---
title: "System::Net::FileWebRequest クラス"
linktitle: "FileWebRequest"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::FileWebRequest クラス。ファイルシステムで動作するための WebRequest 抽象クラスの実装を提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 1000
url: /ja/cpp/system.net/filewebrequest/
---
## FileWebRequest class


[WebRequest](../webrequest/) 抽象クラスの実装を提供し、ファイルシステムで動作します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数として渡す際にそのポインタを使用してください。

```cpp
class FileWebRequest : public System::Net::WebRequest
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Abort](./abort/)() override | 現在のリクエストを中止します。 |
| [BeginGetRequestStream](./begingetrequeststream/)(AsyncCallback, System::SharedPtr\<Object\>) override | リソースにデータを書き込むためのストリームを取得する非同期操作を開始します。 |
| [BeginGetResponse](./begingetresponse/)(AsyncCallback, System::SharedPtr\<Object\>) override | リソースに対する非同期リクエストを開始します。 |
| [EndGetRequestStream](./endgetrequeststream/)(System::SharedPtr\<IAsyncResult\>) override | 指定されたストリーム取得の非同期操作が完了するまで待機します。 |
| [EndGetResponse](./endgetresponse/)(System::SharedPtr\<IAsyncResult\>) override | 指定されたリソースへの非同期リクエストが完了するまで待機します。 |
| [FileWebRequest](./filewebrequest/)(System::SharedPtr\<Uri\>) | 新しいインスタンスを構築します。 |
| [get_ContentType](./get_contenttype/)() override | リクエストの MIME タイプを取得します。 |
| [get_Headers](./get_headers/)() override | HTTP ヘッダーのコレクションを取得します。 |
| [get_Method](./get_method/)() override | HTTP メソッドを取得します。 |
| [get_RequestUri](./get_requesturi/)() override | リクエスト URI を返します。 |
| [GetResponse](./getresponse/)() override | 現在の Web リクエストに関連付けられた Web 応答を返します。 |
| [set_ContentType](./set_contenttype/)(String) override | リクエストの MIME タイプを設定します。 |
| [set_Headers](./set_headers/)(System::SharedPtr\<WebHeaderCollection\>) override | HTTP ヘッダーのコレクションを設定します。 |
| [set_Method](./set_method/)(String) override | HTTP メソッドを設定します。 |
| [set_Timeout](./set_timeout/)(int) override | RTTI 情報。 |
## 参照

* Class [WebRequest](../webrequest/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
