---
title: "System::Net::Http::HttpMessageHandler クラス"
linktitle: "HttpMessageHandler"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::HttpMessageHandler クラス。HTTPメッセージハンドラの基底型を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生する可能性があります。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 500
url: /ja/cpp/system.net.http/httpmessagehandler/
---
## HttpMessageHandler class


HTTPメッセージハンドラの基底型を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class HttpMessageHandler : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Dispose](./dispose/)() override | 何もしません。 |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | RTTI 情報。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
