---
title: "System::Collections::Generic::IComparer クラス"
linktitle: "IComparer"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::IComparer クラス。大小比較（大なり・等しい・小なり）で二つのオブジェクトを比較するインターフェイスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 2000
url: /ja/cpp/system.collections.generic/icomparer/
---
## IComparer class


大小比較（大なり・等しい・小なり）で二つのオブジェクトを比較するインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡すようにしてください。

```cpp
template<typename T>class IComparer : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Compare](./compare/)(args_type, args_type) const | [Comparison](../../system/comparison/) 関数です。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [args_type](./args_type/) | RTTI 情報。 |

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
