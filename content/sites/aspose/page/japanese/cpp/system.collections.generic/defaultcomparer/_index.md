---
title: "System::Collections::Generic::DefaultComparer クラス"
linktitle: "DefaultComparer"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::DefaultComparer クラス。デフォルト比較クラスです。operator < と operator == を使用して値を比較します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 1000
url: /ja/cpp/system.collections.generic/defaultcomparer/
---
## DefaultComparer class


デフォルト比較クラスです。operator < と operator == を使用して値を比較します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
template<class T>class DefaultComparer : public System::Collections::Generic::IComparer<T>
```


| パラメーター | 説明 |
| --- | --- |
| T | 比較対象の型です。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Compare](./compare/)(typename ThisType::args_type, typename ThisType::args_type) const override | RTTI 情報。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [BaseType](./basetype/) | 実装されたインターフェイス。 |
| [ThisType](./thistype/) | 現在の型。 |

## 参照

* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
