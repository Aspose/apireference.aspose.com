---
title: "System::Net::WebClient クラス"
linktitle: "WebClient"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::WebClient クラス。WebClient はデータの送受信のための共通メソッドを提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 3500
url: /ja/cpp/system.net/webclient/
---
## WebClient class


[WebClient](./) provides common methods for sending and receiving data. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class WebClient : public System::ComponentModel::Component
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [DownloadData](./downloaddata/)(const String\&) const | 指定されたリソースをバイト配列としてダウンロードします。 |
| [DownloadData](./downloaddata/)(const SharedPtr\<Uri\>\&) const | 指定されたリソースをバイト配列としてダウンロードします。 |
| [DownloadString](./downloadstring/)(const String\&) const | 指定されたリソースを文字列としてダウンロードします。 |
| [DownloadString](./downloadstring/)(const SharedPtr\<Uri\>\&) const | 指定されたリソースを文字列としてダウンロードします。 |
| [get_Encoding](./get_encoding/)() const | 文字列のダウンロードまたはアップロードに使用されるエンコーディングを取得します。 |
| [set_Encoding](./set_encoding/)(const SharedPtr\<Text::Encoding\>\&) | 文字列のダウンロードまたはアップロードに使用されるエンコーディングを設定します。 |
| [set_UseDefaultCredentials](./set_usedefaultcredentials/)(bool) | 未実装です。 |
| [WebClient](./webclient/)() | RTTI 情報。 |
| [~WebClient](./~webclient/)() | 現在のインスタンスを破棄します。 |
## 参照

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
