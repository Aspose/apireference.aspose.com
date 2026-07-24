---
title: "System::Net::FileWebResponse class"
linktitle: "FileWebResponse"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::FileWebResponse クラス。ファイルシステムで動作するための WebResponse 抽象クラスの実装を提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ の関数に引数として渡す際はそのポインタを使用してください。"
type: docs
weight: 1100
url: /ja/cpp/system.net/filewebresponse/
---
## FileWebResponse class


[WebResponse](../webresponse/) 抽象クラスの実装を提供し、ファイルシステムで動作します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数に引数として渡す際はそのポインタを使用してください。

```cpp
class FileWebResponse : public System::Net::WebResponse
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Close](./close/)() override | レスポンス ストリームを閉じます。 |
| [FileWebResponse](./filewebresponse/)(System::SharedPtr\<Uri\>) | 新しいインスタンスを構築します。 |
| [get_ContentLength](./get_contentlength/)() override | RTTI 情報。 |
| [get_ContentType](./get_contenttype/)() override | リソースの MIME タイプを返します。 |
| [get_Headers](./get_headers/)() override | 現在の応答に関連付けられたヘッダーのコレクションを返します。 |
| [get_ResponseUri](./get_responseuri/)() override | リソースの URI を返します。 |
| [get_SupportsHeaders](./get_supportsheaders/)() override | 現在の応答がヘッダーをサポートしているかどうかを示す値を返します。 |
| [GetResponseStream](./getresponsestream/)() override | 応答ストリームを返します。 |
## 参照

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
