---
title: "System::Net::WebResponse クラス"
linktitle: "WebResponse"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::WebResponse クラス。Web 応答を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 4000
url: /ja/cpp/system.net/webresponse/
---
## WebResponse class


Web 応答を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class WebResponse : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Close](./close/)() | レスポンス ストリームを閉じます。 |
| [Dispose](./dispose/)() override | 何もしません。 |
| virtual [get_ContentLength](./get_contentlength/)() | RTTI 情報。 |
| virtual [get_ContentType](./get_contenttype/)() | リソースの MIME タイプを返します。 |
| virtual [get_Headers](./get_headers/)() | 現在の応答に関連付けられたヘッダーのコレクションを返します。 |
| virtual [get_ResponseUri](./get_responseuri/)() | リソースの URI を返します。 |
| virtual [get_SupportsHeaders](./get_supportsheaders/)() | 現在の応答がヘッダーをサポートしているかどうかを示す値を返します。 |
| virtual [GetResponseStream](./getresponsestream/)() | 応答ストリームを返します。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
