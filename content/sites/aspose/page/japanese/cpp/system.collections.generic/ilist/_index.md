---
title: "System::Collections::Generic::IList class"
linktitle: "IList"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::IList クラス。要素のインデックス付きコンテナのインターフェイスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2600
url: /ja/cpp/system.collections.generic/ilist/
---
## IList class


要素のインデックス付きコンテナのインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
template<typename T>class IList : public System::Collections::Generic::ICollection<T>
```


| パラメーター | 説明 |
| --- | --- |
| T | 要素型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_IsFixedSize](./get_isfixedsize/)() | コレクションが固定サイズかどうかをチェックします。 |
| virtual [idx_get](./idx_get/)(int) const | 指定されたインデックスの要素を取得します。 |
| virtual [idx_set](./idx_set/)(int, T) | 指定されたインデックスに要素を設定します。 |
| virtual [IndexOf](./indexof/)(const T\&) const | コンテナ内で項目が最初に現れるインデックスを取得します。 |
| virtual [Insert](./insert/)(int, const T\&) | 指定位置に要素を挿入し、他の要素をシフトします。 |
| virtual [RemoveAt](./removeat/)(int) | 指定されたインデックスの要素を削除します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [BaseType](./basetype/) | RTTI 情報。 |
| [ThisType](./thistype/) | このタイプ。 |
| [ValueType](./valuetype/) | 値型です。 |

## 参照

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
