---
title: "System::Net::HttpWebResponse クラス"
linktitle: "HttpWebResponse"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::HttpWebResponse クラス。HTTP Web 応答を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2100
url: /ja/cpp/system.net/httpwebresponse/
---
## HttpWebResponse class


HTTP Web 応答を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class HttpWebResponse : public System::Net::WebResponse
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Close](./close/)() override | レスポンス ストリームを閉じます。 |
| [get_CharacterSet](./get_characterset/)() | 未実装です。 |
| [get_ContentLength](./get_contentlength/)() override | RTTI 情報。 |
| [get_ContentType](./get_contenttype/)() override | リソースの MIME タイプを返します。 |
| virtual [get_Cookies](./get_cookies/)() | Web 応答に関連付けられたクッキーを返します。 |
| [get_Headers](./get_headers/)() override | 現在の応答に関連付けられたヘッダーのコレクションを返します。 |
| virtual [get_Method](./get_method/)() | HTTP メソッドを返します。 |
| [get_ResponseUri](./get_responseuri/)() override | リソースの URI を返します。 |
| virtual [get_StatusCode](./get_statuscode/)() | Web 応答に関連付けられた HTTP ステータスコードを返します。 |
| virtual [get_StatusDescription](./get_statusdescription/)() | ステータスコードの文字列表現を返します。 |
| [get_SupportsHeaders](./get_supportsheaders/)() override | 現在の応答がヘッダーをサポートしているかどうかを示す値を返します。 |
| [GetResponseHeader](./getresponseheader/)(String) | 指定されたヘッダー名に対応する値を返します。 |
| [GetResponseStream](./getresponsestream/)() override | 応答ストリームを返します。 |
| [HttpWebResponse](./httpwebresponse/)(System::SharedPtr\<Http::HttpResponseMessage\>, System::SharedPtr\<Uri\>, System::SharedPtr\<CookieContainer\>) | 新しいインスタンスを構築します。 |
## 参照

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
