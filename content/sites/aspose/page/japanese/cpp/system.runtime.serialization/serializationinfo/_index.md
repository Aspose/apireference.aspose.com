---
title: "System::Runtime::Serialization::SerializationInfo クラス"
linktitle: "SerializationInfo"
second_title: "C++ 用 Aspose.Page"
description: "System::Runtime::Serialization::SerializationInfo クラス。シリアライズされたオブジェクトを表す名前付きフィールドの集合を保持します。実装されていません。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 400
url: /ja/cpp/system.runtime.serialization/serializationinfo/
---
## SerializationInfo class


シリアライズされたオブジェクトを表す名前付きフィールドのセットを保持します。実装されていません。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class SerializationInfo : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AddValue](./addvalue/)(const System::String\&, float) | float 値を設定します。実装されていません。 |
| [AddValue](./addvalue/)(const System::String\&, short) | short 値を設定します。実装されていません。 |
| [AddValue](./addvalue/)(const System::String\&, bool) | boolean 値を設定します。実装されていません。 |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | object 値を設定します。実装されていません。 |
| [AddValue](./addvalue/)(const System::String\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | 指定された型で object 値を設定します。実装されていません。 |
| [GetValue](./getvalue/)(const System::String\&, const System::TypeInfo\&) | [SerializationInfo](./) ストアから値を取得します。実装されていません。 |
| [SerializationInfo](./serializationinfo/)(const System::TypeInfo\&, const System::SharedPtr\<IFormatterConverter\>\&) | RTTI 情報。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
