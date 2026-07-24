---
title: "System::DefaultBoxedValue クラス"
linktitle: "DefaultBoxedValue"
second_title: "C++ 用 Aspose.Page"
description: "System::DefaultBoxedValue クラス。BoxedValue クラスの実装です。共通コードを重複させずに BoxingValue の特殊化を宣言できるようにします。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうするとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 2000
url: /ja/cpp/system/defaultboxedvalue/
---
## DefaultBoxedValue class


[BoxedValue](../boxedvalue/) class implementation. Allows it BoxingValue specializations to be declared without duplicating common code. Objects of this class should only be allocated using [System::MakeObject()](../makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
template<class T>class DefaultBoxedValue : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [DefaultBoxedValue](./defaultboxedvalue/)(const T\&) | 指定された値を表す [DefaultBoxedValue](./) クラスの新しいインスタンスを構築します。 |
| [Equals](./equals/)(ptr) override | 現在のオブジェクトと指定されたオブジェクトが表すボックス化された値の等価性を判定します。 |
| [GetHashCode](./gethashcode/)() const override | 現在のオブジェクトのハッシュコードを返します。 |
| [GetType](./gettype/)() const override | オブジェクトの実際の型を取得します。 |
| [is](./is/)() const | 現在のオブジェクトが表すボックス化された値の型が **V** かどうかを判定します。 |
| [ToString](./tostring/)() const override | ボックス化された値の文字列表現を返します。 |
| [unbox](./unbox/)() const | ボックス化された値のボックスを解除します。 |
## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
