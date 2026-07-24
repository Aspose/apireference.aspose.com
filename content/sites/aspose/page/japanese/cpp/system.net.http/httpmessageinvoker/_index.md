---
title: "System::Net::Http::HttpMessageInvoker クラス"
linktitle: "HttpMessageInvoker"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::HttpMessageInvoker クラス。アプリケーションが HTTP ハンドラチェーン上で Send メソッドを呼び出すことを可能にします。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 600
url: /ja/cpp/system.net.http/httpmessageinvoker/
---
## HttpMessageInvoker class


アプリケーションが HTTP ハンドラチェーン上で Send メソッドを呼び出すことを可能にします。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡すようにしてください。

```cpp
class HttpMessageInvoker : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Dispose](./dispose/)() override | 現在のインスタンスを破棄します。このメソッドは必要に応じてハンドラも破棄します。 |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>) | RTTI 情報。 |
| [HttpMessageInvoker](./httpmessageinvoker/)(System::SharedPtr\<HttpMessageHandler\>, bool) | 新しいインスタンスを構築します。 |
| virtual [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>) | 指定されたリクエストを送信します。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
