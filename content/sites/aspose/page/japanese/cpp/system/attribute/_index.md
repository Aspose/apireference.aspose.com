---
title: "System::Attribute クラス"
linktitle: "Attribute"
second_title: "C++ 用 Aspose.Page"
description: "System::Attribute クラス。カスタム属性の基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 400
url: /ja/cpp/system/attribute/
---
## Attribute class


カスタム属性の基底クラスです。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class Attribute : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&, const TypeInfo\&) | 指定された型に適用された、指定されたタイプのカスタム属性を返します。 |
| static [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&) | 指定された型に適用されたすべてのカスタム属性を返します。 |
## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
