---
title: "System::Net::WebHeaderCollection クラス"
linktitle: "WebHeaderCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::WebHeaderCollection クラス。プロトコルヘッダーのコレクションを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 3600
url: /ja/cpp/system.net/webheadercollection/
---
## WebHeaderCollection class


プロトコルヘッダーのコレクションを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class WebHeaderCollection : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(String, String) | 指定されたヘッダー名とヘッダー値のペアをコレクションに追加します。 |
| [Add](./add/)(HttpResponseHeader, String) | 指定されたヘッダーとヘッダー値のペアをコレクションに追加します。 |
| [Add](./add/)(HttpRequestHeader, String) | 指定されたヘッダーとヘッダー値のペアをコレクションに追加します。 |
| [AllKeys](./allkeys/)() | コレクションに格納されているヘッダー名のコレクションを返します。 |
| [get_Count](./get_count/)() const | コレクション内の要素数を返します。 |
| [get_Keys](./get_keys/)() | コレクションに格納されているヘッダー名のコレクションを返します。 |
| [GetKey](./getkey/)(int) | 指定されたインデックスのキーを返します。 |
| [GetValues](./getvalues/)(String) | ヘッダー値のコレクションを返します。 |
| [idx_get](./idx_get/)(HttpRequestHeader) | 指定されたリクエストのヘッダーを使用してヘッダー値を取得します。 |
| [idx_get](./idx_get/)(HttpResponseHeader) | 指定されたレスポンスのヘッダーを使用してヘッダー値を取得します。 |
| [idx_get](./idx_get/)(String) | 指定されたヘッダー名を使用してヘッダー値を取得します。 |
| [idx_set](./idx_set/)(HttpRequestHeader, String) | 指定されたヘッダーのヘッダー値を設定します。 |
| [idx_set](./idx_set/)(HttpResponseHeader, String) | 指定されたレスポンスのヘッダーを使用してヘッダー値を設定します。 |
| [idx_set](./idx_set/)(String, String) | 指定されたヘッダー名を使用してヘッダー値を設定します。 |
| static [IsRestricted](./isrestricted/)(const String\&) | 指定された HTTP ヘッダーをリクエストに設定できるかテストします。 |
| [Remove](./remove/)(String) | 指定されたヘッダー名でヘッダーを削除します。 |
| [Remove](./remove/)(HttpResponseHeader) | 指定されたレスポンスのヘッダーを削除します。 |
| [Remove](./remove/)(HttpRequestHeader) | 指定されたリクエストのヘッダーを削除します。 |
| [Set](./set/)(String, String) | 指定されたヘッダーの値を設定します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| [WebHeaderCollection](./webheadercollection/)() | 新しいインスタンスを構築します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
