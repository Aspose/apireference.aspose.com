---
title: "System::Collections::Generic::IEqualityComparer クラス"
linktitle: "IEqualityComparer"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::IEqualityComparer クラス。等価性を比較する手段を提供するインターフェイスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 2400
url: /ja/cpp/system.collections.generic/iequalitycomparer/
---
## IEqualityComparer class


等価性を比較する手段を提供するインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡すようにしてください。

```cpp
template<typename T>class IEqualityComparer : public virtual System::Object
```


| パラメーター | 説明 |
| --- | --- |
| T | 比較対象の型です。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Equals](./equals/)(T, T) const | RTTI 情報。 |
| virtual [GetHashCode](./gethashcode/)(T) const | あるオブジェクトのハッシュコードを取得します。 |

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
