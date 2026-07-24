---
title: "System::Net::Http::Headers::EntityTagHeaderValue クラス"
linktitle: "EntityTagHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::EntityTagHeaderValue クラス。''Entity-Tag'' ヘッダーの値を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 500
url: /ja/cpp/system.net.http.headers/entitytagheadervalue/
---
## EntityTagHeaderValue class


'Entity-Tag' ヘッダーの値を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数として渡す際にそのポインタを使用してください。

```cpp
class EntityTagHeaderValue : public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String) | 新しいインスタンスを構築します。 |
| [EntityTagHeaderValue](./entitytagheadervalue/)(String, bool) | 新しいインスタンスを構築します。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| static [get_Any](./get_any/)() | 'ETag' ヘッダーの値を取得します。 |
| [get_IsWeak](./get_isweak/)() | 現在のインスタンスが弱いバリデータかどうかを示す値を取得します。 |
| [get_Tag](./get_tag/)() | RTTI 情報。 |
| static [GetEntityTagLength](./getentitytaglength/)(String, int32_t, System::SharedPtr\<EntityTagHeaderValue\>\&) | 指定されたインデックスから渡された文字列を [EntityTagHeaderValue](./) クラスのインスタンスに変換します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [Parse](./parse/)(String) | 渡された文字列を [EntityTagHeaderValue](./) クラスのインスタンスに変換します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<EntityTagHeaderValue\>\&) | 渡された文字列を [EntityTagHeaderValue](./) クラスのインスタンスに変換しようとします。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
