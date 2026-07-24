---
title: "System::Resources::ResourceManager クラス"
linktitle: "ResourceManager"
second_title: "C++ 用 Aspose.Page"
description: "System::Resources::ResourceManager クラス。リソース管理のための API を提供します。実装されていません。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうするとランタイムエラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 100
url: /ja/cpp/system.resources/resourcemanager/
---
## ResourceManager class


リソース管理のための API を提供します。実装されていません。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class ResourceManager : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [GetObject__](./getobject__/)(String) | リソースからオブジェクトを取得します。名前が GetObject() ではなく、GetObjectA の定義問題に対応するためです。 |
| virtual [GetObject__](./getobject__/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | リソースからオブジェクトを取得します。名前が GetObject() ではなく、GetObjectA の定義問題に対応するためです。 |
| virtual [GetString](./getstring/)(String) | 文字列リソースを取得します。 |
| virtual [GetString](./getstring/)(String, SharedPtr\<System::Globalization::CultureInfo\>) | 文字列リソースを取得します。 |
| [ResourceManager](./resourcemanager/)(const String\&, const SharedPtr\<Reflection::Assembly\>\&) | RTTI 情報。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Resources](../)
* Library [Aspose.Page for C++](../../)
