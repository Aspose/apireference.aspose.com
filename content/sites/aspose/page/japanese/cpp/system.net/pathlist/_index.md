---
title: "System::Net::PathList クラス"
linktitle: "PathList"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::PathList クラス。CookieCollection クラスのインスタンスのリストを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 3000
url: /ja/cpp/system.net/pathlist/
---
## PathList class


このクラスは [CookieCollection](../cookiecollection/) クラスのインスタンスのリストを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class PathList : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [Create](./create/)() | 新しいインスタンスを作成します。 |
| [get_Count](./get_count/)() const | 項目数を返します。 |
| [get_SyncRoot](./get_syncroot/)() const | コレクションが同期されているオブジェクトを返します。 |
| [GetCookiesCount](./getcookiescount/)() | すべてのコレクション項目のクッキー数を返します。 |
| [GetEnumerator](./getenumerator/)() | 現在のコレクションの列挙子を返します。 |
| [idx_get](./idx_get/)(String) | 指定されたパスでクッキーコレクションを取得します。 |
| [idx_set](./idx_set/)(String, System::SharedPtr\<CookieCollection\>) | 指定されたパスでクッキーコレクションを設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
