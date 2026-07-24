---
title: "System::BoxedEnum class"
linktitle: "BoxedEnum"
second_title: "C++ 用 Aspose.Page"
description: "System::BoxedEnum クラス。ボックス化された列挙値を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうするとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 700
url: /ja/cpp/system/boxedenum/
---
## BoxedEnum class


ボックス化された列挙値を表します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション違反が発生します。

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| パラメーター | 説明 |
| --- | --- |
| E | 列挙値の型 |
| UT | 列挙型 **E** の基になる型 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | 指定された列挙値を表すインスタンスを構築します。 |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | ボックス化された列挙定数の値を 64 ビット整数値に変換します。 |
| [IsBoxedEnum](./isboxedenum/)() override | 現在のオブジェクトが列挙型のボックス化された値を表すかどうかを判定します。 |
| [ToString](./tostring/)() const override | 現在のオブジェクトが表すボックス化された値を文字列に変換します。 |

## 参照

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
